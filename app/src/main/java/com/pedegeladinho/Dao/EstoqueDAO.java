package com.pedegeladinho.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.pedegeladinho.Entidades.Estoque;

import java.util.List;

@Dao
public interface EstoqueDAO {

    @Insert
    void insert(Estoque estoque);

    @Delete
    void delete(Estoque estoque);

    @Query("SELECT * from ESTOQUE")
    LiveData<List<Estoque>> getAllEstoque();

    @Query("SELECT * from ESTOQUE where COD_ESTOQUE = :id")
    LiveData<Estoque> getEstoqueById(int id);
}
