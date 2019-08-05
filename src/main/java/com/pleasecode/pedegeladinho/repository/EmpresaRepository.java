package com.pleasecode.pedegeladinho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pleasecode.pedegeladinho.model.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
