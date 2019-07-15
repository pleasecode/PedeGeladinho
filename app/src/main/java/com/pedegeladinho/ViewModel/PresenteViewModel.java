package com.pedegeladinho.ViewModel;

import android.app.Application;
import android.os.AsyncTask;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.pedegeladinho.DB.BancoDados;
import com.pedegeladinho.Dao.EmpresaDAO;
import com.pedegeladinho.Dao.PresenteDAO;
import com.pedegeladinho.Entidades.Empresa;
import com.pedegeladinho.Entidades.Presente;

public class PresenteViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();
    private PresenteDAO presenteDAO;
    private BancoDados db;


    public PresenteViewModel(@NonNull Application application) {
        super(application);
        db = BancoDados.getBancoDadosInstancia(application);
        presenteDAO = db.presenteDAO();
    }

    public void insert(Presente presente) {
        new PresenteViewModel.insertAsyncTask(presenteDAO).execute(presente);
    }

    private class insertAsyncTask extends AsyncTask<Presente, Void, Void> {

        PresenteDAO dao = null;

        public insertAsyncTask(PresenteDAO dao) {
            this.dao = dao;
        }

        @Override
        protected Void doInBackground(Presente... presentes) {
            dao.insert(presentes[0]);
            Log.i(TAG, "empresa adicionada");
            return null;
        }
    }
}
