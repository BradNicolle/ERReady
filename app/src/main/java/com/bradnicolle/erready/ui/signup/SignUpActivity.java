package com.bradnicolle.erready.ui.signup;

import android.content.Context;
import android.content.Intent;

import com.bradnicolle.erready.ui.PagingFragmentActivity;

import java.util.ArrayList;
import java.util.List;

public class SignUpActivity extends PagingFragmentActivity {
    private PersonalInfoFragment personalInfoFragment = new PersonalInfoFragment();

    public static Intent newIntent(Context context) {
        return new Intent(context, SignUpActivity.class);
    }

    @Override
    protected List<Page> getPages() {
        List<Page> pages = new ArrayList<>();
        pages.add(new Page(personalInfoFragment, "Personal Info", true));
        return pages;
    }
}
