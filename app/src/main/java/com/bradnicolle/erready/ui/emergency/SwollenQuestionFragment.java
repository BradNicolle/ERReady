package com.bradnicolle.erready.ui.emergency;

import com.bradnicolle.erready.ui.QuestionFragment;

import java.util.Arrays;
import java.util.List;

public class SwollenQuestionFragment extends QuestionFragment {
    @Override
    protected String getQuestion() {
        return "Is there swelling?";
    }

    @Override
    protected List<String> getAnswers() {
        return Arrays.asList("No swelling", "Mild swelling", "Significant swelling");
    }
}
