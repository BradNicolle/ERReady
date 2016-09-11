package com.bradnicolle.erready.ui.emergency;

import com.bradnicolle.erready.ui.QuestionFragment;

import java.util.Arrays;
import java.util.List;

public class MoveFingersQuestionFragment extends QuestionFragment {
    @Override
    protected String getQuestion() {
        return "Can you move your fingers?";
    }

    @Override
    protected List<String> getAnswers() {
        return Arrays.asList("Yes, easily", "Some difficulty", "No");
    }
}
