package com.bradnicolle.erready.ui.emergency;

import android.content.Context;
import android.content.Intent;

import com.bradnicolle.erready.R;
import com.bradnicolle.erready.ui.PagingFragmentActivity;
import com.bradnicolle.erready.ui.QuestionFragment;
import com.bradnicolle.erready.ui.waiting.WaitingActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.OnClick;

public class EmergencyActivity extends PagingFragmentActivity {
    private AnatomyFragment anatomyFragment = new AnatomyFragment();
    private SeverityQuestionFragment severityQuestionFragment = new SeverityQuestionFragment();
    private SubmitFragment submitFragment = new SubmitFragment();

    public static Intent newIntent(Context context) {
        return new Intent(context, EmergencyActivity.class);
    }

    @Override
    protected List<Page> getPages() {
        List<Page> pages = new ArrayList<>();
        pages.add(new Page(anatomyFragment, "Anatomy", true));
        pages.add(new Page(severityQuestionFragment, "Severity", true));
        pages.add(new Page(submitFragment, "Submit", false));
        return pages;
    }
}
