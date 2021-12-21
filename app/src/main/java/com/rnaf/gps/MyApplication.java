package com.rnaf.gps;

import android.app.Application;
import android.location.Location;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application{
    private static MyApplication singleton;
    private static List<Location> myLocations;

    public static List<Location> getMyLocations() {
        return myLocations;
    }

    public MyApplication getIntance(){
        return singleton;
    }

    public void onCreate(){
        super.onCreate();
        singleton = this;
        myLocations = new ArrayList<>();
    }
}
