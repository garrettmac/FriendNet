package com.example.garrettmacmaolain.friendnet;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Loc extends Fragment {

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.


    public View onCreate(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View loc = inflater.inflate(com.example.garrettmacmaolain.friendnet.R.layout.location_fragment, container, false);
        ((TextView) loc.findViewById(com.example.garrettmacmaolain.friendnet.R.id.textView)).setText("Map");
        setUpMapIfNeeded();
        return loc;
    }

    @Override
    public void onResume() {
        super.onResume();
        setUpMapIfNeeded();

    }

    private void setUpMapIfNeeded() {

            if (mMap != null) {
                setUpMap();
            }
    }

    private void setUpMap() {
        mMap.addMarker(new MarkerOptions().position(new LatLng(0, 0)).title("Marker"));
    }
}
