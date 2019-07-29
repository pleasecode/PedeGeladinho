package com.pedegeladinho.ViewModel;

import android.app.Application;
import android.os.AsyncTask;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.pedegeladinho.DB.BancoDados;
import com.pedegeladinho.Dao.EmpresaDAO;
import com.pedegeladinho.Dao.PedidoDAO;
import com.pedegeladinho.Dao.PresenteDAO;
import com.pedegeladinho.Dao.ProdutoDAO;
import com.pedegeladinho.Entidades.Empresa;
import com.pedegeladinho.Entidades.Produto;

import java.util.List;

public class ProdutoViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();
    private ProdutoDAO produtoDAO;
    private BancoDados db;
    private LiveData<List<Produto>> listaProdutos;

    public ProdutoViewModel(@NonNull Application application) {
        super(application);
        db = BancoDados.getBancoDadosInstancia(application);
        produtoDAO = db.produtoDAO();
        listaProdutos = produtoDAO.getAllProdutos();
    }

    public void insert(Produto produto) {
        new ProdutoViewModel.insertAsyncTask(produtoDAO).execute(produto);
    }

    public LiveData<List<Produto>> getAllProdutos() {
        return listaProdutos;
    }

    private class insertAsyncTask extends AsyncTask<Produto, Void, Void> {

        ProdutoDAO dao = null;

        public insertAsyncTask(ProdutoDAO dao) {
            this.dao = dao;
        }

        @Override
        protected Void doInBackground(Produto... produtos) {
            dao.insert(produtos[0]);
            Log.i(TAG, "produto adicionado");
            return null;
        }
    }
}
