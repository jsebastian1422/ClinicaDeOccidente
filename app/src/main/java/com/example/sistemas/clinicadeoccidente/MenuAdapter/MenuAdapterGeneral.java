package com.example.sistemas.clinicadeoccidente.MenuAdapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sistemas.clinicadeoccidente.PacienGeneralInstruc.ArchiveInstruc1Activity;
import com.example.sistemas.clinicadeoccidente.PacienGeneralInstruc.PdfViewPacienteGeneralActivity;
import com.example.sistemas.clinicadeoccidente.PacientGeneralActivity;
import com.example.sistemas.clinicadeoccidente.R;

public class MenuAdapterGeneral extends BaseAdapter {

    String [] resultado;
    int [] imgId;
    Context context;

    private static LayoutInflater inflater = null;

    public MenuAdapterGeneral(PacientGeneralActivity pacientGeneralActivity, String[] progNombreLista, int[] progImg) {

        resultado = progNombreLista;
        context = pacientGeneralActivity;
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
                        Intent intent = new Intent(context, PdfViewPacienteGeneralActivity.class);
                        intent.putExtra("cargapdf", "af_derech_y_deb_plegado.pdf");
                        context.startActivity(intent);
                        break;
                    case 1:
                        Intent intent2 = new Intent(context, PdfViewPacienteGeneralActivity.class);
                        intent2.putExtra("cargapdf", "af_folleto_ambiente_seguro.pdf");
                        context.startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3 = new Intent(context, PdfViewPacienteGeneralActivity.class);
                        intent3.putExtra("cargapdf", "clasificacion_de_residuos.pdf");
                        context.startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4 = new Intent(context, PdfViewPacienteGeneralActivity.class);
                        intent4.putExtra("cargapdf", "normas_de_aislamiento2017.pdf");
                        context.startActivity(intent4);
                        break;
                    case 4:
                        Intent intent5 = new Intent(context, PdfViewPacienteGeneralActivity.class);
                        intent5.putExtra("cargapdf", "normas_de_hospitalizacion.pdf");
                        context.startActivity(intent5);
                        break;
                    case 5:
                        Intent intent6 = new Intent(context, PdfViewPacienteGeneralActivity.class);
                        intent6.putExtra("cargapdf", "af_uci_adultos.pdf");
                        context.startActivity(intent6);
                        break;
                }

                Toast.makeText(context, "Abriendo "+resultado[position],
                        Toast.LENGTH_LONG).show();
            }
        });
        return fila;
    }
}
