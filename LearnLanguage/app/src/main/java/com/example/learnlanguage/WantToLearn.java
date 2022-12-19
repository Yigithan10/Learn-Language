package com.example.learnlanguage;

import static android.graphics.Color.GRAY;
import static com.example.learnlanguage.MainActivity.autoLanguage;
import static com.example.learnlanguage.MainActivity.languageAbd;
import static com.example.learnlanguage.MainActivity.languageGermany;
import static com.example.learnlanguage.MainActivity.languageFrance;
import static com.example.learnlanguage.MainActivity.languageJapan;
import static com.example.learnlanguage.MainActivity.languageSpain;
import static com.example.learnlanguage.MainActivity.languageRussia;
import static com.example.learnlanguage.MainActivity.languageItaly;
import static com.example.learnlanguage.MainActivity.languageTurkey;
import static com.example.learnlanguage.MainActivity.languageItaly;
import static com.example.learnlanguage.MainActivity.languageChina;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.app.UiModeManager;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class WantToLearn extends AppCompatActivity {

    public String engWantToLearn1 = "I want to learn ..";
    public String gerWantToLearn1 = "Ich will lernen ..";
    public String fraWantToLearn1 = "Je veux apprendre ..";
    public String spaWantToLearn1 = "Quiero aprender ..";
    public String rusWantToLearn1 = "Я хочу учиться ..";
    public String itaWantToLearn1 = "Voglio imparare ..";
    public String turWantToLearn1 = "Öğrenmek istiyorum ..";
    public String japWantToLearn1 = "学びたい..";
    public String chiWantToLearn1 = "我想学习 ..";

    public String engTxtAbd = "English";
    public String engTxtGermany = "German";
    public String engTxtFrance = "French";
    public String engTxtSpain = "Spanish";
    public String engTxtRussia = "Russian";
    public String engTxtItaly = "Italian";
    public String engTxtTurkey = "Turkish";
    public String engTxtJapan = "Japanese";
    public String engTxtChina = "Chinese";

    public String gerTxtAbd = "Englisch";
    public String gerTxtGermany = "Deutsch";
    public String gerTxtFrance = "Französisch";
    public String gerTxtSpain = "Spanisch";
    public String gerTxtRussia = "Russisch";
    public String gerTxtItaly = "Italienisch";
    public String gerTxtTurkey = "Türkisch";
    public String gerTxtJapan = "Japanisch";
    public String gerTxtChina = "Chinesisch";

    public String fraTxtAbd = "Anglais";
    public String fraTxtGermany = "Allemand";
    public String fraTxtFrance = "Français";
    public String fraTxtSpain = "Espagnol";
    public String fraTxtRussia = "Russe";
    public String fraTxtItaly = "Italien";
    public String fraTxtTurkey = "Turc";
    public String fraTxtJapan = "Japonais";
    public String fraTxtChina = "Chinois";

    public String spaTxtAbd = "Inglés";
    public String spaTxtGermany = "Alemán";
    public String spaTxtFrance = "Francés";
    public String spaTxtSpain = "Español";
    public String spaTxtRussia = "Ruso";
    public String spaTxtItaly = "Italiano";
    public String spaTxtTurkey = "Turco";
    public String spaTxtJapan = "Japonés";
    public String spaTxtChina = "Chino";

    public String rusTxtAbd = "Английский";
    public String rusTxtGermany = "Немецкий";
    public String rusTxtFrance = "Французский";
    public String rusTxtSpain = "Испанский";
    public String rusTxtRussia = "Русский";
    public String rusTxtItaly = "Итальянский";
    public String rusTxtTurkey = "Tурецкий";
    public String rusTxtJapan = "Японский";
    public String rusTxtChina = "Китайский";

    public String itaTxtAbd = "Inglese";
    public String itaTxtGermany = "Tedesco";
    public String itaTxtFrance = "Francese";
    public String itaTxtSpain = "Spagnolo";
    public String itaTxtRussia = "Russo";
    public String itaTxtItaly = "Italiano";
    public String itaTxtTurkey = "Turco";
    public String itaTxtJapan = "Giapponese";
    public String itaTxtChina = "Cinese";

    public String turTxtAbd = "İngilizce";
    public String turTxtGermany = "Almanca";
    public String turTxtFrance = "Fransızca";
    public String turTxtSpain = "İspanyolca";
    public String turTxtRussia = "Rusça";
    public String turTxtItaly = "İtalyanca";
    public String turTxtTurkey = "Türkçe";
    public String turTxtJapan = "Japonca";
    public String turTxtChina = "Çince";

    public String japTxtAbd = "英語";
    public String japTxtGermany = "ドイツ人";
    public String japTxtFrance = "フランス語";
    public String japTxtSpain = "スペイン語";
    public String japTxtRussia = "ロシア";
    public String japTxtItaly = "イタリアの";
    public String japTxtTurkey = "トルコ語";
    public String japTxtJapan = "日本";
    public String japTxtChina = "中国語";

    public String chiTxtAbd = "英语";
    public String chiTxtGermany = "德语";
    public String chiTxtFrance = "法语";
    public String chiTxtSpain = "西班牙语";
    public String chiTxtRussia = "俄语";
    public String chiTxtItaly = "意大利语";
    public String chiTxtTurkey = "土耳其";
    public String chiTxtJapan = "日本人";
    public String chiTxtChina = "中国人";

    //---

    public String engTxtExplanation = "Native language is automatically selected English.";
    public String gerTxtExplanation = "Als Muttersprache wird automatisch Deutsch gewählt.";
    public String fraTxtExplanation = "La langue maternelle est automatiquement sélectionnée le Français.";
    public String spaTxtExplanation = "El idioma nativo se selecciona automáticamente Español.";
    public String rusTxtExplanation = "Родным языком автоматически выбирается Русский.";
    public String itaTxtExplanation = "Viene automaticamente selezionata la lingua madre Italiana.";
    public String turTxtExplanation = "Anadil otomatik olarak Türkçe seçildi.";
    public String japTxtExplanation = "母国語は自動的に日本語が選択されます。";
    public String chiTxtExplanation = "母语自动选择中文。";

    public static boolean wantToLearnAbd = false;
    public static boolean wantToLearnGermany = false;
    public static boolean wantToLearnFrance = false;
    public static boolean wantToLearnSpain = false;
    public static boolean wantToLearnRussia = false;
    public static boolean wantToLearnItaly = false;
    public static boolean wantToLearnTurkey = false;
    public static boolean wantToLearnJapan = false;
    public static boolean wantToLearnChina = false;

    Animation ScaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_want_to_learn);

        TextView txtViewWantToLearn = findViewById(R.id.txtViewWantToLearn);
        TextView txtViewExplanation = findViewById(R.id.txtViewExplanation);

        ImageButton btnImageAbd = findViewById(R.id.btnImageAbd);
        ImageButton btnImageGermany = findViewById(R.id.btnImageGermany);
        ImageButton btnImageFrance = findViewById(R.id.btnImageFrance);
        ImageButton btnImageSpain = findViewById(R.id.btnImageSpain);
        ImageButton btnImageRussia = findViewById(R.id.btnImageRussia);
        ImageButton btnImageItaly = findViewById(R.id.btnImageItaly);
        ImageButton btnImageTurkey = findViewById(R.id.btnImageTurkey);
        ImageButton btnImageJapan = findViewById(R.id.btnImageJapan);
        ImageButton btnImageChina = findViewById(R.id.btnImageChina);
        ImageButton btnImageTurnBack = findViewById(R.id.btnImageTurnBack);

        TextView txtViewAbd = findViewById(R.id.txtViewAbd);
        TextView txtViewGermany = findViewById(R.id.txtViewGermany);
        TextView txtViewFrance = findViewById(R.id.txtViewFrance);
        TextView txtViewSpain = findViewById(R.id.txtViewSpain);
        TextView txtViewRussia = findViewById(R.id.txtViewRussia);
        TextView txtViewItaly = findViewById(R.id.txtViewItaly);
        TextView txtViewTurkey = findViewById(R.id.txtViewTurkey);
        TextView txtViewJapan = findViewById(R.id.txtViewJapan);
        TextView txtViewChina = findViewById(R.id.txtViewChina);

        ScaleDown = AnimationUtils.loadAnimation(this,R.anim.scale_down);

        Intent MenuActivity = new Intent(WantToLearn.this, com.example.learnlanguage.MenuActivity.class);

        if(languageAbd){
            btnImageAbd.setEnabled(false);
            btnImageAbd.setBackground(getResources().getDrawable(R.drawable.button_disable_color));

            txtViewAbd.setText(engTxtAbd);
            txtViewGermany.setText(engTxtGermany);
            txtViewFrance.setText(engTxtFrance);
            txtViewSpain.setText(engTxtSpain);
            txtViewRussia.setText(engTxtRussia);
            txtViewItaly.setText(engTxtItaly);
            txtViewTurkey.setText(engTxtTurkey);
            txtViewJapan.setText(engTxtJapan);
            txtViewChina.setText(engTxtChina);

            txtViewWantToLearn.setText(engWantToLearn1);
            if(autoLanguage){
                txtViewExplanation.setText(engTxtExplanation);
            }
        }
        if(languageGermany){
            btnImageGermany.setEnabled(false);
            btnImageGermany.setBackground(getResources().getDrawable(R.drawable.button_disable_color));

            txtViewAbd.setText(gerTxtAbd);
            txtViewGermany.setText(gerTxtGermany);
            txtViewFrance.setText(gerTxtFrance);
            txtViewSpain.setText(gerTxtSpain);
            txtViewRussia.setText(gerTxtRussia);
            txtViewItaly.setText(gerTxtItaly);
            txtViewTurkey.setText(gerTxtTurkey);
            txtViewJapan.setText(gerTxtJapan);
            txtViewChina.setText(gerTxtChina);

            txtViewWantToLearn.setText(gerWantToLearn1);
            if(autoLanguage){
                txtViewExplanation.setText(gerTxtExplanation);
            }
        }
        if(languageFrance){
            btnImageFrance.setEnabled(false);
            btnImageFrance.setBackground(getResources().getDrawable(R.drawable.button_disable_color));

            txtViewAbd.setText(fraTxtAbd);
            txtViewGermany.setText(fraTxtGermany);
            txtViewFrance.setText(fraTxtFrance);
            txtViewSpain.setText(fraTxtSpain);
            txtViewRussia.setText(fraTxtRussia);
            txtViewItaly.setText(fraTxtItaly);
            txtViewTurkey.setText(fraTxtTurkey);
            txtViewJapan.setText(fraTxtJapan);
            txtViewChina.setText(fraTxtChina);

            txtViewWantToLearn.setText(fraWantToLearn1);
            if(autoLanguage){
                txtViewExplanation.setText(fraTxtExplanation);
            }
        }
        if(languageSpain){
            btnImageSpain.setEnabled(false);
            btnImageSpain.setBackground(getResources().getDrawable(R.drawable.button_disable_color));

            txtViewAbd.setText(spaTxtAbd);
            txtViewGermany.setText(spaTxtGermany);
            txtViewFrance.setText(spaTxtFrance);
            txtViewSpain.setText(spaTxtSpain);
            txtViewRussia.setText(spaTxtRussia);
            txtViewItaly.setText(spaTxtItaly);
            txtViewTurkey.setText(spaTxtTurkey);
            txtViewJapan.setText(spaTxtJapan);
            txtViewChina.setText(spaTxtChina);

            txtViewWantToLearn.setText(spaWantToLearn1);
            if(autoLanguage){
                txtViewExplanation.setText(spaTxtExplanation);
            }
        }
        if(languageRussia){
            btnImageRussia.setEnabled(false);
            btnImageRussia.setBackground(getResources().getDrawable(R.drawable.button_disable_color));

            txtViewAbd.setText(rusTxtAbd);
            txtViewGermany.setText(rusTxtGermany);
            txtViewFrance.setText(rusTxtFrance);
            txtViewSpain.setText(rusTxtSpain);
            txtViewRussia.setText(rusTxtRussia);
            txtViewItaly.setText(rusTxtItaly);
            txtViewTurkey.setText(rusTxtTurkey);
            txtViewJapan.setText(rusTxtJapan);
            txtViewChina.setText(rusTxtChina);

            txtViewWantToLearn.setText(rusWantToLearn1);
            if(autoLanguage){
                txtViewExplanation.setText(rusTxtExplanation);
            }
        }
        if(languageItaly){
            btnImageItaly.setEnabled(false);
            btnImageItaly.setBackground(getResources().getDrawable(R.drawable.button_disable_color));

            txtViewAbd.setText(itaTxtAbd);
            txtViewGermany.setText(itaTxtGermany);
            txtViewFrance.setText(itaTxtFrance);
            txtViewSpain.setText(itaTxtSpain);
            txtViewRussia.setText(itaTxtRussia);
            txtViewItaly.setText(itaTxtItaly);
            txtViewTurkey.setText(itaTxtTurkey);
            txtViewJapan.setText(itaTxtJapan);
            txtViewChina.setText(itaTxtChina);

            txtViewWantToLearn.setText(itaWantToLearn1);
            if(autoLanguage){
                txtViewExplanation.setText(itaTxtExplanation);
            }
        }
        if(languageTurkey){
            btnImageTurkey.setEnabled(false);
            btnImageTurkey.setBackground(getResources().getDrawable(R.drawable.button_disable_color));

            txtViewAbd.setText(turTxtAbd);
            txtViewGermany.setText(turTxtGermany);
            txtViewFrance.setText(turTxtFrance);
            txtViewSpain.setText(turTxtSpain);
            txtViewRussia.setText(turTxtRussia);
            txtViewItaly.setText(turTxtItaly);
            txtViewTurkey.setText(turTxtTurkey);
            txtViewJapan.setText(turTxtJapan);
            txtViewChina.setText(turTxtChina);

            txtViewWantToLearn.setText(turWantToLearn1);
            if(autoLanguage){
                txtViewExplanation.setText(turTxtExplanation);
            }
        }
        if(languageJapan){
            btnImageJapan.setEnabled(false);
            btnImageJapan.setBackground(getResources().getDrawable(R.drawable.button_disable_color));

            txtViewAbd.setText(japTxtAbd);
            txtViewGermany.setText(japTxtGermany);
            txtViewFrance.setText(japTxtFrance);
            txtViewSpain.setText(japTxtSpain);
            txtViewRussia.setText(japTxtRussia);
            txtViewItaly.setText(japTxtItaly);
            txtViewTurkey.setText(japTxtTurkey);
            txtViewJapan.setText(japTxtJapan);
            txtViewChina.setText(japTxtChina);

            txtViewWantToLearn.setText(japWantToLearn1);
            if(autoLanguage){
                txtViewExplanation.setText(japTxtExplanation);
            }
        }
        if(languageChina){
            btnImageChina.setEnabled(false);
            btnImageChina.setBackground(getResources().getDrawable(R.drawable.button_disable_color));

            txtViewAbd.setText(chiTxtAbd);
            txtViewGermany.setText(chiTxtGermany);
            txtViewFrance.setText(chiTxtFrance);
            txtViewSpain.setText(chiTxtSpain);
            txtViewRussia.setText(chiTxtRussia);
            txtViewItaly.setText(chiTxtItaly);
            txtViewTurkey.setText(chiTxtTurkey);
            txtViewJapan.setText(chiTxtJapan);
            txtViewChina.setText(chiTxtChina);

            txtViewWantToLearn.setText(chiWantToLearn1);
            if(autoLanguage){
                txtViewExplanation.setText(chiTxtExplanation);
            }
        }

        btnImageAbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageAbd.startAnimation(ScaleDown);

                wantToLearnAbd = true;
                wantToLearnGermany = false;
                wantToLearnFrance = false;
                wantToLearnSpain = false;
                wantToLearnRussia = false;
                wantToLearnItaly = false;
                wantToLearnTurkey = false;
                wantToLearnJapan = false;
                wantToLearnChina = false;

                startActivity(MenuActivity);
            }
        });

        btnImageGermany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageGermany.startAnimation(ScaleDown);

                wantToLearnAbd = false;
                wantToLearnGermany = true;
                wantToLearnFrance = false;
                wantToLearnSpain = false;
                wantToLearnRussia = false;
                wantToLearnItaly = false;
                wantToLearnTurkey = false;
                wantToLearnJapan = false;
                wantToLearnChina = false;

                startActivity(MenuActivity);
            }
        });

        btnImageFrance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageFrance.startAnimation(ScaleDown);

                wantToLearnAbd = false;
                wantToLearnGermany = false;
                wantToLearnFrance = true;
                wantToLearnSpain = false;
                wantToLearnRussia = false;
                wantToLearnItaly = false;
                wantToLearnTurkey = false;
                wantToLearnJapan = false;
                wantToLearnChina = false;

                startActivity(MenuActivity);
            }
        });

        btnImageSpain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageSpain.startAnimation(ScaleDown);

                wantToLearnAbd = false;
                wantToLearnGermany = false;
                wantToLearnFrance = false;
                wantToLearnSpain = true;
                wantToLearnRussia = false;
                wantToLearnItaly = false;
                wantToLearnTurkey = false;
                wantToLearnJapan = false;
                wantToLearnChina = false;

                startActivity(MenuActivity);
            }
        });

        btnImageRussia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageRussia.startAnimation(ScaleDown);

                wantToLearnAbd = false;
                wantToLearnGermany = false;
                wantToLearnFrance = false;
                wantToLearnSpain = false;
                wantToLearnRussia = true;
                wantToLearnItaly = false;
                wantToLearnTurkey = false;
                wantToLearnJapan = false;
                wantToLearnChina = false;

                startActivity(MenuActivity);
            }
        });

        btnImageItaly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageItaly.startAnimation(ScaleDown);

                wantToLearnAbd = false;
                wantToLearnGermany = false;
                wantToLearnFrance = false;
                wantToLearnSpain = false;
                wantToLearnRussia = false;
                wantToLearnItaly = true;
                wantToLearnTurkey = false;
                wantToLearnJapan = false;
                wantToLearnChina = false;

                startActivity(MenuActivity);
            }
        });

        btnImageTurkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageTurkey.startAnimation(ScaleDown);

                wantToLearnAbd = false;
                wantToLearnGermany = false;
                wantToLearnFrance = false;
                wantToLearnSpain = false;
                wantToLearnRussia = false;
                wantToLearnItaly = false;
                wantToLearnTurkey = true;
                wantToLearnJapan = false;
                wantToLearnChina = false;

                startActivity(MenuActivity);
            }
        });

        btnImageJapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageJapan.startAnimation(ScaleDown);

                wantToLearnAbd = false;
                wantToLearnGermany = false;
                wantToLearnFrance = false;
                wantToLearnSpain = false;
                wantToLearnRussia = false;
                wantToLearnItaly = false;
                wantToLearnTurkey = false;
                wantToLearnJapan = true;
                wantToLearnChina = false;

                startActivity(MenuActivity);
            }
        });

        btnImageChina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageChina.startAnimation(ScaleDown);

                wantToLearnAbd = false;
                wantToLearnGermany = false;
                wantToLearnFrance = false;
                wantToLearnSpain = false;
                wantToLearnRussia = false;
                wantToLearnItaly = false;
                wantToLearnTurkey = false;
                wantToLearnJapan = false;
                wantToLearnChina = true;

                startActivity(MenuActivity);
            }
        });

        btnImageTurnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageTurnBack.startAnimation(ScaleDown);

                languageAbd = false;
                languageGermany = false;
                languageFrance = false;
                languageSpain = false;
                languageRussia = false;
                languageItaly = false;
                languageTurkey = false;
                languageJapan = false;
                languageChina = false;

                autoLanguage = false;

                finish();
            }
        });
    }
}