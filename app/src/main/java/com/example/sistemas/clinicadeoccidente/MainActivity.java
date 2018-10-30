package com.example.sistemas.clinicadeoccidente;


import android.content.Intent;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.FrameLayout;

import com.example.sistemas.clinicadeoccidente.MenuNavBar.NavegationBar;

public class MainActivity extends AppCompatActivity /*implements BottomNavigationView.OnNavigationItemSelectedListener*/ {

    CardView cdvaten_gener, cdvaten_preferen;
    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigationView = findViewById(R.id.navbar);


        final FragmentManager fragmentManager = getSupportFragmentManager();

        //CardView
        cdvaten_gener = (CardView)findViewById(R.id.Menu_1_Id);

        cdvaten_gener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), PacientGeneralActivity.class);
                startActivityForResult(intent, 0);

            }
        });

        cdvaten_preferen = (CardView)findViewById(R.id.Menu_2_Id);

        cdvaten_preferen.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), PacientPreferencialActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }


}
