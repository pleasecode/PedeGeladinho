package com.pedegeladinho.ViewModel;

import android.app.Application;
import android.os.AsyncTask;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.pedegeladinho.DB.BancoDados;
import com.pedegeladinho.Dao.AgenteDAO;
import com.pedegeladinho.Entidades.Agente;

public class AgenteViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();
    private AgenteDAO agenteDAO;
    private BancoDados db;

    public AgenteViewModel(@NonNull Application application) {
        super(application);

        db = BancoDados.getBancoDadosInstancia(application);
        agenteDAO = db.agenteDAO();
    }

    public void insertAgente(Agente agente) {
        new insertAsyncTask(agenteDAO).execute(agente);
    }

    private class insertAsyncTask extends AsyncTask<Agente, Void, Void> {

        AgenteDAO dao = null;

        public insertAsyncTask(AgenteDAO dao) {
            this.dao = dao;
        }

        @Override
        protected Void doInBackground(Agente... agentes) {
            dao.insert(agentes[0]);
            Log.i(TAG, "agente adicionado");
            return null;
        }
    }
}
