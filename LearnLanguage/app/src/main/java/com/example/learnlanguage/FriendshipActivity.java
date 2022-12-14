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

public class FriendshipActivity extends AppCompatActivity {

    public String engFriendship1 = "How are you?";
    public String engFriendship2 = "I am good, i am bad";
    public String engFriendship3 = "How was your day?";
    public String engFriendship4 = "I had a ... day";
    public String engFriendship5 = "Good, bad";
    public String engFriendship6 = "Great, lousy";
    public String engFriendship7 = "I hope to see you again soon";

    public String gerFriendship1 = "Wie geht es dir?";
    public String gerFriendship2 = "Ich bin gut, ich bin schlecht";
    public String gerFriendship3 = "Wie war dein Tag?";
    public String gerFriendship4 = "Ich hatte einen ... Tag";
    public String gerFriendship5 = "Gut, schlecht";
    public String gerFriendship6 = "Toll, mies";
    public String gerFriendship7 = "Ich hoffe dich bald wieder zu sehen";

    public String fraFriendship1 = "Comment ca va?";
    public String fraFriendship2 = "Je suis bon, je suis mauvais";
    public String fraFriendship3 = "Comment ??tait ta journ??e?";
    public String fraFriendship4 = "J'ai eu une ... journ??e";
    public String fraFriendship5 = "Bon, mauvais";
    public String fraFriendship6 = "G??nial, moche";
    public String fraFriendship7 = "J'esp??re te revoir bient??t";

    public String spaFriendship1 = "??C??mo est??s?";
    public String spaFriendship2 = "Soy bueno, soy malo";
    public String spaFriendship3 = "??C??mo estuvo su d??a?";
    public String spaFriendship4 = "Tuve un ... dia";
    public String spaFriendship5 = "Bueno, malo";
    public String spaFriendship6 = "Genial, p??simo";
    public String spaFriendship7 = "Espero verte pronto";

    public String rusFriendship1 = "?????? ?????????";
    public String rusFriendship2 = "?? ??????????????, ?? ????????????";
    public String rusFriendship3 = "?????? ???????????? ?????????";
    public String rusFriendship4 = "?? ???????? ?????? ... ????????";
    public String rusFriendship5 = "????????????, ??????????";
    public String rusFriendship6 = "??????????????, ??????????????";
    public String rusFriendship7 = "?? ?????????????? ?????????????? ?????? ?????????? ?? ?????????????????? ??????????";

    public String itaFriendship1 = "Come stai?";
    public String itaFriendship2 = "Sono buono, sono cattivo";
    public String itaFriendship3 = "Com'?? stata la tua giornata?";
    public String itaFriendship4 = "Ho avuto un ... giorno";
    public String itaFriendship5 = "Buono, cattivo";
    public String itaFriendship6 = "Ottimo, schifoso";
    public String itaFriendship7 = "Spero di rivederti presto";

    public String turFriendship1 = "Nas??ls??n?";
    public String turFriendship2 = "??yiyim, k??t??y??m";
    public String turFriendship3 = "G??n??n nas??l ge??ti?";
    public String turFriendship4 = "G??n??m ... ge??ti";
    public String turFriendship5 = "??yi, k??t??";
    public String turFriendship6 = "Harika, berbat";
    public String turFriendship7 = "Umar??m yak??nda tekrar g??r??????r??z";

    public String japFriendship1 = "??????????????????";
    public String japFriendship2 = "???????????????????????????????????????";
    public String japFriendship3 = "???????????????????????????????????????";
    public String japFriendship4 = "??????...????????????????????????";
    public String japFriendship5 = "????????????";
    public String japFriendship6 = "???????????????????????????";
    public String japFriendship7 = "??????????????????????????????????????????";

    public String chiFriendship1 = "????????????";
    public String chiFriendship2 = "?????????????????????";
    public String chiFriendship3 = "???????????????????????????";
    public String chiFriendship4 = "????????????????????????";
    public String chiFriendship5 = "??????";
    public String chiFriendship6 = "???????????????";
    public String chiFriendship7 = "??????????????????????????????";

    MediaPlayer FriendshipSound1;
    MediaPlayer FriendshipSound2;
    MediaPlayer FriendshipSound3;
    MediaPlayer FriendshipSound4;
    MediaPlayer FriendshipSound5;
    MediaPlayer FriendshipSound6;
    MediaPlayer FriendshipSound7;

    Animation ScaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendship);

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
            txtViewL1.setText(engFriendship1);
            txtViewL2.setText(engFriendship2);
            txtViewL3.setText(engFriendship3);
            txtViewL4.setText(engFriendship4);
            txtViewL5.setText(engFriendship5);
            txtViewL6.setText(engFriendship6);
            txtViewL7.setText(engFriendship7);
        }
        if(languageGermany){
            txtViewL1.setText(gerFriendship1);
            txtViewL2.setText(gerFriendship2);
            txtViewL3.setText(gerFriendship3);
            txtViewL4.setText(gerFriendship4);
            txtViewL5.setText(gerFriendship5);
            txtViewL6.setText(gerFriendship6);
            txtViewL7.setText(gerFriendship7);
        }
        if(languageFrance){
            txtViewL1.setText(fraFriendship1);
            txtViewL2.setText(fraFriendship2);
            txtViewL3.setText(fraFriendship3);
            txtViewL4.setText(fraFriendship4);
            txtViewL5.setText(fraFriendship5);
            txtViewL6.setText(fraFriendship6);
            txtViewL7.setText(fraFriendship7);
        }
        if(languageSpain){
            txtViewL1.setText(spaFriendship1);
            txtViewL2.setText(spaFriendship2);
            txtViewL3.setText(spaFriendship3);
            txtViewL4.setText(spaFriendship4);
            txtViewL5.setText(spaFriendship5);
            txtViewL6.setText(spaFriendship6);
            txtViewL7.setText(spaFriendship7);
        }
        if(languageRussia){
            txtViewL1.setText(rusFriendship1);
            txtViewL2.setText(rusFriendship2);
            txtViewL3.setText(rusFriendship3);
            txtViewL4.setText(rusFriendship4);
            txtViewL5.setText(rusFriendship5);
            txtViewL6.setText(rusFriendship6);
            txtViewL7.setText(rusFriendship7);
        }
        if(languageItaly){
            txtViewL1.setText(itaFriendship1);
            txtViewL2.setText(itaFriendship2);
            txtViewL3.setText(itaFriendship3);
            txtViewL4.setText(itaFriendship4);
            txtViewL5.setText(itaFriendship5);
            txtViewL6.setText(itaFriendship6);
            txtViewL7.setText(itaFriendship7);
        }
        if(languageTurkey){
            txtViewL1.setText(turFriendship1);
            txtViewL2.setText(turFriendship2);
            txtViewL3.setText(turFriendship3);
            txtViewL4.setText(turFriendship4);
            txtViewL5.setText(turFriendship5);
            txtViewL6.setText(turFriendship6);
            txtViewL7.setText(turFriendship7);
        }
        if(languageJapan){
            txtViewL1.setText(japFriendship1);
            txtViewL2.setText(japFriendship2);
            txtViewL3.setText(japFriendship3);
            txtViewL4.setText(japFriendship4);
            txtViewL5.setText(japFriendship5);
            txtViewL6.setText(japFriendship6);
            txtViewL7.setText(japFriendship7);
        }
        if(languageChina){
            txtViewL1.setText(chiFriendship1);
            txtViewL2.setText(chiFriendship2);
            txtViewL3.setText(chiFriendship3);
            txtViewL4.setText(chiFriendship4);
            txtViewL5.setText(chiFriendship5);
            txtViewL6.setText(chiFriendship6);
            txtViewL7.setText(chiFriendship7);
        }
        //---
        if(wantToLearnAbd){
            txtViewW1.setText(engFriendship1);
            txtViewW2.setText(engFriendship2);
            txtViewW3.setText(engFriendship3);
            txtViewW4.setText(engFriendship4);
            txtViewW5.setText(engFriendship5);
            txtViewW6.setText(engFriendship6);
            txtViewW7.setText(engFriendship7);

            FriendshipSound1 = MediaPlayer.create(FriendshipActivity.this,R.raw.eng1friendship);
            FriendshipSound2 = MediaPlayer.create(FriendshipActivity.this,R.raw.eng2friendship);
            FriendshipSound3 = MediaPlayer.create(FriendshipActivity.this,R.raw.eng3friendship);
            FriendshipSound4 = MediaPlayer.create(FriendshipActivity.this,R.raw.eng4friendship);
            FriendshipSound5 = MediaPlayer.create(FriendshipActivity.this,R.raw.eng5friendship);
            FriendshipSound6 = MediaPlayer.create(FriendshipActivity.this,R.raw.eng6friendship);
            FriendshipSound7 = MediaPlayer.create(FriendshipActivity.this,R.raw.eng7friendship);
        }
        if(wantToLearnGermany){
            txtViewW1.setText(gerFriendship1);
            txtViewW2.setText(gerFriendship2);
            txtViewW3.setText(gerFriendship3);
            txtViewW4.setText(gerFriendship4);
            txtViewW5.setText(gerFriendship5);
            txtViewW6.setText(gerFriendship6);
            txtViewW7.setText(gerFriendship7);

            FriendshipSound1 = MediaPlayer.create(FriendshipActivity.this,R.raw.ger1friendship);
            FriendshipSound2 = MediaPlayer.create(FriendshipActivity.this,R.raw.ger2friendship);
            FriendshipSound3 = MediaPlayer.create(FriendshipActivity.this,R.raw.ger3friendship);
            FriendshipSound4 = MediaPlayer.create(FriendshipActivity.this,R.raw.ger4friendship);
            FriendshipSound5 = MediaPlayer.create(FriendshipActivity.this,R.raw.ger5friendship);
            FriendshipSound6 = MediaPlayer.create(FriendshipActivity.this,R.raw.ger6friendship);
            FriendshipSound7 = MediaPlayer.create(FriendshipActivity.this,R.raw.ger7friendship);
        }
        if(wantToLearnFrance){
            txtViewW1.setText(fraFriendship1);
            txtViewW2.setText(fraFriendship2);
            txtViewW3.setText(fraFriendship3);
            txtViewW4.setText(fraFriendship4);
            txtViewW5.setText(fraFriendship5);
            txtViewW6.setText(fraFriendship6);
            txtViewW7.setText(fraFriendship7);

            FriendshipSound1 = MediaPlayer.create(FriendshipActivity.this,R.raw.fra1friendship);
            FriendshipSound2 = MediaPlayer.create(FriendshipActivity.this,R.raw.fra2friendship);
            FriendshipSound3 = MediaPlayer.create(FriendshipActivity.this,R.raw.fra3friendship);
            FriendshipSound4 = MediaPlayer.create(FriendshipActivity.this,R.raw.fra4friendship);
            FriendshipSound5 = MediaPlayer.create(FriendshipActivity.this,R.raw.fra5friendship);
            FriendshipSound6 = MediaPlayer.create(FriendshipActivity.this,R.raw.fra6friendship);
            FriendshipSound7 = MediaPlayer.create(FriendshipActivity.this,R.raw.fra7friendship);
        }
        if(wantToLearnSpain){
            txtViewW1.setText(spaFriendship1);
            txtViewW2.setText(spaFriendship2);
            txtViewW3.setText(spaFriendship3);
            txtViewW4.setText(spaFriendship4);
            txtViewW5.setText(spaFriendship5);
            txtViewW6.setText(spaFriendship6);
            txtViewW7.setText(spaFriendship7);

            FriendshipSound1 = MediaPlayer.create(FriendshipActivity.this,R.raw.spa1friendship);
            FriendshipSound2 = MediaPlayer.create(FriendshipActivity.this,R.raw.spa2friendship);
            FriendshipSound3 = MediaPlayer.create(FriendshipActivity.this,R.raw.spa3friendship);
            FriendshipSound4 = MediaPlayer.create(FriendshipActivity.this,R.raw.spa4friendship);
            FriendshipSound5 = MediaPlayer.create(FriendshipActivity.this,R.raw.spa5friendship);
            FriendshipSound6 = MediaPlayer.create(FriendshipActivity.this,R.raw.spa6friendship);
            FriendshipSound7 = MediaPlayer.create(FriendshipActivity.this,R.raw.spa7friendship);
        }
        if(wantToLearnRussia){
            txtViewW1.setText(rusFriendship1);
            txtViewW2.setText(rusFriendship2);
            txtViewW3.setText(rusFriendship3);
            txtViewW4.setText(rusFriendship4);
            txtViewW5.setText(rusFriendship5);
            txtViewW6.setText(rusFriendship6);
            txtViewW7.setText(rusFriendship7);

            FriendshipSound1 = MediaPlayer.create(FriendshipActivity.this,R.raw.rus1friendship);
            FriendshipSound2 = MediaPlayer.create(FriendshipActivity.this,R.raw.rus2friendship);
            FriendshipSound3 = MediaPlayer.create(FriendshipActivity.this,R.raw.rus3friendship);
            FriendshipSound4 = MediaPlayer.create(FriendshipActivity.this,R.raw.rus4friendship);
            FriendshipSound5 = MediaPlayer.create(FriendshipActivity.this,R.raw.rus5friendship);
            FriendshipSound6 = MediaPlayer.create(FriendshipActivity.this,R.raw.rus6friendship);
            FriendshipSound7 = MediaPlayer.create(FriendshipActivity.this,R.raw.rus7friendship);
        }
        if(wantToLearnItaly){
            txtViewW1.setText(itaFriendship1);
            txtViewW2.setText(itaFriendship2);
            txtViewW3.setText(itaFriendship3);
            txtViewW4.setText(itaFriendship4);
            txtViewW5.setText(itaFriendship5);
            txtViewW6.setText(itaFriendship6);
            txtViewW7.setText(itaFriendship7);

            FriendshipSound1 = MediaPlayer.create(FriendshipActivity.this,R.raw.ita1friendship);
            FriendshipSound2 = MediaPlayer.create(FriendshipActivity.this,R.raw.ita2friendship);
            FriendshipSound3 = MediaPlayer.create(FriendshipActivity.this,R.raw.ita3friendship);
            FriendshipSound4 = MediaPlayer.create(FriendshipActivity.this,R.raw.ita4friendship);
            FriendshipSound5 = MediaPlayer.create(FriendshipActivity.this,R.raw.ita5friendship);
            FriendshipSound6 = MediaPlayer.create(FriendshipActivity.this,R.raw.ita6friendship);
            FriendshipSound7 = MediaPlayer.create(FriendshipActivity.this,R.raw.ita7friendship);
        }
        if(wantToLearnTurkey){
            txtViewW1.setText(turFriendship1);
            txtViewW2.setText(turFriendship2);
            txtViewW3.setText(turFriendship3);
            txtViewW4.setText(turFriendship4);
            txtViewW5.setText(turFriendship5);
            txtViewW6.setText(turFriendship6);
            txtViewW7.setText(turFriendship7);

            FriendshipSound1 = MediaPlayer.create(FriendshipActivity.this,R.raw.tur1friendship);
            FriendshipSound2 = MediaPlayer.create(FriendshipActivity.this,R.raw.tur2friendship);
            FriendshipSound3 = MediaPlayer.create(FriendshipActivity.this,R.raw.tur3friendship);
            FriendshipSound4 = MediaPlayer.create(FriendshipActivity.this,R.raw.tur4friendship);
            FriendshipSound5 = MediaPlayer.create(FriendshipActivity.this,R.raw.tur5friendship);
            FriendshipSound6 = MediaPlayer.create(FriendshipActivity.this,R.raw.tur6friendship);
            FriendshipSound7 = MediaPlayer.create(FriendshipActivity.this,R.raw.tur7friendship);
        }
        if(wantToLearnJapan){
            txtViewW1.setText(japFriendship1);
            txtViewW2.setText(japFriendship2);
            txtViewW3.setText(japFriendship3);
            txtViewW4.setText(japFriendship4);
            txtViewW5.setText(japFriendship5);
            txtViewW6.setText(japFriendship6);
            txtViewW7.setText(japFriendship7);

            FriendshipSound1 = MediaPlayer.create(FriendshipActivity.this,R.raw.jap1friendship);
            FriendshipSound2 = MediaPlayer.create(FriendshipActivity.this,R.raw.jap2friendship);
            FriendshipSound3 = MediaPlayer.create(FriendshipActivity.this,R.raw.jap3friendship);
            FriendshipSound4 = MediaPlayer.create(FriendshipActivity.this,R.raw.jap4friendship);
            FriendshipSound5 = MediaPlayer.create(FriendshipActivity.this,R.raw.jap5friendship);
            FriendshipSound6 = MediaPlayer.create(FriendshipActivity.this,R.raw.jap6friendship);
            FriendshipSound7 = MediaPlayer.create(FriendshipActivity.this,R.raw.jap7friendship);
        }
        if(wantToLearnChina){
            txtViewW1.setText(chiFriendship1);
            txtViewW2.setText(chiFriendship2);
            txtViewW3.setText(chiFriendship3);
            txtViewW4.setText(chiFriendship4);
            txtViewW5.setText(chiFriendship5);
            txtViewW6.setText(chiFriendship6);
            txtViewW6.setText(chiFriendship7);

            FriendshipSound1 = MediaPlayer.create(FriendshipActivity.this,R.raw.chi1friendship);
            FriendshipSound2 = MediaPlayer.create(FriendshipActivity.this,R.raw.chi2friendship);
            FriendshipSound3 = MediaPlayer.create(FriendshipActivity.this,R.raw.chi3friendship);
            FriendshipSound4 = MediaPlayer.create(FriendshipActivity.this,R.raw.chi4friendship);
            FriendshipSound5 = MediaPlayer.create(FriendshipActivity.this,R.raw.chi5friendship);
            FriendshipSound6 = MediaPlayer.create(FriendshipActivity.this,R.raw.chi6friendship);
            FriendshipSound7 = MediaPlayer.create(FriendshipActivity.this,R.raw.chi7friendship);
        }

        btnImageS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    FriendshipSound1.start();
                }
            }
        });

        btnImageS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    FriendshipSound2.start();
                }
            }
        });

        btnImageS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    FriendshipSound3.start();
                }
            }
        });

        btnImageS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    FriendshipSound4.start();
                }
            }
        });

        btnImageS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    FriendshipSound5.start();
                }
            }
        });

        btnImageS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    FriendshipSound6.start();
                }
            }
        });

        btnImageS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    FriendshipSound7.start();
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
        if(!FriendshipSound1.isPlaying()){
            if(!FriendshipSound2.isPlaying()){
                if(!FriendshipSound3.isPlaying()){
                    if(!FriendshipSound4.isPlaying()){
                        if(!FriendshipSound5.isPlaying()){
                            if(!FriendshipSound6.isPlaying()){
                                if(!FriendshipSound7.isPlaying()){
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