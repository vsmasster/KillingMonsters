package com.example.ksychoo.killingmonsters;

import android.content.Context;
import android.os.AsyncTask;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ksychoo on 23.08.16.
 */
public class ServerHandler {
    private static RequestQueue queue;

    private static String url = "http://localhost:8000/";
    private static Map<String, Response.Listener<String>> container;

    public ServerHandler(Context context) {
        queue = Volley.newRequestQueue(context);
        container = new HashMap<>();
    }

    public static void addRequest(String request, Response.Listener<String> responseListener) {
        if (!container.containsKey(request)) {
            container.put(request, responseListener);
        }
    }

    public static String doRequest(String request) {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url + request, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });

        return "DUPA";
    }

}
