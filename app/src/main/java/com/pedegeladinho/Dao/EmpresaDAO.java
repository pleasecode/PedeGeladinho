package com.pedegeladinho.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.pedegeladinho.Entidades.Empresa;

import java.util.List;

@Dao
public interface EmpresaDAO {

    @Insert
    void insert(Empresa empresa);

    @Delete
    void delete(Empresa empresa);

    @Query("SELECT * from EMPRESA")
    LiveData<List<Empresa>> getAllEmpresas();

    @Query("SELECT * from EMPRESA where COD_EMPRESA = :id")
    LiveData<Empresa> getEmpresaById(int id);

    @Query("SELECT * from EMPRESA where CNPJ = :cnpj")
    LiveData<Empresa> getEmpresaByCNPJ(String cnpj);
}
