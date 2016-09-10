package com.bradnicolle.erready.ui.emergency;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bradnicolle.erready.R;

import butterknife.ButterKnife;

public class AnatomyFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_anatomy, container, false);
        ButterKnife.bind(this, v);
        return v;
    }
}
