package com.bradnicolle.erready.ui.emergency;

import com.bradnicolle.erready.ui.QuestionFragment;

import java.util.Arrays;
import java.util.List;

public class SeverityQuestionFragment extends QuestionFragment {
    @Override
    protected String getQuestion() {
        return "How severe is your discomfort?";
    }

    @Override
    protected List<String> getAnswers() {
        return Arrays.asList("No discomfort", "Mild discomfort", "Strong discomfort");
    }
}
