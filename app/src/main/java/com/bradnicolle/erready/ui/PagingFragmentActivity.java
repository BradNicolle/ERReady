package com.bradnicolle.erready.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.bradnicolle.erready.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public abstract class PagingFragmentActivity extends AppCompatActivity {
    @BindView(R.id.view_pager)
    ViewPager viewPager;
    @BindView(R.id.nav_buttons)
    ViewGroup navButtons;
    @BindView(R.id.prev_button)
    Button prevButton;
    @BindView(R.id.next_button)
    Button nextButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paging_fragment);
        ButterKnife.bind(this);

        viewPager.setAdapter(new PagingPagerAdapter(getSupportFragmentManager(), getPages()));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

            @Override
            public void onPageSelected(int position) {
                updateNav(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {}
        });
        
        updateNav(0);
    }

    private void updateNav(int pos) {
        boolean displayNav = getPages().get(pos).displayNavButtons();
        navButtons.setVisibility(displayNav ? View.VISIBLE : View.GONE);
        int currentItem = viewPager.getCurrentItem();
        prevButton.setVisibility(currentItem == 0 ? View.GONE : View.VISIBLE);
    }

    @OnClick(R.id.prev_button)
    public void onPrevClick() {
        int currentItem = viewPager.getCurrentItem();
        viewPager.setCurrentItem(currentItem-1, true);
    }

    @OnClick(R.id.next_button)
    public void onNextClick() {
        int currentItem = viewPager.getCurrentItem();
        viewPager.setCurrentItem(currentItem+1, true);
    }

    protected abstract List<Page> getPages();

    private class PagingPagerAdapter extends FragmentPagerAdapter {
        private List<Page> pages;

        public PagingPagerAdapter(FragmentManager fm, List<Page> pages) {
            super(fm);
            this.pages = pages;
        }

        @Override
        public Fragment getItem(int position) {
            if (pages.size() > position) {
                return pages.get(position).getFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return pages.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if (pages.size() > position) {
                return pages.get(position).getTitle();
            }
            return null;
        }
    }

    protected static class Page {
        private Fragment fragment;
        private String title;
        private boolean displayNavButtons;

        public Page(Fragment fragment, String title, boolean displayNavButtons) {
            this.fragment = fragment;
            this.title = title;
            this.displayNavButtons = displayNavButtons;
        }

        public Fragment getFragment() {
            return fragment;
        }

        public String getTitle() {
            return title;
        }

        public boolean displayNavButtons() {
            return displayNavButtons;
        }
    }
}
