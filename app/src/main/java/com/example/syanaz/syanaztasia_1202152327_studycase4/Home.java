package com.example.syanaz.syanaztasia_1202152327_studycase4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Syanaz on 3/17/2018.
 */

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("AsyncTask");
    }
    //method saat button ditekan
    public void mahasiswa(View view) {
        //untuk berpindah ke aktivitas mahasiswa//
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    //method saat button ditekan
    public void gambar(View view) {
        //untuk berpindah ke aktivitas gambar//
        Intent intent = new Intent(this, PencariGambar.class);
        startActivity(intent);
    }
}