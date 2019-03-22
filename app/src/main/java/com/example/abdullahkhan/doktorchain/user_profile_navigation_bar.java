package com.example.abdullahkhan.doktorchain;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.abdullahkhan.doktorchain.userFragments.fragement_for_user_doctors;
import com.example.abdullahkhan.doktorchain.userFragments.fragement_for_user_hospital;
import com.example.abdullahkhan.doktorchain.userFragments.fragment_for_user_clinic;
import com.example.abdullahkhan.doktorchain.userFragments.fragment_for_user_dashboard;
import com.example.abdullahkhan.doktorchain.userFragments.fragment_for_user_feature;
import com.example.abdullahkhan.doktorchain.userFragments.fragment_for_user_laboratories;
import com.example.abdullahkhan.doktorchain.userFragments.fragment_for_user_nurse;
import com.example.abdullahkhan.doktorchain.userFragments.fragment_for_user_profile;

public class user_profile_navigation_bar extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
        {

    com.example.abdullahkhan.doktorchain.userFragments.fragement_for_user_doctors fragement_for_user_doctors;
    FragmentManager fragmentManager;

    public interface getResponse
    {
        public void getLatestResponse(String newMessage);
    }

    getResponse getResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile_navigation_bar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.user_profile_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        fragmentManager = getFragmentManager();
        //fragmentManager.beginTransaction().replace(R.id.fragment_doctors,fragement_for_user_doctors,fragement_for_user_doctors.getTag()).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.toolbar_search_bar, menu);
//        MenuItem searchItems = menu.findItem(R.id.action_search_bar);
//
//
//        SearchView searchView =(SearchView) searchItems.getActionView();
//
//        searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);
//
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//
//                getResponse.getLatestResponse(query);
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//
//                //getResponse.getLatestResponse(newText);
//
//                return false;
//            }
//        });
//
//        return true;
//    }
    return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;



        int id = item.getItemId();

        if (id == R.id.user_dashboard) {

            fragment = new fragment_for_user_dashboard();

        } else if (id == R.id.user_doctors) {
            //fragement_for_user_doctors fragement_for_user_doctors = new fragement_for_user_doctors();

            fragment = new fragement_for_user_doctors();


        } else if (id == R.id.user_hospital) {

            fragment = new fragement_for_user_hospital();

        } else if (id == R.id.user_laboratories) {

            fragment = new fragment_for_user_laboratories();

        } else if (id == R.id.user_clinics) {

            fragment = new fragment_for_user_clinic();

        } else if (id == R.id.user_nurses) {

            fragment = new fragment_for_user_nurse();

        }
        else if(id == R.id.user_profile){

            fragment = new fragment_for_user_profile();

        }
        else if(id == R.id.user_features){
            fragment = new fragment_for_user_feature();
        }

        if(fragment != null){
            Activity activity;
            android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_switch,fragment,"themainfragment").commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

            @Override
            public void onAttachFragment(Fragment fragment) {
                super.onAttachFragment(fragment);
            }
        }
