package com.pedegeladinho.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.pedegeladinho.Entidades.Historico;

import java.util.List;

@Dao
public interface HistoricoDAO {

    @Insert
    void insert(Historico historico);

    @Delete
    void delete(Historico historico);

    @Query("SELECT * from HISTORICO")
    LiveData<List<Historico>> getAllHistorico();

    @Query("SELECT * from HISTORICO where COD_HISTORICO = :id")
    LiveData<Historico> getHistoricoById(int id);
}
