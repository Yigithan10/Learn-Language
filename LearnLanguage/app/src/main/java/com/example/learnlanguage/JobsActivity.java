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

public class JobsActivity extends AppCompatActivity {

    public String engJobs1 = "Doctor, engineer, teacher";
    public String engJobs2 = "Judge, nurse, lawyer";
    public String engJobs3 = "Astronaut, architect, pharmacist";
    public String engJobs4 = "Banker, stockbroker, driver";
    public String engJobs5 = "Physiotherapist, cook, gallerist";
    public String engJobs6 = "Barber, farmer, housewife";
    public String engJobs7 = "Politician, jeweler, gardener";

    public String gerJobs1 = "Arzt, Ingenieur, Lehrer";
    public String gerJobs2 = "Richter, Krankenschwester, Rechtsanwalt";
    public String gerJobs3 = "Astronaut, Architekt, Apotheker";
    public String gerJobs4 = "Banker, Börsenmakler, Fahrer";
    public String gerJobs5 = "Physiotherapeut, Koch, Galerist";
    public String gerJobs6 = "Friseur, Bauer, Hausfrau";
    public String gerJobs7 = "Politiker, Juwelier, Gärtner";

    public String fraJobs1 = "Médecin, ingénieur, enseignant";
    public String fraJobs2 = "Juge, infirmière, avocate";
    public String fraJobs3 = "Astronaute, architecte, pharmacien";
    public String fraJobs4 = "Banquier, agent de change, chauffeur";
    public String fraJobs5 = "Kinésithérapeute, cuisinier, galeriste";
    public String fraJobs6 = "Barbier, agriculteur, femme au foyer";
    public String fraJobs7 = "Homme politique, bijoutier, jardinier";

    public String spaJobs1 = "Doctora, ingeniera, profesora";
    public String spaJobs2 = "Jueza, enfermera, abogada";
    public String spaJobs3 = "Astronauta, arquitecta, farmacéutica";
    public String spaJobs4 = "Banquera, corredor de bolsa, conductor";
    public String spaJobs5 = "Fisioterapeuta, cocinera, galerista";
    public String spaJobs6 = "Peluquero, agricultor, ama de casa";
    public String spaJobs7 = "Político, joyero, jardinero";

    public String rusJobs1 = "Врач, инженер, преподаватель";
    public String rusJobs2 = "Судья, медсестра, юрист";
    public String rusJobs3 = "Космонавт, архитектор, фармацевт";
    public String rusJobs4 = "Банкир, биржевой маклер, водитель";
    public String rusJobs5 = "Физиотерапевт, повар, галерист";
    public String rusJobs6 = "Парикмахер, фермер, домохозяйка";
    public String rusJobs7 = "Политик, ювелир, садовник";

    public String itaJobs1 = "Dottore, ingegnere, insegnante";
    public String itaJobs2 = "Giudice, infermiere, avvocato";
    public String itaJobs3 = "Astronauta, architetto, farmacista";
    public String itaJobs4 = "Banchiere, agente di cambio, autista";
    public String itaJobs5 = "Fisioterapista, cuoco, gallerista";
    public String itaJobs6 = "Barbiere, contadino, casalinga";
    public String itaJobs7 = "Politico, gioielliere, giardiniere";

    public String turJobs1 = "Doktor, mühendis, öğretmen";
    public String turJobs2 = "Hakim, hemşire, avukat";
    public String turJobs3 = "Astronot, mimar, eczacı";
    public String turJobs4 = "Bankacı, borsacı, şoför";
    public String turJobs5 = "Fizyoterapist, aşçı, galerici";
    public String turJobs6 = "Berber, çiftçi, ev hanımı";
    public String turJobs7 = "Politikacı, kuyumcu, bahçıvan";

    public String japJobs1 = "医者、エンジニア、先生";
    public String japJobs2 = "裁判官、看護師、弁護士";
    public String japJobs3 = "宇宙飛行士、建築家、薬剤師";
    public String japJobs4 = "銀行家、株式仲買人、運転手";
    public String japJobs5 = "理学療法士、料理人、廊主";
    public String japJobs6 = "理髪師、農夫、主婦";
    public String japJobs7 = "政治家、宝石商、庭師";

    public String chiJobs1 = "博士、工程师、教师";
    public String chiJobs2 = "法官、护士、律师";
    public String chiJobs3 = "宇航员、建筑师、药剂师";
    public String chiJobs4 = "银行家、股票经纪人、司机";
    public String chiJobs5 = "物理治疗师、厨师、画廊主";
    public String chiJobs6 = "理发师、农民、家庭主妇";
    public String chiJobs7 = "政治家、珠宝商、园丁";

    MediaPlayer JobsSound1;
    MediaPlayer JobsSound2;
    MediaPlayer JobsSound3;
    MediaPlayer JobsSound4;
    MediaPlayer JobsSound5;
    MediaPlayer JobsSound6;
    MediaPlayer JobsSound7;

    Animation ScaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);

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
            txtViewL1.setText(engJobs1);
            txtViewL2.setText(engJobs2);
            txtViewL3.setText(engJobs3);
            txtViewL4.setText(engJobs4);
            txtViewL5.setText(engJobs5);
            txtViewL6.setText(engJobs6);
            txtViewL7.setText(engJobs7);
        }
        if(languageGermany){
            txtViewL1.setText(gerJobs1);
            txtViewL2.setText(gerJobs2);
            txtViewL3.setText(gerJobs3);
            txtViewL4.setText(gerJobs4);
            txtViewL5.setText(gerJobs5);
            txtViewL6.setText(gerJobs6);
            txtViewL7.setText(gerJobs7);
        }
        if(languageFrance){
            txtViewL1.setText(fraJobs1);
            txtViewL2.setText(fraJobs2);
            txtViewL3.setText(fraJobs3);
            txtViewL4.setText(fraJobs4);
            txtViewL5.setText(fraJobs5);
            txtViewL6.setText(fraJobs6);
            txtViewL7.setText(fraJobs7);
        }
        if(languageSpain){
            txtViewL1.setText(spaJobs1);
            txtViewL2.setText(spaJobs2);
            txtViewL3.setText(spaJobs3);
            txtViewL4.setText(spaJobs4);
            txtViewL5.setText(spaJobs5);
            txtViewL6.setText(spaJobs6);
            txtViewL7.setText(spaJobs7);
        }
        if(languageRussia){
            txtViewL1.setText(rusJobs1);
            txtViewL2.setText(rusJobs2);
            txtViewL3.setText(rusJobs3);
            txtViewL4.setText(rusJobs4);
            txtViewL5.setText(rusJobs5);
            txtViewL6.setText(rusJobs6);
            txtViewL7.setText(rusJobs7);
        }
        if(languageItaly){
            txtViewL1.setText(itaJobs1);
            txtViewL2.setText(itaJobs2);
            txtViewL3.setText(itaJobs3);
            txtViewL4.setText(itaJobs4);
            txtViewL5.setText(itaJobs5);
            txtViewL6.setText(itaJobs6);
            txtViewL7.setText(itaJobs7);
        }
        if(languageTurkey){
            txtViewL1.setText(turJobs1);
            txtViewL2.setText(turJobs2);
            txtViewL3.setText(turJobs3);
            txtViewL4.setText(turJobs4);
            txtViewL5.setText(turJobs5);
            txtViewL6.setText(turJobs6);
            txtViewL7.setText(turJobs7);
        }
        if(languageJapan){
            txtViewL1.setText(japJobs1);
            txtViewL2.setText(japJobs2);
            txtViewL3.setText(japJobs3);
            txtViewL4.setText(japJobs4);
            txtViewL5.setText(japJobs5);
            txtViewL6.setText(japJobs6);
            txtViewL7.setText(japJobs7);
        }
        if(languageChina){
            txtViewL1.setText(chiJobs1);
            txtViewL2.setText(chiJobs2);
            txtViewL3.setText(chiJobs3);
            txtViewL4.setText(chiJobs4);
            txtViewL5.setText(chiJobs5);
            txtViewL6.setText(chiJobs6);
            txtViewL7.setText(chiJobs7);
        }
        //---
        if(wantToLearnAbd){
            txtViewW1.setText(engJobs1);
            txtViewW2.setText(engJobs2);
            txtViewW3.setText(engJobs3);
            txtViewW4.setText(engJobs4);
            txtViewW5.setText(engJobs5);
            txtViewW6.setText(engJobs6);
            txtViewW7.setText(engJobs7);

            JobsSound1 = MediaPlayer.create(JobsActivity.this,R.raw.eng1jobs);
            JobsSound2 = MediaPlayer.create(JobsActivity.this,R.raw.eng2jobs);
            JobsSound3 = MediaPlayer.create(JobsActivity.this,R.raw.eng3jobs);
            JobsSound4 = MediaPlayer.create(JobsActivity.this,R.raw.eng4jobs);
            JobsSound5 = MediaPlayer.create(JobsActivity.this,R.raw.eng5jobs);
            JobsSound6 = MediaPlayer.create(JobsActivity.this,R.raw.eng6jobs);
            JobsSound7 = MediaPlayer.create(JobsActivity.this,R.raw.eng7jobs);
        }
        if(wantToLearnGermany){
            txtViewW1.setText(gerJobs1);
            txtViewW2.setText(gerJobs2);
            txtViewW3.setText(gerJobs3);
            txtViewW4.setText(gerJobs4);
            txtViewW5.setText(gerJobs5);
            txtViewW6.setText(gerJobs6);
            txtViewW7.setText(gerJobs7);

            JobsSound1 = MediaPlayer.create(JobsActivity.this,R.raw.ger1jobs);
            JobsSound2 = MediaPlayer.create(JobsActivity.this,R.raw.ger2jobs);
            JobsSound3 = MediaPlayer.create(JobsActivity.this,R.raw.ger3jobs);
            JobsSound4 = MediaPlayer.create(JobsActivity.this,R.raw.ger4jobs);
            JobsSound5 = MediaPlayer.create(JobsActivity.this,R.raw.ger5jobs);
            JobsSound6 = MediaPlayer.create(JobsActivity.this,R.raw.ger6jobs);
            JobsSound7 = MediaPlayer.create(JobsActivity.this,R.raw.ger7jobs);
        }
        if(wantToLearnFrance){
            txtViewW1.setText(fraJobs1);
            txtViewW2.setText(fraJobs2);
            txtViewW3.setText(fraJobs3);
            txtViewW4.setText(fraJobs4);
            txtViewW5.setText(fraJobs5);
            txtViewW6.setText(fraJobs6);
            txtViewW7.setText(fraJobs7);

            JobsSound1 = MediaPlayer.create(JobsActivity.this,R.raw.fra1jobs);
            JobsSound2 = MediaPlayer.create(JobsActivity.this,R.raw.fra2jobs);
            JobsSound3 = MediaPlayer.create(JobsActivity.this,R.raw.fra3jobs);
            JobsSound4 = MediaPlayer.create(JobsActivity.this,R.raw.fra4jobs);
            JobsSound5 = MediaPlayer.create(JobsActivity.this,R.raw.fra5jobs);
            JobsSound6 = MediaPlayer.create(JobsActivity.this,R.raw.fra6jobs);
            JobsSound7 = MediaPlayer.create(JobsActivity.this,R.raw.fra7jobs);
        }
        if(wantToLearnSpain){
            txtViewW1.setText(spaJobs1);
            txtViewW2.setText(spaJobs2);
            txtViewW3.setText(spaJobs3);
            txtViewW4.setText(spaJobs4);
            txtViewW5.setText(spaJobs5);
            txtViewW6.setText(spaJobs6);
            txtViewW7.setText(spaJobs7);

            JobsSound1 = MediaPlayer.create(JobsActivity.this,R.raw.spa1jobs);
            JobsSound2 = MediaPlayer.create(JobsActivity.this,R.raw.spa2jobs);
            JobsSound3 = MediaPlayer.create(JobsActivity.this,R.raw.spa3jobs);
            JobsSound4 = MediaPlayer.create(JobsActivity.this,R.raw.spa4jobs);
            JobsSound5 = MediaPlayer.create(JobsActivity.this,R.raw.spa5jobs);
            JobsSound6 = MediaPlayer.create(JobsActivity.this,R.raw.spa6jobs);
            JobsSound7 = MediaPlayer.create(JobsActivity.this,R.raw.spa7jobs);
        }
        if(wantToLearnRussia){
            txtViewW1.setText(rusJobs1);
            txtViewW2.setText(rusJobs2);
            txtViewW3.setText(rusJobs3);
            txtViewW4.setText(rusJobs4);
            txtViewW5.setText(rusJobs5);
            txtViewW6.setText(rusJobs6);
            txtViewW7.setText(rusJobs7);

            JobsSound1 = MediaPlayer.create(JobsActivity.this,R.raw.rus1jobs);
            JobsSound2 = MediaPlayer.create(JobsActivity.this,R.raw.rus2jobs);
            JobsSound3 = MediaPlayer.create(JobsActivity.this,R.raw.rus3jobs);
            JobsSound4 = MediaPlayer.create(JobsActivity.this,R.raw.rus4jobs);
            JobsSound5 = MediaPlayer.create(JobsActivity.this,R.raw.rus5jobs);
            JobsSound6 = MediaPlayer.create(JobsActivity.this,R.raw.rus6jobs);
            JobsSound7 = MediaPlayer.create(JobsActivity.this,R.raw.rus7jobs);
        }
        if(wantToLearnItaly){
            txtViewW1.setText(itaJobs1);
            txtViewW2.setText(itaJobs2);
            txtViewW3.setText(itaJobs3);
            txtViewW4.setText(itaJobs4);
            txtViewW5.setText(itaJobs5);
            txtViewW6.setText(itaJobs6);
            txtViewW7.setText(itaJobs7);

            JobsSound1 = MediaPlayer.create(JobsActivity.this,R.raw.ita1jobs);
            JobsSound2 = MediaPlayer.create(JobsActivity.this,R.raw.ita2jobs);
            JobsSound3 = MediaPlayer.create(JobsActivity.this,R.raw.ita3jobs);
            JobsSound4 = MediaPlayer.create(JobsActivity.this,R.raw.ita4jobs);
            JobsSound5 = MediaPlayer.create(JobsActivity.this,R.raw.ita5jobs);
            JobsSound6 = MediaPlayer.create(JobsActivity.this,R.raw.ita6jobs);
            JobsSound7 = MediaPlayer.create(JobsActivity.this,R.raw.ita7jobs);
        }
        if(wantToLearnTurkey){
            txtViewW1.setText(turJobs1);
            txtViewW2.setText(turJobs2);
            txtViewW3.setText(turJobs3);
            txtViewW4.setText(turJobs4);
            txtViewW5.setText(turJobs5);
            txtViewW6.setText(turJobs6);
            txtViewW7.setText(turJobs7);

            JobsSound1 = MediaPlayer.create(JobsActivity.this,R.raw.tur1jobs);
            JobsSound2 = MediaPlayer.create(JobsActivity.this,R.raw.tur2jobs);
            JobsSound3 = MediaPlayer.create(JobsActivity.this,R.raw.tur3jobs);
            JobsSound4 = MediaPlayer.create(JobsActivity.this,R.raw.tur4jobs);
            JobsSound5 = MediaPlayer.create(JobsActivity.this,R.raw.tur5jobs);
            JobsSound6 = MediaPlayer.create(JobsActivity.this,R.raw.tur6jobs);
            JobsSound7 = MediaPlayer.create(JobsActivity.this,R.raw.tur7jobs);
        }
        if(wantToLearnJapan){
            txtViewW1.setText(japJobs1);
            txtViewW2.setText(japJobs2);
            txtViewW3.setText(japJobs3);
            txtViewW4.setText(japJobs4);
            txtViewW5.setText(japJobs5);
            txtViewW6.setText(japJobs6);
            txtViewW7.setText(japJobs7);

            JobsSound1 = MediaPlayer.create(JobsActivity.this,R.raw.jap1jobs);
            JobsSound2 = MediaPlayer.create(JobsActivity.this,R.raw.jap2jobs);
            JobsSound3 = MediaPlayer.create(JobsActivity.this,R.raw.jap3jobs);
            JobsSound4 = MediaPlayer.create(JobsActivity.this,R.raw.jap4jobs);
            JobsSound5 = MediaPlayer.create(JobsActivity.this,R.raw.jap5jobs);
            JobsSound6 = MediaPlayer.create(JobsActivity.this,R.raw.jap6jobs);
            JobsSound7 = MediaPlayer.create(JobsActivity.this,R.raw.jap7jobs);
        }
        if(wantToLearnChina){
            txtViewW1.setText(chiJobs1);
            txtViewW2.setText(chiJobs2);
            txtViewW3.setText(chiJobs3);
            txtViewW4.setText(chiJobs4);
            txtViewW5.setText(chiJobs5);
            txtViewW6.setText(chiJobs6);
            txtViewW7.setText(chiJobs7);

            JobsSound1 = MediaPlayer.create(JobsActivity.this,R.raw.chi1jobs);
            JobsSound2 = MediaPlayer.create(JobsActivity.this,R.raw.chi2jobs);
            JobsSound3 = MediaPlayer.create(JobsActivity.this,R.raw.chi3jobs);
            JobsSound4 = MediaPlayer.create(JobsActivity.this,R.raw.chi4jobs);
            JobsSound5 = MediaPlayer.create(JobsActivity.this,R.raw.chi5jobs);
            JobsSound6 = MediaPlayer.create(JobsActivity.this,R.raw.chi6jobs);
            JobsSound7 = MediaPlayer.create(JobsActivity.this,R.raw.chi7jobs);
        }

        btnImageS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    JobsSound1.start();
                }
            }
        });

        btnImageS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    JobsSound2.start();
                }
            }
        });

        btnImageS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    JobsSound3.start();
                }
            }
        });

        btnImageS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    JobsSound4.start();
                }
            }
        });

        btnImageS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    JobsSound5.start();
                }
            }
        });

        btnImageS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    JobsSound6.start();
                }
            }
        });

        btnImageS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPlaying()){
                    JobsSound7.start();
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
        if(!JobsSound1.isPlaying()){
            if(!JobsSound2.isPlaying()){
                if(!JobsSound3.isPlaying()){
                    if(!JobsSound4.isPlaying()){
                        if(!JobsSound5.isPlaying()){
                            if(!JobsSound6.isPlaying()){
                                if(!JobsSound7.isPlaying()){
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