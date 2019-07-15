package com.pedegeladinho.ViewModel;

import android.app.Application;
import android.os.AsyncTask;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.pedegeladinho.DB.BancoDados;
import com.pedegeladinho.Dao.EmpresaDAO;
import com.pedegeladinho.Dao.EventoDAO;
import com.pedegeladinho.Entidades.Empresa;
import com.pedegeladinho.Entidades.Evento;

public class EventoViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();
    private EventoDAO eventoDAO;
    private BancoDados db;

    public EventoViewModel(@NonNull Application application) {
        super(application);
        db = BancoDados.getBancoDadosInstancia(application);
        eventoDAO = db.eventoDAO();
    }

    public void insert(Evento evento) {
        new EventoViewModel.insertAsyncTask(eventoDAO).execute(evento);
    }

    private class insertAsyncTask extends AsyncTask<Evento, Void, Void> {

        EventoDAO dao = null;

        public insertAsyncTask(EventoDAO dao) {
            this.dao = dao;
        }

        @Override
        protected Void doInBackground(Evento... eventos) {
            dao.insert(eventos[0]);
            Log.i(TAG, "evento adicionado");
            return null;
        }
    }
}
