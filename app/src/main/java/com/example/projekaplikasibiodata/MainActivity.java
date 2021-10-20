package com.example.projekaplikasibiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    Button alamat;
    Button telepon;
    Button email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alamat = findViewById(R.id.alamat);
        telepon = findViewById(R.id.telepon);
        email = findViewById(R.id.email);

        alamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.co.id/maps/place/Jl.+Pelem+Golek+II,+Tambakaji,+Kec.+Ngaliyan,+Kota+Semarang,+Jawa+Tengah+50185/@-6.9846816,110.3431026,15z/data=!3m1!4b1!4m5!3m4!1s0x2e708ab6600b7a59:0xc5b0bd03f29c9e84!8m2!3d-6.9846817!4d110.3518574");

            }
        });



        telepon.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            gotoUrl("https://wa.me/6281804124208");

        }
    });
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("mailto:alipfarha@gmail.com");

            }
        });


}


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}