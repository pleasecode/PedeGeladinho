package com.pedegeladinho.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class PresenteViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();

    public PresenteViewModel(@NonNull Application application) {
        super(application);
    }
}
