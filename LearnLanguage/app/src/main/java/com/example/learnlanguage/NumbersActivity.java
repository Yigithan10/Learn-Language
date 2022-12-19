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

public class NumbersActivity extends AppCompatActivity {

    public String engNumbers1 = "One, two, three, four, five";
    public String engNumbers2 = "Six, seven, eight, nine";
    public String engNumbers3 = "Ten, twenty, thirty, forty, fifty";
    public String engNumbers4 = "Sixty, seventy, eighty, ninety";
    public String engNumbers5 = "One hundred";
    public String engNumbers6 = "Three hundred nineteen";
    public String engNumbers7 = "Eight hundred eleven";

    public String gerNumbers1 = "Eins, zwei, drei, vier, fünf";
    public String gerNumbers2 = "Sechs, sieben, acht, neun";
    public String gerNumbers3 = "Zehn, zwanzig, dreißig, vierzig, fünfzig";
    public String gerNumbers4 = "Sechzig, siebzig, achtzig, neunzig";
    public String gerNumbers5 = "Einhundert";
    public String gerNumbers6 = "Dreihundertneunzehn";
    public String gerNumbers7 = "Achthundertelf";

    public String fraNumbers1 = "Un, deux, trois, quatre, cinq";
    public String fraNumbers2 = "Six, sept, huit, neuf";
    public String fraNumbers3 = "Dix, vingt, trente, quarante, cinquante";
    public String fraNumbers4 = "Soixante, soixante-dix, quatre-vingt, quatre-vingt-dix";
    public String fraNumbers5 = "Cent";
    public String fraNumbers6 = "Trois cent dix-neuf";
    public String fraNumbers7 = "Huit cent onze";

    public String spaNumbers1 = "Uno, dos, tres, cuatro, cinco";
    public String spaNumbers2 = "Seis, siete, ocho, nueve";
    public String spaNumbers3 = "Diez, veinte, treinta, cuarenta, cincuenta";
    public String spaNumbers4 = "Sesenta, setenta, ochenta, noventa";
    public String spaNumbers5 = "Cien";
    public String spaNumbers6 = "Trescientos diecinueve";
    public String spaNumbers7 = "Ochocientos once";

    public String rusNumbers1 = "Один, два, три, четыре, пять";
    public String rusNumbers2 = "Шесть, семь, восемь, девять";
    public String rusNumbers3 = "Десять, двадцать, тридцать, сорок, пятьдесят";
    public String rusNumbers4 = "Шестьдесят, семьдесят, восемьдесят, девяносто";
    public String rusNumbers5 = "Одна сотня";
    public String rusNumbers6 = "Триста девятнадцать";
    public String rusNumbers7 = "Восемьсот одиннадцать";

    public String itaNumbers1 = "Uno, due, tre, quattro, cinque";
    public String itaNumbers2 = "Sei, sette, otto, nove";
    public String itaNumbers3 = "Dieci, venti, trenta, quaranta, cinquanta";
    public String itaNumbers4 = "Sessanta, settanta, ottanta, novanta";
    public String itaNumbers5 = "Cento";
    public String itaNumbers6 = "Trecentodiciannove";
    public String itaNumbers7 = "Ottocentoundici";

    public String turNumbers1 = "Bir, iki, üç, dört, beş";
    public String turNumbers2 = "Altı, yedi, sekiz, dokuz";
    public String turNumbers3 = "On, yirmi, otuz, kırk, elli";
    public String turNumbers4 = "Altmış, yetmiş, seksen, doksan";
    public String turNumbers5 = "Yüz";
    public String turNumbers6 = "Üç yüz on dokuz";
    public String turNumbers7 = "Sekiz yüz on bir";

    public String japNumbers1 = "1、2、3、4、5";
    public String japNumbers2 = "6、7、8、9";
    public String japNumbers3 = "10、20、30、40、50";
    public String japNumbers4 = "60、70、80、90";
    public String japNumbers5 = "100";
    public String japNumbers6 = "319";
    public String japNumbers7 = "811";

    public String chiNumbers1 = "一、二、三、四、五";
    public String chiNumbers2 = "六、七、八、九";
    public String chiNumbers3 = "十、二十、三十、四十、五十";
    public String chiNumbers4 = "六十、七十、八十、九十";
    public String chiNumbers5 = "一百";
    public String chiNumbers6 = "三百一十九";
    public String chiNumbers7 = "八百一十一";

    MediaPlayer NumbersSound1;
    MediaPlayer NumbersSound2;
    MediaPlayer NumbersSound3;
    MediaPlayer NumbersSound4;
    MediaPlayer NumbersSound5;
    MediaPlayer NumbersSound6;
    MediaPlayer NumbersSound7;

    Animation ScaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

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
            txtViewL1.setText(engNumbers1);
            txtViewL2.setText(engNumbers2);
            txtViewL3.setText(engNumbers3);
            txtViewL4.setText(engNumbers4);
            txtViewL5.setText(engNumbers5);
            txtViewL6.setText(engNumbers6);
            txtViewL7.setText(engNumbers7);
        }
        if(languageGermany){
            txtViewL1.setText(gerNumbers1);
            txtViewL2.setText(gerNumbers2);
            txtViewL3.setText(gerNumbers3);
            txtViewL4.setText(gerNumbers4);
            txtViewL5.setText(gerNumbers5);
            txtViewL6.setText(gerNumbers6);
            txtViewL7.setText(gerNumbers7);
        }
        if(languageFrance){
            txtViewL1.setText(fraNumbers1);
            txtViewL2.setText(fraNumbers2);
            txtViewL3.setText(fraNumbers3);
            txtViewL4.setText(fraNumbers4);
            txtViewL5.setText(fraNumbers5);
            txtViewL6.setText(fraNumbers6);
            txtViewL7.setText(fraNumbers7);
        }
        if(languageSpain){
            txtViewL1.setText(spaNumbers1);
            txtViewL2.setText(spaNumbers2);
            txtViewL3.setText(spaNumbers3);
            txtViewL4.setText(spaNumbers4);
            txtViewL5.setText(spaNumbers5);
            txtViewL6.setText(spaNumbers6);
            txtViewL7.setText(spaNumbers7);
        }
        if(languageRussia){
            txtViewL1.setText(rusNumbers1);
            txtViewL2.setText(rusNumbers2);
            txtViewL3.setText(rusNumbers3);
            txtViewL4.setText(rusNumbers4);
            txtViewL5.setText(rusNumbers5);
            txtViewL6.setText(rusNumbers6);
            txtViewL7.setText(rusNumbers7);
        }
        if(languageItaly){
            txtViewL1.setText(itaNumbers1);
            txtViewL2.setText(itaNumbers2);
            txtViewL3.setText(itaNumbers3);
            txtViewL4.setText(itaNumbers4);
            txtViewL5.setText(itaNumbers5);
            txtViewL6.setText(itaNumbers6);
            txtViewL7.setText(itaNumbers7);
        }
        if(languageTurkey){
            txtViewL1.setText(turNumbers1);
            txtViewL2.setText(turNumbers2);
            txtViewL3.setText(turNumbers3);
            txtViewL4.setText(turNumbers4);
            txtViewL5.setText(turNumbers5);
            txtViewL6.setText(turNumbers6);
            txtViewL7.setText(turNumbers7);
        }
        if(languageJapan){
            txtViewL1.setText(japNumbers1);
            txtViewL2.setText(japNumbers2);
            txtViewL3.setText(japNumbers3);
            txtViewL4.setText(japNumbers4);
            txtViewL5.setText(japNumbers5);
            txtViewL6.setText(japNumbers6);
            txtViewL7.setText(japNumbers7);
        }
        if(languageChina){
            txtViewL1.setText(chiNumbers1);
            txtViewL2.setText(chiNumbers2);
            txtViewL3.setText(chiNumbers3);
            txtViewL4.setText(chiNumbers4);
            txtViewL5.setText(chiNumbers5);
            txtViewL6.setText(chiNumbers6);
            txtViewL7.setText(chiNumbers7);
        }
        //---
        if(wantToLearnAbd){
            txtViewW1.setText(engNumbers1);
            txtViewW2.setText(engNumbers2);
            txtViewW3.setText(engNumbers3);
            txtViewW4.setText(engNumbers4);
            txtViewW5.setText(engNumbers5);
            txtViewW6.setText(engNumbers6);
            txtViewW7.setText(engNumbers7);

            NumbersSound1 = MediaPlayer.create(NumbersActivity.this,R.raw.eng1numbers);
            NumbersSound2 = MediaPlayer.create(NumbersActivity.this,R.raw.eng2numbers);
            NumbersSound3 = MediaPlayer.create(NumbersActivity.this,R.raw.eng3numbers);
            NumbersSound4 = MediaPlayer.create(NumbersActivity.this,R.raw.eng4numbers);
            NumbersSound5 = MediaPlayer.create(NumbersActivity.this,R.raw.eng5numbers);
            NumbersSound6 = MediaPlayer.create(NumbersActivity.this,R.raw.eng6numbers);
            NumbersSound7 = MediaPlayer.create(NumbersActivity.this,R.raw.eng7numbers);
        }
        if(wantToLearnGermany){
            txtViewW1.setText(gerNumbers1);
            txtViewW2.setText(gerNumbers2);
            txtViewW3.setText(gerNumbers3);
            txtViewW4.setText(gerNumbers4);
            txtViewW5.setText(gerNumbers5);
            txtViewW6.setText(gerNumbers6);
            txtViewW7.setText(gerNumbers7);

            NumbersSound1 = MediaPlayer.create(NumbersActivity.this,R.raw.ger1numbers);
            NumbersSound2 = MediaPlayer.create(NumbersActivity.this,R.raw.ger2numbers);
            NumbersSound3 = MediaPlayer.create(NumbersActivity.this,R.raw.ger3numbers);
            NumbersSound4 = MediaPlayer.create(NumbersActivity.this,R.raw.ger4numbers);
            NumbersSound5 = MediaPlayer.create(NumbersActivity.this,R.raw.ger5numbers);
            NumbersSound6 = MediaPlayer.create(NumbersActivity.this,R.raw.ger6numbers);
            NumbersSound7 = MediaPlayer.create(NumbersActivity.this,R.raw.ger7numbers);
        }
        if(wantToLearnFrance){
            txtViewW1.setText(fraNumbers1);
            txtViewW2.setText(fraNumbers2);
            txtViewW3.setText(fraNumbers3);
            txtViewW4.setText(fraNumbers4);
            txtViewW5.setText(fraNumbers5);
            txtViewW6.setText(fraNumbers6);
            txtViewW7.setText(fraNumbers7);

            NumbersSound1 = MediaPlayer.create(NumbersActivity.this,R.raw.fra1numbers);
            NumbersSound2 = MediaPlayer.create(NumbersActivity.this,R.raw.fra2numbers);
            NumbersSound3 = MediaPlayer.create(NumbersActivity.this,R.raw.fra3numbers);
            NumbersSound4 = MediaPlayer.create(NumbersActivity.this,R.raw.fra4numbers);
            NumbersSound5 = MediaPlayer.create(NumbersActivity.this,R.raw.fra5numbers);
            NumbersSound6 = MediaPlayer.create(NumbersActivity.this,R.raw.fra6numbers);
            NumbersSound7 = MediaPlayer.create(NumbersActivity.this,R.raw.fra7numbers);
        }
        if(wantToLearnSpain){
            txtViewW1.setText(spaNumbers1);
            txtViewW2.setText(spaNumbers2);
            txtViewW3.setText(spaNumbers3);
            txtViewW4.setText(spaNumbers4);
            txtViewW5.setText(spaNumbers5);
            txtViewW6.setText(spaNumbers6);
            txtViewW7.setText(spaNumbers7);

            NumbersSound1 = MediaPlayer.create(NumbersActivity.this,R.raw.spa1numbers);
            NumbersSound2 = MediaPlayer.create(NumbersActivity.this,R.raw.spa2numbers);
            NumbersSound3 = MediaPlayer.create(NumbersActivity.this,R.raw.spa3numbers);
            NumbersSound4 = MediaPlayer.create(NumbersActivity.this,R.raw.spa4numbers);
            NumbersSound5 = MediaPlayer.create(NumbersActivity.this,R.raw.spa5numbers);
            NumbersSound6 = MediaPlayer.create(NumbersActivity.this,R.raw.spa6numbers);
            NumbersSound7 = MediaPlayer.create(NumbersActivity.this,R.raw.spa7numbers);
        }
        if(wantToLearnRussia){
            txtViewW1.setText(rusNumbers1);
            txtViewW2.setText(rusNumbers2);
            txtViewW3.setText(rusNumbers3);
            txtViewW4.setText(rusNumbers4);
            txtViewW5.setText(rusNumbers5);
            txtViewW6.setText(rusNumbers6);
            txtViewW7.setText(rusNumbers7);

            NumbersSound1 = MediaPlayer.create(NumbersActivity.this,R.raw.rus1numbers);
            NumbersSound2 = MediaPlayer.create(NumbersActivity.this,R.raw.rus2numbers);
            NumbersSound3 = MediaPlayer.create(NumbersActivity.this,R.raw.rus3numbers);
            NumbersSound4 = MediaPlayer.create(NumbersActivity.this,R.raw.rus4numbers);
            NumbersSound5 = MediaPlayer.create(NumbersActivity.this,R.raw.rus5numbers);
            NumbersSound6 = MediaPlayer.create(NumbersActivity.this,R.raw.rus6numbers);
            NumbersSound7 = MediaPlayer.create(NumbersActivity.this,R.raw.rus7numbers);
        }
        if(wantToLearnItaly){
            txtViewW1.setText(itaNumbers1);
            txtViewW2.setText(itaNumbers2);
            txtViewW3.setText(itaNumbers3);
            txtViewW4.setText(itaNumbers4);
            txtViewW5.setText(itaNumbers5);
            txtViewW6.setText(itaNumbers6);
            txtViewW7.setText(itaNumbers7);

            NumbersSound1 = MediaPlayer.create(NumbersActivity.this,R.raw.ita1numbers);
            NumbersSound2 = MediaPlayer.create(NumbersActivity.this,R.raw.ita2numbers);
            NumbersSound3 = MediaPlayer.create(NumbersActivity.this,R.raw.ita3numbers);
            NumbersSound4 = MediaPlayer.create(NumbersActivity.this,R.raw.ita4numbers);
            NumbersSound5 = MediaPlayer.create(NumbersActivity.this,R.raw.ita5numbers);
            NumbersSound6 = MediaPlayer.create(NumbersActivity.this,R.raw.ita6numbers);
            NumbersSound7 = MediaPlayer.create(NumbersActivity.this,R.raw.ita7numbers);
        }
        if(wantToLearnTurkey){
            txtViewW1.setText(turNumbers1);
            txtViewW2.setText(turNumbers2);
            txtViewW3.setText(turNumbers3);
            txtViewW4.setText(turNumbers4);
            txtViewW5.setText(turNumbers5);
            txtViewW6.setText(turNumbers6);
            txtViewW7.setText(turNumbers7);

            NumbersSound1 = MediaPlayer.create(NumbersActivity.this,R.raw.tur1numbers);
            NumbersSound2 = MediaPlayer.create(NumbersActivity.this,R.raw.tur2numbers);
            NumbersSound3 = MediaPlayer.create(NumbersActivity.this,R.raw.tur3numbers);
            NumbersSound4 = MediaPlayer.create(NumbersActivity.this,R.raw.tur4numbers);
            NumbersSound5 = MediaPlayer.create(NumbersActivity.this,R.raw.tur5numbers);
            NumbersSound6 = MediaPlayer.create(NumbersActivity.this,R.raw.tur6numbers);
            NumbersSound7 = MediaPlayer.create(NumbersActivity.this,R.raw.tur7numbers);
        }
        if(wantToLearnJapan){
            txtViewW1.setText(japNumbers1);
            txtViewW2.setText(japNumbers2);
            txtViewW3.setText(japNumbers3);
            txtViewW4.setText(japNumbers4);
            txtViewW5.setText(japNumbers5);
            txtViewW6.setText(japNumbers6);
            txtViewW7.setText(japNumbers7);

            NumbersSound1 = MediaPlayer.create(NumbersActivity.this,R.raw.jap1numbers);
            NumbersSound2 = MediaPlayer.create(NumbersActivity.this,R.raw.jap2numbers);
            NumbersSound3 = MediaPlayer.create(NumbersActivity.this,R.raw.jap3numbers);
            NumbersSound4 = MediaPlayer.create(NumbersActivity.this,R.raw.jap4numbers);
            NumbersSound5 = MediaPlayer.create(NumbersActivity.this,R.raw.jap5numbers);
            NumbersSound6 = MediaPlayer.create(NumbersActivity.this,R.raw.jap6numbers);
            NumbersSound7 = MediaPlayer.create(NumbersActivity.this,R.raw.jap7numbers);
        }
        if(wantToLearnChina){
            txtViewW1.setText(chiNumbers1);
            txtViewW2.setText(chiNumbers2);
            txtViewW3.setText(chiNumbers3);
            txtViewW4.setText(chiNumbers4);
            txtViewW5.setText(chiNumbers5);
            txtViewW6.setText(chiNumbers6);
            txtViewW7.setText(chiNumbers7);

            NumbersSound1 = MediaPlayer.create(NumbersActivity.this,R.raw.chi1numbers);
            NumbersSound2 = MediaPlayer.create(NumbersActivity.this,R.raw.chi2numbers);
            NumbersSound3 = MediaPlayer.create(NumbersActivity.this,R.raw.chi3numbers);
            NumbersSound4 = MediaPlayer.create(NumbersActivity.this,R.raw.chi4numbers);
            NumbersSound5 = MediaPlayer.create(NumbersActivity.this,R.raw.chi5numbers);
            NumbersSound6 = MediaPlayer.create(NumbersActivity.this,R.raw.chi6numbers);
            NumbersSound7 = MediaPlayer.create(NumbersActivity.this,R.raw.chi7numbers);
        }

        btnImageS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    NumbersSound1.start();
                }
            }
        });

        btnImageS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    NumbersSound2.start();
                }
            }
        });

        btnImageS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    NumbersSound3.start();
                }
            }
        });

        btnImageS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    NumbersSound4.start();
                }
            }
        });

        btnImageS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    NumbersSound5.start();
                }
            }
        });

        btnImageS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    NumbersSound6.start();
                }
            }
        });

        btnImageS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    NumbersSound7.start();
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
        if(!NumbersSound1.isPlaying()){
            if(!NumbersSound2.isPlaying()){
                if(!NumbersSound3.isPlaying()){
                    if(!NumbersSound4.isPlaying()){
                        if(!NumbersSound5.isPlaying()){
                            if(!NumbersSound6.isPlaying()){
                                if(!NumbersSound7.isPlaying()){
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