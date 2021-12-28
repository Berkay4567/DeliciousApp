package com.example.deliciousapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pratik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratik);
        Button button1071 = findViewById(R.id.button1071);
        button1071.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(getApplicationContext(), com.example.deliciousapp.Menu.class);
                startActivity(b);
            }
        });
        Button button261 = findViewById(R.id.button261);
        button261.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi201= new AlertDialog.Builder(Pratik.this);
                uyariPenceresi201.setTitle("Malzemeler");
                uyariPenceresi201.setMessage("- 2 yemek kaşığısıvı yağ\n" +
                        "- 300 gramtavuk göğsü(kuşbaşı doğranmış)\n" +
                        "- 1 adetsoğan\n" +
                        "- 1 adetyeşil biber\n" +
                        "- 1/2 adetkırmızı biber\n" +
                        "- 1 adetdoğranmış domates\n" +
                        "- 1 çay kaşığıtuz\n" +
                        "- 1 çay kaşığıkarabiber\n" +
                        "- 1 çay kaşığıpul biber\n" +
                        "- 1 çay kaşığıkuru nane");
                uyariPenceresi201.show();
            }
        });
        Button button271 = findViewById(R.id.button271);
        button271.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi211= new AlertDialog.Builder(Pratik.this);
                uyariPenceresi211.setTitle("Nasıl Yapılır?");
                uyariPenceresi211.setMessage("- Tavanın içerisine 2 yemek kaşığı sıvı yağı alın ve\n" +
                        " üzerine 300 gram kuşbaşı doğranmış tavuğu ilave ederek yüksek ateşte \n" +
                        "soteleyin.\n" +
                        "- Pişen tavukların üzerine 1 adet doğranmış soğanı ilave ederek sotelemeye \n" +
                        "devam edin.\n  " +
                        "- 1 adet doğranmış yeşil biber ve yarım adet doğranmış kapya biberi de ekleyin.\n" +
                        "- 1 adet doğranmış domatesi de tavanın içerisine aktarın.\n" +
                        "- Biraz suyunu çektikten sonra sırasıyla birer çay kaşığı tuz, karabiber, \n" +
                        "pul biber ve kuru nane ilave ederek güzelce karıştırın.\n" +
                        "- İyice pişince tavuk sotenizi ocaktan alın ve servis edin. Afiyet olsun!");
                uyariPenceresi211.show();
            }
        });
        Button button281 = findViewById(R.id.button281);
        button281.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi221= new AlertDialog.Builder(Pratik.this);
                uyariPenceresi221.setTitle("Püf Noktaları");
                uyariPenceresi221.setMessage("- Tavuk soteyi, yanmaz/yapışmaz tabanlı geniş bir\n" +
                        " tavada hazırlıyorsanız yağ kullanmayın. Aksi takdirde çok az miktarda \n" +
                        "(örneğin 1 tatlı kaşığı), yanma derecesi yüksek bir çeşit sıvı yağ kullanın.\n" +
                        " Sote tavası ve kullandığınız yağı önceden kızdırın. Sote edilen doğranmış\n" +
                        " kabuksuz domates ve biberler suyunu salacağı için ekstra su kullanmayın. \n" +
                        "Ocaktan aldığınız soteyi, arzu ettiğiniz kuru ve taze baharatlarla \n" +
                        "tatlandırabilirsiniz.");
                uyariPenceresi221.show();
            }
        });
        Button button291 = findViewById(R.id.button291);
        button291.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi231= new AlertDialog.Builder(Pratik.this);
                uyariPenceresi231.setTitle("Kaç Kalori?");
                uyariPenceresi231.setMessage("- Bir porsiyon tavuk sote gramaj olarak hesaplandığında \n" +
                        " yaklaşık 170- 180 gram gelmektedir. Bu değerdeki tavuk sotenin kalori miktarı\n" +
                        " ise 285 kcal etmektedir. Tavuk sote, karşıladığı kalori değerinin neredeyse\n" +
                        " yarısını içerdiği yağdan almaktadır.");
                uyariPenceresi231.show();
            }
        });
        Button button301 = findViewById(R.id.button301);
        button301.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi241= new AlertDialog.Builder(Pratik.this);
                uyariPenceresi241.setTitle("Malzemeler");
                uyariPenceresi241.setMessage("- 1/2 paket Yüksük Makarna\n" +
                        "- 1/2 kavanozgarnitür\n" +
                        "- 1 kaseyoğurt\n" +
                        "- 1 dişsarımsak\n" +
                        "- 2 yemek kaşığımayonez\n" +
                        "- 1 çay kaşığıtuz\n" +
                        "- 4 dalmaydanoz");
                uyariPenceresi241.show();
            }
        });
        Button button311 = findViewById(R.id.button311);
        button311.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi251= new AlertDialog.Builder(Pratik.this);
                uyariPenceresi251.setTitle("Nasıl Yapılır?");
                uyariPenceresi251.setMessage("- Makarnayı biraz tuzla kaynar suda yaklaşık 10 dakika \n" +
                        "pişirin.\n" +
                        "\n" +
                        "- Piştikten sonra suyunu süzün ve derin bir karıştırma kabına alın.\n" +
                        "\n" +
                        "- Üzerine yarım kavanoz garnitür dökün ve harmanlayın.\n" +
                        "\n" +
                        "- Yoğurdu ve mayonezi ayrı bir kapta karıştırın. Sarımsağı ezin ve karışıma \n" +
                        "ekleyin. Tuz ve dilediğiniz baharatları ekleyin ve karıştırın.\n" +
                        "\n" +
                        "- Makarna dolu kaba ekleyin ve harmanlayın.\n" +
                        "\n" +
                        "- Servis tabağına alın ve maydanoz yaprakları ile süsleyerek servis edin.\n\n" +
                        " ----Afiyet olsun.----");
                uyariPenceresi251.show();
            }
        });
        Button button321 = findViewById(R.id.button321);
        button321.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi261= new AlertDialog.Builder(Pratik.this);
                uyariPenceresi261.setTitle("Püf Noktaları");
                uyariPenceresi261.setMessage("- Dilediğiniz makarna türünü kullanabilirsiniz.\n" +
                        " Daha çok düdük gibi daha ufak boyutlarda olanları tercih\n" +
                        " etmenizi öneririz.");
                uyariPenceresi261.show();
            }
        });
        Button button331 = findViewById(R.id.button331);
        button331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi271= new AlertDialog.Builder(Pratik.this);
                uyariPenceresi271.setTitle("Kaç Kalori?");
                uyariPenceresi271.setMessage("- Bu besinin 100 gramında 94 kcal kalori, ayrıca \n" +
                        "besinin 1 Porsiyon (Orta) yani 303 gramlık miktarında 285 kalori \n" +
                        "bulunmaktadır.");
                uyariPenceresi271.show();
            }
        });
        Button button341 = findViewById(R.id.button341);
        button341.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi281= new AlertDialog.Builder(Pratik.this);
                uyariPenceresi281.setTitle("Malzemeler");
                uyariPenceresi281.setMessage("- 2 yemek kaşığıtereyağı\n" +
                        "- 2 adetbayat ekmek(küp doğranmış)\n" +
                        "- 2 yemek kaşığısıvı yağ\n" +
                        "- 200 gramdana kıyma\n" +
                        "- 2 yemek kaşığıdomates salçası\n" +
                        "- 1 çay bardağısu\n" +
                        "- 1/2 demetmaydanoz(doğranmış)\n" +
                        "- 1 su bardağıçırpılmış yoğurt");
                uyariPenceresi281.show();
            }
        });
        Button button351 = findViewById(R.id.button351);
        button351.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi291= new AlertDialog.Builder(Pratik.this);
                uyariPenceresi291.setTitle("Nasıl Yapılır?");
                uyariPenceresi291.setMessage("-Tereyağını tencerede eritin. Küp küp doğramış olduğunuz\n" +
                        " bayat ekmekleri ekleyip birkaç dakika kavurun ve ocaktan alın.\n" +
                        "\n" +
                        "Sıvı yağı bir tavaya alın ve kıymayı kavurun. Salçayı ekleyip iyice karıştırın.\n" +
                        "\n" +
                        "1 çay bardağı su ekleyin, su kaynayınca doğradığınız maydanozu ekleyip\n" +
                        " karıştırın.\n" +
                        "\n" +
                        "Servis tabağına ekmekleri yerleştirin. Çırpılmış yoğurdu ve son olarak da\n" +
                        " kıymalı harcı üzerine yayın ve servis edin. Afiyet olsun!" +
                        "\n");
                uyariPenceresi291.show();
            }
        });
        Button button361 = findViewById(R.id.button361);
        button361.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi301= new AlertDialog.Builder(Pratik.this);
                uyariPenceresi301.setTitle("Püf Noktaları");
                uyariPenceresi301.setMessage("- Bayat ekmekleri kullanarak israfı önleyebilirsiniz.");
                uyariPenceresi301.show();
            }
        });
        Button button371 = findViewById(R.id.button371);
        button371.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi311= new AlertDialog.Builder(Pratik.this);
                uyariPenceresi311.setTitle("Kaç Kalori?");
                uyariPenceresi311.setMessage("- 100 g içinde 276 kadar kalori mevcut.");
                uyariPenceresi311.show();
            }
        });
    }
}