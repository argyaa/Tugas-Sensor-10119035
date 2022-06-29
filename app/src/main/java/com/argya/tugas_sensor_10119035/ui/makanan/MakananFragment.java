package com.argya.tugas_sensor_10119035.ui.makanan;

/*
 *   NIM : 10119035
 *   NAMA : ARGYA AULIA FAUZANDIKA
 *   KELAS : IF-1
 * */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.argya.tugas_sensor_10119035.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MakananFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_makanan, container, false);
        SupportMapFragment mMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        mMapFragment.getMapAsync(this);
        return view;
    }



    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng nasiGoreng = new LatLng(-6.89185821874893, 107.61734692421686);
        LatLng kfcDago = new LatLng(-6.901807625526596, 107.61226772085845);
        LatLng warungSteak = new LatLng(-6.890194084683408, 107.61623699852177);
        LatLng yezChicken = new LatLng(-6.889253508583291, 107.61740662441085);
        LatLng pecelLele = new LatLng(-6.889206167290415, 107.6179902128815);

        mMap.addMarker(new MarkerOptions().position(nasiGoreng).title("Nasi Goreng Mafia"));
        mMap.addMarker(new MarkerOptions().position(kfcDago).title("KFC Dago"));
        mMap.addMarker(new MarkerOptions().position(warungSteak).title("Waroeng Steak"));
        mMap.addMarker(new MarkerOptions().position(yezChicken).title("YEZ Chicken"));
        mMap.addMarker(new MarkerOptions().position(pecelLele).title("Pecel Lele Cak Gofur"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(nasiGoreng, 15));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}