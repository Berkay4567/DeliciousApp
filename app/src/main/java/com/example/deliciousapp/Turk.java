package com.example.deliciousapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Turk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turk);
        Button button1070 = findViewById(R.id.button1070);
        button1070.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iiiii = new Intent(getApplicationContext(), com.example.deliciousapp.Menu.class);
                startActivity(iiiii);
            }
        });
        Button button260 = findViewById(R.id.button260);
        button260.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi200= new AlertDialog.Builder(Turk.this);
                uyariPenceresi200.setTitle("Malzemeler");
                uyariPenceresi200.setMessage("-300 gramtaze börülce\n" +
                        "-4 yemek kaşığı zeytinyağı\n" +
                        "-1 adet orta boy soğan\n" +
                        "-2 adet orta boy havuç\n" +
                        "-2 adet orta boy domates\n" +
                        "-1 tatlı kaşığıtuz\n" +
                        "-1 çay kaşığı karabiber\n" +
                        "-1/2 su bardağısu");
                uyariPenceresi200.show();
            }
        });
        Button button270 = findViewById(R.id.button270);
        button270.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi210= new AlertDialog.Builder(Turk.this);
                uyariPenceresi210.setTitle("Nasıl Yapılır?");
                uyariPenceresi210.setMessage("- Börülceleri ayıklayıp yıkadıktan sonra 7-8 cm \n" +
                        "uzunluğunda dilimleyin.\n" +
                        "\n" +
                        "Soğanı yemeklik doğrayın.\n" +
                        "\n" +
                        "Havuçları uzun ve ince bir şekilde doğrayın.\n" +
                        "\n" +
                        "Domatesleri rendeleyin.\n" +
                        "\n" +
                        "4 yemek kaşığı zeytinyağı ile soğanları pembeleşinceye kadar kavurun.\n" +
                        "\n" +
                        "Üzerine havuçları ekleyerek kavurmaya devam edin.\n" +
                        "\n" +
                        "Havuçları terlettikten sonra börülceyi ekleyerek 4-5 dakika kavurun ve\n" +
                        " domatesleri ekleyin.\n" +
                        "\n" +
                        "Son olarak suyu, tuzu ve karabiberi ekleyip, kapağı kapalı bir şekilde ve \n" +
                        "orta ateşte 20 dakika (suyunu çekene kadar) pişirin ve afiyetle tüketin.");
                uyariPenceresi210.show();
            }
        });
        Button button280 = findViewById(R.id.button280);
        button280.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi220= new AlertDialog.Builder(Turk.this);
                uyariPenceresi220.setTitle("Püf Noktaları");
                uyariPenceresi220.setMessage("- Börülceleriniz çok taze değilse az su salacaklarından \n" +
                        "daha fazla su ilavesi ve daha uzun süre pişirilmesi gerekecektir.");
                uyariPenceresi220.show();
            }
        });
        Button button290 = findViewById(R.id.button290);
        button290.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi230= new AlertDialog.Builder(Turk.this);
                uyariPenceresi230.setTitle("Kaç Kalori?");
                uyariPenceresi230.setMessage("- 1 porsiyon (180 gr) : 188 kalori.");
                uyariPenceresi230.show();
            }
        });
        Button button300 = findViewById(R.id.button300);
        button300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi240= new AlertDialog.Builder(Turk.this);
                uyariPenceresi240.setTitle("Malzemeler");
                uyariPenceresi240.setMessage("-600 gramtaze fasulye\n" +
                        "\n" +
                        "-5 yemek kaşığızeytinyağı\n" +
                        "\n" +
                        "-1 adetbüyük boy kuru soğan\n " +
                        "\n" +
                        "-2 dişsarımsak\n " +
                        "\n" +
                        "-3 adetorta boy domates (etli ve sulu)\n " +
                        "\n" +
                        "-1 su bardağısıcak su\n " +
                        "\n" +
                        "-1 tatlı kaşığıtoz şeker\n " +
                        "\n" +
                        "-2 çay kaşığıtuz");
                uyariPenceresi240.show();
            }
        });
        Button button310 = findViewById(R.id.button310);
        button310.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi250= new AlertDialog.Builder(Turk.this);
                uyariPenceresi250.setTitle("Nasıl Yapılır?");
                uyariPenceresi250.setMessage("-Kuru soğanları küçük küpler halinde kesin. \n " +
                        "-Sarımsakları ince ince dilimleyin. Domatesleri rendeleyin.\n" +
                        "-Fasulyeleri de ayıklayarak bir köşeye alın.5 yemek kaşığı zeytinyağını\n" +
                        " bir tencerede kızdırın.\n" +
                        "-Doğradığınız 1 adet büyük boy kuru soğan ve 2 diş doğranmış sarımsakları\n" +
                        " hafif bir renk alana kadar kavurun.\n" +
                        "-600 gram doğranmış taze fasulyeyi de ekleyerek kavurma işlemini sürdürün.\n" +
                        "-2 çay kaşığı tuz, 1 tatlı kaşığı toz şeker, 3 adet rendelenmiş domates ve \n" +
                        "-1 su bardağı sıcak suyu da ekledikten sonra güzelce karıştırın.\n" +
                        "-Kapağını kapatıp fasulyeler yumuşayana kadar kısık ateşte pişirmeye bırakın.\n" +
                        "-Arzuya göre ılık, fakat daha da lezzetli olması için soğuk olarak servis edin.\n\n\n" +
                        " Afiyet olsun!");
                uyariPenceresi250.show();
            }
        });
        Button button320 = findViewById(R.id.button320);
        button320.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi260= new AlertDialog.Builder(Turk.this);
                uyariPenceresi260.setTitle("Püf Noktaları");
                uyariPenceresi260.setMessage("- Seçmiş olduğunuz taze fasulye cinsine göre pişirme\n" +
                        " süresi azalıp artabilir. Bol miktarda etli ve sulu rendelenmiş domates\n" +
                        " kullanırsanız sıcak su eklemeden de taze fasulye yemeği pişirebilirsiniz.\n" +
                        " Zeytinyağlı yemeklerde, sebzelerin üzerine yağlı kağıt kapatarak pişirme\n" +
                        " işlemini gerçekleştirirseniz; besin ve renk değerlerini kaybetmezler.\n ");
                uyariPenceresi260.show();
            }
        });
        Button button330 = findViewById(R.id.button330);
        button330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi270= new AlertDialog.Builder(Turk.this);
                uyariPenceresi270.setTitle("Kaç Kalori?");
                uyariPenceresi270.setMessage("- 100gr taze fasulye 31.3 kalori.\n ");
                uyariPenceresi270.show();
            }
        });
        Button button340 = findViewById(R.id.button340);
        button340.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi280= new AlertDialog.Builder(Turk.this);
                uyariPenceresi280.setTitle("Malzemeler");
                uyariPenceresi280.setMessage("- 3 adetkabak\n" +
                        "- 2 adetyumurta(çırpılmış)\n" +
                        "- 1 adethavuç\n" +
                        "- 3 kahve fincanıun\n" +
                        "- 1 demettaze soğan\n" +
                        "- 1 demetdereotu\n" +
                        "- 1 tatlı kaşığıtuz\n" +
                        "- 1 çay kaşığı karabiber");
                uyariPenceresi280.show();
            }
        });
        Button button350 = findViewById(R.id.button350);
        button350.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi290= new AlertDialog.Builder(Turk.this);
                uyariPenceresi290.setTitle("Nasıl Yapılır?");
                uyariPenceresi290.setMessage("-Bol suda yıkadığınız kabakları rendenin iri kısmıyla\n " +
                        "rendeleyin.\n" +
                        "\n" +
                        "Mücveri sulandırmaması için; rendelenmiş kabakların suyunu sıkarak çıkartın.\n" +
                        "\n" +
                        "Geniş bir kapta rendelenen kabakları, havucu, 2 adet çırpılmış yumurtayı,\n" +
                        " 1 demet taze soğanı, 1 demet dereotunu, 1 tatlı kaşığı tuzu, karabiberi ve\n" +
                        " 3 kahve fincanı unu birleştirin.\n" +
                        "\n" +
                        "Tüm malzemeler birbiriyle harmanlanıp, macun kıvamını alana kadar spatula\n" +
                        " yardımıyla karıştırın.\n" +
                        "\n" +
                        "Her bir mücver 1 tepeleme yemek kaşığı olacak şekilde ayarlayın.\n" +
                        "\n" +
                        "Kızgın yağda altın sarısı rengini alana kadar kızartın.\n" +
                        "\n" +
                        "Mücverlerin fazla yağını havlu kağıda süzdürdükten sonra servis tabağına\n" +
                        " alın ve çırpılmış yoğurt ile servis edin.\n" +
                        "\n");
                uyariPenceresi290.show();
            }
        });
        Button button360 = findViewById(R.id.button360);
        button360.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi300= new AlertDialog.Builder(Turk.this);
                uyariPenceresi300.setTitle("Püf Noktaları");
                uyariPenceresi300.setMessage("- Mücverleri, derin yağda fritözde de kızartabilirsiniz.\n" +
                        " Mücver harcının un miktarını biraz daha artırıp, fırında kek gibi de\n" +
                        " pişirebilirsiniz. Ayrıca kaşıkla yağlı kağıt üzerine hafif yayarak da \n" +
                        "fırınlayabilirsiniz.");
                uyariPenceresi300.show();
            }
        });
        Button button370 = findViewById(R.id.button370);
        button370.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi310= new AlertDialog.Builder(Turk.this);
                uyariPenceresi310.setTitle("Kaç Kalori?");
                uyariPenceresi310.setMessage("- 100gr mucver 62 kalori.\n ");
                uyariPenceresi310.show();
            }
        });
    }
}