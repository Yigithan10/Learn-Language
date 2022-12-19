package com.example.learnlanguage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.os.ConfigurationCompat;

import android.app.UiModeManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.icu.number.Scale;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    public static boolean languageAbd = false;
    public static boolean languageGermany = false;
    public static boolean languageFrance = false;
    public static boolean languageSpain = false;
    public static boolean languageRussia = false;
    public static boolean languageItaly = false;
    public static boolean languageTurkey = false;
    public static boolean languageJapan = false;
    public static boolean languageChina = false;
    public static boolean autoLanguage = false;

    Animation ScaleDown;

    Locale locale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnImageAbd = findViewById(R.id.btnImageAbd);
        ImageButton btnImageGermany = findViewById(R.id.btnImageGermany);
        ImageButton btnImageFrance = findViewById(R.id.btnImageFrance);
        ImageButton btnImageSpain = findViewById(R.id.btnImageSpain);
        ImageButton btnImageRussia = findViewById(R.id.btnImageRussia);
        ImageButton btnImageItaly = findViewById(R.id.btnImageItaly);
        ImageButton btnImageTurkey = findViewById(R.id.btnImageTurkey);
        ImageButton btnImageJapan = findViewById(R.id.btnImageJapan);
        ImageButton btnImageChina = findViewById(R.id.btnImageChina);

        TextView txtViewAbd = findViewById(R.id.txtViewAbd);

        ScaleDown = AnimationUtils.loadAnimation(this,R.anim.scale_down);

        Intent WantToLearn = new Intent(MainActivity.this,WantToLearn.class);


        locale = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration()).get(0);

        if(locale.getLanguage().equals("en")) {
            languageAbd = true;
            languageGermany = false;
            languageFrance = false;
            languageSpain = false;
            languageRussia = false;
            languageItaly = false;
            languageTurkey = false;
            languageJapan = false;
            languageChina = false;

            autoLanguage = true;

            startActivity(WantToLearn);
        }
        if(locale.getLanguage().equals("gsw")) {
            languageAbd = false;
            languageGermany = true;
            languageFrance = false;
            languageSpain = false;
            languageRussia = false;
            languageItaly = false;
            languageTurkey = false;
            languageJapan = false;
            languageChina = false;

            autoLanguage = true;

            startActivity(WantToLearn);
        }
        if(locale.getLanguage().equals("fr")) {
            languageAbd = false;
            languageGermany = false;
            languageFrance = true;
            languageSpain = false;
            languageRussia = false;
            languageItaly = false;
            languageTurkey = false;
            languageJapan = false;
            languageChina = false;

            autoLanguage = true;

            startActivity(WantToLearn);
        }
        if(locale.getLanguage().equals("es")) {
            languageAbd = false;
            languageGermany = false;
            languageFrance = false;
            languageSpain = true;
            languageRussia = false;
            languageItaly = false;
            languageTurkey = false;
            languageJapan = false;
            languageChina = false;

            autoLanguage = true;

            startActivity(WantToLearn);
        }
        if(locale.getLanguage().equals("ru")) {
            languageAbd = false;
            languageGermany = false;
            languageFrance = false;
            languageSpain = false;
            languageRussia = true;
            languageItaly = false;
            languageTurkey = false;
            languageJapan = false;
            languageChina = false;

            autoLanguage = true;

            startActivity(WantToLearn);
        }
        if(locale.getLanguage().equals("it")) {
            languageAbd = false;
            languageGermany = false;
            languageFrance = false;
            languageSpain = false;
            languageRussia = false;
            languageItaly = true;
            languageTurkey = false;
            languageJapan = false;
            languageChina = false;

            autoLanguage = true;

            startActivity(WantToLearn);
        }
        if(locale.getLanguage().equals("tr")) {
            languageAbd = false;
            languageGermany = false;
            languageFrance = false;
            languageSpain = false;
            languageRussia = false;
            languageItaly = false;
            languageTurkey = true;
            languageJapan = false;
            languageChina = false;

            autoLanguage = true;

            startActivity(WantToLearn);
        }
        if(locale.getLanguage().equals("ja")) {
            languageAbd = false;
            languageGermany = false;
            languageFrance = false;
            languageSpain = false;
            languageRussia = false;
            languageItaly = false;
            languageTurkey = false;
            languageJapan = true;
            languageChina = false;

            autoLanguage = true;

            startActivity(WantToLearn);
        }
        if(locale.getLanguage().equals("zh")) {
            languageAbd = false;
            languageGermany = false;
            languageFrance = false;
            languageSpain = false;
            languageRussia = false;
            languageItaly = false;
            languageTurkey = false;
            languageJapan = false;
            languageChina = true;

            autoLanguage = true;

            startActivity(WantToLearn);
        }

        btnImageAbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageAbd.startAnimation(ScaleDown);

                languageAbd = true;
                languageGermany = false;
                languageFrance = false;
                languageSpain = false;
                languageRussia = false;
                languageItaly = false;
                languageTurkey = false;
                languageJapan = false;
                languageChina = false;

                autoLanguage = false;

                startActivity(WantToLearn);
            }
        });

        btnImageGermany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageGermany.startAnimation(ScaleDown);

                languageAbd = false;
                languageGermany = true;
                languageFrance = false;
                languageSpain = false;
                languageRussia = false;
                languageItaly = false;
                languageTurkey = false;
                languageJapan = false;
                languageChina = false;

                autoLanguage = false;

                startActivity(WantToLearn);
            }
        });

        btnImageFrance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageFrance.startAnimation(ScaleDown);

                languageAbd = false;
                languageGermany = false;
                languageFrance = true;
                languageSpain = false;
                languageRussia = false;
                languageItaly = false;
                languageTurkey = false;
                languageJapan = false;
                languageChina = false;

                autoLanguage = false;

                startActivity(WantToLearn);
            }
        });

        btnImageSpain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageSpain.startAnimation(ScaleDown);

                languageAbd = false;
                languageGermany = false;
                languageFrance = false;
                languageSpain = true;
                languageRussia = false;
                languageItaly = false;
                languageTurkey = false;
                languageJapan = false;
                languageChina = false;

                autoLanguage = false;

                startActivity(WantToLearn);
            }
        });

        btnImageRussia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageRussia.startAnimation(ScaleDown);

                languageAbd = false;
                languageGermany = false;
                languageFrance = false;
                languageSpain = false;
                languageRussia = true;
                languageItaly = false;
                languageTurkey = false;
                languageJapan = false;
                languageChina = false;

                autoLanguage = false;

                startActivity(WantToLearn);
            }
        });

        btnImageItaly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageItaly.startAnimation(ScaleDown);

                languageAbd = false;
                languageGermany = false;
                languageFrance = false;
                languageSpain = false;
                languageRussia = false;
                languageItaly = true;
                languageTurkey = false;
                languageJapan = false;
                languageChina = false;

                autoLanguage = false;

                startActivity(WantToLearn);
            }
        });

        btnImageTurkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageTurkey.startAnimation(ScaleDown);

                languageAbd = false;
                languageGermany = false;
                languageFrance = false;
                languageSpain = false;
                languageRussia = false;
                languageItaly = false;
                languageTurkey = true;
                languageJapan = false;
                languageChina = false;

                autoLanguage = false;

                startActivity(WantToLearn);
            }
        });

        btnImageJapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageJapan.startAnimation(ScaleDown);

                languageAbd = false;
                languageGermany = false;
                languageFrance = false;
                languageSpain = false;
                languageRussia = false;
                languageItaly = false;
                languageTurkey = false;
                languageJapan = true;
                languageChina = false;

                autoLanguage = false;

                startActivity(WantToLearn);
            }
        });

        btnImageChina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageChina.startAnimation(ScaleDown);

                languageAbd = false;
                languageGermany = false;
                languageFrance = false;
                languageSpain = false;
                languageRussia = false;
                languageItaly = false;
                languageTurkey = false;
                languageJapan = false;
                languageChina = true;

                autoLanguage = false;

                startActivity(WantToLearn);
            }
        });

    }
}