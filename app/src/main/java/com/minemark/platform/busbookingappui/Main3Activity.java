package com.minemark.platform.busbookingappui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Date;

public class Main3Activity extends AppCompatActivity {

ImageView backbuttons;
TextView tarihh;
TextView seferr;
TextView pricee;
TextView saat;
TextView bilgii;
TextView nereyes;
TextView neredens;
TextView tfiyat;
CardView cardView;
TextView infos;
RadioGroup rgrb;
RadioButton bilet1;
    RadioButton bilet2;
    RadioButton bilet3;
    RadioButton bilet4;
    RadioButton bilet5;
    Button satinal;
    TextView textView3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main3);

        rgrb = findViewById(R.id.rgrb);
        cardView = findViewById(R.id.cardView);
        tarihh  = findViewById(R.id.tarihh);
        seferr = findViewById(R.id.seferr);
        pricee = findViewById(R.id.pricee);
        saat = findViewById(R.id.saat);
        bilgii = findViewById(R.id.bilgii);
        nereyes = findViewById(R.id.nereyes);
        neredens = findViewById(R.id.neredens);
        backbuttons = findViewById(R.id.backbuttons);
        infos = findViewById(R.id.infos);
        bilet1 = findViewById(R.id.bilet1);
        bilet2 = findViewById(R.id.bilet2);
        bilet3 = findViewById(R.id.bilet3);
        bilet4 = findViewById(R.id.bilet4);
        bilet5 = findViewById(R.id.bilet5);
        tfiyat= findViewById(R.id.tfiyat);
        satinal=findViewById(R.id.satınal);
        textView3=findViewById(R.id.textView3);

        String suankitarih = java.text.DateFormat.getDateTimeInstance().format(new Date());
        textView3.setText(suankitarih);


        String nereyess = getIntent().getExtras().getString("nereyes");
        nereyes.setText(nereyess);
        String neredenss = getIntent().getExtras().getString("neredens");
        neredens.setText(neredenss);




        int option1 = getIntent().getIntExtra("opt1", 0);
        int option2 = getIntent().getIntExtra("opt2",0);
        int option3 = getIntent().getIntExtra("opt3", 0);
        int option4 = getIntent().getIntExtra("opt4", 0);
        int option5 = getIntent().getIntExtra("opt5", 0);



        if(option1==1)
       {String a1 = getIntent().getExtras().getString("info1");
        tarihh.setText(a1);
        String b1 = getIntent().getExtras().getString("info2");
        seferr.setText(b1);
        String c1= getIntent().getExtras().getString("info3");
        pricee.setText(c1);
        String d1 = getIntent().getExtras().getString("info4");
        saat.setText(d1);
        String e1 = getIntent().getExtras().getString("info5");
        bilgii.setText(e1);
           infos.setText(neredenss +" - "+nereyess+" - "+a1+" - "+d1+" - "+b1+" - "+e1+" - "+"Fiyat "+c1+"₺");

       }

      if(option2==1)
      {String a2 = getIntent().getExtras().getString("info6");
        tarihh.setText(a2);
        String b2 = getIntent().getExtras().getString("info7");
        seferr.setText(b2);
        String c2 = getIntent().getExtras().getString("info8");
        pricee.setText(c2);
        String d2 = getIntent().getExtras().getString("info9");
        saat.setText(d2);
        String e2 = getIntent().getExtras().getString("info10");
        bilgii.setText(e2);
          infos.setText(neredenss +" - "+nereyess+" - "+a2+" - "+d2+" - "+b2+" - "+e2+" - "+"Fiyat "+c2+"₺");


      }


      if(option3==1)
      { String a3 = getIntent().getExtras().getString("info11");
        tarihh.setText(a3);
        String b3 = getIntent().getExtras().getString("info12");
        seferr.setText(b3);
        String c3 = getIntent().getExtras().getString("info13");
        pricee.setText(c3);
        String d3 = getIntent().getExtras().getString("info14");
        saat.setText(d3);
        String e3 = getIntent().getExtras().getString("info15");
        bilgii.setText(e3);
          infos.setText(neredenss +" - "+nereyess+" - "+a3+" - "+d3+" - "+b3+" - "+e3+" - "+"Fiyat "+c3+"₺");



      }


        if(option4==1)
        {   String a4 = getIntent().getExtras().getString("info16");
        tarihh.setText(a4);
        String b4 = getIntent().getExtras().getString("info17");
        seferr.setText(b4);
        String c4 = getIntent().getExtras().getString("info18");
        pricee.setText(c4);
        String d4 = getIntent().getExtras().getString("info19");
        saat.setText(d4);
        String e4 = getIntent().getExtras().getString("info20");
        bilgii.setText(e4);
            infos.setText(neredenss +" - "+nereyess+" - "+a4+" - "+d4+" - "+b4+" - "+e4+" - "+"Fiyat "+c4+"₺");



        }


        if(option5==1)
        {   String a5 = getIntent().getExtras().getString("info21");
        tarihh.setText(a5);
        String b5 = getIntent().getExtras().getString("info22");
        seferr.setText(b5);
        String c5 = getIntent().getExtras().getString("info23");
        pricee.setText(c5);
        String d5 = getIntent().getExtras().getString("info24");
        saat.setText(d5);
        String e5 = getIntent().getExtras().getString("info25");
        bilgii.setText(e5);
            infos.setText(neredenss +" - "+nereyess+" - "+a5+" - "+d5+" - "+b5+" - "+e5+" - "+"Fiyat "+c5+"₺");



        }

                rgrb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                        switch (checkedId) {
                            case R.id.bilet1:
                                int a = Integer.parseInt(pricee.getText().toString());
                                int islem = a;
                                tfiyat.setText(String.valueOf("Toplam Fiyat:" + islem + "₺"));
                                break;

                            case R.id.bilet2:
                                int b = Integer.parseInt(pricee.getText().toString());
                                int islem1 = b * 2;
                                tfiyat.setText("Toplam Fiyat:" + islem1 + "₺");
                                break;


                            case R.id.bilet3:
                                int c = Integer.parseInt(pricee.getText().toString());
                                int islem2 = c * 3;
                                tfiyat.setText(String.valueOf("Toplam Fiyat:" + islem2 + "₺"));
                                break;


                            case R.id.bilet4:
                                int d = Integer.parseInt(pricee.getText().toString());
                                int islem3 = d * 4;
                                tfiyat.setText(String.valueOf("Toplam Fiyat:" + islem3 + "₺"));
                                break;

                            case R.id.bilet5:
                                int e = Integer.parseInt(pricee.getText().toString());
                                int islem4 = e * 5;
                                tfiyat.setText("Toplam Fiyat:" + islem4 + "₺");
                                break;
                        }
                    }
                });

        satinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogEkrani = new AlertDialog.Builder(Main3Activity.this);
                dialogEkrani.setTitle("Tebrikler Başarıyla Satın Aldınız!");
                dialogEkrani.setMessage("Bilet alışverişinizi tamamladınız lütfen yapmak istediğinizi seçin...");
                dialogEkrani.setPositiveButton("Anasayfaya Dön", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent intent = new Intent(Main3Activity.this, MainActivity.class);
                                Main3Activity.this.startActivity(intent);

                        }
                });
                dialogEkrani.setNegativeButton("Bilgilerime Dön", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Main3Activity.this, userinfo.class);
                        Main3Activity.this.startActivity(intent);

                    }
                });
                AlertDialog dialog = dialogEkrani.create();
                dialog.show();
            }
        });




   backbuttons.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           onBackPressed();
       }
   });

    }
}
