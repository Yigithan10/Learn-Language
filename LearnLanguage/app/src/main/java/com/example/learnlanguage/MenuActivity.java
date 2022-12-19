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

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.UiModeManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    public String engMenuNavigation = "Navigation";
    public String gerMenuNavigation = "Navigation";
    public String fraMenuNavigation = "La navigation";
    public String spaMenuNavigation = "Navegación";
    public String rusMenuNavigation = "Навигация";
    public String itaMenuNavigation = "Navigazione";
    public String turMenuNavigation = "Navigasyon";
    public String japMenuNavigation = "ナビゲーション";
    public String chiMenuNavigation = "导航";

    public String engMenuAirport = "Airport";
    public String gerMenuAirport = "Flughafen";
    public String fraMenuAirport = "Aéroport";
    public String spaMenuAirport = "Aeropuerto";
    public String rusMenuAirport = "Aэропорт";
    public String itaMenuAirport = "Aeroporto";
    public String turMenuAirport = "Havalimanı";
    public String japMenuAirport = "空港";
    public String chiMenuAirport = "飞机场";

    public String engMenuHotel = "Hotel";
    public String gerMenuHotel = "Hotel";
    public String fraMenuHotel = "Hôtel";
    public String spaMenuHotel = "Hotel";
    public String rusMenuHotel = "Отель";
    public String itaMenuHotel = "Hotel";
    public String turMenuHotel = "Otel";
    public String japMenuHotel = "ホテル";
    public String chiMenuHotel = "酒店";

    public String engMenuMarket = "Market";
    public String gerMenuMarket = "Markt";
    public String fraMenuMarket = "Marché";
    public String spaMenuMarket = "Mercado";
    public String rusMenuMarket = "Рынок";
    public String itaMenuMarket = "Supermercato";
    public String turMenuMarket = "Market";
    public String japMenuMarket = "市場";
    public String chiMenuMarket = "市场";

    public String engMenuCafe = "Cafe";
    public String gerMenuCafe = "Cafe";
    public String fraMenuCafe = "Café";
    public String spaMenuCafe = "Cafetería";
    public String rusMenuCafe = "Кафе";
    public String itaMenuCafe = "Bar";
    public String turMenuCafe = "Kafe";
    public String japMenuCafe = "カフェ";
    public String chiMenuCafe = "咖啡店";

    public String engMenuMeet = "Meet";
    public String gerMenuMeet = "Sich treffen";
    public String fraMenuMeet = "Rencontrer";
    public String spaMenuMeet = "Reunir";
    public String rusMenuMeet = "Встретиться";
    public String itaMenuMeet = "Incontrare";
    public String turMenuMeet = "Tanışmak";
    public String japMenuMeet = "会う";
    public String chiMenuMeet = "见面";

    public String engMenuFriendship = "Friendship";
    public String gerMenuFriendship = "Freundschaft";
    public String fraMenuFriendship = "Amitié";
    public String spaMenuFriendship = "Amistad";
    public String rusMenuFriendship = "Дружба";
    public String itaMenuFriendship = "Amicizia";
    public String turMenuFriendship = "Dostluk";
    public String japMenuFriendship = "友情";
    public String chiMenuFriendship = "友谊";

    public String engMenuGreeting = "Greeting";
    public String gerMenuGreeting = "Gruß";
    public String fraMenuGreeting = "Salutation";
    public String spaMenuGreeting = "Saludo";
    public String rusMenuGreeting = "Приветствие";
    public String itaMenuGreeting = "Saluto";
    public String turMenuGreeting = "Selamlama";
    public String japMenuGreeting = "挨拶";
    public String chiMenuGreeting = "问候";

    public String engMenuTechnology = "Technology";
    public String gerMenuTechnology = "Technologie";
    public String fraMenuTechnology = "Technologie";
    public String spaMenuTechnology = "Tecnología";
    public String rusMenuTechnology = "Технологии";
    public String itaMenuTechnology = "Tecnologia";
    public String turMenuTechnology = "Teknoloji";
    public String japMenuTechnology = "テクノロジー";
    public String chiMenuTechnology = "技术";

    public String engMenuJobs = "Jobs";
    public String gerMenuJobs = "Arbeitsplätze";
    public String fraMenuJobs = "Emplois";
    public String spaMenuJobs = "Trabajos";
    public String rusMenuJobs = "Работа";
    public String itaMenuJobs = "Lavori";
    public String turMenuJobs = "Meslekler";
    public String japMenuJobs = "ジョブズ";
    public String chiMenuJobs = "工作";

    public String engMenuLove = "Love";
    public String gerMenuLove = "Liebe";
    public String fraMenuLove = "Amour";
    public String spaMenuLove = "Amar";
    public String rusMenuLove = "Любовь";
    public String itaMenuLove = "Amore";
    public String turMenuLove = "Aşk";
    public String japMenuLove = "愛する";
    public String chiMenuLove = "爱";

    public String engMenuNumbers = "Numbers";
    public String gerMenuNumbers = "Zahlen";
    public String fraMenuNumbers = "Nombres";
    public String spaMenuNumbers = "Números";
    public String rusMenuNumbers = "Числа";
    public String itaMenuNumbers = "Numeri";
    public String turMenuNumbers = "Sayılar";
    public String japMenuNumbers = "数字";
    public String chiMenuNumbers = "数字";

    public String engTitle = "Warning!";
    public String engMessage = "Do you want to exit?";
    public String engPositiveButton = "Yes";
    public String engNegativeButton = "No";

    public String gerTitle = "Warnung!";
    public String gerMessage = "Möchtest du aussteigen?";
    public String gerPositiveButton = "Ja";
    public String gerNegativeButton = "Nein";

    public String fraTitle = "Avertissement!";
    public String fraMessage = "Voulez-vous sortir?";
    public String fraPositiveButton = "Oui";
    public String fraNegativeButton = "Non";

    public String spaTitle = "¡Advertencia!";
    public String spaMessage = "¿Quieres salir?";
    public String spaPositiveButton = "Sí";
    public String spaNegativeButton = "No";

    public String rusTitle = "Предупреждение!";
    public String rusMessage = "Вы хотите выйти?";
    public String rusPositiveButton = "Да";
    public String rusNegativeButton = "Нет";

    public String itaTitle = "Avvertimento!";
    public String itaMessage = "Vuoi uscire?";
    public String itaPositiveButton = "Sì";
    public String itaNegativeButton = "No";

    public String turTitle = "Uyarı!";
    public String turMessage = "Çıkmak istiyor musunuz?";
    public String turPositiveButton = "Evet";
    public String turNegativeButton = "Hayır";

    public String japTitle = "警告！";
    public String japMessage = "終了しますか？";
    public String japPositiveButton = "はい";
    public String japNegativeButton = "いいえ";

    public String chiTitle = "警告！";
    public String chiMessage = "你想离开吗？";
    public String chiPositiveButton = "是的";
    public String chiNegativeButton = "不";

    Animation ScaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        AlertDialog.Builder exitMenu;

        TextView txtMenuNavigation = findViewById(R.id.txtViewMenuNavigation);
        TextView txtMenuAirport = findViewById(R.id.txtViewMenuAirport);
        TextView txtMenuHotel = findViewById(R.id.txtViewMenuHotel);
        TextView txtMenuMarket = findViewById(R.id.txtViewMenuMarket);
        TextView txtMenuCafe = findViewById(R.id.txtViewMenuCafe);
        TextView txtMenuMeet = findViewById(R.id.txtViewMenuMeet);
        TextView txtMenuFriendship = findViewById(R.id.txtViewMenuFriendship);
        TextView txtMenuGreeting = findViewById(R.id.txtViewMenuGreeting);
        TextView txtMenuTechnology = findViewById(R.id.txtViewMenuTechnology);
        TextView txtMenuJobs = findViewById(R.id.txtViewMenuJobs);
        TextView txtMenuLove = findViewById(R.id.txtViewMenuLove);
        TextView txtMenuNumbers = findViewById(R.id.txtViewMenuNumbers);

        ImageButton btnImageMenuNavigation = findViewById(R.id.btnImageMenuNavigation);
        ImageButton btnImageMenuAirport = findViewById(R.id.btnImageMenuAirport);
        ImageButton btnImageMenuHotel = findViewById(R.id.btnImageMenuHotel);
        ImageButton btnImageMenuMarket = findViewById(R.id.btnImageMenuMarket);
        ImageButton btnImageMenuCafe = findViewById(R.id.btnImageMenuCafe);
        ImageButton btnImageMenuMeet = findViewById(R.id.btnImageMenuMeet);
        ImageButton btnImageMenuFriendship = findViewById(R.id.btnImageMenuFriendship);
        ImageButton btnImageMenuGreeting = findViewById(R.id.btnImageMenuGreeting);
        ImageButton btnImageMenuTechnology = findViewById(R.id.btnImageMenuTechnology);
        ImageButton btnImageMenuJobs = findViewById(R.id.btnImageMenuJobs);
        ImageButton btnImageMenuLove = findViewById(R.id.btnImageMenuLove);
        ImageButton btnImageMenuNumbers = findViewById(R.id.btnImageMenuNumbers);

        ImageButton btnImageTurnBack = findViewById(R.id.btnImageTurnBack);
        ImageButton btnImageMenuExit = findViewById(R.id.btnImageMenuExit);

        ScaleDown = AnimationUtils.loadAnimation(this,R.anim.scale_down);

        exitMenu = new AlertDialog.Builder(this);

        Intent NavigationActivity = new Intent(MenuActivity.this, com.example.learnlanguage.NavigationActivity.class);
        Intent AirportActivity = new Intent(MenuActivity.this, com.example.learnlanguage.AirportActivity.class);
        Intent HotelActivity = new Intent(MenuActivity.this, com.example.learnlanguage.HotelActivity.class);
        Intent MarketActivity = new Intent(MenuActivity.this, com.example.learnlanguage.MarketActivity.class);
        Intent CafeActivity = new Intent(MenuActivity.this, com.example.learnlanguage.CafeActivity.class);
        Intent MeetActivity = new Intent(MenuActivity.this, com.example.learnlanguage.MeetActivity.class);
        Intent FriendshipActivity = new Intent(MenuActivity.this, com.example.learnlanguage.FriendshipActivity.class);
        Intent GreetingActivity = new Intent(MenuActivity.this, com.example.learnlanguage.GreetingActivity.class);
        Intent TechnologyActivity = new Intent(MenuActivity.this, com.example.learnlanguage.TechnologyActivity.class);
        Intent JobsActivity = new Intent(MenuActivity.this, com.example.learnlanguage.JobsActivity.class);
        Intent LoveActivity = new Intent(MenuActivity.this, com.example.learnlanguage.LoveActivity.class);
        Intent NumbersActivity = new Intent(MenuActivity.this, com.example.learnlanguage.NumbersActivity.class);


        if(languageAbd){
            txtMenuNavigation.setText(engMenuNavigation);
            txtMenuAirport.setText(engMenuAirport);
            txtMenuHotel.setText(engMenuHotel);
            txtMenuMarket.setText(engMenuMarket);
            txtMenuCafe.setText(engMenuCafe);
            txtMenuMeet.setText(engMenuMeet);
            txtMenuFriendship.setText(engMenuFriendship);
            txtMenuGreeting.setText(engMenuGreeting);
            txtMenuTechnology.setText(engMenuTechnology);
            txtMenuJobs.setText(engMenuJobs);
            txtMenuLove.setText(engMenuLove);
            txtMenuNumbers.setText(engMenuNumbers);
        }
        if(languageGermany){
            txtMenuNavigation.setText(gerMenuNavigation);
            txtMenuAirport.setText(gerMenuAirport);
            txtMenuHotel.setText(gerMenuHotel);
            txtMenuMarket.setText(gerMenuMarket);
            txtMenuCafe.setText(gerMenuCafe);
            txtMenuMeet.setText(gerMenuMeet);
            txtMenuFriendship.setText(gerMenuFriendship);
            txtMenuGreeting.setText(gerMenuGreeting);
            txtMenuTechnology.setText(gerMenuTechnology);
            txtMenuJobs.setText(gerMenuJobs);
            txtMenuLove.setText(gerMenuLove);
            txtMenuNumbers.setText(gerMenuNumbers);
        }
        if(languageFrance){
            txtMenuNavigation.setText(fraMenuNavigation);
            txtMenuAirport.setText(fraMenuAirport);
            txtMenuHotel.setText(fraMenuHotel);
            txtMenuMarket.setText(fraMenuMarket);
            txtMenuCafe.setText(fraMenuCafe);
            txtMenuMeet.setText(fraMenuMeet);
            txtMenuFriendship.setText(fraMenuFriendship);
            txtMenuGreeting.setText(fraMenuGreeting);
            txtMenuTechnology.setText(fraMenuTechnology);
            txtMenuJobs.setText(fraMenuJobs);
            txtMenuLove.setText(fraMenuLove);
            txtMenuNumbers.setText(fraMenuNumbers);
        }
        if(languageSpain){
            txtMenuNavigation.setText(spaMenuNavigation);
            txtMenuAirport.setText(spaMenuAirport);
            txtMenuHotel.setText(spaMenuHotel);
            txtMenuMarket.setText(spaMenuMarket);
            txtMenuCafe.setText(spaMenuCafe);
            txtMenuMeet.setText(spaMenuMeet);
            txtMenuFriendship.setText(spaMenuFriendship);
            txtMenuGreeting.setText(spaMenuGreeting);
            txtMenuTechnology.setText(spaMenuTechnology);
            txtMenuJobs.setText(spaMenuJobs);
            txtMenuLove.setText(spaMenuLove);
            txtMenuNumbers.setText(spaMenuNumbers);
        }
        if(languageRussia){
            txtMenuNavigation.setText(rusMenuNavigation);
            txtMenuAirport.setText(rusMenuAirport);
            txtMenuHotel.setText(rusMenuHotel);
            txtMenuMarket.setText(rusMenuMarket);
            txtMenuCafe.setText(rusMenuCafe);
            txtMenuMeet.setText(rusMenuMeet);
            txtMenuFriendship.setText(rusMenuFriendship);
            txtMenuGreeting.setText(rusMenuGreeting);
            txtMenuTechnology.setText(rusMenuTechnology);
            txtMenuJobs.setText(rusMenuJobs);
            txtMenuLove.setText(rusMenuLove);
            txtMenuNumbers.setText(rusMenuNumbers);
        }
        if(languageItaly){
            txtMenuNavigation.setText(itaMenuNavigation);
            txtMenuAirport.setText(itaMenuAirport);
            txtMenuHotel.setText(itaMenuHotel);
            txtMenuMarket.setText(itaMenuMarket);
            txtMenuCafe.setText(itaMenuCafe);
            txtMenuMeet.setText(itaMenuMeet);
            txtMenuFriendship.setText(itaMenuFriendship);
            txtMenuGreeting.setText(itaMenuGreeting);
            txtMenuTechnology.setText(itaMenuTechnology);
            txtMenuJobs.setText(itaMenuJobs);
            txtMenuLove.setText(itaMenuLove);
            txtMenuNumbers.setText(itaMenuNumbers);
        }
        if(languageTurkey){
            txtMenuNavigation.setText(turMenuNavigation);
            txtMenuAirport.setText(turMenuAirport);
            txtMenuHotel.setText(turMenuHotel);
            txtMenuMarket.setText(turMenuMarket);
            txtMenuCafe.setText(turMenuCafe);
            txtMenuMeet.setText(turMenuMeet);
            txtMenuFriendship.setText(turMenuFriendship);
            txtMenuGreeting.setText(turMenuGreeting);
            txtMenuTechnology.setText(turMenuTechnology);
            txtMenuJobs.setText(turMenuJobs);
            txtMenuLove.setText(turMenuLove);
            txtMenuNumbers.setText(turMenuNumbers);
        }
        if(languageJapan){
            txtMenuNavigation.setText(japMenuNavigation);
            txtMenuAirport.setText(japMenuAirport);
            txtMenuHotel.setText(japMenuHotel);
            txtMenuMarket.setText(japMenuMarket);
            txtMenuCafe.setText(japMenuCafe);
            txtMenuMeet.setText(japMenuMeet);
            txtMenuFriendship.setText(japMenuFriendship);
            txtMenuGreeting.setText(japMenuGreeting);
            txtMenuTechnology.setText(japMenuTechnology);
            txtMenuJobs.setText(japMenuJobs);
            txtMenuLove.setText(japMenuLove);
            txtMenuNumbers.setText(japMenuNumbers);
        }
        if(languageChina){
            txtMenuNavigation.setText(chiMenuNavigation);
            txtMenuAirport.setText(chiMenuAirport);
            txtMenuHotel.setText(chiMenuHotel);
            txtMenuMarket.setText(chiMenuMarket);
            txtMenuCafe.setText(chiMenuCafe);
            txtMenuMeet.setText(chiMenuMeet);
            txtMenuFriendship.setText(chiMenuFriendship);
            txtMenuGreeting.setText(chiMenuGreeting);
            txtMenuTechnology.setText(chiMenuTechnology);
            txtMenuJobs.setText(chiMenuJobs);
            txtMenuLove.setText(chiMenuLove);
            txtMenuNumbers.setText(chiMenuNumbers);
        }

        btnImageMenuNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageMenuNavigation.startAnimation(ScaleDown);
                startActivity(NavigationActivity); }
        });

        btnImageMenuAirport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageMenuAirport.startAnimation(ScaleDown);
                startActivity(AirportActivity);
            }
        });

        btnImageMenuHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageMenuHotel.startAnimation(ScaleDown);
                startActivity(HotelActivity);
            }
        });

        btnImageMenuMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageMenuMarket.startAnimation(ScaleDown);
                startActivity(MarketActivity);
            }
        });

        btnImageMenuCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageMenuCafe.startAnimation(ScaleDown);
                startActivity(CafeActivity);
            }
        });

        btnImageMenuMeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageMenuMeet.startAnimation(ScaleDown);
                startActivity(MeetActivity);
            }
        });

        btnImageMenuFriendship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageMenuFriendship.startAnimation(ScaleDown);
                startActivity(FriendshipActivity);
            }
        });

        btnImageMenuGreeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageMenuGreeting.startAnimation(ScaleDown);
                startActivity(GreetingActivity);
            }
        });

        btnImageMenuTechnology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageMenuTechnology.startAnimation(ScaleDown);
                startActivity(TechnologyActivity);
            }
        });

        btnImageMenuJobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageMenuJobs.startAnimation(ScaleDown);
                startActivity(JobsActivity);
            }
        });

        btnImageMenuLove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageMenuLove.startAnimation(ScaleDown);
                startActivity(LoveActivity);
            }
        });

        btnImageMenuNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageMenuNumbers.startAnimation(ScaleDown);
                startActivity(NumbersActivity);
            }
        });

        btnImageTurnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageTurnBack.startAnimation(ScaleDown);

                wantToLearnAbd = false;
                wantToLearnGermany = false;
                wantToLearnFrance = false;
                wantToLearnSpain = false;
                wantToLearnRussia = false;
                wantToLearnItaly = false;
                wantToLearnTurkey = false;
                wantToLearnJapan = false;
                wantToLearnChina = false;
                finish();
            }
        });

        btnImageMenuExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnImageMenuExit.startAnimation(ScaleDown);

                if(languageAbd){
                    exitMenu.setTitle(engTitle)
                            .setMessage(engMessage)
                            .setCancelable(true)
                            .setPositiveButton(engPositiveButton, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finishAffinity();
                                }
                            })
                            .setNegativeButton(engNegativeButton, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .show();
                }
                if(languageGermany){
                    exitMenu.setTitle(gerTitle)
                            .setMessage(gerMessage)
                            .setCancelable(true)
                            .setPositiveButton(gerPositiveButton, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finishAffinity();
                                }
                            })
                            .setNegativeButton(gerNegativeButton, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .show();
                }
                if(languageFrance){
                    exitMenu.setTitle(fraTitle)
                            .setMessage(fraMessage)
                            .setCancelable(true)
                            .setPositiveButton(fraPositiveButton, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finishAffinity();
                                }
                            })
                            .setNegativeButton(fraNegativeButton, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .show();
                }
                if(languageSpain){
                    exitMenu.setTitle(spaTitle)
                            .setMessage(spaMessage)
                            .setCancelable(true)
                            .setPositiveButton(spaPositiveButton, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finishAffinity();
                                }
                            })
                            .setNegativeButton(spaNegativeButton, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .show();
                }
                if(languageRussia){
                    exitMenu.setTitle(rusTitle)
                            .setMessage(rusMessage)
                            .setCancelable(true)
                            .setPositiveButton(rusPositiveButton, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finishAffinity();
                                }
                            })
                            .setNegativeButton(rusNegativeButton, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .show();
                }
                if(languageItaly){
                    exitMenu.setTitle(itaTitle)
                            .setMessage(itaMessage)
                            .setCancelable(true)
                            .setPositiveButton(itaPositiveButton, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finishAffinity();
                                }
                            })
                            .setNegativeButton(itaNegativeButton, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .show();
                }
                if(languageTurkey){
                    exitMenu.setTitle(turTitle)
                            .setMessage(turMessage)
                            .setCancelable(true)
                            .setPositiveButton(turPositiveButton, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finishAffinity();
                                }
                            })
                            .setNegativeButton(turNegativeButton, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .show();
                }
                if(languageJapan){
                    exitMenu.setTitle(japTitle)
                            .setMessage(japMessage)
                            .setCancelable(true)
                            .setPositiveButton(japPositiveButton, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finishAffinity();
                                }
                            })
                            .setNegativeButton(japNegativeButton, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .show();
                }
                if(languageChina){
                    exitMenu.setTitle(chiTitle)
                            .setMessage(chiMessage)
                            .setCancelable(true)
                            .setPositiveButton(chiPositiveButton, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finishAffinity();
                                }
                            })
                            .setNegativeButton(chiNegativeButton, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .show();
                }
            }
        });
    }
}