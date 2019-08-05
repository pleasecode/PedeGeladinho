package com.pleasecode.pedegeladinho.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.pleasecode.pedegeladinho.model.Agente;
import com.pleasecode.pedegeladinho.model.Configuracao;
import com.pleasecode.pedegeladinho.repository.AgenteRepository;
import com.pleasecode.pedegeladinho.repository.ConfiguracaoRepository;

@RestController
@RequestMapping("configuracoes")
public class ConfiguracaoController {
	
	private final ConfiguracaoRepository configuracaoDAO;
	
	@Autowired
	public ConfiguracaoController(ConfiguracaoRepository configuracaoDAO) {
		this.configuracaoDAO = configuracaoDAO;
	}

	@GetMapping("/getAll")
	public ResponseEntity<?> getAll() {	
		return new ResponseEntity<>( configuracaoDAO.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getById(@PathVariable("id") Long id) {
		
		return new ResponseEntity<>(configuracaoDAO.findById(id),  HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Configuracao configuracao) {
		return new ResponseEntity<>(configuracaoDAO.save(configuracao), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<?> atualiza(@RequestBody Configuracao configuracao) {
		configuracaoDAO.save(configuracao);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody Configuracao configuracao) {
		configuracaoDAO.delete(configuracao);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
		configuracaoDAO.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}


}
