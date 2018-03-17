package com.example.syanaz.syanaztasia_1202152327_studycase4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Syanaz on 3/17/2018.
 */

public class PencariGambar extends AppCompatActivity {
    //mendeklarasikan variabel yang dibutuhkan
    ImageView gambar;
    EditText sumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pencari_gambar);
        setTitle("AsyncTask"); //set title pada tampilan

        //memanggil variabel yang ada pada layout
        gambar = (ImageView) findViewById(R.id.gambar);
        sumber = (EditText) findViewById(R.id.link);
    }

    //method saat button ditekan
    public void cari(View view) {
        //loading gambar dari internet ke imageview
        Picasso.with(PencariGambar.this).load(sumber.getText().toString())
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher)
                .into(gambar);
    }
}