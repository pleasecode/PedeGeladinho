package com.pedegeladinho.ViewModel;

import android.app.Application;
import android.os.AsyncTask;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.pedegeladinho.DB.BancoDados;
import com.pedegeladinho.Dao.EmpresaDAO;
import com.pedegeladinho.Dao.HistoricoDAO;
import com.pedegeladinho.Entidades.Empresa;
import com.pedegeladinho.Entidades.Historico;

import java.util.List;

public class HistoricoViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();
    private HistoricoDAO historicoDAO;
    private BancoDados db;
    LiveData<List<Historico>> listaHistorico;

    public HistoricoViewModel(@NonNull Application application) {
        super(application);
        db = BancoDados.getBancoDadosInstancia(application);
        historicoDAO = db.historicoDAO();
        listaHistorico = historicoDAO.getAllHistorico();
    }

    public LiveData<List<Historico>> getAllHistorico() {
        return listaHistorico;
    }

    public void insert(Historico historico) {
        new HistoricoViewModel.insertAsyncTask(historicoDAO).execute(historico);
    }

    private class insertAsyncTask extends AsyncTask<Historico, Void, Void> {

        HistoricoDAO dao = null;

        public insertAsyncTask(HistoricoDAO dao) {
            this.dao = dao;
        }

        @Override
        protected Void doInBackground(Historico... historicos) {
            dao.insert(historicos[0]);
            Log.i(TAG, "historico adicionada");
            return null;
        }
    }
}
