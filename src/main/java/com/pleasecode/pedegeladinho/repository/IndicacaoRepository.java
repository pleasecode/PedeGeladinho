package com.pleasecode.pedegeladinho.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pleasecode.pedegeladinho.model.Atividade;
import com.pleasecode.pedegeladinho.model.Indicacao;

@Repository
public interface IndicacaoRepository extends JpaRepository<Indicacao, Long> {
	
}
