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

public class MarketActivity extends AppCompatActivity {

    public String engMarket1 = "I want to shop";
    public String engMarket2 = "This is my shopping list";
    public String engMarket3 = "Where are the market cars?";
    public String engMarket4 = "How much is the total price?";
    public String engMarket5 = "I want to pay cash";
    public String engMarket6 = "I want to pay by card";
    public String engMarket7 = "I do not want receipt, thanks";

    public String gerMarket1 = "Ich möchte einkaufen";
    public String gerMarket2 = "Das ist meine Einkaufsliste";
    public String gerMarket3 = "Wo sind die Marktautos?";
    public String gerMarket4 = "Wie hoch ist der Gesamtpreis?";
    public String gerMarket5 = "Ich möchte bar bezahlen";
    public String gerMarket6 = "Ich möchte mit Karte bezahlen";
    public String gerMarket7 = "Ich möchte keine Quittung, danke";

    public String fraMarket1 = "Je veux faire du shopping";
    public String fraMarket2 = "Ceci est ma liste de courses";
    public String fraMarket3 = "Où sont les voitures du marché?";
    public String fraMarket4 = "Combien coûte le prix total?";
    public String fraMarket5 = "Je veux payer comptant";
    public String fraMarket6 = "Je veux payer par carte";
    public String fraMarket7 = "Je ne veux pas de reçu, merci";

    public String spaMarket1 = "Quiero ir de compras";
    public String spaMarket2 = "Esta es mi lista de la compra";
    public String spaMarket3 = "¿Dónde están los coches del mercado?";
    public String spaMarket4 = "¿Cuánto es el precio total?";
    public String spaMarket5 = "Quiero pagar en efectivo";
    public String spaMarket6 = "Quiero pagar con tarjeta";
    public String spaMarket7 = "No quiero factura, gracias";

    public String rusMarket1 = "Я хочу делать покупки";
    public String rusMarket2 = "Это мой список покупок";
    public String rusMarket3 = "Где рынок автомобилей?";
    public String rusMarket4 = "Сколько стоит общая цена?";
    public String rusMarket5 = "Я хочу заплатить наличными";
    public String rusMarket6 = "Я хочу оплатить картой";
    public String rusMarket7 = "Я не хочу квитанцию, спасибо";

    public String itaMarket1 = "Voglio fare acquisti";
    public String itaMarket2 = "Questa è la mia lista della spesa";
    public String itaMarket3 = "Dove sono le auto del mercato?";
    public String itaMarket4 = "Quanto è il prezzo totale?";
    public String itaMarket5 = "Voglio pagare in contanti";
    public String itaMarket6 = "Voglio pagare con la carta";
    public String itaMarket7 = "Non voglio ricevuta, grazie";

    public String turMarket1 = "Alışveriş yapmak istiyorum";
    public String turMarket2 = "Bu benim alışveriş listem";
    public String turMarket3 = "Market arabaları nerede?";
    public String turMarket4 = "Toplam ücret ne kadar?";
    public String turMarket5 = "Nakit ödeme yapmak istiyorum";
    public String turMarket6 = "Kart ile ödeme yapmak istiyorum";
    public String turMarket7 = "Fatura istemiyorum, teşekkürler";

    public String japMarket1 = "買い物したい";
    public String japMarket2 = "これは私の買い物リストです";
    public String japMarket3 = "市場の車はどこにありますか？";
    public String japMarket4 = "合計金額はいくらですか？";
    public String japMarket5 = "現金を払いたい";
    public String japMarket6 = "カードで支払いたい";
    public String japMarket7 = "領収書は欲しくない、ありがとう";

    public String chiMarket1 = "我要购物";
    public String chiMarket2 = "这是我的购物清单";
    public String chiMarket3 = "市场车在哪里？";
    public String chiMarket4 = "总价是多少？";
    public String chiMarket5 = "我想付现金";
    public String chiMarket6 = "我想用卡付款";
    public String chiMarket7 = "我不要收据，谢谢";

    MediaPlayer MarketSound1;
    MediaPlayer MarketSound2;
    MediaPlayer MarketSound3;
    MediaPlayer MarketSound4;
    MediaPlayer MarketSound5;
    MediaPlayer MarketSound6;
    MediaPlayer MarketSound7;

    Animation ScaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);

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
            txtViewL1.setText(engMarket1);
            txtViewL2.setText(engMarket2);
            txtViewL3.setText(engMarket3);
            txtViewL4.setText(engMarket4);
            txtViewL5.setText(engMarket5);
            txtViewL6.setText(engMarket6);
            txtViewL7.setText(engMarket7);
        }
        if(languageGermany){
            txtViewL1.setText(gerMarket1);
            txtViewL2.setText(gerMarket2);
            txtViewL3.setText(gerMarket3);
            txtViewL4.setText(gerMarket4);
            txtViewL5.setText(gerMarket5);
            txtViewL6.setText(gerMarket6);
            txtViewL7.setText(gerMarket7);
        }
        if(languageFrance){
            txtViewL1.setText(fraMarket1);
            txtViewL2.setText(fraMarket2);
            txtViewL3.setText(fraMarket3);
            txtViewL4.setText(fraMarket4);
            txtViewL5.setText(fraMarket5);
            txtViewL6.setText(fraMarket6);
            txtViewL7.setText(fraMarket7);
        }
        if(languageSpain){
            txtViewL1.setText(spaMarket1);
            txtViewL2.setText(spaMarket2);
            txtViewL3.setText(spaMarket3);
            txtViewL4.setText(spaMarket4);
            txtViewL5.setText(spaMarket5);
            txtViewL6.setText(spaMarket6);
            txtViewL7.setText(spaMarket7);
        }
        if(languageRussia){
            txtViewL1.setText(rusMarket1);
            txtViewL2.setText(rusMarket2);
            txtViewL3.setText(rusMarket3);
            txtViewL4.setText(rusMarket4);
            txtViewL5.setText(rusMarket5);
            txtViewL6.setText(rusMarket6);
            txtViewL7.setText(rusMarket7);
        }
        if(languageItaly){
            txtViewL1.setText(itaMarket1);
            txtViewL2.setText(itaMarket2);
            txtViewL3.setText(itaMarket3);
            txtViewL4.setText(itaMarket4);
            txtViewL5.setText(itaMarket5);
            txtViewL6.setText(itaMarket6);
            txtViewL7.setText(itaMarket7);
        }
        if(languageTurkey){
            txtViewL1.setText(turMarket1);
            txtViewL2.setText(turMarket2);
            txtViewL3.setText(turMarket3);
            txtViewL4.setText(turMarket4);
            txtViewL5.setText(turMarket5);
            txtViewL6.setText(turMarket6);
            txtViewL7.setText(turMarket7);
        }
        if(languageJapan){
            txtViewL1.setText(japMarket1);
            txtViewL2.setText(japMarket2);
            txtViewL3.setText(japMarket3);
            txtViewL4.setText(japMarket4);
            txtViewL5.setText(japMarket5);
            txtViewL6.setText(japMarket6);
            txtViewL7.setText(japMarket7);
        }
        if(languageChina){
            txtViewL1.setText(chiMarket1);
            txtViewL2.setText(chiMarket2);
            txtViewL3.setText(chiMarket3);
            txtViewL4.setText(chiMarket4);
            txtViewL5.setText(chiMarket5);
            txtViewL6.setText(chiMarket6);
            txtViewL7.setText(chiMarket7);
        }
        //---
        if(wantToLearnAbd){
            txtViewW1.setText(engMarket1);
            txtViewW2.setText(engMarket2);
            txtViewW3.setText(engMarket3);
            txtViewW4.setText(engMarket4);
            txtViewW5.setText(engMarket5);
            txtViewW6.setText(engMarket6);
            txtViewW7.setText(engMarket7);

            MarketSound1 = MediaPlayer.create(MarketActivity.this,R.raw.eng1market);
            MarketSound2 = MediaPlayer.create(MarketActivity.this,R.raw.eng2market);
            MarketSound3 = MediaPlayer.create(MarketActivity.this,R.raw.eng3market);
            MarketSound4 = MediaPlayer.create(MarketActivity.this,R.raw.eng4market);
            MarketSound5 = MediaPlayer.create(MarketActivity.this,R.raw.eng5market);
            MarketSound6 = MediaPlayer.create(MarketActivity.this,R.raw.eng6market);
            MarketSound7 = MediaPlayer.create(MarketActivity.this,R.raw.eng7market);
        }
        if(wantToLearnGermany){
            txtViewW1.setText(gerMarket1);
            txtViewW2.setText(gerMarket2);
            txtViewW3.setText(gerMarket3);
            txtViewW4.setText(gerMarket4);
            txtViewW5.setText(gerMarket5);
            txtViewW6.setText(gerMarket6);
            txtViewW7.setText(gerMarket7);

            MarketSound1 = MediaPlayer.create(MarketActivity.this,R.raw.ger1market);
            MarketSound2 = MediaPlayer.create(MarketActivity.this,R.raw.ger2market);
            MarketSound3 = MediaPlayer.create(MarketActivity.this,R.raw.ger3market);
            MarketSound4 = MediaPlayer.create(MarketActivity.this,R.raw.ger4market);
            MarketSound5 = MediaPlayer.create(MarketActivity.this,R.raw.ger5market);
            MarketSound6 = MediaPlayer.create(MarketActivity.this,R.raw.ger6market);
            MarketSound7 = MediaPlayer.create(MarketActivity.this,R.raw.ger7market);
        }
        if(wantToLearnFrance){
            txtViewW1.setText(fraMarket1);
            txtViewW2.setText(fraMarket2);
            txtViewW3.setText(fraMarket3);
            txtViewW4.setText(fraMarket4);
            txtViewW5.setText(fraMarket5);
            txtViewW6.setText(fraMarket6);
            txtViewW7.setText(fraMarket7);

            MarketSound1 = MediaPlayer.create(MarketActivity.this,R.raw.fra1market);
            MarketSound2 = MediaPlayer.create(MarketActivity.this,R.raw.fra2market);
            MarketSound3 = MediaPlayer.create(MarketActivity.this,R.raw.fra3market);
            MarketSound4 = MediaPlayer.create(MarketActivity.this,R.raw.fra4market);
            MarketSound5 = MediaPlayer.create(MarketActivity.this,R.raw.fra5market);
            MarketSound6 = MediaPlayer.create(MarketActivity.this,R.raw.fra6market);
            MarketSound7 = MediaPlayer.create(MarketActivity.this,R.raw.fra7market);
        }
        if(wantToLearnSpain){
            txtViewW1.setText(spaMarket1);
            txtViewW2.setText(spaMarket2);
            txtViewW3.setText(spaMarket3);
            txtViewW4.setText(spaMarket4);
            txtViewW5.setText(spaMarket5);
            txtViewW6.setText(spaMarket6);
            txtViewW7.setText(spaMarket7);

            MarketSound1 = MediaPlayer.create(MarketActivity.this,R.raw.spa1market);
            MarketSound2 = MediaPlayer.create(MarketActivity.this,R.raw.spa2market);
            MarketSound3 = MediaPlayer.create(MarketActivity.this,R.raw.spa3market);
            MarketSound4 = MediaPlayer.create(MarketActivity.this,R.raw.spa4market);
            MarketSound5 = MediaPlayer.create(MarketActivity.this,R.raw.spa5market);
            MarketSound6 = MediaPlayer.create(MarketActivity.this,R.raw.spa6market);
            MarketSound7 = MediaPlayer.create(MarketActivity.this,R.raw.spa7market);
        }
        if(wantToLearnRussia){
            txtViewW1.setText(rusMarket1);
            txtViewW2.setText(rusMarket2);
            txtViewW3.setText(rusMarket3);
            txtViewW4.setText(rusMarket4);
            txtViewW5.setText(rusMarket5);
            txtViewW6.setText(rusMarket6);
            txtViewW7.setText(rusMarket7);

            MarketSound1 = MediaPlayer.create(MarketActivity.this,R.raw.rus1market);
            MarketSound2 = MediaPlayer.create(MarketActivity.this,R.raw.rus2market);
            MarketSound3 = MediaPlayer.create(MarketActivity.this,R.raw.rus3market);
            MarketSound4 = MediaPlayer.create(MarketActivity.this,R.raw.rus4market);
            MarketSound5 = MediaPlayer.create(MarketActivity.this,R.raw.rus5market);
            MarketSound6 = MediaPlayer.create(MarketActivity.this,R.raw.rus6market);
            MarketSound7 = MediaPlayer.create(MarketActivity.this,R.raw.rus7market);
        }
        if(wantToLearnItaly){
            txtViewW1.setText(itaMarket1);
            txtViewW2.setText(itaMarket2);
            txtViewW3.setText(itaMarket3);
            txtViewW4.setText(itaMarket4);
            txtViewW5.setText(itaMarket5);
            txtViewW6.setText(itaMarket6);
            txtViewW7.setText(itaMarket7);

            MarketSound1 = MediaPlayer.create(MarketActivity.this,R.raw.ita1market);
            MarketSound2 = MediaPlayer.create(MarketActivity.this,R.raw.ita2market);
            MarketSound3 = MediaPlayer.create(MarketActivity.this,R.raw.ita3market);
            MarketSound4 = MediaPlayer.create(MarketActivity.this,R.raw.ita4market);
            MarketSound5 = MediaPlayer.create(MarketActivity.this,R.raw.ita5market);
            MarketSound6 = MediaPlayer.create(MarketActivity.this,R.raw.ita6market);
            MarketSound7 = MediaPlayer.create(MarketActivity.this,R.raw.ita7market);
        }
        if(wantToLearnTurkey){
            txtViewW1.setText(turMarket1);
            txtViewW2.setText(turMarket2);
            txtViewW3.setText(turMarket3);
            txtViewW4.setText(turMarket4);
            txtViewW5.setText(turMarket5);
            txtViewW6.setText(turMarket6);
            txtViewW7.setText(turMarket7);

            MarketSound1 = MediaPlayer.create(MarketActivity.this,R.raw.tur1market);
            MarketSound2 = MediaPlayer.create(MarketActivity.this,R.raw.tur2market);
            MarketSound3 = MediaPlayer.create(MarketActivity.this,R.raw.tur3market);
            MarketSound4 = MediaPlayer.create(MarketActivity.this,R.raw.tur4market);
            MarketSound5 = MediaPlayer.create(MarketActivity.this,R.raw.tur5market);
            MarketSound6 = MediaPlayer.create(MarketActivity.this,R.raw.tur6market);
            MarketSound7 = MediaPlayer.create(MarketActivity.this,R.raw.tur7market);
        }
        if(wantToLearnJapan){
            txtViewW1.setText(japMarket1);
            txtViewW2.setText(japMarket2);
            txtViewW3.setText(japMarket3);
            txtViewW4.setText(japMarket4);
            txtViewW5.setText(japMarket5);
            txtViewW6.setText(japMarket6);
            txtViewW7.setText(japMarket7);

            MarketSound1 = MediaPlayer.create(MarketActivity.this,R.raw.jap1market);
            MarketSound2 = MediaPlayer.create(MarketActivity.this,R.raw.jap2market);
            MarketSound3 = MediaPlayer.create(MarketActivity.this,R.raw.jap3market);
            MarketSound4 = MediaPlayer.create(MarketActivity.this,R.raw.jap4market);
            MarketSound5 = MediaPlayer.create(MarketActivity.this,R.raw.jap5market);
            MarketSound6 = MediaPlayer.create(MarketActivity.this,R.raw.jap6market);
            MarketSound7 = MediaPlayer.create(MarketActivity.this,R.raw.jap7market);
        }
        if(wantToLearnChina){
            txtViewW1.setText(chiMarket1);
            txtViewW2.setText(chiMarket2);
            txtViewW3.setText(chiMarket3);
            txtViewW4.setText(chiMarket4);
            txtViewW5.setText(chiMarket5);
            txtViewW6.setText(chiMarket6);
            txtViewW7.setText(chiMarket7);

            MarketSound1 = MediaPlayer.create(MarketActivity.this,R.raw.chi1market);
            MarketSound2 = MediaPlayer.create(MarketActivity.this,R.raw.chi2market);
            MarketSound3 = MediaPlayer.create(MarketActivity.this,R.raw.chi3market);
            MarketSound4 = MediaPlayer.create(MarketActivity.this,R.raw.chi4market);
            MarketSound5 = MediaPlayer.create(MarketActivity.this,R.raw.chi5market);
            MarketSound6 = MediaPlayer.create(MarketActivity.this,R.raw.chi6market);
            MarketSound7 = MediaPlayer.create(MarketActivity.this,R.raw.chi7market);
        }

        btnImageS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    MarketSound1.start();
                }
            }
        });

        btnImageS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    MarketSound2.start();
                }
            }
        });

        btnImageS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    MarketSound3.start();
                }
            }
        });

        btnImageS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    MarketSound4.start();
                }
            }
        });

        btnImageS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    MarketSound5.start();
                }
            }
        });

        btnImageS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    MarketSound6.start();
                }
            }
        });

        btnImageS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    MarketSound7.start();
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
        if(!MarketSound1.isPlaying()){
            if(!MarketSound2.isPlaying()){
                if(!MarketSound3.isPlaying()){
                    if(!MarketSound4.isPlaying()){
                        if(!MarketSound5.isPlaying()){
                            if(!MarketSound6.isPlaying()){
                                if(!MarketSound7.isPlaying()){
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