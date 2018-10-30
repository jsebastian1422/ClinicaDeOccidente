package com.example.sistemas.clinicadeoccidente.MenuNavBar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.sistemas.clinicadeoccidente.R;


public class NavegationBar  extends AppCompatActivity {

    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;


    //@SuppressLint("ResourceType")
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navegation_bar);

        mMainFrame = (FrameLayout)findViewById(R.id.main_frame_id);
        mMainNav = (BottomNavigationView)findViewById(R.id.navbar);


        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment;

                switch (menuItem.getItemId()){

                    case R.id.home_id:
                        Toast.makeText(NavegationBar.this, "Selecciono Home", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.acount_id:
                        Toast.makeText(NavegationBar.this, "Selecciono Acount", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.healing_id:
                        Toast.makeText(NavegationBar.this, "Selecciono Healing", Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;
            }
        });

    }

    private void loadFragment(Fragment fragment){

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame_id,fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
