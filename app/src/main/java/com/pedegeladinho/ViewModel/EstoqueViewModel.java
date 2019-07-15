package com.pedegeladinho.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class EstoqueViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();

    public EstoqueViewModel(@NonNull Application application) {
        super(application);
    }
}
