package com.example.sistemas.clinicadeoccidente;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.sistemas.clinicadeoccidente.PacienGeneralInstruc.ArchiveInstruc1Activity;

import java.util.ArrayList;

public class PacientPreferencialActivity extends AppCompatActivity {

    ListView listView;
    Context context;

    ArrayList listTemas;

    public static int[] progImg = {R.drawable.ic_dybdp,R.drawable.ic_ambisegudp,R.drawable.ic_clasresdp,R.drawable.ic_normaisldp,R.drawable.ic_hospitaldp,R.drawable.ic_hospitaldp};

    public static String[] progNombreLista = {"Tema 1", "Tema 2", "Tema 3","Tema 4", "Tema 5", "Tema 6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pacient_preferencial);

        context = this;

        listView = (ListView)findViewById(R.id.Menu_PaciePreferencial_id);
        listView.setAdapter(new com.example.sistemas.clinicadeoccidente.MenuAdapter.MenuAdapter(this, progNombreLista,progImg));

    }
}
