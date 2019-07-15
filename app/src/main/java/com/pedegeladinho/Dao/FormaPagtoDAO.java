package com.pedegeladinho.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.pedegeladinho.Entidades.FormaPagto;

import java.util.List;

@Dao
public interface FormaPagtoDAO {

    @Insert
    void insert(FormaPagto formaPagto);

    @Delete
    void delete(FormaPagto formaPagto);

    @Query("SELECT * from FORMA_PAGTO")
    LiveData<List<FormaPagto>> getAllFormasPagto();

    @Query("SELECT * from FORMA_PAGTO where COD_FORMA_PAGTO = :id")
    LiveData<FormaPagto> getFormaPagtoById(int id);
}
