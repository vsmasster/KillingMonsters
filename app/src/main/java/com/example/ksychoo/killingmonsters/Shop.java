package com.example.ksychoo.killingmonsters;

import android.content.Context;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.internal.zzf;

/**
 * Created by ksychoo on 18.08.16.
 */
public class Shop{
    private LatLng myLocation;
    private Context appContext;

    public MarkerOptions getMarkerOptions() {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(myLocation);
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));

        return markerOptions;
    }

    public Shop(LatLng startPos) {
        myLocation = GeoMath.GetRandomLocation(startPos, 200);
    }
}
