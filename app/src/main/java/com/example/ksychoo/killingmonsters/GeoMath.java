package com.example.ksychoo.killingmonsters;

import com.google.android.gms.maps.model.LatLng;

import java.util.Random;

/**
 * Created by ksychoo on 18.08.16.
 */
public class GeoMath {
    public static LatLng GetRandomLocation(LatLng point, int radius) {
        Random random = new Random();

        double radiusInDegrees = radius / 111000f;

        double u = random.nextDouble();
        double v = random.nextDouble();
        double w = radiusInDegrees * Math.sqrt(u);
        double t = 2 * Math.PI * v;
        double x = w * Math.cos(t);
        double y = w * Math.sin(t);

        // Adjust the x-coordinate for the shrinking of the east-west distances
        double new_x = x / Math.cos(point.longitude);

        double foundLongitude = new_x + point.longitude;
        double foundLatitude = y + point.latitude;

        return new LatLng(foundLatitude, foundLongitude);
    }
}
