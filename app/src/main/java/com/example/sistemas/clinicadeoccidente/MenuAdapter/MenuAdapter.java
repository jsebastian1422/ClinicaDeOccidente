package com.example.sistemas.clinicadeoccidente.MenuAdapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sistemas.clinicadeoccidente.PacienGeneralInstruc.ArchiveInstruc1Activity;
import com.example.sistemas.clinicadeoccidente.PacientPreferencialActivity;
import com.example.sistemas.clinicadeoccidente.R;

public class MenuAdapter extends BaseAdapter {

    String [] resultado;
    int [] imgId;
    Context context;

    private static LayoutInflater inflater = null;

    public MenuAdapter (PacientPreferencialActivity pacientPreferencialActivity, String[]progNombreLista, int[]progImg){

        resultado = progNombreLista;
        context = pacientPreferencialActivity;
        imgId = progImg;

        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return resultado.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder{
        TextView textView;
        ImageView imageView;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        Holder holder = new Holder();
        View fila;

        fila = inflater.inflate(R.layout.list_temes,null);
        holder.textView = (TextView) fila.findViewById(R.id.textViewTema);
        holder.imageView = (ImageView) fila.findViewById(R.id.imgTema);
        holder.textView.setText(resultado[position]);
        holder.imageView.setImageResource(imgId[position]);

        fila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (position){

                    case 0:
                        Intent intent = new Intent(context, ArchiveInstruc1Activity.class);
                        context.startActivity(intent);
                        break;
                    case 1:
                        Intent intent2 = new Intent(context, ArchiveInstruc1Activity.class);
                        context.startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3 = new Intent(context, ArchiveInstruc1Activity.class);
                        context.startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4 = new Intent(context, ArchiveInstruc1Activity.class);
                        context.startActivity(intent4);
                        break;
                    case 4:
                        Intent intent5 = new Intent(context, ArchiveInstruc1Activity.class);
                        context.startActivity(intent5);
                        break;
                    case 5:
                        Intent intent6 = new Intent(context, ArchiveInstruc1Activity.class);
                        context.startActivity(intent6);
                        break;
                }

                Toast.makeText(context, "Seleccionaste "+resultado[position],
                        Toast.LENGTH_LONG).show();
            }
        });

        return fila;
    }




}
