package com.example.raymondlian.movieappv2.SyncServices;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by raymond on 8/7/16.
 */
public class MovieAuthenticatorService extends Service {
    // Instance field that stores the authenticator object
    private MovieAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
        // Create a new authenticator object
        mAuthenticator = new MovieAuthenticator(this);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}
