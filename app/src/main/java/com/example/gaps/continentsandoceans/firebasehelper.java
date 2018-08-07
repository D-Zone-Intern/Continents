package com.example.gaps.continentsandoceans;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

import java.io.Serializable;

public class firebasehelper extends Application implements Serializable {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
