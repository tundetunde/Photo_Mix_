package com.example.tunde.com.photomix;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by tunde_000 on 09/06/2015.
 */
public class SplashMain extends Activity{
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_main);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent openMain = new Intent("com.example.tunde.com.photomix.MAIN_ACTIVITY");
                    startActivity(openMain);
                }
            }
        };
        timer.start();
    }
}
