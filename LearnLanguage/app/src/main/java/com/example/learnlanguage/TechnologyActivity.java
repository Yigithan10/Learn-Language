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

public class TechnologyActivity extends AppCompatActivity {

    public String engTechnology1 = "Computer, laptop";
    public String engTechnology2 = "Telephone, television";
    public String engTechnology3 = "Oven, ironing machine";
    public String engTechnology4 = "Air conditioner, calculator";
    public String engTechnology5 = "Refrigerator, vacuum cleaner";
    public String engTechnology6 = "Dishwasher, washing machine";
    public String engTechnology7 = "Radio, toaster";

    public String gerTechnology1 = "Computer, Laptop";
    public String gerTechnology2 = "Telefon, Fernsehen";
    public String gerTechnology3 = "Backofen, Bügelmaschine";
    public String gerTechnology4 = "Klimaanlage, Taschenrechner";
    public String gerTechnology5 = "Kühlschrank, Staubsauger";
    public String gerTechnology6 = "Geschirrspüler, Waschmaschine";
    public String gerTechnology7 = "Radio, Toaster";

    public String fraTechnology1 = "Ordinateur, portable";
    public String fraTechnology2 = "Téléphone, télévision";
    public String fraTechnology3 = "Four, machine à repasser";
    public String fraTechnology4 = "Climatiseur, calculatrice";
    public String fraTechnology5 = "Réfrigérateur, aspirateur";
    public String fraTechnology6 = "Lave-vaisselle, lave-linge";
    public String fraTechnology7 = "Radio, grille-pain";

    public String spaTechnology1 = "Computadora, computadora portátil";
    public String spaTechnology2 = "Teléfono, televisión";
    public String spaTechnology3 = "Horno, plancha";
    public String spaTechnology4 = "Aire acondicionado, calculadora";
    public String spaTechnology5 = "Frigorífico, aspiradora";
    public String spaTechnology6 = "Lavavajillas, lavadora";
    public String spaTechnology7 = "Radio, tostadora";

    public String rusTechnology1 = "Компьютер, ноутбук";
    public String rusTechnology2 = "Телефон, телевизор";
    public String rusTechnology3 = "Духовка, гладильная машина";
    public String rusTechnology4 = "Кондиционер, калькулятор";
    public String rusTechnology5 = "Холодильник, пылесос";
    public String rusTechnology6 = "Посудомоечная машина, стиральная машина";
    public String rusTechnology7 = "Радио, тостер";

    public String itaTechnology1 = "Computer, portatile";
    public String itaTechnology2 = "Telefono, televisione";
    public String itaTechnology3 = "Forno, macchina da stiro";
    public String itaTechnology4 = "Condizionatore d'aria, calcolatrice";
    public String itaTechnology5 = "Frigorifero, aspirapolvere";
    public String itaTechnology6 = "Lavastoviglie, lavatrice";
    public String itaTechnology7 = "Radio, tostapane";

    public String turTechnology1 = "Bilgisayar, dizüstü bilgisayar";
    public String turTechnology2 = "Telefon, televizyon";
    public String turTechnology3 = "Fırın, ütü makinesi";
    public String turTechnology4 = "Klima, hesap makinesi";
    public String turTechnology5 = "Buzdolabı, elektrikli süpürge";
    public String turTechnology6 = "Bulaşık makinesi, çamaşır makinesi";
    public String turTechnology7 = "Radyo, tost makinesi";

    public String japTechnology1 = "コンピューター、ラップトップ";
    public String japTechnology2 = "電話、テレビ";
    public String japTechnology3 = "オーブン、アイロン機";
    public String japTechnology4 = "エアコン、電卓";
    public String japTechnology5 = "冷蔵庫、掃除機";
    public String japTechnology6 = "食器洗い機、洗濯機";
    public String japTechnology7 = "ラジオ、トースター";

    public String chiTechnology1 = "电脑、笔记本电脑";
    public String chiTechnology2 = "电话、电视";
    public String chiTechnology3 = "烤箱、熨烫机";
    public String chiTechnology4 = "空调、计算器";
    public String chiTechnology5 = "冰箱、吸尘器";
    public String chiTechnology6 = "洗碗机、洗衣机";
    public String chiTechnology7 = "收音机、烤面包机";

    MediaPlayer TechnologySound1;
    MediaPlayer TechnologySound2;
    MediaPlayer TechnologySound3;
    MediaPlayer TechnologySound4;
    MediaPlayer TechnologySound5;
    MediaPlayer TechnologySound6;
    MediaPlayer TechnologySound7;

    Animation ScaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technology);

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
            txtViewL1.setText(engTechnology1);
            txtViewL2.setText(engTechnology2);
            txtViewL3.setText(engTechnology3);
            txtViewL4.setText(engTechnology4);
            txtViewL5.setText(engTechnology5);
            txtViewL6.setText(engTechnology6);
            txtViewL7.setText(engTechnology7);
        }
        if(languageGermany){
            txtViewL1.setText(gerTechnology1);
            txtViewL2.setText(gerTechnology2);
            txtViewL3.setText(gerTechnology3);
            txtViewL4.setText(gerTechnology4);
            txtViewL5.setText(gerTechnology5);
            txtViewL6.setText(gerTechnology6);
            txtViewL7.setText(gerTechnology7);
        }
        if(languageFrance){
            txtViewL1.setText(fraTechnology1);
            txtViewL2.setText(fraTechnology2);
            txtViewL3.setText(fraTechnology3);
            txtViewL4.setText(fraTechnology4);
            txtViewL5.setText(fraTechnology5);
            txtViewL6.setText(fraTechnology6);
            txtViewL7.setText(fraTechnology7);
        }
        if(languageSpain){
            txtViewL1.setText(spaTechnology1);
            txtViewL2.setText(spaTechnology2);
            txtViewL3.setText(spaTechnology3);
            txtViewL4.setText(spaTechnology4);
            txtViewL5.setText(spaTechnology5);
            txtViewL6.setText(spaTechnology6);
            txtViewL7.setText(spaTechnology7);
        }
        if(languageRussia){
            txtViewL1.setText(rusTechnology1);
            txtViewL2.setText(rusTechnology2);
            txtViewL3.setText(rusTechnology3);
            txtViewL4.setText(rusTechnology4);
            txtViewL5.setText(rusTechnology5);
            txtViewL6.setText(rusTechnology6);
            txtViewL7.setText(rusTechnology7);
        }
        if(languageItaly){
            txtViewL1.setText(itaTechnology1);
            txtViewL2.setText(itaTechnology2);
            txtViewL3.setText(itaTechnology3);
            txtViewL4.setText(itaTechnology4);
            txtViewL5.setText(itaTechnology5);
            txtViewL6.setText(itaTechnology6);
            txtViewL7.setText(itaTechnology7);
        }
        if(languageTurkey){
            txtViewL1.setText(turTechnology1);
            txtViewL2.setText(turTechnology2);
            txtViewL3.setText(turTechnology3);
            txtViewL4.setText(turTechnology4);
            txtViewL5.setText(turTechnology5);
            txtViewL6.setText(turTechnology6);
            txtViewL7.setText(turTechnology7);
        }
        if(languageJapan){
            txtViewL1.setText(japTechnology1);
            txtViewL2.setText(japTechnology2);
            txtViewL3.setText(japTechnology3);
            txtViewL4.setText(japTechnology4);
            txtViewL5.setText(japTechnology5);
            txtViewL6.setText(japTechnology6);
            txtViewL7.setText(japTechnology7);
        }
        if(languageChina){
            txtViewL1.setText(chiTechnology1);
            txtViewL2.setText(chiTechnology2);
            txtViewL3.setText(chiTechnology3);
            txtViewL4.setText(chiTechnology4);
            txtViewL5.setText(chiTechnology5);
            txtViewL6.setText(chiTechnology6);
            txtViewL7.setText(chiTechnology7);
        }
        //---
        if(wantToLearnAbd){
            txtViewW1.setText(engTechnology1);
            txtViewW2.setText(engTechnology2);
            txtViewW3.setText(engTechnology3);
            txtViewW4.setText(engTechnology4);
            txtViewW5.setText(engTechnology5);
            txtViewW6.setText(engTechnology6);
            txtViewW7.setText(engTechnology7);

            TechnologySound1 = MediaPlayer.create(TechnologyActivity.this,R.raw.eng1technology);
            TechnologySound2 = MediaPlayer.create(TechnologyActivity.this,R.raw.eng2technology);
            TechnologySound3 = MediaPlayer.create(TechnologyActivity.this,R.raw.eng3technology);
            TechnologySound4 = MediaPlayer.create(TechnologyActivity.this,R.raw.eng4technology);
            TechnologySound5 = MediaPlayer.create(TechnologyActivity.this,R.raw.eng5technology);
            TechnologySound6 = MediaPlayer.create(TechnologyActivity.this,R.raw.eng6technology);
            TechnologySound7 = MediaPlayer.create(TechnologyActivity.this,R.raw.eng7technology);
        }
        if(wantToLearnGermany){
            txtViewW1.setText(gerTechnology1);
            txtViewW2.setText(gerTechnology2);
            txtViewW3.setText(gerTechnology3);
            txtViewW4.setText(gerTechnology4);
            txtViewW5.setText(gerTechnology5);
            txtViewW6.setText(gerTechnology6);
            txtViewW7.setText(gerTechnology7);

            TechnologySound1 = MediaPlayer.create(TechnologyActivity.this,R.raw.ger1technology);
            TechnologySound2 = MediaPlayer.create(TechnologyActivity.this,R.raw.ger2technology);
            TechnologySound3 = MediaPlayer.create(TechnologyActivity.this,R.raw.ger3technology);
            TechnologySound4 = MediaPlayer.create(TechnologyActivity.this,R.raw.ger4technology);
            TechnologySound5 = MediaPlayer.create(TechnologyActivity.this,R.raw.ger5technology);
            TechnologySound6 = MediaPlayer.create(TechnologyActivity.this,R.raw.ger6technology);
            TechnologySound7 = MediaPlayer.create(TechnologyActivity.this,R.raw.ger7technology);
        }
        if(wantToLearnFrance){
            txtViewW1.setText(fraTechnology1);
            txtViewW2.setText(fraTechnology2);
            txtViewW3.setText(fraTechnology3);
            txtViewW4.setText(fraTechnology4);
            txtViewW5.setText(fraTechnology5);
            txtViewW6.setText(fraTechnology6);
            txtViewW7.setText(fraTechnology7);

            TechnologySound1 = MediaPlayer.create(TechnologyActivity.this,R.raw.fra1technology);
            TechnologySound2 = MediaPlayer.create(TechnologyActivity.this,R.raw.fra2technology);
            TechnologySound3 = MediaPlayer.create(TechnologyActivity.this,R.raw.fra3technology);
            TechnologySound4 = MediaPlayer.create(TechnologyActivity.this,R.raw.fra4technology);
            TechnologySound5 = MediaPlayer.create(TechnologyActivity.this,R.raw.fra5technology);
            TechnologySound6 = MediaPlayer.create(TechnologyActivity.this,R.raw.fra6technology);
            TechnologySound7 = MediaPlayer.create(TechnologyActivity.this,R.raw.fra7technology);
        }
        if(wantToLearnSpain){
            txtViewW1.setText(spaTechnology1);
            txtViewW2.setText(spaTechnology2);
            txtViewW3.setText(spaTechnology3);
            txtViewW4.setText(spaTechnology4);
            txtViewW5.setText(spaTechnology5);
            txtViewW6.setText(spaTechnology6);
            txtViewW7.setText(spaTechnology7);

            TechnologySound1 = MediaPlayer.create(TechnologyActivity.this,R.raw.spa1technology);
            TechnologySound2 = MediaPlayer.create(TechnologyActivity.this,R.raw.spa2technology);
            TechnologySound3 = MediaPlayer.create(TechnologyActivity.this,R.raw.spa3technology);
            TechnologySound4 = MediaPlayer.create(TechnologyActivity.this,R.raw.spa4technology);
            TechnologySound5 = MediaPlayer.create(TechnologyActivity.this,R.raw.spa5technology);
            TechnologySound6 = MediaPlayer.create(TechnologyActivity.this,R.raw.spa6technology);
            TechnologySound7 = MediaPlayer.create(TechnologyActivity.this,R.raw.spa7technology);
        }
        if(wantToLearnRussia){
            txtViewW1.setText(rusTechnology1);
            txtViewW2.setText(rusTechnology2);
            txtViewW3.setText(rusTechnology3);
            txtViewW4.setText(rusTechnology4);
            txtViewW5.setText(rusTechnology5);
            txtViewW6.setText(rusTechnology6);
            txtViewW7.setText(rusTechnology7);

            TechnologySound1 = MediaPlayer.create(TechnologyActivity.this,R.raw.rus1technology);
            TechnologySound2 = MediaPlayer.create(TechnologyActivity.this,R.raw.rus2technology);
            TechnologySound3 = MediaPlayer.create(TechnologyActivity.this,R.raw.rus3technology);
            TechnologySound4 = MediaPlayer.create(TechnologyActivity.this,R.raw.rus4technology);
            TechnologySound5 = MediaPlayer.create(TechnologyActivity.this,R.raw.rus5technology);
            TechnologySound6 = MediaPlayer.create(TechnologyActivity.this,R.raw.rus6technology);
            TechnologySound7 = MediaPlayer.create(TechnologyActivity.this,R.raw.rus7technology);
        }
        if(wantToLearnItaly){
            txtViewW1.setText(itaTechnology1);
            txtViewW2.setText(itaTechnology2);
            txtViewW3.setText(itaTechnology3);
            txtViewW4.setText(itaTechnology4);
            txtViewW5.setText(itaTechnology5);
            txtViewW6.setText(itaTechnology6);
            txtViewW7.setText(itaTechnology7);

            TechnologySound1 = MediaPlayer.create(TechnologyActivity.this,R.raw.ita1technology);
            TechnologySound2 = MediaPlayer.create(TechnologyActivity.this,R.raw.ita2technology);
            TechnologySound3 = MediaPlayer.create(TechnologyActivity.this,R.raw.ita3technology);
            TechnologySound4 = MediaPlayer.create(TechnologyActivity.this,R.raw.ita4technology);
            TechnologySound5 = MediaPlayer.create(TechnologyActivity.this,R.raw.ita5technology);
            TechnologySound6 = MediaPlayer.create(TechnologyActivity.this,R.raw.ita6technology);
            TechnologySound7 = MediaPlayer.create(TechnologyActivity.this,R.raw.ita7technology);
        }
        if(wantToLearnTurkey){
            txtViewW1.setText(turTechnology1);
            txtViewW2.setText(turTechnology2);
            txtViewW3.setText(turTechnology3);
            txtViewW4.setText(turTechnology4);
            txtViewW5.setText(turTechnology5);
            txtViewW6.setText(turTechnology6);
            txtViewW7.setText(turTechnology7);

            TechnologySound1 = MediaPlayer.create(TechnologyActivity.this,R.raw.tur1technology);
            TechnologySound2 = MediaPlayer.create(TechnologyActivity.this,R.raw.tur2technology);
            TechnologySound3 = MediaPlayer.create(TechnologyActivity.this,R.raw.tur3technology);
            TechnologySound4 = MediaPlayer.create(TechnologyActivity.this,R.raw.tur4technology);
            TechnologySound5 = MediaPlayer.create(TechnologyActivity.this,R.raw.tur5technology);
            TechnologySound6 = MediaPlayer.create(TechnologyActivity.this,R.raw.tur6technology);
            TechnologySound7 = MediaPlayer.create(TechnologyActivity.this,R.raw.tur7technology);
        }
        if(wantToLearnJapan){
            txtViewW1.setText(japTechnology1);
            txtViewW2.setText(japTechnology2);
            txtViewW3.setText(japTechnology3);
            txtViewW4.setText(japTechnology4);
            txtViewW5.setText(japTechnology5);
            txtViewW6.setText(japTechnology6);
            txtViewW7.setText(japTechnology7);

            TechnologySound1 = MediaPlayer.create(TechnologyActivity.this,R.raw.jap1technology);
            TechnologySound2 = MediaPlayer.create(TechnologyActivity.this,R.raw.jap2technology);
            TechnologySound3 = MediaPlayer.create(TechnologyActivity.this,R.raw.jap3technology);
            TechnologySound4 = MediaPlayer.create(TechnologyActivity.this,R.raw.jap4technology);
            TechnologySound5 = MediaPlayer.create(TechnologyActivity.this,R.raw.jap5technology);
            TechnologySound6 = MediaPlayer.create(TechnologyActivity.this,R.raw.jap6technology);
            TechnologySound7 = MediaPlayer.create(TechnologyActivity.this,R.raw.jap7technology);
        }
        if(wantToLearnChina){
            txtViewW1.setText(chiTechnology1);
            txtViewW2.setText(chiTechnology2);
            txtViewW3.setText(chiTechnology3);
            txtViewW4.setText(chiTechnology4);
            txtViewW5.setText(chiTechnology5);
            txtViewW6.setText(chiTechnology6);
            txtViewW7.setText(chiTechnology7);

            TechnologySound1 = MediaPlayer.create(TechnologyActivity.this,R.raw.chi1technology);
            TechnologySound2 = MediaPlayer.create(TechnologyActivity.this,R.raw.chi2technology);
            TechnologySound3 = MediaPlayer.create(TechnologyActivity.this,R.raw.chi3technology);
            TechnologySound4 = MediaPlayer.create(TechnologyActivity.this,R.raw.chi4technology);
            TechnologySound5 = MediaPlayer.create(TechnologyActivity.this,R.raw.chi5technology);
            TechnologySound6 = MediaPlayer.create(TechnologyActivity.this,R.raw.chi6technology);
            TechnologySound7 = MediaPlayer.create(TechnologyActivity.this,R.raw.chi7technology);
        }

        btnImageS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    TechnologySound1.start();
                }
            }
        });

        btnImageS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    TechnologySound2.start();
                }
            }
        });

        btnImageS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    TechnologySound3.start();
                }
            }
        });

        btnImageS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    TechnologySound4.start();
                }
            }
        });

        btnImageS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    TechnologySound5.start();
                }
            }
        });

        btnImageS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    TechnologySound6.start();
                }
            }
        });

        btnImageS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    TechnologySound7.start();
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
        if(!TechnologySound1.isPlaying()){
            if(!TechnologySound2.isPlaying()){
                if(!TechnologySound3.isPlaying()){
                    if(!TechnologySound4.isPlaying()){
                        if(!TechnologySound5.isPlaying()){
                            if(!TechnologySound6.isPlaying()){
                                if(!TechnologySound7.isPlaying()){
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