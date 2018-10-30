package com.example.sistemas.clinicadeoccidente.PacienGeneralInstruc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sistemas.clinicadeoccidente.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.listener.OnRenderListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class PdfViewPacienteGeneralActivity extends AppCompatActivity implements OnPageChangeListener,OnLoadCompleteListener{

    PDFView pdfView;
    Integer pageNumber = 0;
    String pdfFileName;

    private static final String TAG = ArchiveInstruc1Activity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view_pacient_general);

        getIntent().getExtras().getString("cargapdf");

        pdfView = (PDFView)findViewById(R.id.PacienGeneralArchi1_id);
        pdfView.fromAsset(getIntent().getExtras().getString("cargapdf")).defaultPage(pageNumber).enableSwipe(true)
                .swipeHorizontal(false)
                .onPageChange(this)
                .enableAnnotationRendering(true)
                .onLoad((OnLoadCompleteListener) this)
                .spacing(7)
                .scrollHandle(new DefaultScrollHandle(this))
                .load();
    }


    @Override
    public void loadComplete(int nbPages) {

    }

    @Override
    public void onPageChanged(int page, int pageCount) {

    }
}
