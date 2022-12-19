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

public class MeetActivity extends AppCompatActivity {

    public String engMeet1 = "Can we meet?";
    public String engMeet2 = "What is your name?";
    public String engMeet3 = "My name is ...";
    public String engMeet4 = "How old are you?";
    public String engMeet5 = "I am ... years old";
    public String engMeet6 = "Can I have your phone number?";
    public String engMeet7 = "My phone number ...";

    public String gerMeet1 = "Können wir uns treffen?";
    public String gerMeet2 = "Wie lautet dein Name?";
    public String gerMeet3 = "Mein Name ist ...";
    public String gerMeet4 = "Wie alt sind Sie?";
    public String gerMeet5 = "Ich bin ... Jahre alt";
    public String gerMeet6 = "Kann ich deine Handynummer haben?";
    public String gerMeet7 = "Meine Telefonnummer ...";

    public String fraMeet1 = "Pouvons-nous nous rencontrer?";
    public String fraMeet2 = "Quel est ton nom?";
    public String fraMeet3 = "Mon nom est ...";
    public String fraMeet4 = "Quel âge as-tu?";
    public String fraMeet5 = "J'ai ... ans";
    public String fraMeet6 = "Puis-je avoir votre numéro de téléphone?";
    public String fraMeet7 = "Mon numéro de téléphone ...";

    public String spaMeet1 = "¿Podemos encontrarnos?";
    public String spaMeet2 = "¿Cómo te llamas?";
    public String spaMeet3 = "Me llamo ...";
    public String spaMeet4 = "¿Cuantos años tienes?";
    public String spaMeet5 = "Tengo ... años";
    public String spaMeet6 = "¿Puedo tener tu número de teléfono?";
    public String spaMeet7 = "Mi número de teléfono ...";

    public String rusMeet1 = "Можем ли мы встретиться?";
    public String rusMeet2 = "Как вас зовут?";
    public String rusMeet3 = "Меня зовут ...";
    public String rusMeet4 = "Сколько тебе лет?";
    public String rusMeet5 = "Mне ... лет";
    public String rusMeet6 = "Могу я взять твой номер телефона?";
    public String rusMeet7 = "Мой номер телефона ...";

    public String itaMeet1 = "Possiamo incontrarci?";
    public String itaMeet2 = "Come ti chiami?";
    public String itaMeet3 = "Il mio nome è ...";
    public String itaMeet4 = "Quanti anni hai?";
    public String itaMeet5 = "Ho ... anni";
    public String itaMeet6 = "Posso avere il tuo numero di telefono?";
    public String itaMeet7 = "Il mio numero di telefono ...";

    public String turMeet1 = "Buluşabilir miyiz?";
    public String turMeet2 = "Adın ne?";
    public String turMeet3 = "Benim adım ...";
    public String turMeet4 = "Kaç yaşındasın?";
    public String turMeet5 = "Ben ... yaşındayım";
    public String turMeet6 = "Telefon numaranı alabilir miyim?";
    public String turMeet7 = "Benim telefon numaram ...";

    public String japMeet1 = "会えますか？";
    public String japMeet2 = "名前は何？";
    public String japMeet3 = "私の名前は ...";
    public String japMeet4 = "何歳ですか？";
    public String japMeet5 = "私は ... 歳です";
    public String japMeet6 = "あなたの電話番号を教えてもらえますか？";
    public String japMeet7 = "私の電話番号 ...";

    public String chiMeet1 = "我们能碰面吗？";
    public String chiMeet2 = "你叫什么名字？";
    public String chiMeet3 = "我的名字是 ...";
    public String chiMeet4 = "你几岁？";
    public String chiMeet5 = "我……岁";
    public String chiMeet6 = "你能给我你的电话号码吗？";
    public String chiMeet7 = "我的电话号码 ...";

    MediaPlayer MeetSound1;
    MediaPlayer MeetSound2;
    MediaPlayer MeetSound3;
    MediaPlayer MeetSound4;
    MediaPlayer MeetSound5;
    MediaPlayer MeetSound6;
    MediaPlayer MeetSound7;

    Animation ScaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meet);

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
            txtViewL1.setText(engMeet1);
            txtViewL2.setText(engMeet2);
            txtViewL3.setText(engMeet3);
            txtViewL4.setText(engMeet4);
            txtViewL5.setText(engMeet5);
            txtViewL6.setText(engMeet6);
            txtViewL7.setText(engMeet7);
        }
        if(languageGermany){
            txtViewL1.setText(gerMeet1);
            txtViewL2.setText(gerMeet2);
            txtViewL3.setText(gerMeet3);
            txtViewL4.setText(gerMeet4);
            txtViewL5.setText(gerMeet5);
            txtViewL6.setText(gerMeet6);
            txtViewL7.setText(gerMeet7);
        }
        if(languageFrance){
            txtViewL1.setText(fraMeet1);
            txtViewL2.setText(fraMeet2);
            txtViewL3.setText(fraMeet3);
            txtViewL4.setText(fraMeet4);
            txtViewL5.setText(fraMeet5);
            txtViewL6.setText(fraMeet6);
            txtViewL7.setText(fraMeet7);
        }
        if(languageSpain){
            txtViewL1.setText(spaMeet1);
            txtViewL2.setText(spaMeet2);
            txtViewL3.setText(spaMeet3);
            txtViewL4.setText(spaMeet4);
            txtViewL5.setText(spaMeet5);
            txtViewL6.setText(spaMeet6);
            txtViewL7.setText(spaMeet7);
        }
        if(languageRussia){
            txtViewL1.setText(rusMeet1);
            txtViewL2.setText(rusMeet2);
            txtViewL3.setText(rusMeet3);
            txtViewL4.setText(rusMeet4);
            txtViewL5.setText(rusMeet5);
            txtViewL6.setText(rusMeet6);
            txtViewL7.setText(rusMeet7);
        }
        if(languageItaly){
            txtViewL1.setText(itaMeet1);
            txtViewL2.setText(itaMeet2);
            txtViewL3.setText(itaMeet3);
            txtViewL4.setText(itaMeet4);
            txtViewL5.setText(itaMeet5);
            txtViewL6.setText(itaMeet6);
            txtViewL7.setText(itaMeet7);
        }
        if(languageTurkey){
            txtViewL1.setText(turMeet1);
            txtViewL2.setText(turMeet2);
            txtViewL3.setText(turMeet3);
            txtViewL4.setText(turMeet4);
            txtViewL5.setText(turMeet5);
            txtViewL6.setText(turMeet6);
            txtViewL7.setText(turMeet7);
        }
        if(languageJapan){
            txtViewL1.setText(japMeet1);
            txtViewL2.setText(japMeet2);
            txtViewL3.setText(japMeet3);
            txtViewL4.setText(japMeet4);
            txtViewL5.setText(japMeet5);
            txtViewL6.setText(japMeet6);
            txtViewL7.setText(japMeet7);
        }
        if(languageChina){
            txtViewL1.setText(chiMeet1);
            txtViewL2.setText(chiMeet2);
            txtViewL3.setText(chiMeet3);
            txtViewL4.setText(chiMeet4);
            txtViewL5.setText(chiMeet5);
            txtViewL6.setText(chiMeet6);
            txtViewL7.setText(chiMeet7);
        }
        //---
        if(wantToLearnAbd){
            txtViewW1.setText(engMeet1);
            txtViewW2.setText(engMeet2);
            txtViewW3.setText(engMeet3);
            txtViewW4.setText(engMeet4);
            txtViewW5.setText(engMeet5);
            txtViewW6.setText(engMeet6);
            txtViewW7.setText(engMeet7);

            MeetSound1 = MediaPlayer.create(MeetActivity.this,R.raw.eng1meet);
            MeetSound2 = MediaPlayer.create(MeetActivity.this,R.raw.eng2meet);
            MeetSound3 = MediaPlayer.create(MeetActivity.this,R.raw.eng3meet);
            MeetSound4 = MediaPlayer.create(MeetActivity.this,R.raw.eng4meet);
            MeetSound5 = MediaPlayer.create(MeetActivity.this,R.raw.eng5meet);
            MeetSound6 = MediaPlayer.create(MeetActivity.this,R.raw.eng6meet);
            MeetSound7 = MediaPlayer.create(MeetActivity.this,R.raw.eng7meet);
        }
        if(wantToLearnGermany){
            txtViewW1.setText(gerMeet1);
            txtViewW2.setText(gerMeet2);
            txtViewW3.setText(gerMeet3);
            txtViewW4.setText(gerMeet4);
            txtViewW5.setText(gerMeet5);
            txtViewW6.setText(gerMeet6);
            txtViewW7.setText(gerMeet7);

            MeetSound1 = MediaPlayer.create(MeetActivity.this,R.raw.ger1meet);
            MeetSound2 = MediaPlayer.create(MeetActivity.this,R.raw.ger2meet);
            MeetSound3 = MediaPlayer.create(MeetActivity.this,R.raw.ger3meet);
            MeetSound4 = MediaPlayer.create(MeetActivity.this,R.raw.ger4meet);
            MeetSound5 = MediaPlayer.create(MeetActivity.this,R.raw.ger5meet);
            MeetSound6 = MediaPlayer.create(MeetActivity.this,R.raw.ger6meet);
            MeetSound7 = MediaPlayer.create(MeetActivity.this,R.raw.ger7meet);
        }
        if(wantToLearnFrance){
            txtViewW1.setText(fraMeet1);
            txtViewW2.setText(fraMeet2);
            txtViewW3.setText(fraMeet3);
            txtViewW4.setText(fraMeet4);
            txtViewW5.setText(fraMeet5);
            txtViewW6.setText(fraMeet6);
            txtViewW7.setText(fraMeet7);

            MeetSound1 = MediaPlayer.create(MeetActivity.this,R.raw.fra1meet);
            MeetSound2 = MediaPlayer.create(MeetActivity.this,R.raw.fra2meet);
            MeetSound3 = MediaPlayer.create(MeetActivity.this,R.raw.fra3meet);
            MeetSound4 = MediaPlayer.create(MeetActivity.this,R.raw.fra4meet);
            MeetSound5 = MediaPlayer.create(MeetActivity.this,R.raw.fra5meet);
            MeetSound6 = MediaPlayer.create(MeetActivity.this,R.raw.fra6meet);
            MeetSound7 = MediaPlayer.create(MeetActivity.this,R.raw.fra7meet);
        }
        if(wantToLearnSpain){
            txtViewW1.setText(spaMeet1);
            txtViewW2.setText(spaMeet2);
            txtViewW3.setText(spaMeet3);
            txtViewW4.setText(spaMeet4);
            txtViewW5.setText(spaMeet5);
            txtViewW6.setText(spaMeet6);
            txtViewW7.setText(spaMeet7);

            MeetSound1 = MediaPlayer.create(MeetActivity.this,R.raw.spa1meet);
            MeetSound2 = MediaPlayer.create(MeetActivity.this,R.raw.spa2meet);
            MeetSound3 = MediaPlayer.create(MeetActivity.this,R.raw.spa3meet);
            MeetSound4 = MediaPlayer.create(MeetActivity.this,R.raw.spa4meet);
            MeetSound5 = MediaPlayer.create(MeetActivity.this,R.raw.spa5meet);
            MeetSound6 = MediaPlayer.create(MeetActivity.this,R.raw.spa6meet);
            MeetSound7 = MediaPlayer.create(MeetActivity.this,R.raw.spa7meet);
        }
        if(wantToLearnRussia){
            txtViewW1.setText(rusMeet1);
            txtViewW2.setText(rusMeet2);
            txtViewW3.setText(rusMeet3);
            txtViewW4.setText(rusMeet4);
            txtViewW5.setText(rusMeet5);
            txtViewW6.setText(rusMeet6);
            txtViewW7.setText(rusMeet7);

            MeetSound1 = MediaPlayer.create(MeetActivity.this,R.raw.rus1meet);
            MeetSound2 = MediaPlayer.create(MeetActivity.this,R.raw.rus2meet);
            MeetSound3 = MediaPlayer.create(MeetActivity.this,R.raw.rus3meet);
            MeetSound4 = MediaPlayer.create(MeetActivity.this,R.raw.rus4meet);
            MeetSound5 = MediaPlayer.create(MeetActivity.this,R.raw.rus5meet);
            MeetSound6 = MediaPlayer.create(MeetActivity.this,R.raw.rus6meet);
            MeetSound7 = MediaPlayer.create(MeetActivity.this,R.raw.rus7meet);
        }
        if(wantToLearnItaly){
            txtViewW1.setText(itaMeet1);
            txtViewW2.setText(itaMeet2);
            txtViewW3.setText(itaMeet3);
            txtViewW4.setText(itaMeet4);
            txtViewW5.setText(itaMeet5);
            txtViewW6.setText(itaMeet6);
            txtViewW7.setText(itaMeet7);

            MeetSound1 = MediaPlayer.create(MeetActivity.this,R.raw.ita1meet);
            MeetSound2 = MediaPlayer.create(MeetActivity.this,R.raw.ita2meet);
            MeetSound3 = MediaPlayer.create(MeetActivity.this,R.raw.ita3meet);
            MeetSound4 = MediaPlayer.create(MeetActivity.this,R.raw.ita4meet);
            MeetSound5 = MediaPlayer.create(MeetActivity.this,R.raw.ita5meet);
            MeetSound6 = MediaPlayer.create(MeetActivity.this,R.raw.ita6meet);
            MeetSound7 = MediaPlayer.create(MeetActivity.this,R.raw.ita7meet);
        }
        if(wantToLearnTurkey){
            txtViewW1.setText(turMeet1);
            txtViewW2.setText(turMeet2);
            txtViewW3.setText(turMeet3);
            txtViewW4.setText(turMeet4);
            txtViewW5.setText(turMeet5);
            txtViewW6.setText(turMeet6);
            txtViewW7.setText(turMeet7);

            MeetSound1 = MediaPlayer.create(MeetActivity.this,R.raw.tur1meet);
            MeetSound2 = MediaPlayer.create(MeetActivity.this,R.raw.tur2meet);
            MeetSound3 = MediaPlayer.create(MeetActivity.this,R.raw.tur3meet);
            MeetSound4 = MediaPlayer.create(MeetActivity.this,R.raw.tur4meet);
            MeetSound5 = MediaPlayer.create(MeetActivity.this,R.raw.tur5meet);
            MeetSound6 = MediaPlayer.create(MeetActivity.this,R.raw.tur6meet);
            MeetSound7 = MediaPlayer.create(MeetActivity.this,R.raw.tur7meet);
        }
        if(wantToLearnJapan){
            txtViewW1.setText(japMeet1);
            txtViewW2.setText(japMeet2);
            txtViewW3.setText(japMeet3);
            txtViewW4.setText(japMeet4);
            txtViewW5.setText(japMeet5);
            txtViewW6.setText(japMeet6);
            txtViewW7.setText(japMeet7);

            MeetSound1 = MediaPlayer.create(MeetActivity.this,R.raw.jap1meet);
            MeetSound2 = MediaPlayer.create(MeetActivity.this,R.raw.jap2meet);
            MeetSound3 = MediaPlayer.create(MeetActivity.this,R.raw.jap3meet);
            MeetSound4 = MediaPlayer.create(MeetActivity.this,R.raw.jap4meet);
            MeetSound5 = MediaPlayer.create(MeetActivity.this,R.raw.jap5meet);
            MeetSound6 = MediaPlayer.create(MeetActivity.this,R.raw.jap6meet);
            MeetSound7 = MediaPlayer.create(MeetActivity.this,R.raw.jap7meet);
        }
        if(wantToLearnChina){
            txtViewW1.setText(chiMeet1);
            txtViewW2.setText(chiMeet2);
            txtViewW3.setText(chiMeet3);
            txtViewW4.setText(chiMeet4);
            txtViewW5.setText(chiMeet5);
            txtViewW6.setText(chiMeet6);
            txtViewW7.setText(chiMeet7);

            MeetSound1 = MediaPlayer.create(MeetActivity.this,R.raw.chi1meet);
            MeetSound2 = MediaPlayer.create(MeetActivity.this,R.raw.chi2meet);
            MeetSound3 = MediaPlayer.create(MeetActivity.this,R.raw.chi3meet);
            MeetSound4 = MediaPlayer.create(MeetActivity.this,R.raw.chi4meet);
            MeetSound5 = MediaPlayer.create(MeetActivity.this,R.raw.chi5meet);
            MeetSound6 = MediaPlayer.create(MeetActivity.this,R.raw.chi6meet);
            MeetSound7 = MediaPlayer.create(MeetActivity.this,R.raw.chi7meet);
        }

        btnImageS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    MeetSound1.start();
                }
            }
        });

        btnImageS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    MeetSound2.start();
                }
            }
        });

        btnImageS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    MeetSound3.start();
                }
            }
        });

        btnImageS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    MeetSound4.start();
                }
            }
        });

        btnImageS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    MeetSound5.start();
                }
            }
        });

        btnImageS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    MeetSound6.start();
                }
            }
        });

        btnImageS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    MeetSound7.start();
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
        if(!MeetSound1.isPlaying()){
            if(!MeetSound2.isPlaying()){
                if(!MeetSound3.isPlaying()){
                    if(!MeetSound4.isPlaying()){
                        if(!MeetSound5.isPlaying()){
                            if(!MeetSound6.isPlaying()){
                                if(!MeetSound7.isPlaying()){
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