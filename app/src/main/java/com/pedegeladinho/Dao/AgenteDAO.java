package com.pedegeladinho.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.pedegeladinho.Entidades.Agente;

@Dao
public interface AgenteDAO {

    @Insert
    void insert(Agente agente);

    @Delete
    void delete(Agente agente);
}
