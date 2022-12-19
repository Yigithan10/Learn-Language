package com.example.learnlanguage;

import androidx.appcompat.app.AppCompatActivity;
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

import android.app.UiModeManager;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;

public class LoveActivity extends AppCompatActivity {

    public String engLove1 = "I love you";
    public String engLove2 = "I miss you";
    public String engLove3 = "I adore you";
    public String engLove4 = "You are mine";
    public String engLove5 = "You are my everything";
    public String engLove6 = "You're the only one for me";
    public String engLove7 = "I am happy to be with you";

    public String gerLove1 = "Ich liebe dich";
    public String gerLove2 = "Ich vermisse dich";
    public String gerLove3 = "Ich verehre dich";
    public String gerLove4 = "Du bist mein";
    public String gerLove5 = "Du bist mein Ein und Alles";
    public String gerLove6 = "Du bist der Einzige für mich";
    public String gerLove7 = "Ich bin glücklich mit dir zusammen zu sein";

    public String fraLove1 = "Je vous aime";
    public String fraLove2 = "Tu me manques";
    public String fraLove3 = "Je vous adore";
    public String fraLove4 = "Tu es à moi";
    public String fraLove5 = "Tu es tout pour moi";
    public String fraLove6 = "Tu es le seul pour moi";
    public String fraLove7 = "Je suis heureux d'être avec toi";

    public String spaLove1 = "Te quiero";
    public String spaLove2 = "Te extraño";
    public String spaLove3 = "Te adoro";
    public String spaLove4 = "Tu eres mia";
    public String spaLove5 = "Eres mi todo";
    public String spaLove6 = "Eres la unica para mi";
    public String spaLove7 = "Estoy feliz de estar contigo";

    public String rusLove1 = "Я тебя люблю";
    public String rusLove2 = "Я скучаю по тебе";
    public String rusLove3 = "Я тебя обожаю";
    public String rusLove4 = "Ты принадлежишь мне";
    public String rusLove5 = "Ты для меня все";
    public String rusLove6 = "Ты единственный для меня";
    public String rusLove7 = "Я счастлив быть с тобой";

    public String itaLove1 = "Ti amo";
    public String itaLove2 = "Mi manchi";
    public String itaLove3 = "Ti adoro";
    public String itaLove4 = "Sei mio";
    public String itaLove5 = "Sei il mio tutto";
    public String itaLove6 = "Tu sei l'unico per me";
    public String itaLove7 = "Sono felice di essere con te";

    public String turLove1 = "Seni seviyorum";
    public String turLove2 = "Seni özlüyorum";
    public String turLove3 = "Sana bayılıyorum";
    public String turLove4 = "Sen benimsin";
    public String turLove5 = "Sen benim her şeyimsin";
    public String turLove6 = "Benim için bir tek sen varsın";
    public String turLove7 = "Seninle olmaktan mutluyum";

    public String japLove1 = "愛してます";
    public String japLove2 = "あなたが恋しい";
    public String japLove3 = "君が愛おしい";
    public String japLove4 = "あなたは私のものです";
    public String japLove5 = "あなたは私のすべてです";
    public String japLove6 = "私にとって唯一のあなた";
    public String japLove7 = "私はあなたと一緒にいて幸せです";

    public String chiLove1 = "我爱你";
    public String chiLove2 = "我想你";
    public String chiLove3 = "我崇拜你";
    public String chiLove4 = "你是我的";
    public String chiLove5 = "你是我的全部";
    public String chiLove6 = "你是我的唯一";
    public String chiLove7 = "我很高兴和你在一起";

    MediaPlayer LoveSound1;
    MediaPlayer LoveSound2;
    MediaPlayer LoveSound3;
    MediaPlayer LoveSound4;
    MediaPlayer LoveSound5;
    MediaPlayer LoveSound6;
    MediaPlayer LoveSound7;

    Animation ScaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);

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
            txtViewL1.setText(engLove1);
            txtViewL2.setText(engLove2);
            txtViewL3.setText(engLove3);
            txtViewL4.setText(engLove4);
            txtViewL5.setText(engLove5);
            txtViewL6.setText(engLove6);
            txtViewL7.setText(engLove7);
        }
        if(languageGermany){
            txtViewL1.setText(gerLove1);
            txtViewL2.setText(gerLove2);
            txtViewL3.setText(gerLove3);
            txtViewL4.setText(gerLove4);
            txtViewL5.setText(gerLove5);
            txtViewL6.setText(gerLove6);
            txtViewL7.setText(gerLove7);
        }
        if(languageFrance){
            txtViewL1.setText(fraLove1);
            txtViewL2.setText(fraLove2);
            txtViewL3.setText(fraLove3);
            txtViewL4.setText(fraLove4);
            txtViewL5.setText(fraLove5);
            txtViewL6.setText(fraLove6);
            txtViewL7.setText(fraLove7);
        }
        if(languageSpain){
            txtViewL1.setText(spaLove1);
            txtViewL2.setText(spaLove2);
            txtViewL3.setText(spaLove3);
            txtViewL4.setText(spaLove4);
            txtViewL5.setText(spaLove5);
            txtViewL6.setText(spaLove6);
            txtViewL7.setText(spaLove7);
        }
        if(languageRussia){
            txtViewL1.setText(rusLove1);
            txtViewL2.setText(rusLove2);
            txtViewL3.setText(rusLove3);
            txtViewL4.setText(rusLove4);
            txtViewL5.setText(rusLove5);
            txtViewL6.setText(rusLove6);
            txtViewL7.setText(rusLove7);
        }
        if(languageItaly){
            txtViewL1.setText(itaLove1);
            txtViewL2.setText(itaLove2);
            txtViewL3.setText(itaLove3);
            txtViewL4.setText(itaLove4);
            txtViewL5.setText(itaLove5);
            txtViewL6.setText(itaLove6);
            txtViewL7.setText(itaLove7);
        }
        if(languageTurkey){
            txtViewL1.setText(turLove1);
            txtViewL2.setText(turLove2);
            txtViewL3.setText(turLove3);
            txtViewL4.setText(turLove4);
            txtViewL5.setText(turLove5);
            txtViewL6.setText(turLove6);
            txtViewL7.setText(turLove7);
        }
        if(languageJapan){
            txtViewL1.setText(japLove1);
            txtViewL2.setText(japLove2);
            txtViewL3.setText(japLove3);
            txtViewL4.setText(japLove4);
            txtViewL5.setText(japLove5);
            txtViewL6.setText(japLove6);
            txtViewL7.setText(japLove7);
        }
        if(languageChina){
            txtViewL1.setText(chiLove1);
            txtViewL2.setText(chiLove2);
            txtViewL3.setText(chiLove3);
            txtViewL4.setText(chiLove4);
            txtViewL5.setText(chiLove5);
            txtViewL6.setText(chiLove6);
            txtViewL7.setText(chiLove7);
        }
        //---
        if(wantToLearnAbd){
            txtViewW1.setText(engLove1);
            txtViewW2.setText(engLove2);
            txtViewW3.setText(engLove3);
            txtViewW4.setText(engLove4);
            txtViewW5.setText(engLove5);
            txtViewW6.setText(engLove6);
            txtViewW7.setText(engLove7);

            LoveSound1 = MediaPlayer.create(LoveActivity.this,R.raw.eng1love);
            LoveSound2 = MediaPlayer.create(LoveActivity.this,R.raw.eng2love);
            LoveSound3 = MediaPlayer.create(LoveActivity.this,R.raw.eng3love);
            LoveSound4 = MediaPlayer.create(LoveActivity.this,R.raw.eng4love);
            LoveSound5 = MediaPlayer.create(LoveActivity.this,R.raw.eng5love);
            LoveSound6 = MediaPlayer.create(LoveActivity.this,R.raw.eng6love);
            LoveSound7 = MediaPlayer.create(LoveActivity.this,R.raw.eng7love);
        }
        if(wantToLearnGermany){
            txtViewW1.setText(gerLove1);
            txtViewW2.setText(gerLove2);
            txtViewW3.setText(gerLove3);
            txtViewW4.setText(gerLove4);
            txtViewW5.setText(gerLove5);
            txtViewW6.setText(gerLove6);
            txtViewW7.setText(gerLove7);

            LoveSound1 = MediaPlayer.create(LoveActivity.this,R.raw.ger1love);
            LoveSound2 = MediaPlayer.create(LoveActivity.this,R.raw.ger2love);
            LoveSound3 = MediaPlayer.create(LoveActivity.this,R.raw.ger3love);
            LoveSound4 = MediaPlayer.create(LoveActivity.this,R.raw.ger4love);
            LoveSound5 = MediaPlayer.create(LoveActivity.this,R.raw.ger5love);
            LoveSound6 = MediaPlayer.create(LoveActivity.this,R.raw.ger6love);
            LoveSound7 = MediaPlayer.create(LoveActivity.this,R.raw.ger7love);
        }
        if(wantToLearnFrance){
            txtViewW1.setText(fraLove1);
            txtViewW2.setText(fraLove2);
            txtViewW3.setText(fraLove3);
            txtViewW4.setText(fraLove4);
            txtViewW5.setText(fraLove5);
            txtViewW6.setText(fraLove6);
            txtViewW7.setText(fraLove7);

            LoveSound1 = MediaPlayer.create(LoveActivity.this,R.raw.fra1love);
            LoveSound2 = MediaPlayer.create(LoveActivity.this,R.raw.fra2love);
            LoveSound3 = MediaPlayer.create(LoveActivity.this,R.raw.fra3love);
            LoveSound4 = MediaPlayer.create(LoveActivity.this,R.raw.fra4love);
            LoveSound5 = MediaPlayer.create(LoveActivity.this,R.raw.fra5love);
            LoveSound6 = MediaPlayer.create(LoveActivity.this,R.raw.fra6love);
            LoveSound7 = MediaPlayer.create(LoveActivity.this,R.raw.fra7love);
        }
        if(wantToLearnSpain){
            txtViewW1.setText(spaLove1);
            txtViewW2.setText(spaLove2);
            txtViewW3.setText(spaLove3);
            txtViewW4.setText(spaLove4);
            txtViewW5.setText(spaLove5);
            txtViewW6.setText(spaLove6);
            txtViewW7.setText(spaLove7);

            LoveSound1 = MediaPlayer.create(LoveActivity.this,R.raw.spa1love);
            LoveSound2 = MediaPlayer.create(LoveActivity.this,R.raw.spa2love);
            LoveSound3 = MediaPlayer.create(LoveActivity.this,R.raw.spa3love);
            LoveSound4 = MediaPlayer.create(LoveActivity.this,R.raw.spa4love);
            LoveSound5 = MediaPlayer.create(LoveActivity.this,R.raw.spa5love);
            LoveSound6 = MediaPlayer.create(LoveActivity.this,R.raw.spa6love);
            LoveSound7 = MediaPlayer.create(LoveActivity.this,R.raw.spa7love);
        }
        if(wantToLearnRussia){
            txtViewW1.setText(rusLove1);
            txtViewW2.setText(rusLove2);
            txtViewW3.setText(rusLove3);
            txtViewW4.setText(rusLove4);
            txtViewW5.setText(rusLove5);
            txtViewW6.setText(rusLove6);
            txtViewW7.setText(rusLove7);

            LoveSound1 = MediaPlayer.create(LoveActivity.this,R.raw.rus1love);
            LoveSound2 = MediaPlayer.create(LoveActivity.this,R.raw.rus2love);
            LoveSound3 = MediaPlayer.create(LoveActivity.this,R.raw.rus3love);
            LoveSound4 = MediaPlayer.create(LoveActivity.this,R.raw.rus4love);
            LoveSound5 = MediaPlayer.create(LoveActivity.this,R.raw.rus5love);
            LoveSound6 = MediaPlayer.create(LoveActivity.this,R.raw.rus6love);
            LoveSound7 = MediaPlayer.create(LoveActivity.this,R.raw.rus7love);
        }
        if(wantToLearnItaly){
            txtViewW1.setText(itaLove1);
            txtViewW2.setText(itaLove2);
            txtViewW3.setText(itaLove3);
            txtViewW4.setText(itaLove4);
            txtViewW5.setText(itaLove5);
            txtViewW6.setText(itaLove6);
            txtViewW7.setText(itaLove7);

            LoveSound1 = MediaPlayer.create(LoveActivity.this,R.raw.ita1love);
            LoveSound2 = MediaPlayer.create(LoveActivity.this,R.raw.ita2love);
            LoveSound3 = MediaPlayer.create(LoveActivity.this,R.raw.ita3love);
            LoveSound4 = MediaPlayer.create(LoveActivity.this,R.raw.ita4love);
            LoveSound5 = MediaPlayer.create(LoveActivity.this,R.raw.ita5love);
            LoveSound6 = MediaPlayer.create(LoveActivity.this,R.raw.ita6love);
            LoveSound7 = MediaPlayer.create(LoveActivity.this,R.raw.ita7love);
        }
        if(wantToLearnTurkey){
            txtViewW1.setText(turLove1);
            txtViewW2.setText(turLove2);
            txtViewW3.setText(turLove3);
            txtViewW4.setText(turLove4);
            txtViewW5.setText(turLove5);
            txtViewW6.setText(turLove6);
            txtViewW7.setText(turLove7);

            LoveSound1 = MediaPlayer.create(LoveActivity.this,R.raw.tur1love);
            LoveSound2 = MediaPlayer.create(LoveActivity.this,R.raw.tur2love);
            LoveSound3 = MediaPlayer.create(LoveActivity.this,R.raw.tur3love);
            LoveSound4 = MediaPlayer.create(LoveActivity.this,R.raw.tur4love);
            LoveSound5 = MediaPlayer.create(LoveActivity.this,R.raw.tur5love);
            LoveSound6 = MediaPlayer.create(LoveActivity.this,R.raw.tur6love);
            LoveSound7 = MediaPlayer.create(LoveActivity.this,R.raw.tur7love);
        }
        if(wantToLearnJapan){
            txtViewW1.setText(japLove1);
            txtViewW2.setText(japLove2);
            txtViewW3.setText(japLove3);
            txtViewW4.setText(japLove4);
            txtViewW5.setText(japLove5);
            txtViewW6.setText(japLove6);
            txtViewW7.setText(japLove7);

            LoveSound1 = MediaPlayer.create(LoveActivity.this,R.raw.jap1love);
            LoveSound2 = MediaPlayer.create(LoveActivity.this,R.raw.jap2love);
            LoveSound3 = MediaPlayer.create(LoveActivity.this,R.raw.jap3love);
            LoveSound4 = MediaPlayer.create(LoveActivity.this,R.raw.jap4love);
            LoveSound5 = MediaPlayer.create(LoveActivity.this,R.raw.jap5love);
            LoveSound6 = MediaPlayer.create(LoveActivity.this,R.raw.jap6love);
            LoveSound7 = MediaPlayer.create(LoveActivity.this,R.raw.jap7love);
        }
        if(wantToLearnChina){
            txtViewW1.setText(chiLove1);
            txtViewW2.setText(chiLove2);
            txtViewW3.setText(chiLove3);
            txtViewW4.setText(chiLove4);
            txtViewW5.setText(chiLove5);
            txtViewW6.setText(chiLove6);
            txtViewW7.setText(chiLove7);

            LoveSound1 = MediaPlayer.create(LoveActivity.this,R.raw.chi1love);
            LoveSound2 = MediaPlayer.create(LoveActivity.this,R.raw.chi2love);
            LoveSound3 = MediaPlayer.create(LoveActivity.this,R.raw.chi3love);
            LoveSound4 = MediaPlayer.create(LoveActivity.this,R.raw.chi4love);
            LoveSound5 = MediaPlayer.create(LoveActivity.this,R.raw.chi5love);
            LoveSound6 = MediaPlayer.create(LoveActivity.this,R.raw.chi6love);
            LoveSound7 = MediaPlayer.create(LoveActivity.this,R.raw.chi7love);
        }

        btnImageS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    LoveSound1.start();
                }
            }
        });

        btnImageS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    LoveSound2.start();
                }
            }
        });

        btnImageS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    LoveSound3.start();
                }
            }
        });

        btnImageS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    LoveSound4.start();
                }
            }
        });

        btnImageS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    LoveSound5.start();
                }
            }
        });

        btnImageS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    LoveSound6.start();
                }
            }
        });

        btnImageS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    LoveSound7.start();
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
        if(!LoveSound1.isPlaying()){
            if(!LoveSound2.isPlaying()){
                if(!LoveSound3.isPlaying()){
                    if(!LoveSound4.isPlaying()){
                        if(!LoveSound5.isPlaying()){
                            if(!LoveSound6.isPlaying()){
                                if(!LoveSound7.isPlaying()){
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