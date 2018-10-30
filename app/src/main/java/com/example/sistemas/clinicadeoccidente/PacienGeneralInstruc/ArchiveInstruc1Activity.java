package com.example.sistemas.clinicadeoccidente.PacienGeneralInstruc;

import android.media.SoundPool;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sistemas.clinicadeoccidente.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.shockwave.pdfium.PdfDocument;

import java.util.List;

public class ArchiveInstruc1Activity extends AppCompatActivity implements OnPageChangeListener,OnLoadCompleteListener {

    PDFView pdfView;
    Integer pageNumber = 0;
    String pdfFileName;


    private static final String TAG = ArchiveInstruc1Activity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archive_instruc1);

        pdfView = (PDFView)findViewById(R.id.PacienGeneralArchi1_id);
        pdfView.fromAsset("atenpacient.pdf").defaultPage(pageNumber).enableSwipe(true)
                .swipeHorizontal(false)
                .onPageChange(this)
                .enableAnnotationRendering(true)
                .onLoad((OnLoadCompleteListener) this)
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
