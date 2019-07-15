package com.pedegeladinho.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class ProdutoViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();

    public ProdutoViewModel(@NonNull Application application) {
        super(application);
    }
}
