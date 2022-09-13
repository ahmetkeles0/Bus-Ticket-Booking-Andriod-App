package com.minemark.platform.busbookingappui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Date;

public class Main2Activity extends AppCompatActivity {

    ImageView reversebutton; CardView cardView1;TextView nereye1;TextView nereden;ImageView backbutton;TextView tarih1;TextView filo1;TextView price1;TextView saat1;TextView tarih2;TextView filo2;TextView price2;TextView saat2;TextView tarih3;TextView filo3;TextView price3;TextView saat3;TextView tarih4;TextView filo4;TextView price4;TextView saat4;TextView tarih5;TextView filo5;TextView price5;TextView saat5;TextView bilgi1;TextView bilgi2;TextView bilgi3;TextView bilgi4;TextView bilgi5;
   CardView cardView2; CardView cardView3; CardView cardView4; CardView cardView5; TextView tarihs;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);
        reversebutton = findViewById(R.id.reversebutton);
        cardView1 = findViewById(R.id.cardView1);
        cardView2=findViewById(R.id.cardView2);
        cardView3=findViewById(R.id.cardView3);
        cardView4=findViewById(R.id.cardView4);
        cardView5=findViewById(R.id.cardView5);
        backbutton = findViewById(R.id.backbutton);
        tarih1 = findViewById(R.id.tarih1);filo1 = findViewById(R.id.filo1);price1 = findViewById(R.id.price1);saat1 = findViewById(R.id.saat1);
        tarih2 = findViewById(R.id.tarih2);filo2 = findViewById(R.id.filo2);price2 = findViewById(R.id.price2);saat2 = findViewById(R.id.saat2);
        tarih3 = findViewById(R.id.tarih3);filo3 = findViewById(R.id.filo3);price3 = findViewById(R.id.price3);saat3 = findViewById(R.id.saat3);
        tarih4 = findViewById(R.id.tarih4);filo4 = findViewById(R.id.filo4);price4 = findViewById(R.id.price4);saat4 = findViewById(R.id.saat4);
        tarih5 = findViewById(R.id.tarih5);filo5 = findViewById(R.id.filo5);price5 = findViewById(R.id.price5);saat5 = findViewById(R.id.saat5);
        tarihs = findViewById(R.id.tarihs);
        bilgi1 = findViewById(R.id.bilgi1);bilgi2 = findViewById(R.id.bilgi2);bilgi3 = findViewById(R.id.bilgi3);bilgi4 = findViewById(R.id.bilgi4);bilgi5 = findViewById(R.id.bilgi5);

        String suankitarih = java.text.DateFormat.getDateTimeInstance().format(new Date());
        tarihs.setText(suankitarih);


        nereye1 = findViewById(R.id.nereye1);
        String a=getIntent().getExtras().getString("nereye");
        nereye1.setText(a);
        final String fro = nereye1.getText().toString();

        nereden = findViewById(R.id.nereden);
        String b = getIntent().getExtras().getString("nereden");
        nereden.setText(b);
        final String dest = nereden.getText().toString();


        if (dest.equals("İstanbul") && fro.equals("İzmir")) {
            tarih1.setText("7:00 - 14:30");
            filo1.setText("Vatan");
            price1.setText("120");
            saat1.setText("6 Saat 30 Dakika");
            bilgi1.setText("Klima, Yiyecek & İçecek Servisi");

            tarih2.setText("8:30 - 15:15");
            filo2.setText("Pamukkale");
            price2.setText("150");
            saat2.setText("6 Saat 45 Dakika");
            bilgi2.setText("Yiyecek & İçecek Servisi");

            tarih3.setText("10:15 - 17:30");
            filo3.setText("Ulusoy");
            price3.setText("170");
            saat3.setText("7 Saat 15 Dakika");
            bilgi3.setText("Klima, Televizyon ve İçecek Servisi");

            tarih4.setText("12:00 - 19:00");
            filo4.setText("Koç");
            price4.setText("140");
            saat4.setText("7 Saat");
            bilgi4.setText("Yiyecek & İçecek Servisi");

            tarih5.setText("18:00 - 00:30");
            filo5.setText("Metro");
            price5.setText("110");
            saat5.setText("6 Saat 30 Dakika");
            bilgi5.setText("Televizyon ve İçecek Servisi");
        } else if (dest.equals("İstanbul") && fro.equals("Ankara")) {
            tarih1.setText("7:30 - 9:30");
            filo1.setText("Ulusoy");
            price1.setText("50");
            saat1.setText("2 Saat");
            bilgi1.setText("Servis Yok");

            tarih2.setText("9:00 - 12:30");
            filo2.setText("Vatan");
            price2.setText("65");
            saat2.setText("2 Saat 30 Dakika");
            bilgi2.setText("Klima");

            tarih3.setText("11:30 - 14:15");
            filo3.setText("Metro");
            price3.setText("95");
            saat3.setText("3 Saat 15 Dakika");
            bilgi3.setText("Klima, Yiyecek & İçecek Servisi");

            tarih4.setText("12:00 - 15:15");
            filo4.setText("Koç");
            price4.setText("80");
            saat4.setText("3 Saat 15 Dakika");
            bilgi4.setText("Klima & İçecek Servisi");

            tarih5.setText("17:00 - 19:30");
            filo5.setText("Pamukkale");
            price5.setText("65");
            saat5.setText("2 Saat 30 Dakika");
            bilgi5.setText("İçecek Servisi");
        } else if (dest.equals("İstanbul") && fro.equals("Antalya")) {
            tarih1.setText("10:00 - 21:30");
            filo1.setText("Ulusoy");
            price1.setText("170");
            saat1.setText("9 Saat 30 Dakika");
            bilgi1.setText("Yiyecek & İçecek Servisi");

            tarih2.setText("12:00 - 22:15");
            filo2.setText("Vatan");
            price2.setText("240");
            saat2.setText("10 Saat 15 Dakika");
            bilgi2.setText("Klima, Yiyecek & İçecek Servisi");

            tarih3.setText("16:00 - 03:30");
            filo3.setText("Metro");
            price3.setText("200");
            saat3.setText("11 Saat 30 Dakika");
            bilgi3.setText("Klima, Yiyecek & İçecek Servisi");

            tarih4.setText("20:30 - 04:15");
            filo4.setText("Pamukkale");
            price4.setText("210");
            saat4.setText("8 Saat 15 Dakika");
            bilgi4.setText("Yiyecek & İçecek Servisi");

            tarih5.setText("00:30 - 08:00");
            filo5.setText("Koç");
            price5.setText("215");
            saat5.setText("7 Saat 30 Dakika");
            bilgi5.setText("Televizyon, Yiyecek & İçecek Servisi");
        } else if (dest.equals("İzmir") && fro.equals("İstanbul")) {
            tarih1.setText("8:15 - 14:45");
            filo1.setText("Vatan");
            price1.setText("130");
            saat1.setText("6 Saat 30 Dakika");
            bilgi1.setText("Klima, Yiyecek & İçecek Servisi");

            tarih2.setText("8:30 - 13:00");
            filo2.setText("Pamukkale");
            price2.setText("190");
            saat2.setText("5 Saat 30 Dakika");
            bilgi2.setText("Yiyecek & İçecek Servisi");

            tarih3.setText("10:15 - 17:30");
            filo3.setText("Ulusoy");
            price3.setText("170");
            saat3.setText("7 Saat 15 Dakika");
            bilgi3.setText("Klima, Televizyon ve İçecek Servisi");

            tarih4.setText("12:00 - 19:00");
            filo4.setText("Koç");
            price4.setText("140");
            saat4.setText("7 Saat");
            bilgi4.setText("Yiyecek & İçecek Servisi");

            tarih5.setText("18:00 - 00:30");
            filo5.setText("Metro");
            price5.setText("110");
            saat5.setText("6 Saat 30 Dakika");
            bilgi5.setText("Televizyon ve İçecek Servisi");
        } else if (dest.equals("İzmir") && fro.equals("Ankara")) {
            tarih1.setText("9:35 - 13:45");
            filo1.setText("Vatan");
            price1.setText("110");
            saat1.setText("4 Saat 10 Dakika");
            bilgi1.setText("Klima, Yiyecek & İçecek Servisi");

            tarih2.setText("11:30 - 15:10");
            filo2.setText("Pamukkale");
            price2.setText("150");
            saat2.setText("3 Saat 40 Dakika");
            bilgi2.setText("Yiyecek & İçecek Servisi");

            tarih3.setText("14:00 - 19:30");
            filo3.setText("Ulusoy");
            price3.setText("110");
            saat3.setText("5 Saat 30 Dakika");
            bilgi3.setText("İçecek Servisi");

            tarih4.setText("18:00 - 21:00");
            filo4.setText("Koç");
            price4.setText("190");
            saat4.setText("3 Saat");
            bilgi4.setText("Klima, Televizyon ,Yiyecek & İçecek Servisi");

            tarih5.setText("22:30 - 02:30");
            filo5.setText("Metro");
            price5.setText("140");
            saat5.setText(" 4 Saat ");
            bilgi5.setText("Televizyon ve İçecek Servisi");
        } else if (dest.equals("İzmir") && fro.equals("Antalya")) {
            tarih1.setText("13:45 - 21:30");
            filo1.setText("Pamukkale");
            price1.setText("80");
            saat1.setText("7 Saat 45 Dakika");
            bilgi1.setText("Klima, Yiyecek & İçecek Servisi");

            tarih2.setText("14:00 - 21:30");
            filo2.setText("Vatan");
            price2.setText("80");
            saat2.setText("7 Saat 30 Dakika");
            bilgi2.setText("Yiyecek & İçecek Servisi");

            tarih3.setText("14:45 - 23:15");
            filo3.setText("Metro");
            price3.setText("90");
            saat3.setText("8 Saat 30 Dakika");
            bilgi3.setText("İçecek Servisi");

            tarih4.setText("19:45 - 03:20");
            filo4.setText("Ulusoy");
            price4.setText("110");
            saat4.setText("7 Saat 35 Dakika");
            bilgi4.setText("Yiyecek & İçecek Servisi");

            tarih5.setText("23:45 - 07:10");
            filo5.setText("Koç");
            price5.setText("85");
            saat5.setText(" 7 Saat 25 Dakika ");
            bilgi5.setText("Televizyon ve İçecek Servisi");
        } else if (dest.equals("Ankara") && fro.equals("İstanbul")) {
            tarih1.setText("8:00 - 11:15");
            filo1.setText("Ulusoy");
            price1.setText("70");
            saat1.setText("3 Saat 15 Dakika ");
            bilgi1.setText("Servis Yok");

            tarih2.setText("10:00 - 14:30");
            filo2.setText("Vatan");
            price2.setText("65");
            saat2.setText("4 Saat 30 Dakika");
            bilgi2.setText("Klima, İçecek Servisi");

            tarih3.setText("12:00 - 15:00");
            filo3.setText("Metro");
            price3.setText("110");
            saat3.setText("3 Saat");
            bilgi3.setText("Klima, Yiyecek & İçecek Servisi");

            tarih4.setText("15:00 - 17:45");
            filo4.setText("Koç");
            price4.setText("90");
            saat4.setText("2 Saat 45 Dakika");
            bilgi4.setText("Klima & İçecek Servisi");

            tarih5.setText("20:00 - 23:15");
            filo5.setText("Pamukkale");
            price5.setText("70");
            saat5.setText("3 Saat 15 Dakika");
            bilgi5.setText("İçecek Servisi");
        } else if (dest.equals("Ankara") && fro.equals("İzmir")) {
            tarih1.setText("14:30 - 22:25");
            filo1.setText("Metro");
            price1.setText("100");
            saat1.setText("7 Saat 55 Dakika ");
            bilgi1.setText("Yiyecek, İçecek Servisi");

            tarih2.setText("16:30 - 00:30");
            filo2.setText("Pamukkale");
            price2.setText("130");
            saat2.setText("8 Saat");
            bilgi2.setText("Televizyon, Klima, İçecek Servisi");

            tarih3.setText("18:00 - 01:55");
            filo3.setText("Ulusoy");
            price3.setText("110");
            saat3.setText("7 Saat 55 Dakika");
            bilgi3.setText("Yiyecek & İçecek Servisi");

            tarih4.setText("19:30 - 04:00");
            filo4.setText("Koç");
            price4.setText("90");
            saat4.setText("8 Saat 30 Dakika");
            bilgi4.setText("Klima & İçecek Servisi");

            tarih5.setText("22:00 - 06:15");
            filo5.setText("Vatan");
            price5.setText("120");
            saat5.setText("8 Saat 15 Dakika");
            bilgi5.setText("Yiyecek & İçecek Servisi");
        } else if (dest.equals("Ankara") && fro.equals("Antalya")) {
            tarih1.setText("15:00 - 22:45");
            filo1.setText("Metro");
            price1.setText("120");
            saat1.setText("7 Saat 45 Dakika ");
            bilgi1.setText("Televizyon, Klima, Yiyecek & İçecek Servisi");

            tarih2.setText("17:30 - 01:30");
            filo2.setText("Pamukkale");
            price2.setText("100");
            saat2.setText("8 Saat");
            bilgi2.setText("Klima, Yiyecek & İçecek Servisi");

            tarih3.setText("20:00 - 04:00");
            filo3.setText("Ulusoy");
            price3.setText("120");
            saat3.setText("8 Saat");
            bilgi3.setText("Yiyecek & İçecek Servisi");

            tarih4.setText("23:00 - 08:00");
            filo4.setText("Koç");
            price4.setText("110");
            saat4.setText("9 Saat");
            bilgi4.setText("Klima, Yiyecek & İçecek Servisi");

            tarih5.setText("23:59 - 08:00");
            filo5.setText("Vatan");
            price5.setText("120");
            saat5.setText("8 Saat 1 Dakika");
            bilgi5.setText("Yiyecek & İçecek Servisi");
        } else if (dest.equals("Antalya") && fro.equals("İstanbul")) {
            tarih1.setText("17:00 - 05:00");
            filo1.setText("Ulusoy");
            price1.setText("155");
            saat1.setText("12 Saat");
            bilgi1.setText("Yiyecek & İçecek Servisi");

            tarih2.setText("17:00 - 06:10");
            filo2.setText("Vatan");
            price2.setText("180");
            saat2.setText("13 Saat 10 Dakika");
            bilgi2.setText("Klima, Yiyecek & İçecek Servisi");

            tarih3.setText("19:00 - 07:05");
            filo3.setText("Metro");
            price3.setText("170");
            saat3.setText("12 Saat 5 Dakika");
            bilgi3.setText("Klima, Yiyecek & İçecek Servisi");

            tarih4.setText("20:00 - 07:15");
            filo4.setText("Pamukkale");
            price4.setText("200");
            saat4.setText("11 Saat 15 Dakika");
            bilgi4.setText("Televizyon, Yiyecek & İçecek Servisi");

            tarih5.setText("22:30 - 10:45");
            filo5.setText("Koç");
            price5.setText("170");
            saat5.setText(" 12 Saat 15 Dakika");
            bilgi5.setText("Televizyon, Yiyecek & İçecek Servisi");
        } else if (dest.equals("Antalya") && fro.equals("İzmir")) {
            tarih1.setText("07:30 - 14:30");
            filo1.setText("Pamukkale");
            price1.setText("90");
            saat1.setText("7 Saat");
            bilgi1.setText("Yiyecek & İçecek Servisi");

            tarih2.setText("09:00 - 16:15");
            filo2.setText("Koç");
            price2.setText("100");
            saat2.setText("7 Saat 15 Dakika");
            bilgi2.setText("Klima, Yiyecek & İçecek Servisi");

            tarih3.setText("16:30 - 00:30");
            filo3.setText("Metro");
            price3.setText("110");
            saat3.setText("8 Saat");
            bilgi3.setText("Klima, Yiyecek & İçecek Servisi");

            tarih4.setText("17:30 - 01:15");
            filo4.setText("Ulusoy");
            price4.setText("130");
            saat4.setText("7 Saat 45 Dakika");
            bilgi4.setText("Televizyon, Klima, Yiyecek & İçecek Servisi");

            tarih5.setText("23:55 - 07:09");
            filo5.setText("Vatan");
            price5.setText("110");
            saat5.setText(" 7 Saat 14 Dakika");
            bilgi5.setText("Televizyon, Yiyecek & İçecek Servisi");
        }
        else if (dest.equals("İstanbul") && fro.equals("İzmir")) {
            tarih1.setText("7:00 - 14:30");
            filo1.setText("Vatan");
            price1.setText("120");
            saat1.setText("6 Saat 30 Dakika");
            bilgi1.setText("Klima, Yiyecek & İçecek Servisi");

            tarih2.setText("8:30 - 15:15");
            filo2.setText("Pamukkale");
            price2.setText("150");
            saat2.setText("6 Saat 45 Dakika");
            bilgi2.setText("Yiyecek & İçecek Servisi");

            tarih3.setText("10:15 - 17:30");
            filo3.setText("Ulusoy");
            price3.setText("170");
            saat3.setText("7 Saat 15 Dakika");
            bilgi3.setText("Klima, Televizyon ve İçecek Servisi");

            tarih4.setText("12:00 - 19:00");
            filo4.setText("Koç");
            price4.setText("140");
            saat4.setText("7 Saat");
            bilgi4.setText("Yiyecek & İçecek Servisi");

            tarih5.setText("18:00 - 00:30");
            filo5.setText("Metro");
            price5.setText("110");
            saat5.setText("6 Saat 30 Dakika");
            bilgi5.setText("Televizyon ve İçecek Servisi");
        }
        else if (dest.equals("İstanbul") && fro.equals("Ankara")) {
            tarih1.setText("7:30 - 9:30");
            filo1.setText("Ulusoy");
            price1.setText("50");
            saat1.setText("2 Saat");
            bilgi1.setText("Servis Yok");

            tarih2.setText("9:00 - 12:30");
            filo2.setText("Vatan");
            price2.setText("65");
            saat2.setText("2 Saat 30 Dakika");
            bilgi2.setText("Klima");

            tarih3.setText("11:30 - 14:15");
            filo3.setText("Metro");
            price3.setText("95");
            saat3.setText("3 Saat 15 Dakika");
            bilgi3.setText("Klima, Yiyecek & İçecek Servisi");

            tarih4.setText("12:00 - 15:15");
            filo4.setText("Koç");
            price4.setText("80");
            saat4.setText("3 Saat 15 Dakika");
            bilgi4.setText("Klima & İçecek Servisi");

            tarih5.setText("17:00 - 19:30");
            filo5.setText("Pamukkale");
            price5.setText("65");
            saat5.setText("2 Saat 30 Dakika");
            bilgi5.setText("İçecek Servisi");
        }
        else if (dest.equals("İstanbul") && fro.equals("Antalya")) {
            tarih1.setText("10:00 - 21:30");
            filo1.setText("Ulusoy");
            price1.setText("170");
            saat1.setText("9 Saat 30 Dakika");
            bilgi1.setText("Yiyecek & İçecek Servisi");

            tarih2.setText("12:00 - 22:15");
            filo2.setText("Vatan");
            price2.setText("240");
            saat2.setText("10 Saat 15 Dakika");
            bilgi2.setText("Klima, Yiyecek & İçecek Servisi");

            tarih3.setText("16:00 - 03:30");
            filo3.setText("Metro");
            price3.setText("200");
            saat3.setText("11 Saat 30 Dakika");
            bilgi3.setText("Klima, Yiyecek & İçecek Servisi");

            tarih4.setText("20:30 - 04:15");
            filo4.setText("Pamukkale");
            price4.setText("210");
            saat4.setText("8 Saat 15 Dakika");
            bilgi4.setText("Yiyecek & İçecek Servisi");

            tarih5.setText("00:30 - 08:00");
            filo5.setText("Koç");
            price5.setText("215");
            saat5.setText("7 Saat 30 Dakika");
            bilgi5.setText("Televizyon, Yiyecek & İçecek Servisi");
        }

        else if (dest.equals("İzmir") && fro.equals("İstanbul")) {
            tarih1.setText("8:15 - 14:45");
            filo1.setText("Vatan");
            price1.setText("130");
            saat1.setText("6 Saat 30 Dakika");
            bilgi1.setText("Klima, Yiyecek & İçecek Servisi");

            tarih2.setText("8:30 - 13:00");
            filo2.setText("Pamukkale");
            price2.setText("190");
            saat2.setText("5 Saat 30 Dakika");
            bilgi2.setText("Yiyecek & İçecek Servisi");

            tarih3.setText("10:15 - 17:30");
            filo3.setText("Ulusoy");
            price3.setText("170");
            saat3.setText("7 Saat 15 Dakika");
            bilgi3.setText("Klima, Televizyon ve İçecek Servisi");

            tarih4.setText("12:00 - 19:00");
            filo4.setText("Koç");
            price4.setText("140");
            saat4.setText("7 Saat");
            bilgi4.setText("Yiyecek & İçecek Servisi");

            tarih5.setText("18:00 - 00:30");
            filo5.setText("Metro");
            price5.setText("110");
            saat5.setText("6 Saat 30 Dakika");
            bilgi5.setText("Televizyon ve İçecek Servisi");
        }

        else if (dest.equals("İzmir") && fro.equals("Ankara")) {
            tarih1.setText("9:35 - 13:45");
            filo1.setText("Vatan");
            price1.setText("110");
            saat1.setText("4 Saat 10 Dakika");
            bilgi1.setText("Klima, Yiyecek & İçecek Servisi");

            tarih2.setText("11:30 - 15:10");
            filo2.setText("Pamukkale");
            price2.setText("150");
            saat2.setText("3 Saat 40 Dakika");
            bilgi2.setText("Yiyecek & İçecek Servisi");

            tarih3.setText("14:00 - 19:30");
            filo3.setText("Ulusoy");
            price3.setText("110");
            saat3.setText("5 Saat 30 Dakika");
            bilgi3.setText("İçecek Servisi");

            tarih4.setText("18:00 - 21:00");
            filo4.setText("Koç");
            price4.setText("190");
            saat4.setText("3 Saat");
            bilgi4.setText("Klima, Televizyon ,Yiyecek & İçecek Servisi");

            tarih5.setText("22:30 - 02:30");
            filo5.setText("Metro");
            price5.setText("140");
            saat5.setText(" 4 Saat ");
            bilgi5.setText("Televizyon ve İçecek Servisi");
        }

        else if (dest.equals("İzmir") && fro.equals("Antalya")) {
            tarih1.setText("13:45 - 21:30");
            filo1.setText("Pamukkale");
            price1.setText("80");
            saat1.setText("7 Saat 45 Dakika");
            bilgi1.setText("Klima, Yiyecek & İçecek Servisi");

            tarih2.setText("14:00 - 21:30");
            filo2.setText("Vatan");
            price2.setText("80");
            saat2.setText("7 Saat 30 Dakika");
            bilgi2.setText("Yiyecek & İçecek Servisi");

            tarih3.setText("14:45 - 23:15");
            filo3.setText("Metro");
            price3.setText("90");
            saat3.setText("8 Saat 30 Dakika");
            bilgi3.setText("İçecek Servisi");

            tarih4.setText("19:45 - 03:20");
            filo4.setText("Ulusoy");
            price4.setText("110");
            saat4.setText("7 Saat 35 Dakika");
            bilgi4.setText("Yiyecek & İçecek Servisi");

            tarih5.setText("23:45 - 07:10");
            filo5.setText("Koç");
            price5.setText("85");
            saat5.setText(" 7 Saat 25 Dakika ");
            bilgi5.setText("Televizyon ve İçecek Servisi");
        }
        else if (dest.equals("Ankara") && fro.equals("İstanbul")) {
            tarih1.setText("8:00 - 11:15");
            filo1.setText("Ulusoy");
            price1.setText("70");
            saat1.setText("3 Saat 15 Dakika ");
            bilgi1.setText("Servis Yok");

            tarih2.setText("10:00 - 14:30");
            filo2.setText("Vatan");
            price2.setText("65");
            saat2.setText("4 Saat 30 Dakika");
            bilgi2.setText("Klima, İçecek Servisi");

            tarih3.setText("12:00 - 15:00");
            filo3.setText("Metro");
            price3.setText("110");
            saat3.setText("3 Saat");
            bilgi3.setText("Klima, Yiyecek & İçecek Servisi");

            tarih4.setText("15:00 - 17:45");
            filo4.setText("Koç");
            price4.setText("90");
            saat4.setText("2 Saat 45 Dakika");
            bilgi4.setText("Klima & İçecek Servisi");

            tarih5.setText("20:00 - 23:15");
            filo5.setText("Pamukkale");
            price5.setText("70");
            saat5.setText("3 Saat 15 Dakika");
            bilgi5.setText("İçecek Servisi");
        }
        else if (dest.equals("Ankara") && fro.equals("İzmir")) {
            tarih1.setText("14:30 - 22:25");
            filo1.setText("Metro");
            price1.setText("100");
            saat1.setText("7 Saat 55 Dakika ");
            bilgi1.setText("Yiyecek, İçecek Servisi");

            tarih2.setText("16:30 - 00:30");
            filo2.setText("Pamukkale");
            price2.setText("130");
            saat2.setText("8 Saat");
            bilgi2.setText("Televizyon, Klima, İçecek Servisi");

            tarih3.setText("18:00 - 01:55");
            filo3.setText("Ulusoy");
            price3.setText("110");
            saat3.setText("7 Saat 55 Dakika");
            bilgi3.setText("Yiyecek & İçecek Servisi");

            tarih4.setText("19:30 - 04:00");
            filo4.setText("Koç");
            price4.setText("90");
            saat4.setText("8 Saat 30 Dakika");
            bilgi4.setText("Klima & İçecek Servisi");

            tarih5.setText("22:00 - 06:15");
            filo5.setText("Vatan");
            price5.setText("120");
            saat5.setText("8 Saat 15 Dakika");
            bilgi5.setText("Yiyecek & İçecek Servisi");
        }

        else if (dest.equals("Ankara") && fro.equals("Antalya")) {
            tarih1.setText("15:00 - 22:45");
            filo1.setText("Metro");
            price1.setText("120");
            saat1.setText("7 Saat 45 Dakika ");
            bilgi1.setText("Televizyon, Klima, Yiyecek & İçecek Servisi");

            tarih2.setText("17:30 - 01:30");
            filo2.setText("Pamukkale");
            price2.setText("100");
            saat2.setText("8 Saat");
            bilgi2.setText("Klima, Yiyecek & İçecek Servisi");

            tarih3.setText("20:00 - 04:00");
            filo3.setText("Ulusoy");
            price3.setText("120");
            saat3.setText("8 Saat");
            bilgi3.setText("Yiyecek & İçecek Servisi");

            tarih4.setText("23:00 - 07:00");
            filo4.setText("Koç");
            price4.setText("110");
            saat4.setText("8 Saat");
            bilgi4.setText("Klima, Yiyecek & İçecek Servisi");

            tarih5.setText("23:59 - 08:00");
            filo5.setText("Vatan");
            price5.setText("120");
            saat5.setText("8 Saat 1 Dakika");
            bilgi5.setText("Yiyecek & İçecek Servisi");
        }

        else if (dest.equals("Antalya") && fro.equals("İstanbul")) {
            tarih1.setText("17:00 - 05:00");
            filo1.setText("Ulusoy");
            price1.setText("155");
            saat1.setText("12 Saat");
            bilgi1.setText("Yiyecek & İçecek Servisi");

            tarih2.setText("17:00 - 06:10");
            filo2.setText("Vatan");
            price2.setText("180");
            saat2.setText("13 Saat 10 Dakika");
            bilgi2.setText("Klima, Yiyecek & İçecek Servisi");

            tarih3.setText("19:00 - 07:05");
            filo3.setText("Metro");
            price3.setText("170");
            saat3.setText("12 Saat 5 Dakika");
            bilgi3.setText("Klima, Yiyecek & İçecek Servisi");

            tarih4.setText("20:00 - 07:15");
            filo4.setText("Pamukkale");
            price4.setText("200");
            saat4.setText("11 Saat 15 Dakika");
            bilgi4.setText("Televizyon, Yiyecek & İçecek Servisi");

            tarih5.setText("22:30 - 10:45");
            filo5.setText("Koç");
            price5.setText("170");
            saat5.setText(" 12 Saat 15 Dakika");
            bilgi5.setText("Televizyon, Yiyecek & İçecek Servisi");
        }

        else if (dest.equals("Antalya") && fro.equals("İzmir")) {
            tarih1.setText("07:30 - 14:30");
            filo1.setText("Pamukkale");
            price1.setText("90");
            saat1.setText("7 Saat");
            bilgi1.setText("Yiyecek & İçecek Servisi");

            tarih2.setText("09:00 - 16:15");
            filo2.setText("Koç");
            price2.setText("100");
            saat2.setText("7 Saat 15 Dakika");
            bilgi2.setText("Klima, Yiyecek & İçecek Servisi");

            tarih3.setText("16:30 - 00:30");
            filo3.setText("Metro");
            price3.setText("110");
            saat3.setText("8 Saat");
            bilgi3.setText("Klima, Yiyecek & İçecek Servisi");

            tarih4.setText("17:30 - 01:15");
            filo4.setText("Ulusoy");
            price4.setText("130");
            saat4.setText("7 Saat 45 Dakika");
            bilgi4.setText("Televizyon, Klima, Yiyecek & İçecek Servisi");

            tarih5.setText("23:55 - 07:09");
            filo5.setText("Vatan");
            price5.setText("110");
            saat5.setText(" 7 Saat 14 Dakika");
            bilgi5.setText("Televizyon, Yiyecek & İçecek Servisi");
        }
        else if (dest.equals("Antalya") && fro.equals("Ankara")) {
            tarih1.setText("15:00 - 22:45");
            filo1.setText("Metro");
            price1.setText("120");
            saat1.setText("7 Saat 45 Dakika ");
            bilgi1.setText("Televizyon, Klima, Yiyecek & İçecek Servisi");

            tarih2.setText("17:30 - 01:30");
            filo2.setText("Pamukkale");
            price2.setText("100");
            saat2.setText("8 Saat");
            bilgi2.setText("Klima, Yiyecek & İçecek Servisi");

            tarih3.setText("20:00 - 04:00");
            filo3.setText("Ulusoy");
            price3.setText("120");
            saat3.setText("8 Saat");
            bilgi3.setText("Yiyecek & İçecek Servisi");

            tarih4.setText("23:00 - 07:00");
            filo4.setText("Koç");
            price4.setText("110");
            saat4.setText("8 Saat");
            bilgi4.setText("Klima, Yiyecek & İçecek Servisi");

            tarih5.setText("23:59 - 08:00");
            filo5.setText("Vatan");
            price5.setText("120");
            saat5.setText("8 Saat 1 Dakika");
            bilgi5.setText("Yiyecek & İçecek Servisi");
        }




        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                String nereyes=nereye1.getText().toString();
                intent.putExtra("nereyes", nereyes);
                String neredens=nereden.getText().toString();
                intent.putExtra("neredens",neredens);

                int opt1=1;
                if(opt1==1)
                { String tarihs1 = tarih1.getText().toString();
                intent.putExtra("info1", tarihs1);
                String filos1 = filo1.getText().toString();
                intent.putExtra("info2", filos1);
                String prices1=price1.getText().toString();
                intent.putExtra("info3", prices1);
                String saats1 = saat1.getText().toString();
                intent.putExtra("info4", saats1);
                String bilgis1 = bilgi1.getText().toString();
                intent.putExtra("info5", bilgis1);
                    intent.putExtra("opt1",opt1);
                    startActivity(intent); }

            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                String nereyes = nereye1.getText().toString();
                intent.putExtra("nereyes", nereyes);
                String neredens = nereden.getText().toString();
                intent.putExtra("neredens", neredens);

                int opt2=1;
                if(opt2==1)
                { String tarihs2 = tarih2.getText().toString();
                intent.putExtra("info6", tarihs2);
                String filos2 = filo2.getText().toString();
                intent.putExtra("info7", filos2);
                String prices2 = price2.getText().toString();
                intent.putExtra("info8", prices2);
                String saats2 = saat2.getText().toString();
                intent.putExtra("info9", saats2);
                String bilgis2 = bilgi2.getText().toString();
                intent.putExtra("info10", bilgis2);
                    intent.putExtra("opt2", opt2);
                    startActivity(intent); }
            }
        });

         cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                String nereyes = nereye1.getText().toString();
                intent.putExtra("nereyes", nereyes);
                String neredens = nereden.getText().toString();
                intent.putExtra("neredens", neredens);
                int opt3=1;
                if (opt3==1)
                {String tarihs3 = tarih3.getText().toString();
                intent.putExtra("info11", tarihs3);
                String filos3 = filo3.getText().toString();
                intent.putExtra("info12", filos3);
                String prices3 = price3.getText().toString();
                intent.putExtra("info13", prices3);
                String saats3 = saat3.getText().toString();
                intent.putExtra("info14", saats3);
                String bilgis3 = bilgi3.getText().toString();
                intent.putExtra("info15", bilgis3);
                intent.putExtra("opt3", opt3);
                startActivity(intent); }
            }
        });

         cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                String nereyes = nereye1.getText().toString();
                intent.putExtra("nereyes", nereyes);
                String neredens = nereden.getText().toString();
                intent.putExtra("neredens", neredens);

                int opt4=1;
                if (opt4==1)
                {String tarihs4 = tarih4.getText().toString();
                intent.putExtra("info16", tarihs4);
                String filos4 = filo4.getText().toString();
                intent.putExtra("info17", filos4);
                String prices4 = price4.getText().toString();
                intent.putExtra("info18", prices4);
                String saats4 = saat4.getText().toString();
                intent.putExtra("info19", saats4);
                String bilgis4 = bilgi4.getText().toString();
                intent.putExtra("info20", bilgis4);
                    intent.putExtra("opt4", opt4);
                    startActivity(intent); }
            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                String nereyes = nereye1.getText().toString();
                intent.putExtra("nereyes", nereyes);
                String neredens = nereden.getText().toString();
                intent.putExtra("neredens", neredens);
                int opt5=1;
                if (opt5==1)
                { String tarihs5 = tarih5.getText().toString();
                intent.putExtra("info21", tarihs5);
                String filos5 = filo5.getText().toString();
                intent.putExtra("info22", filos5);
                String prices5 = price5.getText().toString();
                intent.putExtra("info23", prices5);
                String saats5 = saat5.getText().toString();
                intent.putExtra("info24", saats5);
                String bilgis5 = bilgi5.getText().toString();
                intent.putExtra("info25", bilgis5);
                    intent.putExtra("opt5", opt5);
                    startActivity(intent); }
            }
        });



        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        }

    }

