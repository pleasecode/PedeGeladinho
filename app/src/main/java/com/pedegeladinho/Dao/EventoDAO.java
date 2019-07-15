package com.pedegeladinho.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.pedegeladinho.Entidades.Evento;

import java.util.List;

@Dao
public interface EventoDAO {

    @Insert
    void insert(Evento evento);

    @Delete
    void delete(Evento evento);

    @Query("SELECT * from EVENTO")
    LiveData<List<Evento>> getAllEventos();

    @Query("SELECT * from EVENTO where COD_EVENTO = :id")
    LiveData<Evento> getEventoById(int id);
}
