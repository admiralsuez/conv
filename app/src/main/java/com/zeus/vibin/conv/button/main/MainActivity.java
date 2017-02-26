package com.zeus.vibin.conv.button.main;

import android.content.Intent;
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

public class MainActivity extends AppCompatActivity {


    ButtonManager buttonManager;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, Intro.class);
        startActivity(intent);


        buttonManager = new ButtonManager(this);

    }

    public void numberClicked(View v) {
        buttonManager.numberClick(v.getId());
    }

    public void operatorClicked(View v) {
        buttonManager.operatorClick(v.getId());
    }

    public void equalClicked(View v) {
        buttonManager.equalsClick();
    }

    public void decimalClicked(View v) {
        buttonManager.decimalClick(v.getId());
    }

    public void deleteClicked(View v) {
        buttonManager.deleteClick(v.getId());
    }


}