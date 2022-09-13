package com.minemark.platform.busbookingappui;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loginpage extends AppCompatActivity {

    Button continuebutton;
    EditText isim;
    EditText soyisim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        isim = findViewById(R.id.isim);
        soyisim = findViewById(R.id.soyisim);
        continuebutton = findViewById(R.id.continuebutton);

        continuebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(isim.getText())){
                    isim.setError("Lütfen devam etmek için isminizi giriniz.");
                }
                else if (TextUtils.isEmpty(soyisim.getText())){
                    soyisim.setError("Lütfen devam etmek için soyisminizi giriniz");
                }
                else {
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    String name = isim.getText().toString();
                    String surname = soyisim.getText().toString();
                    intent.putExtra("isim",name);
                    intent.putExtra("soyisim",surname);
                    startActivity(intent);
                }
            }
        });


    }


}