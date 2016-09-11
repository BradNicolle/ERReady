package com.bradnicolle.erready.ui.emergency;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bradnicolle.erready.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AnatomyFragment extends Fragment {
    @BindView(R.id.anatomy_img)
    ImageView anatomyImg;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_anatomy, container, false);
        ButterKnife.bind(this, v);
        return v;
    }

    @OnClick(R.id.anatomy_img)
    public void onAnatomyClick() {
        anatomyImg.setImageResource(R.drawable.anatomy_highlight);
    }
}
