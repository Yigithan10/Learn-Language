package com.example.learnlanguage;

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
import static com.example.learnlanguage.WantToLearn.wantToLearnAbd;
import static com.example.learnlanguage.WantToLearn.wantToLearnGermany;
import static com.example.learnlanguage.WantToLearn.wantToLearnFrance;
import static com.example.learnlanguage.WantToLearn.wantToLearnSpain;
import static com.example.learnlanguage.WantToLearn.wantToLearnRussia;
import static com.example.learnlanguage.WantToLearn.wantToLearnItaly;
import static com.example.learnlanguage.WantToLearn.wantToLearnTurkey;
import static com.example.learnlanguage.WantToLearn.wantToLearnJapan;
import static com.example.learnlanguage.WantToLearn.wantToLearnChina;

import androidx.appcompat.app.AppCompatActivity;

import android.app.UiModeManager;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity {

    public String engGreeting1 = "Hello!";
    public String engGreeting2 = "Good morning";
    public String engGreeting3 = "Good day";
    public String engGreeting4 = "Good evening";
    public String engGreeting5 = "Good night";
    public String engGreeting6 = "Bye bye";
    public String engGreeting7 = "Take care of yourself";

    public String gerGreeting1 = "Hallo!";
    public String gerGreeting2 = "Guten Morgen";
    public String gerGreeting3 = "Guten Tag";
    public String gerGreeting4 = "Guten Abend";
    public String gerGreeting5 = "Gute Nacht";
    public String gerGreeting6 = "Tschüss";
    public String gerGreeting7 = "Pass auf dich auf";

    public String fraGreeting1 = "Bonjour!";
    public String fraGreeting2 = "Bonjour";
    public String fraGreeting3 = "Bonne journée";
    public String fraGreeting4 = "Bonsoir";
    public String fraGreeting5 = "Bonne nuit";
    public String fraGreeting6 = "Adieu";
    public String fraGreeting7 = "Prends soin de toi";

    public String spaGreeting1 = "¡Hola!";
    public String spaGreeting2 = "Buenos Dias";
    public String spaGreeting3 = "Buenos días";
    public String spaGreeting4 = "Buenas noches";
    public String spaGreeting5 = "Buenas noches";
    public String spaGreeting6 = "Adiós";
    public String spaGreeting7 = "Cuídate";

    public String rusGreeting1 = "Привет!";
    public String rusGreeting2 = "Доброе утро";
    public String rusGreeting3 = "Добрый день";
    public String rusGreeting4 = "Добрый вечер";
    public String rusGreeting5 = "Спокойной ночи";
    public String rusGreeting6 = "Пока-пока";
    public String rusGreeting7 = "Береги себя";

    public String itaGreeting1 = "Ciao!";
    public String itaGreeting2 = "Buon giorno";
    public String itaGreeting3 = "Buona giornata";
    public String itaGreeting4 = "Buona serata";
    public String itaGreeting5 = "Buona notte";
    public String itaGreeting6 = "Ciao ciao";
    public String itaGreeting7 = "Prenditi cura di te";

    public String turGreeting1 = "Merhaba!";
    public String turGreeting2 = "Günaydın";
    public String turGreeting3 = "İyi günler";
    public String turGreeting4 = "İyi akşamlar";
    public String turGreeting5 = "İyi geceler";
    public String turGreeting6 = "Görüşürüz";
    public String turGreeting7 = "Kendine iyi bak";

    public String japGreeting1 = "こんにちは！";
    public String japGreeting2 = "おはようございます";
    public String japGreeting3 = "良い一日";
    public String japGreeting4 = "こんばんは";
    public String japGreeting5 = "おやすみなさい";
    public String japGreeting6 = "バイバイ";
    public String japGreeting7 = "自分を大事にして下さい";

    public String chiGreeting1 = "你好！";
    public String chiGreeting2 = "早上好";
    public String chiGreeting3 = "再会";
    public String chiGreeting4 = "晚上好";
    public String chiGreeting5 = "晚安";
    public String chiGreeting6 = "再见";
    public String chiGreeting7 = "好好照顾自己";

    MediaPlayer GreetingSound1;
    MediaPlayer GreetingSound2;
    MediaPlayer GreetingSound3;
    MediaPlayer GreetingSound4;
    MediaPlayer GreetingSound5;
    MediaPlayer GreetingSound6;
    MediaPlayer GreetingSound7;

    Animation ScaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        TextView txtViewL1 = findViewById(R.id.txtViewL1);
        TextView txtViewL2 = findViewById(R.id.txtViewL2);
        TextView txtViewL3 = findViewById(R.id.txtViewL3);
        TextView txtViewL4 = findViewById(R.id.txtViewL4);
        TextView txtViewL5 = findViewById(R.id.txtViewL5);
        TextView txtViewL6 = findViewById(R.id.txtViewL6);
        TextView txtViewL7 = findViewById(R.id.txtViewL7);

        TextView txtViewW1 = findViewById(R.id.txtViewW1);
        TextView txtViewW2 = findViewById(R.id.txtViewW2);
        TextView txtViewW3 = findViewById(R.id.txtViewW3);
        TextView txtViewW4 = findViewById(R.id.txtViewW4);
        TextView txtViewW5 = findViewById(R.id.txtViewW5);
        TextView txtViewW6 = findViewById(R.id.txtViewW6);
        TextView txtViewW7 = findViewById(R.id.txtViewW7);

        ImageButton btnImageS1 = findViewById(R.id.btnImageS1);
        ImageButton btnImageS2 = findViewById(R.id.btnImageS2);
        ImageButton btnImageS3 = findViewById(R.id.btnImageS3);
        ImageButton btnImageS4 = findViewById(R.id.btnImageS4);
        ImageButton btnImageS5 = findViewById(R.id.btnImageS5);
        ImageButton btnImageS6 = findViewById(R.id.btnImageS6);
        ImageButton btnImageS7 = findViewById(R.id.btnImageS7);

        ImageButton btnImageTurnBack = findViewById(R.id.btnImageTurnBack);

        ScaleDown = AnimationUtils.loadAnimation(this,R.anim.scale_down);

        if(languageAbd){
            txtViewL1.setText(engGreeting1);
            txtViewL2.setText(engGreeting2);
            txtViewL3.setText(engGreeting3);
            txtViewL4.setText(engGreeting4);
            txtViewL5.setText(engGreeting5);
            txtViewL6.setText(engGreeting6);
            txtViewL7.setText(engGreeting7);
        }
        if(languageGermany){
            txtViewL1.setText(gerGreeting1);
            txtViewL2.setText(gerGreeting2);
            txtViewL3.setText(gerGreeting3);
            txtViewL4.setText(gerGreeting4);
            txtViewL5.setText(gerGreeting5);
            txtViewL6.setText(gerGreeting6);
            txtViewL7.setText(gerGreeting7);
        }
        if(languageFrance){
            txtViewL1.setText(fraGreeting1);
            txtViewL2.setText(fraGreeting2);
            txtViewL3.setText(fraGreeting3);
            txtViewL4.setText(fraGreeting4);
            txtViewL5.setText(fraGreeting5);
            txtViewL6.setText(fraGreeting6);
            txtViewL7.setText(fraGreeting7);
        }
        if(languageSpain){
            txtViewL1.setText(spaGreeting1);
            txtViewL2.setText(spaGreeting2);
            txtViewL3.setText(spaGreeting3);
            txtViewL4.setText(spaGreeting4);
            txtViewL5.setText(spaGreeting5);
            txtViewL6.setText(spaGreeting6);
            txtViewL7.setText(spaGreeting7);
        }
        if(languageRussia){
            txtViewL1.setText(rusGreeting1);
            txtViewL2.setText(rusGreeting2);
            txtViewL3.setText(rusGreeting3);
            txtViewL4.setText(rusGreeting4);
            txtViewL5.setText(rusGreeting5);
            txtViewL6.setText(rusGreeting6);
            txtViewL7.setText(rusGreeting7);
        }
        if(languageItaly){
            txtViewL1.setText(itaGreeting1);
            txtViewL2.setText(itaGreeting2);
            txtViewL3.setText(itaGreeting3);
            txtViewL4.setText(itaGreeting4);
            txtViewL5.setText(itaGreeting5);
            txtViewL6.setText(itaGreeting6);
            txtViewL7.setText(itaGreeting7);
        }
        if(languageTurkey){
            txtViewL1.setText(turGreeting1);
            txtViewL2.setText(turGreeting2);
            txtViewL3.setText(turGreeting3);
            txtViewL4.setText(turGreeting4);
            txtViewL5.setText(turGreeting5);
            txtViewL6.setText(turGreeting6);
            txtViewL7.setText(turGreeting7);
        }
        if(languageJapan){
            txtViewL1.setText(japGreeting1);
            txtViewL2.setText(japGreeting2);
            txtViewL3.setText(japGreeting3);
            txtViewL4.setText(japGreeting4);
            txtViewL5.setText(japGreeting5);
            txtViewL6.setText(japGreeting6);
            txtViewL7.setText(japGreeting7);
        }
        if(languageChina){
            txtViewL1.setText(chiGreeting1);
            txtViewL2.setText(chiGreeting2);
            txtViewL3.setText(chiGreeting3);
            txtViewL4.setText(chiGreeting4);
            txtViewL5.setText(chiGreeting5);
            txtViewL6.setText(chiGreeting6);
            txtViewL7.setText(chiGreeting7);
        }
        //---
        if(wantToLearnAbd){
            txtViewW1.setText(engGreeting1);
            txtViewW2.setText(engGreeting2);
            txtViewW3.setText(engGreeting3);
            txtViewW4.setText(engGreeting4);
            txtViewW5.setText(engGreeting5);
            txtViewW6.setText(engGreeting6);
            txtViewW7.setText(engGreeting7);

            GreetingSound1 = MediaPlayer.create(GreetingActivity.this,R.raw.eng1greeting);
            GreetingSound2 = MediaPlayer.create(GreetingActivity.this,R.raw.eng2greeting);
            GreetingSound3 = MediaPlayer.create(GreetingActivity.this,R.raw.eng3greeting);
            GreetingSound4 = MediaPlayer.create(GreetingActivity.this,R.raw.eng4greeting);
            GreetingSound5 = MediaPlayer.create(GreetingActivity.this,R.raw.eng5greeting);
            GreetingSound6 = MediaPlayer.create(GreetingActivity.this,R.raw.eng6greeting);
            GreetingSound7 = MediaPlayer.create(GreetingActivity.this,R.raw.eng7greeting);
        }
        if(wantToLearnGermany){
            txtViewW1.setText(gerGreeting1);
            txtViewW2.setText(gerGreeting2);
            txtViewW3.setText(gerGreeting3);
            txtViewW4.setText(gerGreeting4);
            txtViewW5.setText(gerGreeting5);
            txtViewW6.setText(gerGreeting6);
            txtViewW7.setText(gerGreeting7);

            GreetingSound1 = MediaPlayer.create(GreetingActivity.this,R.raw.ger1greeting);
            GreetingSound2 = MediaPlayer.create(GreetingActivity.this,R.raw.ger2greeting);
            GreetingSound3 = MediaPlayer.create(GreetingActivity.this,R.raw.ger3greeting);
            GreetingSound4 = MediaPlayer.create(GreetingActivity.this,R.raw.ger4greeting);
            GreetingSound5 = MediaPlayer.create(GreetingActivity.this,R.raw.ger5greeting);
            GreetingSound6 = MediaPlayer.create(GreetingActivity.this,R.raw.ger6greeting);
            GreetingSound7 = MediaPlayer.create(GreetingActivity.this,R.raw.ger7greeting);
        }
        if(wantToLearnFrance){
            txtViewW1.setText(fraGreeting1);
            txtViewW2.setText(fraGreeting2);
            txtViewW3.setText(fraGreeting3);
            txtViewW4.setText(fraGreeting4);
            txtViewW5.setText(fraGreeting5);
            txtViewW6.setText(fraGreeting6);
            txtViewW7.setText(fraGreeting7);

            GreetingSound1 = MediaPlayer.create(GreetingActivity.this,R.raw.fra1greeting);
            GreetingSound2 = MediaPlayer.create(GreetingActivity.this,R.raw.fra2greeting);
            GreetingSound3 = MediaPlayer.create(GreetingActivity.this,R.raw.fra3greeting);
            GreetingSound4 = MediaPlayer.create(GreetingActivity.this,R.raw.fra4greeting);
            GreetingSound5 = MediaPlayer.create(GreetingActivity.this,R.raw.fra5greeting);
            GreetingSound6 = MediaPlayer.create(GreetingActivity.this,R.raw.fra6greeting);
            GreetingSound7 = MediaPlayer.create(GreetingActivity.this,R.raw.fra7greeting);
        }
        if(wantToLearnSpain){
            txtViewW1.setText(spaGreeting1);
            txtViewW2.setText(spaGreeting2);
            txtViewW3.setText(spaGreeting3);
            txtViewW4.setText(spaGreeting4);
            txtViewW5.setText(spaGreeting5);
            txtViewW6.setText(spaGreeting6);
            txtViewW7.setText(spaGreeting7);

            GreetingSound1 = MediaPlayer.create(GreetingActivity.this,R.raw.spa1greeting);
            GreetingSound2 = MediaPlayer.create(GreetingActivity.this,R.raw.spa2greeting);
            GreetingSound3 = MediaPlayer.create(GreetingActivity.this,R.raw.spa3greeting);
            GreetingSound4 = MediaPlayer.create(GreetingActivity.this,R.raw.spa4greeting);
            GreetingSound5 = MediaPlayer.create(GreetingActivity.this,R.raw.spa5greeting);
            GreetingSound6 = MediaPlayer.create(GreetingActivity.this,R.raw.spa6greeting);
            GreetingSound7 = MediaPlayer.create(GreetingActivity.this,R.raw.spa7greeting);
        }
        if(wantToLearnRussia){
            txtViewW1.setText(rusGreeting1);
            txtViewW2.setText(rusGreeting2);
            txtViewW3.setText(rusGreeting3);
            txtViewW4.setText(rusGreeting4);
            txtViewW5.setText(rusGreeting5);
            txtViewW6.setText(rusGreeting6);
            txtViewW7.setText(rusGreeting7);

            GreetingSound1 = MediaPlayer.create(GreetingActivity.this,R.raw.rus1greeting);
            GreetingSound2 = MediaPlayer.create(GreetingActivity.this,R.raw.rus2greeting);
            GreetingSound3 = MediaPlayer.create(GreetingActivity.this,R.raw.rus3greeting);
            GreetingSound4 = MediaPlayer.create(GreetingActivity.this,R.raw.rus4greeting);
            GreetingSound5 = MediaPlayer.create(GreetingActivity.this,R.raw.rus5greeting);
            GreetingSound6 = MediaPlayer.create(GreetingActivity.this,R.raw.rus6greeting);
            GreetingSound7 = MediaPlayer.create(GreetingActivity.this,R.raw.rus7greeting);
        }
        if(wantToLearnItaly){
            txtViewW1.setText(itaGreeting1);
            txtViewW2.setText(itaGreeting2);
            txtViewW3.setText(itaGreeting3);
            txtViewW4.setText(itaGreeting4);
            txtViewW5.setText(itaGreeting5);
            txtViewW6.setText(itaGreeting6);
            txtViewW7.setText(itaGreeting7);

            GreetingSound1 = MediaPlayer.create(GreetingActivity.this,R.raw.ita1greeting);
            GreetingSound2 = MediaPlayer.create(GreetingActivity.this,R.raw.ita2greeting);
            GreetingSound3 = MediaPlayer.create(GreetingActivity.this,R.raw.ita3greeting);
            GreetingSound4 = MediaPlayer.create(GreetingActivity.this,R.raw.ita4greeting);
            GreetingSound5 = MediaPlayer.create(GreetingActivity.this,R.raw.ita5greeting);
            GreetingSound6 = MediaPlayer.create(GreetingActivity.this,R.raw.ita6greeting);
            GreetingSound7 = MediaPlayer.create(GreetingActivity.this,R.raw.ita7greeting);
        }
        if(wantToLearnTurkey){
            txtViewW1.setText(turGreeting1);
            txtViewW2.setText(turGreeting2);
            txtViewW3.setText(turGreeting3);
            txtViewW4.setText(turGreeting4);
            txtViewW5.setText(turGreeting5);
            txtViewW6.setText(turGreeting6);
            txtViewW7.setText(turGreeting7);

            GreetingSound1 = MediaPlayer.create(GreetingActivity.this,R.raw.tur1greeting);
            GreetingSound2 = MediaPlayer.create(GreetingActivity.this,R.raw.tur2greeting);
            GreetingSound3 = MediaPlayer.create(GreetingActivity.this,R.raw.tur3greeting);
            GreetingSound4 = MediaPlayer.create(GreetingActivity.this,R.raw.tur4greeting);
            GreetingSound5 = MediaPlayer.create(GreetingActivity.this,R.raw.tur5greeting);
            GreetingSound6 = MediaPlayer.create(GreetingActivity.this,R.raw.tur6greeting);
            GreetingSound7 = MediaPlayer.create(GreetingActivity.this,R.raw.tur7greeting);
        }
        if(wantToLearnJapan){
            txtViewW1.setText(japGreeting1);
            txtViewW2.setText(japGreeting2);
            txtViewW3.setText(japGreeting3);
            txtViewW4.setText(japGreeting4);
            txtViewW5.setText(japGreeting5);
            txtViewW6.setText(japGreeting6);
            txtViewW7.setText(japGreeting7);

            GreetingSound1 = MediaPlayer.create(GreetingActivity.this,R.raw.jap1greeting);
            GreetingSound2 = MediaPlayer.create(GreetingActivity.this,R.raw.jap2greeting);
            GreetingSound3 = MediaPlayer.create(GreetingActivity.this,R.raw.jap3greeting);
            GreetingSound4 = MediaPlayer.create(GreetingActivity.this,R.raw.jap4greeting);
            GreetingSound5 = MediaPlayer.create(GreetingActivity.this,R.raw.jap5greeting);
            GreetingSound6 = MediaPlayer.create(GreetingActivity.this,R.raw.jap6greeting);
            GreetingSound7 = MediaPlayer.create(GreetingActivity.this,R.raw.jap7greeting);
        }
        if(wantToLearnChina){
            txtViewW1.setText(chiGreeting1);
            txtViewW2.setText(chiGreeting2);
            txtViewW3.setText(chiGreeting3);
            txtViewW4.setText(chiGreeting4);
            txtViewW5.setText(chiGreeting5);
            txtViewW6.setText(chiGreeting6);
            txtViewW7.setText(chiGreeting7);

            GreetingSound1 = MediaPlayer.create(GreetingActivity.this,R.raw.chi1greeting);
            GreetingSound2 = MediaPlayer.create(GreetingActivity.this,R.raw.chi2greeting);
            GreetingSound3 = MediaPlayer.create(GreetingActivity.this,R.raw.chi3greeting);
            GreetingSound4 = MediaPlayer.create(GreetingActivity.this,R.raw.chi4greeting);
            GreetingSound5 = MediaPlayer.create(GreetingActivity.this,R.raw.chi5greeting);
            GreetingSound6 = MediaPlayer.create(GreetingActivity.this,R.raw.chi6greeting);
            GreetingSound7 = MediaPlayer.create(GreetingActivity.this,R.raw.chi7greeting);
        }

        btnImageS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    GreetingSound1.start();
                }
            }
        });

        btnImageS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    GreetingSound2.start();
                }
            }
        });

        btnImageS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    GreetingSound3.start();
                }
            }
        });

        btnImageS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    GreetingSound4.start();
                }
            }
        });

        btnImageS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    GreetingSound5.start();
                }
            }
        });

        btnImageS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    GreetingSound6.start();
                }
            }
        });

        btnImageS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    GreetingSound7.start();
                }
            }
        });

        btnImageTurnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageTurnBack.startAnimation(ScaleDown);
                finish();
            }
        });
    }

    public boolean isPlaying(){
        if(!GreetingSound1.isPlaying()){
            if(!GreetingSound2.isPlaying()){
                if(!GreetingSound3.isPlaying()){
                    if(!GreetingSound4.isPlaying()){
                        if(!GreetingSound5.isPlaying()){
                            if(!GreetingSound6.isPlaying()){
                                if(!GreetingSound7.isPlaying()){
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}