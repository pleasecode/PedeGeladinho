package com.pedegeladinho.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.pedegeladinho.Entidades.Agente;

import java.util.List;

@Dao
public interface AgenteDAO {

    @Insert
    Long insert(Agente agente);

    @Delete
    void delete(Agente agente);

    @Query("SELECT * from AGENTE")
    LiveData<List<Agente>> getAgentes();

    @Query("SELECT * from AGENTE where COD_AGENTE = :id")
    LiveData<Agente> getAgenteById(int id);

    @Query("SELECT * from AGENTE where EMAIL = :email")
    LiveData<Agente> getAgenteByEmail(String email);
}
