package com.pedegeladinho.DB;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.pedegeladinho.Dao.AgenteDAO;
import com.pedegeladinho.Dao.EmpresaDAO;
import com.pedegeladinho.Dao.EstoqueDAO;
import com.pedegeladinho.Dao.EventoDAO;
import com.pedegeladinho.Dao.FormaPagtoDAO;
import com.pedegeladinho.Dao.HistoricoDAO;
import com.pedegeladinho.Dao.PedidoDAO;
import com.pedegeladinho.Dao.PresenteDAO;
import com.pedegeladinho.Dao.ProdutoDAO;
import com.pedegeladinho.Entidades.Agente;
import com.pedegeladinho.Entidades.Empresa;
import com.pedegeladinho.Entidades.Evento;
import com.pedegeladinho.Entidades.FormaPagto;
import com.pedegeladinho.Entidades.Historico;
import com.pedegeladinho.Entidades.Pedido;
import com.pedegeladinho.Entidades.PedidoItens;
import com.pedegeladinho.Entidades.Presente;
import com.pedegeladinho.Entidades.Produto;

@Database(entities = {Agente.class, Empresa.class, Evento.class, FormaPagto.class, Historico.class,
        Pedido.class, PedidoItens.class, PedidoItens.class, Presente.class, Produto.class}, version = 1)
public abstract class BancoDados extends RoomDatabase {

    public abstract AgenteDAO agenteDAO();
    public abstract EmpresaDAO empresaDAO();
    public abstract EstoqueDAO estoqueDAO();
    public abstract EventoDAO eventoDAO();
    public abstract FormaPagtoDAO formaPagtoDAO();
    public abstract HistoricoDAO historicoDAO();
    public abstract PedidoDAO pedidoDAO();
    public abstract PresenteDAO presenteDAO();
    public abstract ProdutoDAO produtoDAO();

    private static volatile BancoDados bancoDadosInstancia = null;

    static BancoDados getBancoDadosInstancia(final Context context) {
        if (bancoDadosInstancia == null)  {
            synchronized (BancoDados.class) {
                bancoDadosInstancia = Room.databaseBuilder(context.getApplicationContext(),
                        BancoDados.class, "basepedegeladinho")
                        .build();
            }
        }

        return bancoDadosInstancia;
    }

}
