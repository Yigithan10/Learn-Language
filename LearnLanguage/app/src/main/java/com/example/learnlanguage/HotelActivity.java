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

public class HotelActivity extends AppCompatActivity {

    public String engHotel1 = "I do not have a reservation";
    public String engHotel2 = "I have a reservation";
    public String engHotel3 = "How much is the room rate for a day?";
    public String engHotel4 = "Where is room ...?";
    public String engHotel5 = "I want room cleaning";
    public String engHotel6 = "I don't want room cleaning";
    public String engHotel7 = "Do you have a parking garage?";

    public String gerHotel1 = "Ich habe keine Reservierung";
    public String gerHotel2 = "Ich habe eine Reservierung";
    public String gerHotel3 = "Wie hoch ist der Zimmerpreis für einen Tag?";
    public String gerHotel4 = "Wo ist Platz ...?";
    public String gerHotel5 = "Ich möchte eine Zimmerreinigung";
    public String gerHotel6 = "Ich möchte keine Zimmerreinigung";
    public String gerHotel7 = "Haben Sie eine Parkgarage?";

    public String fraHotel1 = "Je n'ai pas de réservation";
    public String fraHotel2 = "J'ai une réservation";
    public String fraHotel3 = "Combien coûte la chambre pour une journée?";
    public String fraHotel4 = "Où est la chambre ...?";
    public String fraHotel5 = "Je veux le nettoyage de la chambre";
    public String fraHotel6 = "Je ne veux pas de nettoyage de chambre";
    public String fraHotel7 = "Avez-vous un parking?";

    public String spaHotel1 = "No tengo reserva";
    public String spaHotel2 = "Tengo una reservación";
    public String spaHotel3 = "¿Cuánto es el precio de la habitación por un día?";
    public String spaHotel4 = "¿Dónde está la habitación ...?";
    public String spaHotel5 = "Quiero limpieza de habitacion";
    public String spaHotel6 = "No quiero limpieza de habitaciones";
    public String spaHotel7 = "¿Tienes un garaje de estacionamiento?";

    public String rusHotel1 = "у меня нет брони";
    public String rusHotel2 = "У меня есть бронь";
    public String rusHotel3 = "Сколько стоит номер за сутки?";
    public String rusHotel4 = "Где комната...?";
    public String rusHotel5 = "Я хочу уборку комнаты";
    public String rusHotel6 = "Я не хочу убирать комнату";
    public String rusHotel7 = "У вас есть гараж?";

    public String itaHotel1 = "Non ho una prenotazione";
    public String itaHotel2 = "Ho prenotato";
    public String itaHotel3 = "Quanto costa la camera per un giorno?";
    public String itaHotel4 = "Dov'è la stanza...?";
    public String itaHotel5 = "Voglio la pulizia della stanza";
    public String itaHotel6 = "Non voglio la pulizia della stanza";
    public String itaHotel7 = "Hai un garage?";

    public String turHotel1 = "Rezervasyonum yok";
    public String turHotel2 = "Rezervasyonum var";
    public String turHotel3 = "Bir günlük oda fiyatı ne kadar?";
    public String turHotel4 = "... numaralı oda nerede?";
    public String turHotel5 = "Oda temizliği istiyorum";
    public String turHotel6 = "Oda temizliği istemiyorum";
    public String turHotel7 = "Otoparkınız var mı?";

    public String japHotel1 = "予約はありません";
    public String japHotel2 = "予約してあります";
    public String japHotel3 = "1日の宿泊料金はいくらですか？";
    public String japHotel4 = "部屋はどこですか...？";
    public String japHotel5 = "部屋の掃除をしたい";
    public String japHotel6 = "部屋の掃除はしたくない";
    public String japHotel7 = "駐車場はありますか？";

    public String chiHotel1 = "我没有预订";
    public String chiHotel2 = "我预订了座位";
    public String chiHotel3 = "一天的房费是多少？";
    public String chiHotel4 = "房间……在哪里？";
    public String chiHotel5 = "我要打扫房间";
    public String chiHotel6 = "我不想打扫房间";
    public String chiHotel7 = "你有停车场吗？";

    MediaPlayer HotelSound1;
    MediaPlayer HotelSound2;
    MediaPlayer HotelSound3;
    MediaPlayer HotelSound4;
    MediaPlayer HotelSound5;
    MediaPlayer HotelSound6;
    MediaPlayer HotelSound7;

    Animation ScaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

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
            txtViewL1.setText(engHotel1);
            txtViewL2.setText(engHotel2);
            txtViewL3.setText(engHotel3);
            txtViewL4.setText(engHotel4);
            txtViewL5.setText(engHotel5);
            txtViewL6.setText(engHotel6);
            txtViewL7.setText(engHotel7);
        }
        if(languageGermany){
            txtViewL1.setText(gerHotel1);
            txtViewL2.setText(gerHotel2);
            txtViewL3.setText(gerHotel3);
            txtViewL4.setText(gerHotel4);
            txtViewL5.setText(gerHotel5);
            txtViewL6.setText(gerHotel6);
            txtViewL7.setText(gerHotel7);
        }
        if(languageFrance){
            txtViewL1.setText(fraHotel1);
            txtViewL2.setText(fraHotel2);
            txtViewL3.setText(fraHotel3);
            txtViewL4.setText(fraHotel4);
            txtViewL5.setText(fraHotel5);
            txtViewL6.setText(fraHotel6);
            txtViewL7.setText(fraHotel7);
        }
        if(languageSpain){
            txtViewL1.setText(spaHotel1);
            txtViewL2.setText(spaHotel2);
            txtViewL3.setText(spaHotel3);
            txtViewL4.setText(spaHotel4);
            txtViewL5.setText(spaHotel5);
            txtViewL6.setText(spaHotel6);
            txtViewL7.setText(spaHotel7);
        }
        if(languageRussia){
            txtViewL1.setText(rusHotel1);
            txtViewL2.setText(rusHotel2);
            txtViewL3.setText(rusHotel3);
            txtViewL4.setText(rusHotel4);
            txtViewL5.setText(rusHotel5);
            txtViewL6.setText(rusHotel6);
            txtViewL7.setText(rusHotel7);
        }
        if(languageItaly){
            txtViewL1.setText(itaHotel1);
            txtViewL2.setText(itaHotel2);
            txtViewL3.setText(itaHotel3);
            txtViewL4.setText(itaHotel4);
            txtViewL5.setText(itaHotel5);
            txtViewL6.setText(itaHotel6);
            txtViewL7.setText(itaHotel7);
        }
        if(languageTurkey){
            txtViewL1.setText(turHotel1);
            txtViewL2.setText(turHotel2);
            txtViewL3.setText(turHotel3);
            txtViewL4.setText(turHotel4);
            txtViewL5.setText(turHotel5);
            txtViewL6.setText(turHotel6);
            txtViewL7.setText(turHotel7);
        }
        if(languageJapan){
            txtViewL1.setText(japHotel1);
            txtViewL2.setText(japHotel2);
            txtViewL3.setText(japHotel3);
            txtViewL4.setText(japHotel4);
            txtViewL5.setText(japHotel5);
            txtViewL6.setText(japHotel6);
            txtViewL7.setText(japHotel7);
        }
        if(languageChina){
            txtViewL1.setText(chiHotel1);
            txtViewL2.setText(chiHotel2);
            txtViewL3.setText(chiHotel3);
            txtViewL4.setText(chiHotel4);
            txtViewL5.setText(chiHotel5);
            txtViewL6.setText(chiHotel6);
            txtViewL7.setText(chiHotel7);
        }
        //---
        if(wantToLearnAbd){
            txtViewW1.setText(engHotel1);
            txtViewW2.setText(engHotel2);
            txtViewW3.setText(engHotel3);
            txtViewW4.setText(engHotel4);
            txtViewW5.setText(engHotel5);
            txtViewW6.setText(engHotel6);
            txtViewW7.setText(engHotel7);

            HotelSound1 = MediaPlayer.create(HotelActivity.this,R.raw.eng1hotel);
            HotelSound2 = MediaPlayer.create(HotelActivity.this,R.raw.eng2hotel);
            HotelSound3 = MediaPlayer.create(HotelActivity.this,R.raw.eng3hotel);
            HotelSound4 = MediaPlayer.create(HotelActivity.this,R.raw.eng4hotel);
            HotelSound5 = MediaPlayer.create(HotelActivity.this,R.raw.eng5hotel);
            HotelSound6 = MediaPlayer.create(HotelActivity.this,R.raw.eng6hotel);
            HotelSound7 = MediaPlayer.create(HotelActivity.this,R.raw.eng7hotel);
        }
        if(wantToLearnGermany){
            txtViewW1.setText(gerHotel1);
            txtViewW2.setText(gerHotel2);
            txtViewW3.setText(gerHotel3);
            txtViewW4.setText(gerHotel4);
            txtViewW5.setText(gerHotel5);
            txtViewW6.setText(gerHotel6);
            txtViewW7.setText(gerHotel7);

            HotelSound1 = MediaPlayer.create(HotelActivity.this,R.raw.ger1hotel);
            HotelSound2 = MediaPlayer.create(HotelActivity.this,R.raw.ger2hotel);
            HotelSound3 = MediaPlayer.create(HotelActivity.this,R.raw.ger3hotel);
            HotelSound4 = MediaPlayer.create(HotelActivity.this,R.raw.ger4hotel);
            HotelSound5 = MediaPlayer.create(HotelActivity.this,R.raw.ger5hotel);
            HotelSound6 = MediaPlayer.create(HotelActivity.this,R.raw.ger6hotel);
            HotelSound7 = MediaPlayer.create(HotelActivity.this,R.raw.ger7hotel);
        }
        if(wantToLearnFrance){
            txtViewW1.setText(fraHotel1);
            txtViewW2.setText(fraHotel2);
            txtViewW3.setText(fraHotel3);
            txtViewW4.setText(fraHotel4);
            txtViewW5.setText(fraHotel5);
            txtViewW6.setText(fraHotel6);
            txtViewW7.setText(fraHotel7);

            HotelSound1 = MediaPlayer.create(HotelActivity.this,R.raw.fra1hotel);
            HotelSound2 = MediaPlayer.create(HotelActivity.this,R.raw.fra2hotel);
            HotelSound3 = MediaPlayer.create(HotelActivity.this,R.raw.fra3hotel);
            HotelSound4 = MediaPlayer.create(HotelActivity.this,R.raw.fra4hotel);
            HotelSound5 = MediaPlayer.create(HotelActivity.this,R.raw.fra5hotel);
            HotelSound6 = MediaPlayer.create(HotelActivity.this,R.raw.fra6hotel);
            HotelSound7 = MediaPlayer.create(HotelActivity.this,R.raw.fra7hotel);
        }
        if(wantToLearnSpain){
            txtViewW1.setText(spaHotel1);
            txtViewW2.setText(spaHotel2);
            txtViewW3.setText(spaHotel3);
            txtViewW4.setText(spaHotel4);
            txtViewW5.setText(spaHotel5);
            txtViewW6.setText(spaHotel6);
            txtViewW7.setText(spaHotel7);

            HotelSound1 = MediaPlayer.create(HotelActivity.this,R.raw.spa1hotel);
            HotelSound2 = MediaPlayer.create(HotelActivity.this,R.raw.spa2hotel);
            HotelSound3 = MediaPlayer.create(HotelActivity.this,R.raw.spa3hotel);
            HotelSound4 = MediaPlayer.create(HotelActivity.this,R.raw.spa4hotel);
            HotelSound5 = MediaPlayer.create(HotelActivity.this,R.raw.spa5hotel);
            HotelSound6 = MediaPlayer.create(HotelActivity.this,R.raw.spa6hotel);
            HotelSound7 = MediaPlayer.create(HotelActivity.this,R.raw.spa7hotel);
        }
        if(wantToLearnRussia){
            txtViewW1.setText(rusHotel1);
            txtViewW2.setText(rusHotel2);
            txtViewW3.setText(rusHotel3);
            txtViewW4.setText(rusHotel4);
            txtViewW5.setText(rusHotel5);
            txtViewW6.setText(rusHotel6);
            txtViewW7.setText(rusHotel7);

            HotelSound1 = MediaPlayer.create(HotelActivity.this,R.raw.rus1hotel);
            HotelSound2 = MediaPlayer.create(HotelActivity.this,R.raw.rus2hotel);
            HotelSound3 = MediaPlayer.create(HotelActivity.this,R.raw.rus3hotel);
            HotelSound4 = MediaPlayer.create(HotelActivity.this,R.raw.rus4hotel);
            HotelSound5 = MediaPlayer.create(HotelActivity.this,R.raw.rus5hotel);
            HotelSound6 = MediaPlayer.create(HotelActivity.this,R.raw.rus6hotel);
            HotelSound7 = MediaPlayer.create(HotelActivity.this,R.raw.rus7hotel);
        }
        if(wantToLearnItaly){
            txtViewW1.setText(itaHotel1);
            txtViewW2.setText(itaHotel2);
            txtViewW3.setText(itaHotel3);
            txtViewW4.setText(itaHotel4);
            txtViewW5.setText(itaHotel5);
            txtViewW6.setText(itaHotel6);
            txtViewW7.setText(itaHotel7);

            HotelSound1 = MediaPlayer.create(HotelActivity.this,R.raw.ita1hotel);
            HotelSound2 = MediaPlayer.create(HotelActivity.this,R.raw.ita2hotel);
            HotelSound3 = MediaPlayer.create(HotelActivity.this,R.raw.ita3hotel);
            HotelSound4 = MediaPlayer.create(HotelActivity.this,R.raw.ita4hotel);
            HotelSound5 = MediaPlayer.create(HotelActivity.this,R.raw.ita5hotel);
            HotelSound6 = MediaPlayer.create(HotelActivity.this,R.raw.ita6hotel);
            HotelSound7 = MediaPlayer.create(HotelActivity.this,R.raw.ita7hotel);
        }
        if(wantToLearnTurkey){
            txtViewW1.setText(turHotel1);
            txtViewW2.setText(turHotel2);
            txtViewW3.setText(turHotel3);
            txtViewW4.setText(turHotel4);
            txtViewW5.setText(turHotel5);
            txtViewW6.setText(turHotel6);
            txtViewW7.setText(turHotel7);

            HotelSound1 = MediaPlayer.create(HotelActivity.this,R.raw.tur1hotel);
            HotelSound2 = MediaPlayer.create(HotelActivity.this,R.raw.tur2hotel);
            HotelSound3 = MediaPlayer.create(HotelActivity.this,R.raw.tur3hotel);
            HotelSound4 = MediaPlayer.create(HotelActivity.this,R.raw.tur4hotel);
            HotelSound5 = MediaPlayer.create(HotelActivity.this,R.raw.tur5hotel);
            HotelSound6 = MediaPlayer.create(HotelActivity.this,R.raw.tur6hotel);
            HotelSound7 = MediaPlayer.create(HotelActivity.this,R.raw.tur7hotel);
        }
        if(wantToLearnJapan){
            txtViewW1.setText(japHotel1);
            txtViewW2.setText(japHotel2);
            txtViewW3.setText(japHotel3);
            txtViewW4.setText(japHotel4);
            txtViewW5.setText(japHotel5);
            txtViewW6.setText(japHotel6);
            txtViewW7.setText(japHotel7);

            HotelSound1 = MediaPlayer.create(HotelActivity.this,R.raw.jap1hotel);
            HotelSound2 = MediaPlayer.create(HotelActivity.this,R.raw.jap2hotel);
            HotelSound3 = MediaPlayer.create(HotelActivity.this,R.raw.jap3hotel);
            HotelSound4 = MediaPlayer.create(HotelActivity.this,R.raw.jap4hotel);
            HotelSound5 = MediaPlayer.create(HotelActivity.this,R.raw.jap5hotel);
            HotelSound6 = MediaPlayer.create(HotelActivity.this,R.raw.jap6hotel);
            HotelSound7 = MediaPlayer.create(HotelActivity.this,R.raw.jap7hotel);
        }
        if(wantToLearnChina){
            txtViewW1.setText(chiHotel1);
            txtViewW2.setText(chiHotel2);
            txtViewW3.setText(chiHotel3);
            txtViewW4.setText(chiHotel4);
            txtViewW5.setText(chiHotel5);
            txtViewW6.setText(chiHotel6);
            txtViewW7.setText(chiHotel7);

            HotelSound1 = MediaPlayer.create(HotelActivity.this,R.raw.chi1hotel);
            HotelSound2 = MediaPlayer.create(HotelActivity.this,R.raw.chi2hotel);
            HotelSound3 = MediaPlayer.create(HotelActivity.this,R.raw.chi3hotel);
            HotelSound4 = MediaPlayer.create(HotelActivity.this,R.raw.chi4hotel);
            HotelSound5 = MediaPlayer.create(HotelActivity.this,R.raw.chi5hotel);
            HotelSound6 = MediaPlayer.create(HotelActivity.this,R.raw.chi6hotel);
            HotelSound7 = MediaPlayer.create(HotelActivity.this,R.raw.chi7hotel);
        }

        btnImageS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    HotelSound1.start();
                }
            }
        });

        btnImageS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    HotelSound2.start();
                }
            }
        });

        btnImageS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    HotelSound3.start();
                }
            }
        });

        btnImageS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    HotelSound4.start();
                }
            }
        });

        btnImageS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    HotelSound5.start();
                }
            }
        });

        btnImageS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    HotelSound6.start();
                }
            }
        });

        btnImageS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    HotelSound7.start();
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
        if(!HotelSound1.isPlaying()){
            if(!HotelSound2.isPlaying()){
                if(!HotelSound3.isPlaying()){
                    if(!HotelSound4.isPlaying()){
                        if(!HotelSound5.isPlaying()){
                            if(!HotelSound6.isPlaying()){
                                if(!HotelSound7.isPlaying()){
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