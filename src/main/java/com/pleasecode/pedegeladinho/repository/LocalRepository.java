package com.pleasecode.pedegeladinho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pleasecode.pedegeladinho.model.Local;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long>{
}
