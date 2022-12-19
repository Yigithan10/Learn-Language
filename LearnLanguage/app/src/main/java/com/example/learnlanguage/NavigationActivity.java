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
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;

public class NavigationActivity extends AppCompatActivity {

    public String engNavigation1 = "Where is the ...";
    public String engNavigation2 = "How can I go to ...";
    public String engNavigation3 = "Go straight";
    public String engNavigation4 = "Turn left";
    public String engNavigation5 = "Turn right";
    public String engNavigation6 = "There";
    public String engNavigation7 = "At the end of the street";

    public String gerNavigation1 = "Wo ist der, die, das ...";
    public String gerNavigation2 = "Wie kann ich zu ...";
    public String gerNavigation3 = "Geh geradeaus";
    public String gerNavigation4 = "Biegen Sie links ab";
    public String gerNavigation5 = "Biegen Sie rechts ab";
    public String gerNavigation6 = "Dort";
    public String gerNavigation7 = "Am Ende der Straße";

    public String fraNavigation1 = "Où est le ...";
    public String fraNavigation2 = "Comment puis-je aller à...";
    public String fraNavigation3 = "Allez tout droit";
    public String fraNavigation4 = "Tournez à gauche";
    public String fraNavigation5 = "Tournez à droite";
    public String fraNavigation6 = "Là";
    public String fraNavigation7 = "Au bout de la rue";

    public String spaNavigation1 = "Donde esta la";
    public String spaNavigation2 = "Como puedo ir a...";
    public String spaNavigation3 = "Ir directamente";
    public String spaNavigation4 = "Girar a la izquierda";
    public String spaNavigation5 = "Doble a la derecha";
    public String spaNavigation6 = "Allá";
    public String spaNavigation7 = "Al final de la calle";

    public String rusNavigation1 = "Где ...";
    public String rusNavigation2 = "Как я могу пойти в ...";
    public String rusNavigation3 = "Езжайте прямо";
    public String rusNavigation4 = "Повернуть налево";
    public String rusNavigation5 = "Поверни направо";
    public String rusNavigation6 = "Там";
    public String rusNavigation7 = "В конце улицы";

    public String itaNavigation1 = "Dov'è il ...";
    public String itaNavigation2 = "Come posso andare a ...";
    public String itaNavigation3 = "Vada dritto";
    public String itaNavigation4 = "Gira a sinistra";
    public String itaNavigation5 = "Girare a destra";
    public String itaNavigation6 = "Là";
    public String itaNavigation7 = "Alla fine della strada";

    public String turNavigation1 = "... nerede";
    public String turNavigation2 = "...'a nasıl gidebilirim";
    public String turNavigation3 = "Düz git";
    public String turNavigation4 = "Sola dön";
    public String turNavigation5 = "Sağa dön";
    public String turNavigation6 = "Şurada";
    public String turNavigation7 = "Sokağın sonunda";

    public String japNavigation1 = "どこに...";
    public String japNavigation2 = "どうすれば...";
    public String japNavigation3 = "真っ直ぐ進んで下さい";
    public String japNavigation4 = "左折してください";
    public String japNavigation5 = "右に曲がる";
    public String japNavigation6 = "そこには";
    public String japNavigation7 = "通りの終わりに";

    public String chiNavigation1 = "哪儿是 ...";
    public String chiNavigation2 = "我怎么去...";
    public String chiNavigation3 = "笔直走";
    public String chiNavigation4 = "转左";
    public String chiNavigation5 = "右转";
    public String chiNavigation6 = "那里";
    public String chiNavigation7 = "在街道的尽头";

    MediaPlayer NavigationSound1;
    MediaPlayer NavigationSound2;
    MediaPlayer NavigationSound3;
    MediaPlayer NavigationSound4;
    MediaPlayer NavigationSound5;
    MediaPlayer NavigationSound6;
    MediaPlayer NavigationSound7;

    Animation ScaleDown;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

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
            txtViewL1.setText(engNavigation1);
            txtViewL2.setText(engNavigation2);
            txtViewL3.setText(engNavigation3);
            txtViewL4.setText(engNavigation4);
            txtViewL5.setText(engNavigation5);
            txtViewL6.setText(engNavigation6);
            txtViewL7.setText(engNavigation7);
        }
        if(languageGermany){
            txtViewL1.setText(gerNavigation1);
            txtViewL2.setText(gerNavigation2);
            txtViewL3.setText(gerNavigation3);
            txtViewL4.setText(gerNavigation4);
            txtViewL5.setText(gerNavigation5);
            txtViewL6.setText(gerNavigation6);
            txtViewL7.setText(gerNavigation7);
        }
        if(languageFrance){
            txtViewL1.setText(fraNavigation1);
            txtViewL2.setText(fraNavigation2);
            txtViewL3.setText(fraNavigation3);
            txtViewL4.setText(fraNavigation4);
            txtViewL5.setText(fraNavigation5);
            txtViewL6.setText(fraNavigation6);
            txtViewL7.setText(fraNavigation7);
        }
        if(languageSpain){
            txtViewL1.setText(spaNavigation1);
            txtViewL2.setText(spaNavigation2);
            txtViewL3.setText(spaNavigation3);
            txtViewL4.setText(spaNavigation4);
            txtViewL5.setText(spaNavigation5);
            txtViewL6.setText(spaNavigation6);
            txtViewL7.setText(spaNavigation7);
        }
        if(languageRussia){
            txtViewL1.setText(rusNavigation1);
            txtViewL2.setText(rusNavigation2);
            txtViewL3.setText(rusNavigation3);
            txtViewL4.setText(rusNavigation4);
            txtViewL5.setText(rusNavigation5);
            txtViewL6.setText(rusNavigation6);
            txtViewL7.setText(rusNavigation7);
        }
        if(languageItaly){
            txtViewL1.setText(itaNavigation1);
            txtViewL2.setText(itaNavigation2);
            txtViewL3.setText(itaNavigation3);
            txtViewL4.setText(itaNavigation4);
            txtViewL5.setText(itaNavigation5);
            txtViewL6.setText(itaNavigation6);
            txtViewL7.setText(itaNavigation7);
        }
        if(languageTurkey){
            txtViewL1.setText(turNavigation1);
            txtViewL2.setText(turNavigation2);
            txtViewL3.setText(turNavigation3);
            txtViewL4.setText(turNavigation4);
            txtViewL5.setText(turNavigation5);
            txtViewL6.setText(turNavigation6);
            txtViewL7.setText(turNavigation7);
        }
        if(languageJapan){
            txtViewL1.setText(japNavigation1);
            txtViewL2.setText(japNavigation2);
            txtViewL3.setText(japNavigation3);
            txtViewL4.setText(japNavigation4);
            txtViewL5.setText(japNavigation5);
            txtViewL6.setText(japNavigation6);
            txtViewL7.setText(japNavigation7);
        }
        if(languageChina){
            txtViewL1.setText(chiNavigation1);
            txtViewL2.setText(chiNavigation2);
            txtViewL3.setText(chiNavigation3);
            txtViewL4.setText(chiNavigation4);
            txtViewL5.setText(chiNavigation5);
            txtViewL6.setText(chiNavigation6);
            txtViewL7.setText(chiNavigation7);
        }
        //---
        if(wantToLearnAbd){
            txtViewW1.setText(engNavigation1);
            txtViewW2.setText(engNavigation2);
            txtViewW3.setText(engNavigation3);
            txtViewW4.setText(engNavigation4);
            txtViewW5.setText(engNavigation5);
            txtViewW6.setText(engNavigation6);
            txtViewW7.setText(engNavigation7);

            NavigationSound1 = MediaPlayer.create(NavigationActivity.this,R.raw.eng1navigation);
            NavigationSound2 = MediaPlayer.create(NavigationActivity.this,R.raw.eng2navigation);
            NavigationSound3 = MediaPlayer.create(NavigationActivity.this,R.raw.eng3navigation);
            NavigationSound4 = MediaPlayer.create(NavigationActivity.this,R.raw.eng4navigation);
            NavigationSound5 = MediaPlayer.create(NavigationActivity.this,R.raw.eng5navigation);
            NavigationSound6 = MediaPlayer.create(NavigationActivity.this,R.raw.eng6navigation);
            NavigationSound7 = MediaPlayer.create(NavigationActivity.this,R.raw.eng7navigation);
        }
        if(wantToLearnGermany){
            txtViewW1.setText(gerNavigation1);
            txtViewW2.setText(gerNavigation2);
            txtViewW3.setText(gerNavigation3);
            txtViewW4.setText(gerNavigation4);
            txtViewW5.setText(gerNavigation5);
            txtViewW6.setText(gerNavigation6);
            txtViewW7.setText(gerNavigation7);

            NavigationSound1 = MediaPlayer.create(NavigationActivity.this,R.raw.ger1navigation);
            NavigationSound2= MediaPlayer.create(NavigationActivity.this,R.raw.ger2navigation);
            NavigationSound3 = MediaPlayer.create(NavigationActivity.this,R.raw.ger3navigation);
            NavigationSound4 = MediaPlayer.create(NavigationActivity.this,R.raw.ger4navigation);
            NavigationSound5 = MediaPlayer.create(NavigationActivity.this,R.raw.ger5navigation);
            NavigationSound6 = MediaPlayer.create(NavigationActivity.this,R.raw.ger6navigation);
            NavigationSound7 = MediaPlayer.create(NavigationActivity.this,R.raw.ger7navigation);
        }
        if(wantToLearnFrance){
            txtViewW1.setText(fraNavigation1);
            txtViewW2.setText(fraNavigation2);
            txtViewW3.setText(fraNavigation3);
            txtViewW4.setText(fraNavigation4);
            txtViewW5.setText(fraNavigation5);
            txtViewW6.setText(fraNavigation6);
            txtViewW7.setText(fraNavigation7);

            NavigationSound1 = MediaPlayer.create(NavigationActivity.this,R.raw.fra1navigation);
            NavigationSound2 = MediaPlayer.create(NavigationActivity.this,R.raw.fra2navigation);
            NavigationSound3 = MediaPlayer.create(NavigationActivity.this,R.raw.fra3navigation);
            NavigationSound4 = MediaPlayer.create(NavigationActivity.this,R.raw.fra4navigation);
            NavigationSound5 = MediaPlayer.create(NavigationActivity.this,R.raw.fra5navigation);
            NavigationSound6 = MediaPlayer.create(NavigationActivity.this,R.raw.fra6navigation);
            NavigationSound7 = MediaPlayer.create(NavigationActivity.this,R.raw.fra7navigation);
        }
        if(wantToLearnSpain){
            txtViewW1.setText(spaNavigation1);
            txtViewW2.setText(spaNavigation2);
            txtViewW3.setText(spaNavigation3);
            txtViewW4.setText(spaNavigation4);
            txtViewW5.setText(spaNavigation5);
            txtViewW6.setText(spaNavigation6);
            txtViewW7.setText(spaNavigation7);

            NavigationSound1 = MediaPlayer.create(NavigationActivity.this,R.raw.spa1navigation);
            NavigationSound2 = MediaPlayer.create(NavigationActivity.this,R.raw.spa2navigation);
            NavigationSound3 = MediaPlayer.create(NavigationActivity.this,R.raw.spa3navigation);
            NavigationSound4 = MediaPlayer.create(NavigationActivity.this,R.raw.spa4navigation);
            NavigationSound5 = MediaPlayer.create(NavigationActivity.this,R.raw.spa5navigation);
            NavigationSound6 = MediaPlayer.create(NavigationActivity.this,R.raw.spa6navigation);
            NavigationSound7 = MediaPlayer.create(NavigationActivity.this,R.raw.spa7navigation);
        }
        if(wantToLearnRussia){
            txtViewW1.setText(rusNavigation1);
            txtViewW2.setText(rusNavigation2);
            txtViewW3.setText(rusNavigation3);
            txtViewW4.setText(rusNavigation4);
            txtViewW5.setText(rusNavigation5);
            txtViewW6.setText(rusNavigation6);
            txtViewW7.setText(rusNavigation7);

            NavigationSound1 = MediaPlayer.create(NavigationActivity.this,R.raw.rus1navigation);
            NavigationSound2 = MediaPlayer.create(NavigationActivity.this,R.raw.rus2navigation);
            NavigationSound3 = MediaPlayer.create(NavigationActivity.this,R.raw.rus3navigation);
            NavigationSound4 = MediaPlayer.create(NavigationActivity.this,R.raw.rus4navigation);
            NavigationSound5 = MediaPlayer.create(NavigationActivity.this,R.raw.rus5navigation);
            NavigationSound6 = MediaPlayer.create(NavigationActivity.this,R.raw.rus6navigation);
            NavigationSound7 = MediaPlayer.create(NavigationActivity.this,R.raw.rus7navigation);
        }
        if(wantToLearnItaly){
            txtViewW1.setText(itaNavigation1);
            txtViewW2.setText(itaNavigation2);
            txtViewW3.setText(itaNavigation3);
            txtViewW4.setText(itaNavigation4);
            txtViewW5.setText(itaNavigation5);
            txtViewW6.setText(itaNavigation6);
            txtViewW7.setText(itaNavigation7);

            NavigationSound1 = MediaPlayer.create(NavigationActivity.this,R.raw.ita1navigation);
            NavigationSound2 = MediaPlayer.create(NavigationActivity.this,R.raw.ita2navigation);
            NavigationSound3 = MediaPlayer.create(NavigationActivity.this,R.raw.ita3navigation);
            NavigationSound4 = MediaPlayer.create(NavigationActivity.this,R.raw.ita4navigation);
            NavigationSound5 = MediaPlayer.create(NavigationActivity.this,R.raw.ita5navigation);
            NavigationSound6 = MediaPlayer.create(NavigationActivity.this,R.raw.ita6navigation);
            NavigationSound7 = MediaPlayer.create(NavigationActivity.this,R.raw.ita7navigation);
        }
        if(wantToLearnTurkey){
            txtViewW1.setText(turNavigation1);
            txtViewW2.setText(turNavigation2);
            txtViewW3.setText(turNavigation3);
            txtViewW4.setText(turNavigation4);
            txtViewW5.setText(turNavigation5);
            txtViewW6.setText(turNavigation6);
            txtViewW7.setText(turNavigation7);

            NavigationSound1 = MediaPlayer.create(NavigationActivity.this,R.raw.tur1navigation);
            NavigationSound2 = MediaPlayer.create(NavigationActivity.this,R.raw.tur2navigation);
            NavigationSound3 = MediaPlayer.create(NavigationActivity.this,R.raw.tur3navigation);
            NavigationSound4 = MediaPlayer.create(NavigationActivity.this,R.raw.tur4navigation);
            NavigationSound5 = MediaPlayer.create(NavigationActivity.this,R.raw.tur5navigation);
            NavigationSound6 = MediaPlayer.create(NavigationActivity.this,R.raw.tur6navigation);
            NavigationSound7 = MediaPlayer.create(NavigationActivity.this,R.raw.tur7navigation);
        }
        if(wantToLearnJapan){
            txtViewW1.setText(japNavigation1);
            txtViewW2.setText(japNavigation2);
            txtViewW3.setText(japNavigation3);
            txtViewW4.setText(japNavigation4);
            txtViewW5.setText(japNavigation5);
            txtViewW6.setText(japNavigation6);
            txtViewW7.setText(japNavigation7);

            NavigationSound1 = MediaPlayer.create(NavigationActivity.this,R.raw.jap1navigation);
            NavigationSound2 = MediaPlayer.create(NavigationActivity.this,R.raw.jap2navigation);
            NavigationSound3 = MediaPlayer.create(NavigationActivity.this,R.raw.jap3navigation);
            NavigationSound4 = MediaPlayer.create(NavigationActivity.this,R.raw.jap4navigation);
            NavigationSound5 = MediaPlayer.create(NavigationActivity.this,R.raw.jap5navigation);
            NavigationSound6 = MediaPlayer.create(NavigationActivity.this,R.raw.jap6navigation);
            NavigationSound7 = MediaPlayer.create(NavigationActivity.this,R.raw.jap7navigation);
        }
        if(wantToLearnChina){
            txtViewW1.setText(chiNavigation1);
            txtViewW2.setText(chiNavigation2);
            txtViewW3.setText(chiNavigation3);
            txtViewW4.setText(chiNavigation4);
            txtViewW5.setText(chiNavigation5);
            txtViewW6.setText(chiNavigation6);
            txtViewW7.setText(chiNavigation7);

            NavigationSound1 = MediaPlayer.create(NavigationActivity.this,R.raw.chi1navigation);
            NavigationSound2 = MediaPlayer.create(NavigationActivity.this,R.raw.chi2navigation);
            NavigationSound3 = MediaPlayer.create(NavigationActivity.this,R.raw.chi3navigation);
            NavigationSound4 = MediaPlayer.create(NavigationActivity.this,R.raw.chi4navigation);
            NavigationSound5 = MediaPlayer.create(NavigationActivity.this,R.raw.chi5navigation);
            NavigationSound6 = MediaPlayer.create(NavigationActivity.this,R.raw.chi6navigation);
            NavigationSound7 = MediaPlayer.create(NavigationActivity.this,R.raw.chi7navigation);
        }

        btnImageS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    NavigationSound1.start();
                }
            }
        });

        btnImageS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    NavigationSound2.start();
                }
            }
        });

        btnImageS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    NavigationSound3.start();
                }
            }
        });

        btnImageS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    NavigationSound4.start();
                }
            }
        });

        btnImageS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    NavigationSound5.start();
                }
            }
        });

        btnImageS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    NavigationSound6.start();
                }
            }
        });

        btnImageS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    NavigationSound7.start();
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
        if(!NavigationSound1.isPlaying()){
            if(!NavigationSound2.isPlaying()){
                if(!NavigationSound3.isPlaying()){
                    if(!NavigationSound4.isPlaying()){
                        if(!NavigationSound5.isPlaying()){
                            if(!NavigationSound6.isPlaying()){
                                if(!NavigationSound7.isPlaying()){
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