package com.pedegeladinho.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class PedidoViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();

    public PedidoViewModel(@NonNull Application application) {
        super(application);
    }
}
