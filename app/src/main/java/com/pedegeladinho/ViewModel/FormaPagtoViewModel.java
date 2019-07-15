package com.pedegeladinho.ViewModel;

import android.app.Application;
import android.os.AsyncTask;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.pedegeladinho.DB.BancoDados;
import com.pedegeladinho.Dao.EmpresaDAO;
import com.pedegeladinho.Dao.FormaPagtoDAO;
import com.pedegeladinho.Entidades.Empresa;
import com.pedegeladinho.Entidades.FormaPagto;

public class FormaPagtoViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();
    private FormaPagtoDAO formaPagtoDAO;
    private BancoDados db;

    public FormaPagtoViewModel(@NonNull Application application) {
        super(application);
        db = BancoDados.getBancoDadosInstancia(application);
        formaPagtoDAO = db.formaPagtoDAO();
    }

    public void insert(FormaPagto formaPagto) {
        new FormaPagtoViewModel.insertAsyncTask(formaPagtoDAO).execute(formaPagto);
    }

    private class insertAsyncTask extends AsyncTask<FormaPagto, Void, Void> {

        FormaPagtoDAO dao = null;

        public insertAsyncTask(FormaPagtoDAO dao) {
            this.dao = dao;
        }

        @Override
        protected Void doInBackground(FormaPagto... formaPagtos) {
            dao.insert(formaPagtos[0]);
            Log.i(TAG, "forma pagto adicionada");
            return null;
        }
    }
}
