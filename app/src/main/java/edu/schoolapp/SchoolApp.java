package edu.schoolapp;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

public class SchoolApp extends Application {

    private static Context appContext;

    public static Context getAppContext() {
        return appContext;
    }

    private static SharedPreferences sharedPreferences;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;
        sharedPreferences = getSharedPreferences(this.getClass().getSimpleName(), Context.MODE_PRIVATE);
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }

    public static void setToken(String value) {
        sharedPreferences.edit()
                .putString("token", value)
                .apply();
    }

    public static String getToken() {
        return sharedPreferences.getString("token", null);
    }

    public static void setName(String value) {
        sharedPreferences.edit()
                .putString("userName", value)
                .apply();
    }

    public static String getName() {
        return sharedPreferences.getString("userName", null);
    }

    public static void setEmail(String value) {
        sharedPreferences.edit()
                .putString("email", value)
                .apply();
    }

    public static String getEmail() {
        return sharedPreferences.getString("email", null);
    }

    public static void setProfileUrl(String value) {
        sharedPreferences.edit()
                .putString("profileUrl", value)
                .apply();
    }

    public static String getProfileUrl() {
        return sharedPreferences.getString("profileUrl", null);
    }
}
