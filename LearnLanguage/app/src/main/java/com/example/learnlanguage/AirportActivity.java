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

public class AirportActivity extends AppCompatActivity {

    public String engAirport1 = "I have a plane ticket";
    public String engAirport2 = "I don't have a plane ticket";
    public String engAirport3 = "Where can I buy plane ticket?";
    public String engAirport4 = "I'm flying to ...";
    public String engAirport5 = "I want a plane ticket to ...";
    public String engAirport6 = "How much is the ticket price?";
    public String engAirport7 = "Where can I find a taxi?";

    public String gerAirport1 = "Ich habe ein Flugticket";
    public String gerAirport2 = "Ich habe kein Flugticket";
    public String gerAirport3 = "Wo kann ich Flugtickets kaufen?";
    public String gerAirport4 = "Ich fliege nach ...";
    public String gerAirport5 = "Ich möchte ein Flugticket nach ...";
    public String gerAirport6 = "Wie hoch ist der Ticketpreis?";
    public String gerAirport7 = "Wo kann ich ein Taxi finden?";

    public String fraAirport1 = "J'ai un billet d'avion";
    public String fraAirport2 = "Je n'ai pas de billet d'avion";
    public String fraAirport3 = "Où puis-je acheter un billet d'avion?";
    public String fraAirport4 = "Je m'envole pour ...";
    public String fraAirport5 = "Je veux un billet d'avion pour ...";
    public String fraAirport6 = "Combien coûte le prix du billet?";
    public String fraAirport7 = "Où puis-je trouver un taxi?";

    public String spaAirport1 = "Tengo un billete de avion";
    public String spaAirport2 = "No tengo billete de avion";
    public String spaAirport3 = "¿Dónde puedo comprar el billete de avión?";
    public String spaAirport4 = "Estoy volando a...";
    public String spaAirport5 = "Quiero un billete de avión para ...";
    public String spaAirport6 = "¿Cuánto es el precio del boleto?";
    public String spaAirport7 = "¿Dónde puedo encontrar un taxi?";

    public String rusAirport1 = "у меня есть билет на самолет";
    public String rusAirport2 = "у меня нет билета на самолет";
    public String rusAirport3 = "Где я могу купить билет на самолет?";
    public String rusAirport4 = "Я лечу в...";
    public String rusAirport5 = "Я хочу билет на самолет до...";
    public String rusAirport6 = "Сколько стоит билет?";
    public String rusAirport7 = "Где я могу найти такси?";

    public String itaAirport1 = "Ho un biglietto aereo";
    public String itaAirport2 = "Non ho un biglietto aereo";
    public String itaAirport3 = "Dove posso acquistare il biglietto aereo?";
    public String itaAirport4 = "Sto volando verso...";
    public String itaAirport5 = "Voglio un biglietto aereo per...";
    public String itaAirport6 = "Quanto costa il biglietto?";
    public String itaAirport7 = "Dove posso trovare un taxi?";

    public String turAirport1 = "Uçak biletim var";
    public String turAirport2 = "Uçak biletim yok";
    public String turAirport3 = "Uçak biletini nereden alabilirim?";
    public String turAirport4 = "...'a uçuyorum";
    public String turAirport5 = "...'a uçak bileti istiyorum";
    public String turAirport6 = "Bilet fiyatı ne kadar?";
    public String turAirport7 = "Nereden taksi bulabilirim?";

    public String japAirport1 = "飛行機のチケットを持っています";
    public String japAirport2 = "飛行機のチケットを持っていません";
    public String japAirport3 = "飛行機のチケットはどこで買えますか？";
    public String japAirport4 = "私は飛んでいます...";
    public String japAirport5 = "飛行機のチケットが欲しい...";
    public String japAirport6 = "チケットの値段はいくらですか？";
    public String japAirport7 = "タクシーはどこにありますか？";

    public String chiAirport1 = "我有机票";
    public String chiAirport2 = "我没有机票";
    public String chiAirport3 = "我在哪里可以买到机票？";
    public String chiAirport4 = "我飞往...";
    public String chiAirport5 = "我要机票去...";
    public String chiAirport6 = "票价是多少？";
    public String chiAirport7 = "我在哪里可以找到出租车？";

    MediaPlayer AirportSound1;
    MediaPlayer AirportSound2;
    MediaPlayer AirportSound3;
    MediaPlayer AirportSound4;
    MediaPlayer AirportSound5;
    MediaPlayer AirportSound6;
    MediaPlayer AirportSound7;

    Animation ScaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airport);

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
            txtViewL1.setText(engAirport1);
            txtViewL2.setText(engAirport2);
            txtViewL3.setText(engAirport3);
            txtViewL4.setText(engAirport4);
            txtViewL5.setText(engAirport5);
            txtViewL6.setText(engAirport6);
            txtViewL7.setText(engAirport7);
        }
        if(languageGermany){
            txtViewL1.setText(gerAirport1);
            txtViewL2.setText(gerAirport2);
            txtViewL3.setText(gerAirport3);
            txtViewL4.setText(gerAirport4);
            txtViewL5.setText(gerAirport5);
            txtViewL6.setText(gerAirport6);
            txtViewL7.setText(gerAirport7);
        }
        if(languageFrance){
            txtViewL1.setText(fraAirport1);
            txtViewL2.setText(fraAirport2);
            txtViewL3.setText(fraAirport3);
            txtViewL4.setText(fraAirport4);
            txtViewL5.setText(fraAirport5);
            txtViewL6.setText(fraAirport6);
            txtViewL7.setText(fraAirport7);
        }
        if(languageSpain){
            txtViewL1.setText(spaAirport1);
            txtViewL2.setText(spaAirport2);
            txtViewL3.setText(spaAirport3);
            txtViewL4.setText(spaAirport4);
            txtViewL5.setText(spaAirport5);
            txtViewL6.setText(spaAirport6);
            txtViewL7.setText(spaAirport7);
        }
        if(languageRussia){
            txtViewL1.setText(rusAirport1);
            txtViewL2.setText(rusAirport2);
            txtViewL3.setText(rusAirport3);
            txtViewL4.setText(rusAirport4);
            txtViewL5.setText(rusAirport5);
            txtViewL6.setText(rusAirport6);
            txtViewL7.setText(rusAirport7);
        }
        if(languageItaly){
            txtViewL1.setText(itaAirport1);
            txtViewL2.setText(itaAirport2);
            txtViewL3.setText(itaAirport3);
            txtViewL4.setText(itaAirport4);
            txtViewL5.setText(itaAirport5);
            txtViewL6.setText(itaAirport6);
            txtViewL7.setText(itaAirport7);
        }
        if(languageTurkey){
            txtViewL1.setText(turAirport1);
            txtViewL2.setText(turAirport2);
            txtViewL3.setText(turAirport3);
            txtViewL4.setText(turAirport4);
            txtViewL5.setText(turAirport5);
            txtViewL6.setText(turAirport6);
            txtViewL7.setText(turAirport7);
        }
        if(languageJapan){
            txtViewL1.setText(japAirport1);
            txtViewL2.setText(japAirport2);
            txtViewL3.setText(japAirport3);
            txtViewL4.setText(japAirport4);
            txtViewL5.setText(japAirport5);
            txtViewL6.setText(japAirport6);
            txtViewL7.setText(japAirport7);
        }
        if(languageChina){
            txtViewL1.setText(chiAirport1);
            txtViewL2.setText(chiAirport2);
            txtViewL3.setText(chiAirport3);
            txtViewL4.setText(chiAirport4);
            txtViewL5.setText(chiAirport5);
            txtViewL6.setText(chiAirport6);
            txtViewL7.setText(chiAirport7);
        }
        //---
        if(wantToLearnAbd){
            txtViewW1.setText(engAirport1);
            txtViewW2.setText(engAirport2);
            txtViewW3.setText(engAirport3);
            txtViewW4.setText(engAirport4);
            txtViewW5.setText(engAirport5);
            txtViewW6.setText(engAirport6);
            txtViewW7.setText(engAirport7);

            AirportSound1 = MediaPlayer.create(AirportActivity.this,R.raw.eng1airport);
            AirportSound2 = MediaPlayer.create(AirportActivity.this,R.raw.eng2airport);
            AirportSound3 = MediaPlayer.create(AirportActivity.this,R.raw.eng3airport);
            AirportSound4 = MediaPlayer.create(AirportActivity.this,R.raw.eng4airport);
            AirportSound5 = MediaPlayer.create(AirportActivity.this,R.raw.eng5airport);
            AirportSound6 = MediaPlayer.create(AirportActivity.this,R.raw.eng6airport);
            AirportSound7 = MediaPlayer.create(AirportActivity.this,R.raw.eng7airport);
        }
        if(wantToLearnGermany){
            txtViewW1.setText(gerAirport1);
            txtViewW2.setText(gerAirport2);
            txtViewW3.setText(gerAirport3);
            txtViewW4.setText(gerAirport4);
            txtViewW5.setText(gerAirport5);
            txtViewW6.setText(gerAirport6);
            txtViewW7.setText(gerAirport7);

            AirportSound1 = MediaPlayer.create(AirportActivity.this,R.raw.ger1airport);
            AirportSound2 = MediaPlayer.create(AirportActivity.this,R.raw.ger2airport);
            AirportSound3 = MediaPlayer.create(AirportActivity.this,R.raw.ger3airport);
            AirportSound4 = MediaPlayer.create(AirportActivity.this,R.raw.ger4airport);
            AirportSound5 = MediaPlayer.create(AirportActivity.this,R.raw.ger5airport);
            AirportSound6 = MediaPlayer.create(AirportActivity.this,R.raw.ger6airport);
            AirportSound7 = MediaPlayer.create(AirportActivity.this,R.raw.ger7airport);
        }
        if(wantToLearnFrance){
            txtViewW1.setText(fraAirport1);
            txtViewW2.setText(fraAirport2);
            txtViewW3.setText(fraAirport3);
            txtViewW4.setText(fraAirport4);
            txtViewW5.setText(fraAirport5);
            txtViewW6.setText(fraAirport6);
            txtViewW7.setText(fraAirport7);

            AirportSound1 = MediaPlayer.create(AirportActivity.this,R.raw.fra1airport);
            AirportSound2 = MediaPlayer.create(AirportActivity.this,R.raw.fra2airport);
            AirportSound3 = MediaPlayer.create(AirportActivity.this,R.raw.fra3airport);
            AirportSound4 = MediaPlayer.create(AirportActivity.this,R.raw.fra4airport);
            AirportSound5 = MediaPlayer.create(AirportActivity.this,R.raw.fra5airport);
            AirportSound6 = MediaPlayer.create(AirportActivity.this,R.raw.fra6airport);
            AirportSound7 = MediaPlayer.create(AirportActivity.this,R.raw.fra7airport);
        }
        if(wantToLearnSpain){
            txtViewW1.setText(spaAirport1);
            txtViewW2.setText(spaAirport2);
            txtViewW3.setText(spaAirport3);
            txtViewW4.setText(spaAirport4);
            txtViewW5.setText(spaAirport5);
            txtViewW6.setText(spaAirport6);
            txtViewW7.setText(spaAirport7);

            AirportSound1 = MediaPlayer.create(AirportActivity.this,R.raw.spa1airport);
            AirportSound2 = MediaPlayer.create(AirportActivity.this,R.raw.spa2airport);
            AirportSound3 = MediaPlayer.create(AirportActivity.this,R.raw.spa3airport);
            AirportSound4 = MediaPlayer.create(AirportActivity.this,R.raw.spa4airport);
            AirportSound5 = MediaPlayer.create(AirportActivity.this,R.raw.spa5airport);
            AirportSound6 = MediaPlayer.create(AirportActivity.this,R.raw.spa6airport);
            AirportSound7 = MediaPlayer.create(AirportActivity.this,R.raw.spa7airport);
        }
        if(wantToLearnRussia){
            txtViewW1.setText(rusAirport1);
            txtViewW2.setText(rusAirport2);
            txtViewW3.setText(rusAirport3);
            txtViewW4.setText(rusAirport4);
            txtViewW5.setText(rusAirport5);
            txtViewW6.setText(rusAirport6);
            txtViewW7.setText(rusAirport7);

            AirportSound1 = MediaPlayer.create(AirportActivity.this,R.raw.rus1airport);
            AirportSound2 = MediaPlayer.create(AirportActivity.this,R.raw.rus2airport);
            AirportSound3 = MediaPlayer.create(AirportActivity.this,R.raw.rus3airport);
            AirportSound4 = MediaPlayer.create(AirportActivity.this,R.raw.rus4airport);
            AirportSound5 = MediaPlayer.create(AirportActivity.this,R.raw.rus5airport);
            AirportSound6 = MediaPlayer.create(AirportActivity.this,R.raw.rus6airport);
            AirportSound7 = MediaPlayer.create(AirportActivity.this,R.raw.rus7airport);
        }
        if(wantToLearnItaly){
            txtViewW1.setText(itaAirport1);
            txtViewW2.setText(itaAirport2);
            txtViewW3.setText(itaAirport3);
            txtViewW4.setText(itaAirport4);
            txtViewW5.setText(itaAirport5);
            txtViewW6.setText(itaAirport6);
            txtViewW7.setText(itaAirport7);

            AirportSound1 = MediaPlayer.create(AirportActivity.this,R.raw.ita1airport);
            AirportSound2 = MediaPlayer.create(AirportActivity.this,R.raw.ita2airport);
            AirportSound3 = MediaPlayer.create(AirportActivity.this,R.raw.ita3airport);
            AirportSound4 = MediaPlayer.create(AirportActivity.this,R.raw.ita4airport);
            AirportSound5 = MediaPlayer.create(AirportActivity.this,R.raw.ita5airport);
            AirportSound6 = MediaPlayer.create(AirportActivity.this,R.raw.ita6airport);
            AirportSound7 = MediaPlayer.create(AirportActivity.this,R.raw.ita7airport);
        }
        if(wantToLearnTurkey){
            txtViewW1.setText(turAirport1);
            txtViewW2.setText(turAirport2);
            txtViewW3.setText(turAirport3);
            txtViewW4.setText(turAirport4);
            txtViewW5.setText(turAirport5);
            txtViewW6.setText(turAirport6);
            txtViewW7.setText(turAirport7);

            AirportSound1 = MediaPlayer.create(AirportActivity.this,R.raw.tur1airport);
            AirportSound2 = MediaPlayer.create(AirportActivity.this,R.raw.tur2airport);
            AirportSound3 = MediaPlayer.create(AirportActivity.this,R.raw.tur3airport);
            AirportSound4 = MediaPlayer.create(AirportActivity.this,R.raw.tur4airport);
            AirportSound5 = MediaPlayer.create(AirportActivity.this,R.raw.tur5airport);
            AirportSound6 = MediaPlayer.create(AirportActivity.this,R.raw.tur6airport);
            AirportSound7 = MediaPlayer.create(AirportActivity.this,R.raw.tur7airport);
        }
        if(wantToLearnJapan){
            txtViewW1.setText(japAirport1);
            txtViewW2.setText(japAirport2);
            txtViewW3.setText(japAirport3);
            txtViewW4.setText(japAirport4);
            txtViewW5.setText(japAirport5);
            txtViewW6.setText(japAirport6);
            txtViewW7.setText(japAirport7);

            AirportSound1 = MediaPlayer.create(AirportActivity.this,R.raw.jap1airport);
            AirportSound2 = MediaPlayer.create(AirportActivity.this,R.raw.jap2airport);
            AirportSound3 = MediaPlayer.create(AirportActivity.this,R.raw.jap3airport);
            AirportSound4 = MediaPlayer.create(AirportActivity.this,R.raw.jap4airport);
            AirportSound5 = MediaPlayer.create(AirportActivity.this,R.raw.jap5airport);
            AirportSound6 = MediaPlayer.create(AirportActivity.this,R.raw.jap6airport);
            AirportSound7 = MediaPlayer.create(AirportActivity.this,R.raw.jap7airport);
        }
        if(wantToLearnChina){
            txtViewW1.setText(chiAirport1);
            txtViewW2.setText(chiAirport2);
            txtViewW3.setText(chiAirport3);
            txtViewW4.setText(chiAirport4);
            txtViewW5.setText(chiAirport5);
            txtViewW6.setText(chiAirport6);
            txtViewW7.setText(chiAirport7);

            AirportSound1 = MediaPlayer.create(AirportActivity.this,R.raw.chi1airport);
            AirportSound2 = MediaPlayer.create(AirportActivity.this,R.raw.chi2airport);
            AirportSound3 = MediaPlayer.create(AirportActivity.this,R.raw.chi3airport);
            AirportSound4 = MediaPlayer.create(AirportActivity.this,R.raw.chi4airport);
            AirportSound5 = MediaPlayer.create(AirportActivity.this,R.raw.chi5airport);
            AirportSound6 = MediaPlayer.create(AirportActivity.this,R.raw.chi6airport);
            AirportSound7 = MediaPlayer.create(AirportActivity.this,R.raw.chi7airport);
        }

        btnImageS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    AirportSound1.start();
                }
            }
        });

        btnImageS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    AirportSound1.start();
                }
            }
        });

        btnImageS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    AirportSound3.start();
                }
            }
        });

        btnImageS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    AirportSound4.start();
                }
            }
        });

        btnImageS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    AirportSound5.start();
                }
            }
        });

        btnImageS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    AirportSound6.start();
                }
            }
        });

        btnImageS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    AirportSound7.start();
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
        if(!AirportSound1.isPlaying()){
            if(!AirportSound2.isPlaying()){
                if(!AirportSound3.isPlaying()){
                    if(!AirportSound4.isPlaying()){
                        if(!AirportSound5.isPlaying()){
                            if(!AirportSound6.isPlaying()){
                                if(!AirportSound7.isPlaying()){
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