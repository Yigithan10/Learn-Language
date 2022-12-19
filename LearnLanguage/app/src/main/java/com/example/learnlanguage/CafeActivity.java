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

public class CafeActivity extends AppCompatActivity {

    public String engCafe1 = "I want one ...";
    public String engCafe2 = "Is there ... in this cafe?";
    public String engCafe3 = "What is your drink recommendation?";
    public String engCafe4 = "What is your food recommendation?";
    public String engCafe5 = "I want the same again";
    public String engCafe6 = "Check please?";
    public String engCafe7 = "Service was good, thanks";

    public String gerCafe1 = "Ich will eins ...";
    public String gerCafe2 = "Gibt es ... in diesem Café?";
    public String gerCafe3 = "Was ist Ihre Getränkeempfehlung?";
    public String gerCafe4 = "Was ist Ihre Essensempfehlung?";
    public String gerCafe5 = "Ich will das gleiche nochmal";
    public String gerCafe6 = "Bitte überprüfen?";
    public String gerCafe7 = "Der Service war gut, danke";

    public String fraCafe1 = "J'en veux un ...";
    public String fraCafe2 = "Y a-t-il ... dans ce café?";
    public String fraCafe3 = "Quelle est votre recommandation de boisson?";
    public String fraCafe4 = "Quelle est votre recommandation alimentaire?";
    public String fraCafe5 = "Je veux encore le même";
    public String fraCafe6 = "Vérifiez s'il vous plait?";
    public String fraCafe7 = "Le service était bon, merci";

    public String spaCafe1 = "Quiero uno ...";
    public String spaCafe2 = "¿Hay ... en este café?";
    public String spaCafe3 = "¿Cuál es tu bebida recomendada?";
    public String spaCafe4 = "¿Cuál es tu recomendación de comida?";
    public String spaCafe5 = "Quiero el mismo producto otra vez";
    public String spaCafe6 = "¿Comprueba, por favor?";
    public String spaCafe7 = "El servicio fue bueno, gracias";

    public String rusCafe1 = "Я хочу один ...";
    public String rusCafe2 = "Есть ли... в этом кафе?";
    public String rusCafe3 = "Что вы рекомендуете пить?";
    public String rusCafe4 = "Каковы ваши рекомендации по еде?";
    public String rusCafe5 = "Я хочу то же самое снова";
    public String rusCafe6 = "Проверьте, пожалуйста?";
    public String rusCafe7 = "Обслуживание было хорошим, спасибо";

    public String itaCafe1 = "Ne voglio uno ...";
    public String itaCafe2 = "C'è... in questo caffè?";
    public String itaCafe3 = "Qual è la tua bevanda consigliata?";
    public String itaCafe4 = "Qual è la tua raccomandazione alimentare?";
    public String itaCafe5 = "Voglio di nuovo lo stesso";
    public String itaCafe6 = "Controlli, per favore?";
    public String itaCafe7 = "Il servizio era buono, grazie";

    public String turCafe1 = "Bir tane ... istiyorum";
    public String turCafe2 = "Bu cafede ... var mı?";
    public String turCafe3 = "İçecek tavsiyeniz nedir?";
    public String turCafe4 = "Yiyecek tavsiyeniz nedir?";
    public String turCafe5 = "Tekrar aynısından istiyorum";
    public String turCafe6 = "Hesabı alabilir miyim?";
    public String turCafe7 = "Hizmet iyiydi, teşekkürler";

    public String japCafe1 = "私は1つが欲しい ...";
    public String japCafe2 = "このカフェに…ありますか？";
    public String japCafe3 = "あなたの飲み物の推薦は何ですか？";
    public String japCafe4 = "あなたの食べ物の推薦は何ですか？";
    public String japCafe5 = "また同じものが欲しい";
    public String japCafe6 = "お会計お願いします？";
    public String japCafe7 = "サービスは良かった、ありがとう";

    public String chiCafe1 = "我要一个 ...";
    public String chiCafe2 = "有没有……在这家咖啡馆？";
    public String chiCafe3 = "你的饮品推荐是什么？";
    public String chiCafe4 = "你的食物推荐是什么？";
    public String chiCafe5 = "我想要同样的";
    public String chiCafe6 = "请检查？";
    public String chiCafe7 = "服务很好，谢谢";

    MediaPlayer CafeSound1;
    MediaPlayer CafeSound2;
    MediaPlayer CafeSound3;
    MediaPlayer CafeSound4;
    MediaPlayer CafeSound5;
    MediaPlayer CafeSound6;
    MediaPlayer CafeSound7;

    Animation ScaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);

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
            txtViewL1.setText(engCafe1);
            txtViewL2.setText(engCafe2);
            txtViewL3.setText(engCafe3);
            txtViewL4.setText(engCafe4);
            txtViewL5.setText(engCafe5);
            txtViewL6.setText(engCafe6);
            txtViewL7.setText(engCafe7);
        }
        if(languageGermany){
            txtViewL1.setText(gerCafe1);
            txtViewL2.setText(gerCafe2);
            txtViewL3.setText(gerCafe3);
            txtViewL4.setText(gerCafe4);
            txtViewL5.setText(gerCafe5);
            txtViewL6.setText(gerCafe6);
            txtViewL7.setText(gerCafe7);
        }
        if(languageFrance){
            txtViewL1.setText(fraCafe1);
            txtViewL2.setText(fraCafe2);
            txtViewL3.setText(fraCafe3);
            txtViewL4.setText(fraCafe4);
            txtViewL5.setText(fraCafe5);
            txtViewL6.setText(fraCafe6);
            txtViewL7.setText(fraCafe7);
        }
        if(languageSpain){
            txtViewL1.setText(spaCafe1);
            txtViewL2.setText(spaCafe2);
            txtViewL3.setText(spaCafe3);
            txtViewL4.setText(spaCafe4);
            txtViewL5.setText(spaCafe5);
            txtViewL6.setText(spaCafe6);
            txtViewL7.setText(spaCafe7);
        }
        if(languageRussia){
            txtViewL1.setText(rusCafe1);
            txtViewL2.setText(rusCafe2);
            txtViewL3.setText(rusCafe3);
            txtViewL4.setText(rusCafe4);
            txtViewL5.setText(rusCafe5);
            txtViewL6.setText(rusCafe6);
            txtViewL7.setText(rusCafe7);
        }
        if(languageItaly){
            txtViewL1.setText(itaCafe1);
            txtViewL2.setText(itaCafe2);
            txtViewL3.setText(itaCafe3);
            txtViewL4.setText(itaCafe4);
            txtViewL5.setText(itaCafe5);
            txtViewL6.setText(itaCafe6);
            txtViewL7.setText(itaCafe7);
        }
        if(languageTurkey){
            txtViewL1.setText(turCafe1);
            txtViewL2.setText(turCafe2);
            txtViewL3.setText(turCafe3);
            txtViewL4.setText(turCafe4);
            txtViewL5.setText(turCafe5);
            txtViewL6.setText(turCafe6);
            txtViewL7.setText(turCafe7);
        }
        if(languageJapan){
            txtViewL1.setText(japCafe1);
            txtViewL2.setText(japCafe2);
            txtViewL3.setText(japCafe3);
            txtViewL4.setText(japCafe4);
            txtViewL5.setText(japCafe5);
            txtViewL6.setText(japCafe6);
            txtViewL7.setText(japCafe7);
        }
        if(languageChina){
            txtViewL1.setText(chiCafe1);
            txtViewL2.setText(chiCafe2);
            txtViewL3.setText(chiCafe3);
            txtViewL4.setText(chiCafe4);
            txtViewL5.setText(chiCafe5);
            txtViewL6.setText(chiCafe6);
            txtViewL7.setText(chiCafe7);
        }
        //---
        if(wantToLearnAbd){
            txtViewW1.setText(engCafe1);
            txtViewW2.setText(engCafe2);
            txtViewW3.setText(engCafe3);
            txtViewW4.setText(engCafe4);
            txtViewW5.setText(engCafe5);
            txtViewW6.setText(engCafe6);
            txtViewW7.setText(engCafe7);

            CafeSound1 = MediaPlayer.create(CafeActivity.this,R.raw.eng1cafe);
            CafeSound2 = MediaPlayer.create(CafeActivity.this,R.raw.eng2cafe);
            CafeSound3 = MediaPlayer.create(CafeActivity.this,R.raw.eng3cafe);
            CafeSound4 = MediaPlayer.create(CafeActivity.this,R.raw.eng4cafe);
            CafeSound5 = MediaPlayer.create(CafeActivity.this,R.raw.eng5cafe);
            CafeSound6 = MediaPlayer.create(CafeActivity.this,R.raw.eng6cafe);
            CafeSound7 = MediaPlayer.create(CafeActivity.this,R.raw.eng7cafe);
        }
        if(wantToLearnGermany){
            txtViewW1.setText(gerCafe1);
            txtViewW2.setText(gerCafe2);
            txtViewW3.setText(gerCafe3);
            txtViewW4.setText(gerCafe4);
            txtViewW5.setText(gerCafe5);
            txtViewW6.setText(gerCafe6);
            txtViewW7.setText(gerCafe7);

            CafeSound1 = MediaPlayer.create(CafeActivity.this,R.raw.ger1cafe);
            CafeSound2 = MediaPlayer.create(CafeActivity.this,R.raw.ger2cafe);
            CafeSound3 = MediaPlayer.create(CafeActivity.this,R.raw.ger3cafe);
            CafeSound4 = MediaPlayer.create(CafeActivity.this,R.raw.ger4cafe);
            CafeSound5 = MediaPlayer.create(CafeActivity.this,R.raw.ger5cafe);
            CafeSound6 = MediaPlayer.create(CafeActivity.this,R.raw.ger6cafe);
            CafeSound7 = MediaPlayer.create(CafeActivity.this,R.raw.ger7cafe);
        }
        if(wantToLearnFrance){
            txtViewW1.setText(fraCafe1);
            txtViewW2.setText(fraCafe2);
            txtViewW3.setText(fraCafe3);
            txtViewW4.setText(fraCafe4);
            txtViewW5.setText(fraCafe5);
            txtViewW6.setText(fraCafe6);
            txtViewW7.setText(fraCafe7);

            CafeSound1 = MediaPlayer.create(CafeActivity.this,R.raw.fra1cafe);
            CafeSound2 = MediaPlayer.create(CafeActivity.this,R.raw.fra2cafe);
            CafeSound3 = MediaPlayer.create(CafeActivity.this,R.raw.fra3cafe);
            CafeSound4 = MediaPlayer.create(CafeActivity.this,R.raw.fra4cafe);
            CafeSound5 = MediaPlayer.create(CafeActivity.this,R.raw.fra5cafe);
            CafeSound6 = MediaPlayer.create(CafeActivity.this,R.raw.fra6cafe);
            CafeSound7 = MediaPlayer.create(CafeActivity.this,R.raw.fra7cafe);
        }
        if(wantToLearnSpain){
            txtViewW1.setText(spaCafe1);
            txtViewW2.setText(spaCafe2);
            txtViewW3.setText(spaCafe3);
            txtViewW4.setText(spaCafe4);
            txtViewW5.setText(spaCafe5);
            txtViewW6.setText(spaCafe6);
            txtViewW7.setText(spaCafe7);

            CafeSound1 = MediaPlayer.create(CafeActivity.this,R.raw.spa1cafe);
            CafeSound2 = MediaPlayer.create(CafeActivity.this,R.raw.spa2cafe);
            CafeSound3 = MediaPlayer.create(CafeActivity.this,R.raw.spa3cafe);
            CafeSound4 = MediaPlayer.create(CafeActivity.this,R.raw.spa4cafe);
            CafeSound5 = MediaPlayer.create(CafeActivity.this,R.raw.spa5cafe);
            CafeSound6 = MediaPlayer.create(CafeActivity.this,R.raw.spa6cafe);
            CafeSound7 = MediaPlayer.create(CafeActivity.this,R.raw.spa7cafe);
        }
        if(wantToLearnRussia){
            txtViewW1.setText(rusCafe1);
            txtViewW2.setText(rusCafe2);
            txtViewW3.setText(rusCafe3);
            txtViewW4.setText(rusCafe4);
            txtViewW5.setText(rusCafe5);
            txtViewW6.setText(rusCafe6);
            txtViewW7.setText(rusCafe7);

            CafeSound1 = MediaPlayer.create(CafeActivity.this,R.raw.rus1cafe);
            CafeSound2 = MediaPlayer.create(CafeActivity.this,R.raw.rus2cafe);
            CafeSound3 = MediaPlayer.create(CafeActivity.this,R.raw.rus3cafe);
            CafeSound4 = MediaPlayer.create(CafeActivity.this,R.raw.rus4cafe);
            CafeSound5 = MediaPlayer.create(CafeActivity.this,R.raw.rus5cafe);
            CafeSound6 = MediaPlayer.create(CafeActivity.this,R.raw.rus6cafe);
            CafeSound7 = MediaPlayer.create(CafeActivity.this,R.raw.rus7cafe);
        }
        if(wantToLearnItaly){
            txtViewW1.setText(itaCafe1);
            txtViewW2.setText(itaCafe2);
            txtViewW3.setText(itaCafe3);
            txtViewW4.setText(itaCafe4);
            txtViewW5.setText(itaCafe5);
            txtViewW6.setText(itaCafe6);
            txtViewW7.setText(itaCafe7);

            CafeSound1 = MediaPlayer.create(CafeActivity.this,R.raw.ita1cafe);
            CafeSound2 = MediaPlayer.create(CafeActivity.this,R.raw.ita2cafe);
            CafeSound3 = MediaPlayer.create(CafeActivity.this,R.raw.ita3cafe);
            CafeSound4 = MediaPlayer.create(CafeActivity.this,R.raw.ita4cafe);
            CafeSound5 = MediaPlayer.create(CafeActivity.this,R.raw.ita5cafe);
            CafeSound6 = MediaPlayer.create(CafeActivity.this,R.raw.ita6cafe);
            CafeSound7 = MediaPlayer.create(CafeActivity.this,R.raw.ita7cafe);
        }
        if(wantToLearnTurkey){
            txtViewW1.setText(turCafe1);
            txtViewW2.setText(turCafe2);
            txtViewW3.setText(turCafe3);
            txtViewW4.setText(turCafe4);
            txtViewW5.setText(turCafe5);
            txtViewW6.setText(turCafe6);
            txtViewW7.setText(turCafe7);

            CafeSound1 = MediaPlayer.create(CafeActivity.this,R.raw.tur1cafe);
            CafeSound2 = MediaPlayer.create(CafeActivity.this,R.raw.tur2cafe);
            CafeSound3 = MediaPlayer.create(CafeActivity.this,R.raw.tur3cafe);
            CafeSound4 = MediaPlayer.create(CafeActivity.this,R.raw.tur4cafe);
            CafeSound5 = MediaPlayer.create(CafeActivity.this,R.raw.tur5cafe);
            CafeSound6 = MediaPlayer.create(CafeActivity.this,R.raw.tur6cafe);
            CafeSound7 = MediaPlayer.create(CafeActivity.this,R.raw.tur7cafe);
        }
        if(wantToLearnJapan){
            txtViewW1.setText(japCafe1);
            txtViewW2.setText(japCafe2);
            txtViewW3.setText(japCafe3);
            txtViewW4.setText(japCafe4);
            txtViewW5.setText(japCafe5);
            txtViewW6.setText(japCafe6);
            txtViewW7.setText(japCafe7);

            CafeSound1 = MediaPlayer.create(CafeActivity.this,R.raw.jap1cafe);
            CafeSound2 = MediaPlayer.create(CafeActivity.this,R.raw.jap2cafe);
            CafeSound3 = MediaPlayer.create(CafeActivity.this,R.raw.jap3cafe);
            CafeSound4 = MediaPlayer.create(CafeActivity.this,R.raw.jap4cafe);
            CafeSound5 = MediaPlayer.create(CafeActivity.this,R.raw.jap5cafe);
            CafeSound6 = MediaPlayer.create(CafeActivity.this,R.raw.jap6cafe);
            CafeSound7 = MediaPlayer.create(CafeActivity.this,R.raw.jap7cafe);
        }
        if(wantToLearnChina){
            txtViewW1.setText(chiCafe1);
            txtViewW2.setText(chiCafe2);
            txtViewW3.setText(chiCafe3);
            txtViewW4.setText(chiCafe4);
            txtViewW5.setText(chiCafe5);
            txtViewW6.setText(chiCafe6);
            txtViewW7.setText(chiCafe7);

            CafeSound1 = MediaPlayer.create(CafeActivity.this,R.raw.chi1cafe);
            CafeSound2 = MediaPlayer.create(CafeActivity.this,R.raw.chi2cafe);
            CafeSound3 = MediaPlayer.create(CafeActivity.this,R.raw.chi3cafe);
            CafeSound4 = MediaPlayer.create(CafeActivity.this,R.raw.chi4cafe);
            CafeSound5 = MediaPlayer.create(CafeActivity.this,R.raw.chi5cafe);
            CafeSound6 = MediaPlayer.create(CafeActivity.this,R.raw.chi6cafe);
            CafeSound7 = MediaPlayer.create(CafeActivity.this,R.raw.chi7cafe);
        }

        btnImageS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    CafeSound1.start();
                }
            }
        });

        btnImageS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    CafeSound2.start();
                }
            }
        });

        btnImageS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    CafeSound3.start();
                }
            }
        });

        btnImageS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    CafeSound4.start();
                }
            }
        });

        btnImageS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    CafeSound5.start();
                }
            }
        });

        btnImageS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    CafeSound6.start();
                }
            }
        });

        btnImageS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    CafeSound7.start();
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
        if(!CafeSound1.isPlaying()){
            if(!CafeSound2.isPlaying()){
                if(!CafeSound3.isPlaying()){
                    if(!CafeSound4.isPlaying()){
                        if(!CafeSound5.isPlaying()){
                            if(!CafeSound6.isPlaying()){
                                if(!CafeSound7.isPlaying()){
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