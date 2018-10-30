package com.example.sistemas.clinicadeoccidente;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.sistemas.clinicadeoccidente.MenuAdapter.MenuAdapterGeneral;

import java.util.ArrayList;

public class PacientGeneralActivity extends AppCompatActivity {

    ListView listView;
    Context context;

    ArrayList lisTemas;

    public static int[] progImg = {R.drawable.ic_dybdp,R.drawable.ic_ambisegudp,R.drawable.ic_clasresdp,R.drawable.ic_normaisldp,R.drawable.ic_hospitaldp,R.drawable.ic_hospitaldp};

    public static String[] progNombreLista = {"Derechos y Deberes", "Ambiente Seguro", "Clasificación de Residuos","Normas de Aislamiento", "Normas de Hospitalización",
            "UCI Adultos"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pacient_general);

        context = this;
        listView = (ListView)findViewById(R.id.Menu_PacieGeneral_id);
        listView.setAdapter(new com.example.sistemas.clinicadeoccidente.MenuAdapter.MenuAdapterGeneral(this, progNombreLista,progImg));
    }
}
