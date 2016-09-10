package com.bradnicolle.erready.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.bradnicolle.erready.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public abstract class QuestionFragment extends Fragment {
    @BindView(R.id.question_text)
    TextView questionText;
    @BindView(R.id.answers_radio_group)
    RadioGroup answersRadioGroup;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_question, container, false);
        ButterKnife.bind(this, v);
        populateFields(inflater);
        return v;
    }

    private void populateFields(LayoutInflater inflater) {
        questionText.setText(getQuestion());
        List<String> answers = getAnswers();
        for (String ans : answers) {
            RadioButton radio = (RadioButton) inflater.inflate(R.layout.radio_answer, answersRadioGroup, false);
            radio.setText(ans);
            answersRadioGroup.addView(radio);
        }
    }

    protected abstract String getQuestion();
    protected abstract List<String> getAnswers();
}
