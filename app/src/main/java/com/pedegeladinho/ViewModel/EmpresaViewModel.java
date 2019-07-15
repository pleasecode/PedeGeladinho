package com.pedegeladinho.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class EmpresaViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();

    public EmpresaViewModel(@NonNull Application application) {
        super(application);
    }
}
