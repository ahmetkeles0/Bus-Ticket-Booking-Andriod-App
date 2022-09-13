package com.minemark.platform.busbookingappui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class userinfo extends AppCompatActivity {

    ImageView backbutton;
    TextView isimsoyisim1;
    TextView bilgiadsoyad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);

        isimsoyisim1 = findViewById(R.id.isimsoyisim1);
        backbutton = findViewById(R.id.backbutton);
       /* bilgiadsoyad = findViewById(R.id.bilgiadsoyad);

    String ads= getIntent().getExtras().getString("ad");
    String soyads= getIntent().getExtras().getString("soyad");
    isimsoyisim1.setText(ads+" "+soyads);
    bilgiadsoyad.setText(ads+" "+soyads);*/






        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
