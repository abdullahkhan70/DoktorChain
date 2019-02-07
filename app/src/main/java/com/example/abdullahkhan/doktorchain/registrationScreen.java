package com.example.abdullahkhan.doktorchain;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class registrationScreen extends AppCompatActivity {


    private selectionPageAdapter mSelectionPageAdapter;
    private ViewPager mViewPager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_screen);

      //  selectionPageAdapter selectionPageAdapter = new selectionPageAdapter(getSupportFragmentManager());

        // Set up the view Pager for the fragment...

        mViewPager = findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setTabTextColors(getResources().getColor(android.R.color.black),
                getResources().getColor(R.color.splashBackground));
        tabLayout.setBackgroundColor(getResources().getColor(android.R.color.white));
        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.backgroundTabLayout));

        tabLayout.setupWithViewPager(mViewPager);

    }

    private void setupViewPager(ViewPager viewPager){
        selectionPageAdapter adapter = new selectionPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new fragmentForRegisterAsUser(),"Register As User");
        adapter.addFragment(new fragment_for_register_as_doctor(),"Register As Doctor");
        viewPager.setAdapter(adapter);
    }
}
