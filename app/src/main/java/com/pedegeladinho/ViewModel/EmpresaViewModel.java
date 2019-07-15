package com.pedegeladinho.ViewModel;

import android.app.Application;
import android.os.AsyncTask;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.pedegeladinho.DB.BancoDados;
import com.pedegeladinho.Dao.AgenteDAO;
import com.pedegeladinho.Dao.EmpresaDAO;
import com.pedegeladinho.Entidades.Agente;
import com.pedegeladinho.Entidades.Empresa;

public class EmpresaViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();
    private EmpresaDAO empresaDAO;
    private BancoDados db;

    public EmpresaViewModel(@NonNull Application application) {
        super(application);
        db = BancoDados.getBancoDadosInstancia(application);
        empresaDAO = db.empresaDAO();
    }

    public void insert(Empresa empresa) {
        new EmpresaViewModel.insertAsyncTask(empresaDAO).execute(empresa);
    }

    private class insertAsyncTask extends AsyncTask<Empresa, Void, Void> {

        EmpresaDAO dao = null;

        public insertAsyncTask(EmpresaDAO dao) {
            this.dao = dao;
        }

        @Override
        protected Void doInBackground(Empresa... empresas) {
            dao.insert(empresas[0]);
            Log.i(TAG, "empresa adicionada");
            return null;
        }
    }
}
