package com.example.ksychoo.killingmonsters;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by ksychoo on 21.08.16.
 */
public class Point {
    private String mLabel;
    private Location mLocation;
    private String mFragment;

    public Point(String label, double lat, double lng, String fragment) {
        mLabel = label;
        mLocation = new Location("");
        mLocation.setLatitude(lat);
        mLocation.setLongitude(lng);
        mFragment = fragment;
    }

    public Class<?> getActionFragment() throws ClassNotFoundException{
        return Class.forName("com.example.ksychoo.killingmonsters." + mFragment);
    }

    public String getLabel() {
        return mLabel;
    }

    public Location getLocation() {
        return mLocation;
    }
}
