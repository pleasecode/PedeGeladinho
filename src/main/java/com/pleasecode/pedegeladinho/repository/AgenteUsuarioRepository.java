package com.pleasecode.pedegeladinho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pleasecode.pedegeladinho.model.Agente;
import com.pleasecode.pedegeladinho.model.AgenteUsuario;

@Repository
public interface AgenteUsuarioRepository extends JpaRepository<AgenteUsuario, Long> {
	AgenteUsuario findByUsername(String username);
}
