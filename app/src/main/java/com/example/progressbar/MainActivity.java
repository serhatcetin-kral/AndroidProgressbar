package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {



    ProgressBar progressBar;
    //sayac
    int sayac=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar=findViewById(R.id.installing);
        //zamanlayici
        Timer zamanlayici=new Timer();
        //zamanlayici gorevi
        TimerTask timergorevi=new TimerTask() {
            @Override
            public void run() {

            sayac++;
                //progrese sayaci ayarla
             progressBar.setProgress(sayac);


             //sayac kaca kadar
                if(sayac==100)
                    zamanlayici.cancel();
            }
        };

        //zamanlama schcilini ayarla
        zamanlayici.schedule(timergorevi,0,100);

    }
}