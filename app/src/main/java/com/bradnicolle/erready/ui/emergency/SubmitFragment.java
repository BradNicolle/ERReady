package com.bradnicolle.erready.ui.emergency;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bradnicolle.erready.R;
import com.bradnicolle.erready.ui.waiting.WaitingActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SubmitFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_submit, container, false);
        ButterKnife.bind(this, v);
        return v;
    }

    @OnClick(R.id.submit_request_button)
    public void onSubmitRequest() {
        startActivity(WaitingActivity.newIntent(getActivity()));
    }
}
