package com.pedegeladinho.ViewModel;

import android.app.Application;
import android.os.AsyncTask;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.pedegeladinho.DB.BancoDados;
import com.pedegeladinho.Dao.EmpresaDAO;
import com.pedegeladinho.Dao.PedidoDAO;
import com.pedegeladinho.Entidades.Empresa;
import com.pedegeladinho.Entidades.Pedido;

public class PedidoViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();
    private PedidoDAO pedidoDAO;
    private BancoDados db;

    public PedidoViewModel(@NonNull Application application) {
        super(application);
        db = BancoDados.getBancoDadosInstancia(application);
        pedidoDAO = db.pedidoDAO();
    }

    public void insert(Pedido pedido) {
        new PedidoViewModel.insertAsyncTask(pedidoDAO).execute(pedido);
    }

    private class insertAsyncTask extends AsyncTask<Pedido, Void, Void> {

        PedidoDAO dao = null;

        public insertAsyncTask(PedidoDAO dao) {
            this.dao = dao;
        }

        @Override
        protected Void doInBackground(Pedido... pedidos) {
            dao.insert(pedidos[0]);
            Log.i(TAG, "pedido adicionada");
            return null;
        }
    }
}
