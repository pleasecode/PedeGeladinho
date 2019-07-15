package com.pedegeladinho.ViewModel;

import android.app.Application;
import android.os.AsyncTask;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.pedegeladinho.DB.BancoDados;
import com.pedegeladinho.Dao.EmpresaDAO;
import com.pedegeladinho.Dao.EstoqueDAO;
import com.pedegeladinho.Entidades.Empresa;
import com.pedegeladinho.Entidades.Estoque;

public class EstoqueViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();
    private EstoqueDAO estoqueDAO;
    private BancoDados db;

    public EstoqueViewModel(@NonNull Application application) {
        super(application);
        db = BancoDados.getBancoDadosInstancia(application);
        estoqueDAO = db.estoqueDAO();
    }

    public void insert(Estoque estoque) {
        new EstoqueViewModel.insertAsyncTask(estoqueDAO).execute(estoque);
    }

    private class insertAsyncTask extends AsyncTask<Estoque, Void, Void> {

        EstoqueDAO dao = null;

        public insertAsyncTask(EstoqueDAO dao) {
            this.dao = dao;
        }

        @Override
        protected Void doInBackground(Estoque... estoques) {
            dao.insert(estoques[0]);
            Log.i(TAG, "estoque adicionada");
            return null;
        }
    }
}
