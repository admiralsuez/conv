package com.zeus.vibin.conv.button.libs;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.zeus.vibin.conv.R;
import com.zeus.vibin.conv.button.buttons.ButtonManager;
import com.zeus.vibin.conv.button.main.Convert;
import com.zeus.vibin.conv.button.main.MainActivity;

/**
 * Created by cyber on 26-Feb-17.
 */


public class Intro extends AppIntro {


    ButtonManager buttonManager;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Note here that we DO NOT use setContentView();

        // Add your slide fragments here.
        // AppIntro will automatically generate the dots indicator and buttons.
        addSlide(SampleSlide.newInstance(R.layout.slide1));
        addSlide(SampleSlide.newInstance(R.layout.slide2));

    }
    private void loadMainActivity() {
      // setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, Convert.class);
        startActivity(intent);
            }


    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);

        // Do something when users tap on Skip button.
    }


    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        setContentView(R.layout.activity_main);

        buttonManager = new ButtonManager(this);
        //Intent intent = new Intent(this, Convert.class);
      //startActivity(intent);
       // buttonManager = new ButtonManager(this);

        // Do something when users tap on Done button.
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }


}
