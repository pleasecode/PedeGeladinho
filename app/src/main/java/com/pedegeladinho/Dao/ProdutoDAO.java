package com.pedegeladinho.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.pedegeladinho.Entidades.Produto;

import java.util.List;

@Dao
public interface ProdutoDAO {

    @Insert
    void insert(Produto produto);

    @Delete
    void delete(Produto produto);

    @Query("SELECT * from PRODUTO")
    LiveData<List<Produto>> getAllProdutos();

    @Query("SELECT * from PRODUTO where COD_PRODUTO = :id")
    LiveData<Produto> getProdutosById(int id);
}
