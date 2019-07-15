package com.pedegeladinho.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class EventoViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();

    public EventoViewModel(@NonNull Application application) {
        super(application);
    }
}
