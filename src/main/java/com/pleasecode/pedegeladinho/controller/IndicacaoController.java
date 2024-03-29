package com.pleasecode.pedegeladinho.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pleasecode.pedegeladinho.error.ResourceNotFoundException;
import com.pleasecode.pedegeladinho.model.Agente;
import com.pleasecode.pedegeladinho.model.Indicacao;
import com.pleasecode.pedegeladinho.model.Local;
import com.pleasecode.pedegeladinho.repository.AgenteRepository;
import com.pleasecode.pedegeladinho.repository.IndicacaoRepository;
import com.pleasecode.pedegeladinho.repository.LocalRepository;

@RestController
@RequestMapping("indicacoes")
public class IndicacaoController {
	
private final IndicacaoRepository indicacaoDAO;
private final LocalRepository localRepository;
private final AgenteRepository agenteRepository;
	
	@Autowired
	public IndicacaoController(IndicacaoRepository indicacaoDAO, LocalRepository localRepository,
			AgenteRepository agenteRepository) {
		this.indicacaoDAO = indicacaoDAO;
		this.localRepository = localRepository;
		this.agenteRepository = agenteRepository;
	}

	@GetMapping("/getAll")
	public Page<Indicacao> getAll(Pageable pageable) {	
		return  indicacaoDAO.findAll(pageable);
	}
	
	@GetMapping(path = "/{id}")
	public Indicacao getById(@PathVariable("id") Long id) {
		
		return indicacaoDAO.findById(id).map(indicacao -> {
			return indicacao;
		}).orElseThrow(()-> new ResourceNotFoundException("indicação não encontrada"));
	}
	
	@PostMapping
	public Indicacao salvar(@RequestBody Indicacao indicacao) {
		
		Local localBuscado = localRepository.findById(indicacao.getLocal().getId()).map(local -> {
			local.adicionaIndicacoes(indicacao);
			return local;
		}).orElseThrow(() -> new ResourceNotFoundException("Impossível salva, Local não encontrado"));
		
		Agente agenteBuscado = agenteRepository.findById(indicacao.getLocal().getId()).map(agente -> {
			agente.adicionaIndicacao(indicacao);
			return agente;
		}).orElseThrow(() -> new ResourceNotFoundException("Impossível salvar, Agente não encontrado."));
		
		indicacao.setLocal(localBuscado);
		indicacao.setAgente(agenteBuscado);
		
		return  indicacaoDAO.save(indicacao);
	}
		
	@PutMapping
	public ResponseEntity<?> atualiza(@RequestBody Indicacao indicacao) {
		indicacaoDAO.save(indicacao);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody Indicacao indicacao) {
		indicacaoDAO.delete(indicacao);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
		indicacaoDAO.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
