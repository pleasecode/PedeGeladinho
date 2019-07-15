package com.pedegeladinho.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.pedegeladinho.Entidades.Pedido;

import java.util.List;

@Dao
public interface PedidoDAO {

    @Insert
    Long insert(Pedido pedido);

    @Query("SELECT * from PEDIDO P inner join PEDIDO_ITENS PI on PI.COD_PEDIDO = P.COD_PEDIDO " +
            "inner join PEDIDO_FECHAMENTO PF on PF.COD_PEDIDO = P.COD_PEDIDO")
    LiveData<List<Pedido>> getPedidos();

    @Query("SELECT * from PEDIDO P inner join PEDIDO_ITENS PI on PI.COD_PEDIDO = P.COD_PEDIDO " +
            "inner join PEDIDO_FECHAMENTO PF on PF.COD_PEDIDO = P.COD_PEDIDO where P.COD_PEDIDO = :id")
    LiveData<Pedido> getPedidoById(int id);
}
