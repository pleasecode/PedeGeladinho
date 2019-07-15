package com.pedegeladinho.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.pedegeladinho.Entidades.Presente;

import java.util.List;

@Dao
public interface PresenteDAO {

    @Insert
    void insert(Presente presente);

    @Delete
    void delete(Presente presente);

    @Query("SELECT * from PRESENTE")
    LiveData<List<Presente>> getAllPresentes();

    @Query("SELECT * from PRESENTE where COD_PRESENTE = :id")
    LiveData<Presente> getPresenteById(int id);
}
