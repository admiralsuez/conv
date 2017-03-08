package com.zeus.vibin.conv.button.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zeus.vibin.conv.R;
import com.zeus.vibin.conv.button.buttons.ButtonManager;
import com.zeus.vibin.conv.button.libs.Intro;

/**
 * Created by cyber on 07-Mar-17.
 */
public class Convert extends AppCompatActivity{


    ButtonManager buttonManager;


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


