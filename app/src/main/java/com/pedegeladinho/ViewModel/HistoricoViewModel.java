package com.pedegeladinho.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class HistoricoViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();

    public HistoricoViewModel(@NonNull Application application) {
        super(application);
    }
}
