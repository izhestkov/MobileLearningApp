package com.itis.android.mobilelearningapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itis.android.mobilelearningapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    public static ProfileFragment newInstance() {
        Bundle args = new Bundle();
        ProfileFragment profileFragment = new ProfileFragment();
        profileFragment.setArguments(args);
        return profileFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
}