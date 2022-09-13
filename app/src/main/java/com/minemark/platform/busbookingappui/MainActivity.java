package com.minemark.platform.busbookingappui;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button otoara;
    Spinner nereyetext;
    Spinner neredentext;
    ImageView userinfo;
    TextView isimsoyisim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        otoara = findViewById(R.id.otoara);
        userinfo = findViewById(R.id.userinfo);
        nereyetext = findViewById(R.id.nereyetext);
        neredentext = findViewById(R.id.neredentext);
        isimsoyisim = findViewById(R.id.isimsoyisim);

        final String a = getIntent().getExtras().getString("isim");
       final String b = getIntent().getExtras().getString("soyisim");
        isimsoyisim.setText(a+" "+b);


        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.ulkeler, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        neredentext.setPrompt("Nereden");
        neredentext.setAdapter(new NothingSelectedSpinnerAdapter(
                adapter,
                R.layout.contact_spinner_row_nothing_selected,this));



        ArrayAdapter<CharSequence>adapter1=ArrayAdapter.createFromResource(this,R.array.ulkeler2, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        nereyetext.setPrompt("Nereye");
        nereyetext.setAdapter(new NothingSelectedSpinnerAdapter1(
                adapter1,
                R.layout.contact_spinner_row_nothing_selected1,this));



        otoara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String destination = nereyetext.getSelectedItem().toString();
                String from = neredentext.getSelectedItem().toString();
                if (from.equals(destination) && destination.equals(from))
                {
                    Toast.makeText(getApplicationContext(), "Lütfen Farklı şehirler seçiniz!", Toast.LENGTH_SHORT).show();}
                else
                { Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("nereye", destination);
                intent.putExtra("nereden",from);
                startActivity(intent); }


            }
        });

        userinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), userinfo.class);
                String ad = String.valueOf(a);
                intent.putExtra("ad", ad);
                String soyad = String.valueOf(b);
                intent.putExtra("soyad", soyad);
                startActivity(intent);
            }
        });
    }
}
