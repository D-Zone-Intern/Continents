package com.example.gaps.continentsandoceans;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class firebasehelper extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
