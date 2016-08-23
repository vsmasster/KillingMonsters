package com.example.ksychoo.killingmonsters;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by ksychoo on 21.08.16.
 */
public class Point {
    private String mLabel;
    private LatLng mLocation;
    private String mFragment;

    public Point(String label, LatLng location, String fragment) {
        mLabel = label;
        mLocation = location;
        mFragment = fragment;
    }

    public Class<?> getActionFragment() throws ClassNotFoundException{
        return Class.forName("com.example.ksychoo.killingmonsters" + mFragment);
    }

    public String getLabel() {
        return mLabel;
    }

    public LatLng getLocation() {
        return mLocation;
    }
}
