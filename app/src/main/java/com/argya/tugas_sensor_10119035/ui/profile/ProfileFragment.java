package com.argya.tugas_sensor_10119035.ui.profile;

/*
 *   NIM : 10119035
 *   NAMA : ARGYA AULIA FAUZANDIKA
 *   KELAS : IF-1
 * */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.argya.tugas_sensor_10119035.R;


public class ProfileFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profil, container, false);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}