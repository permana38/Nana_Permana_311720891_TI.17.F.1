package com.example.hospital_uas;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageview;
    TextView rumahsakit, inforumahsakit, fasilitas1;
    TextView notelpon1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imageview = findViewById(R.id.imageviewfoto);
        rumahsakit = findViewById(R.id.rumahsakit);
        inforumahsakit = findViewById(R.id.info);
        fasilitas1 = findViewById(R.id.fasilitas);
        notelpon1 = findViewById(R.id.notelpon);

        getIncomingExtra();

    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("foto_rumahsakit") && getIntent().hasExtra("nama_rumahsakit") && getIntent().hasExtra("info") && getIntent().hasExtra("fasilitas") && getIntent().hasExtra("notelpon")){

            String fotorumahsakit = getIntent().getStringExtra("foto_rumahsakit");
            String namarumahsakit = getIntent().getStringExtra("nama_rumahsakit");
            String info = getIntent().getStringExtra("info");
            String fasilitas = getIntent().getStringExtra("fasilitas");
            String notelpon = getIntent().getStringExtra("notelpon");

            setDataActivity(fotorumahsakit, namarumahsakit, info, fasilitas, notelpon);

        }
    }

    private void setDataActivity(String fotorumahsakit, String namarumahsakit, String info, String fasilitas, String notelpon){


        Glide.with(this).asBitmap().load(fotorumahsakit).into(imageview);
        rumahsakit.setText(namarumahsakit);
        inforumahsakit.setText(info);
        fasilitas1.setText(fasilitas);
        notelpon1.setText(notelpon);






    }

}
