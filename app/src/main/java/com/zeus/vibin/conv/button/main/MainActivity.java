package com.zeus.vibin.conv.button.main;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.zeus.vibin.conv.R;
import com.zeus.vibin.conv.button.buttons.ButtonManager;
import com.zeus.vibin.conv.button.libs.Intro;
import com.zeus.vibin.conv.button.constants.Constants;

public class MainActivity extends AppCompatActivity {


    @Override
   protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
       //setContentView(R.layout.slide1);

//   setContentView(R.layout.slide1);
  Intent intent = new Intent(this, Intro.class);
   startActivity(intent);
   finish();
  //  protected void onCreate(Bundle savedInstanceState) {

  //      super.onCreate(savedInstanceState);
       //setContentView(R.layout.activity_main);

        //check if it has run before
        //Thread t = new Thread(new Runnable() {
//            public void run() {

           //     SharedPreferences sharedPreferences = getSharedPreferences(Constants.FLAG, Context.MODE_PRIVATE);

          //      if (sharedPreferences.getBoolean(Constants.FLAG, true)) {


       //             startActivity(new Intent(MainActivity.this, Intro.class));

       //             SharedPreferences.Editor e = sharedPreferences.edit();

//
          //          e.apply();
         //       }
       //     }
     //   });
    //    t.start();
    }
   // ButtonManager buttonManager;

    //public void numberClicked(View v) {
    //    buttonManager.numberClick(v.getId());
    }

   // public void operatorClicked(View v) {
       // buttonManager.operatorClick(v.getId());
   // }

   // public void equalClicked(View v) {
       // buttonManager.equalsClick();
   // }
//
   // public void decimalClicked(View v) {
       // buttonManager.decimalClick(v.getId());
    //

    //public void deleteClicked(View v) {
       // buttonManager.deleteClick(v.getId());
   // }





