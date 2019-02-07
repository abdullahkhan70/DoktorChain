package com.example.abdullahkhan.doktorchain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

public class splashScreen extends AwesomeSplash {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash_screen);
//    }

    @Override
    public void initSplash(ConfigSplash configSplash) {

        //getWindow().setFlags(WindowManager.LayoutParams.WRAP_CONTENT,WindowManager.LayoutParams.WRAP_CONTENT);

        //background Animation...

        configSplash.setBackgroundColor(R.color.splashBackground);
        configSplash.setAnimCircularRevealDuration(2000);
        configSplash.setRevealFlagX(Flags.REVEAL_LEFT);
        configSplash.setRevealFlagY(Flags.REVEAL_TOP);

        //Logo Splash...

        configSplash.setLogoSplash(R.drawable.logo_company_1);
        configSplash.setAnimLogoSplashDuration(2000);
        configSplash.setAnimLogoSplashTechnique(Techniques.Flash);

        configSplash.setTitleSplash("");


    }

    @Override
    public void animationsFinished() {
        startActivity(new Intent(this, registrationScreen.class));
    }

}
