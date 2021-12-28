package com.example.deliciousapp;

        import androidx.appcompat.app.AlertDialog;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class Diyabet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diyabet);
        Button button107 = findViewById(R.id.button107);
        button107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iii = new Intent(getApplicationContext(), com.example.deliciousapp.Menu.class);
                startActivity(iii);
            }
        });
        Button button26 = findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi20= new AlertDialog.Builder(Diyabet.this);
                uyariPenceresi20.setTitle("Malzemeler");
                uyariPenceresi20.setMessage("- 600 gram bal kabağı\n" +
                        "- 1,5 su bardağı su\n" +
                        "-------------------------------------------\n" +
                        "Servisi için:\n" +
                        "- 50 gram ceviz içi\n" +
                        "- 4 tatlı kaşığı agave şurubu");
                uyariPenceresi20.show();
            }
        });
        Button button27 = findViewById(R.id.button27);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi21= new AlertDialog.Builder(Diyabet.this);
                uyariPenceresi21.setTitle("Nasıl Yapılır?");
                uyariPenceresi21.setMessage("- Dilimlenmiş bal kabaklarının kabuklarını soyun. Yeşil " +
                        "kısımlarını kullanmamaya özen gösterin.\n" +
                        "- Dilimlenmiş kabakları fırın poşetine yerleştirin. Yaklaşık 1,5 su bardağı suyu " +
                        "fırın poşetine aktarın. Kabakların üzerini geçmemesine dikkat edin.\n" +
                        "- Fırın poşetini sıkıca bağlayın. Üzerine kürdan yardımıyla birkaç delik açın.\n" +
                        "- Önceden ısıtılmış 180 derece fırında kabaklar yumuşayıp, esmerleşene kadar " +
                        "yaklaşık 40 dakika pişirin.\n" +
                        "- Pişen bal kabaklarını servis tabağına alın, soğumadan üzerine agave şurubu " +
                        "gezdirin.\n" +
                        "- Ceviz içlerini iri parçalar halinde üzerine serpiştirdikten sonra bekletmeden " +
                        "servis edin. Sevdiklerinizle paylaşın.");
                uyariPenceresi21.show();
            }
        });
        Button button28 = findViewById(R.id.button28);
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi22= new AlertDialog.Builder(Diyabet.this);
                uyariPenceresi22.setTitle("Püf Noktaları");
                uyariPenceresi22.setMessage("- Fırın poşeti içerisindeki su miktarı, yaklaşık bir " +
                        "parmak kalınlığında olmalıdır.");
                uyariPenceresi22.show();
            }
        });
        Button button29 = findViewById(R.id.button29);
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi23= new AlertDialog.Builder(Diyabet.this);
                uyariPenceresi23.setTitle("Kaç Kalori?");
                uyariPenceresi23.setMessage("- 1 porsiyon (60 gr) cevizli kabak tatlısı: 294 kalori. " +
                        "1 porsiyon tatlandırıcılı şekersiz kabak tatlısı: 94 kalori.");
                uyariPenceresi23.show();
            }
        });
        Button button30 = findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi24= new AlertDialog.Builder(Diyabet.this);
                uyariPenceresi24.setTitle("Malzemeler");
                uyariPenceresi24.setMessage("- 250 gram yoğurt\n" +
                        "- 5 yemek kaşığı bal\n" +
                        "- 1/2 su bardağı kırmızı meyveler(böğürtlen, yaban mersini, frambuaz)\n" +
                        "- 4 yemek kaşığı yulaf\n" +
                        "- 2 yemek kaşığı antep fıstığı içi(iri kıyılmış ve tuzsuz)");
                uyariPenceresi24.show();
            }
        });
        Button button31 = findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi25= new AlertDialog.Builder(Diyabet.this);
                uyariPenceresi25.setTitle("Nasıl Yapılır?");
                uyariPenceresi25.setMessage("- Yoğurt ve balı bir kapta güzelce karıştırın.\n" +
                        "- Yoğurt-bal karışımını pişirme kağıdı serdiğiniz 20 x 30cm'lik düz tepsiye yayın.\n" +
                        "- Üzerine meyveleri, yulafı ve iri parçalanmış Antep fıstıklarını serpin.\n" +
                        "- Karışımı en az 5 saat dondurucuda bekletin.\n" +
                        "- Yeterince dondurduktan sonra keskin bir bıçak yardımıyla üçgen şeklinde kesin ve " +
                        "bekletmeden afiyetle tüketin.");
                uyariPenceresi25.show();
            }
        });
        Button button32 = findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi26= new AlertDialog.Builder(Diyabet.this);
                uyariPenceresi26.setTitle("Püf Noktaları");
                uyariPenceresi26.setMessage("- Yoğurdun taze olmasına dikkat edin.\n " +
                        "- Servis etmeden önce iyice dondurun.\n ");
                uyariPenceresi26.show();
            }
        });
        Button button33 = findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi27= new AlertDialog.Builder(Diyabet.this);
                uyariPenceresi27.setTitle("Kaç Kalori?");
                uyariPenceresi27.setMessage("- Bu yemek 5 malzeme ile yapılır. Bu yemeğin 100 gramı\n  " +
                        "108.7 kalori ihtiva eder. 1 porsiyonu ise 75.0 gram olup 81.5 kalori içermektedir. \n " +
                        "Bu yemek Kalsiyum, Protein, Karbonhidrat yönünden zengindir.\n ");
                uyariPenceresi27.show();
            }
        });
        Button button34 = findViewById(R.id.button34);
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi28= new AlertDialog.Builder(Diyabet.this);
                uyariPenceresi28.setTitle("Malzemeler");
                uyariPenceresi28.setMessage("- 1 su bardağı + 2 yemek kaşığı tam buğday unu\n" +
                        "-Yarım çay bardağı pekmez\n" +
                        "-3 adet yumurta\n" +
                        "-1 çay bardağı süt\n" +
                        "-Tarçın, ceviz, kuru üzüm, yaban mersini (istediğiniz malzemelerden de koyabilirsiniz)\n" +
                        "-1 paket kabartma tozu)");
                uyariPenceresi28.show();
            }
        });
        Button button35 = findViewById(R.id.button35);
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi29= new AlertDialog.Builder(Diyabet.this);
                uyariPenceresi29.setTitle("Nasıl Yapılır?");
                uyariPenceresi29.setMessage("- Yumurta karıştırma kabına alınır ve çırpılmaya başlanır.\n" +
                        "-Daha sonra pekmez eklenir ve karıştırılmaya devam edilir.\n" +
                        "-Daha sonra süt eklenir, karıştırılır.\n" +
                        "-Karıştırılmaya devam ederken, un ve kabartma tozu eklenir.\n" +
                        "-Kek hamuru kıvam alınca; tarçın, kuru üzüm, ceviz ve yaban mersini eklenir.\n" +
                        "-Pişirme kabına alınır ve fırına verilir. 180 derecede pişirilir.");
                uyariPenceresi29.show();
            }
        });
        Button button36 = findViewById(R.id.button36);
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi30= new AlertDialog.Builder(Diyabet.this);
                uyariPenceresi30.setTitle("Püf Noktaları");
                uyariPenceresi30.setMessage("- Fırını önden ısıtın. ");
                uyariPenceresi30.show();
            }
        });
        Button button37 = findViewById(R.id.button37);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi31= new AlertDialog.Builder(Diyabet.this);
                uyariPenceresi31.setTitle("Kaç Kalori?");
                uyariPenceresi31.setMessage("- Bu kek 3004 kcal'dir.\n ");
                uyariPenceresi31.show();
            }
        });
        Button button38 = findViewById(R.id.button38);
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi32= new AlertDialog.Builder(Diyabet.this);
                uyariPenceresi32.setTitle("Malzemeler");
                uyariPenceresi32.setMessage("- Yarım su bardağından biraz fazla pudra şekeri\n" +
                        "-1 su bardağı sıvı yağ\n" +
                        "-2,5 su bardağı un");
                uyariPenceresi32.show();
            }
        });
        Button button39 = findViewById(R.id.button39);
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi33= new AlertDialog.Builder(Diyabet.this);
                uyariPenceresi33.setTitle("Nasıl Yapılır?");
                uyariPenceresi33.setMessage("-Yoğurma kabımıza pudra şekeri, sıvı yağ ve unun bir\n " +
                        "kısmını alarak malzemelerimizi birbiri ile özleşene kadar karıştıralım.\n" +
                        "-Unu yavaş yavaş ilave ederek malzemelerimizi karıştıralım. Hamurumuz el ile\n " +
                        "yoğurma kıvamına gelene kadar karıştırmaya devam edelim.\n" +
                        "-Kıvam almaya başlayan hamurumuza biraz daha un ilave ederek elimizle\n " +
                        "yoğurmaya başlayalım.\n" +
                        "-Hazır olan hamurumuzdan parçalar alarak elimizle yuvarlayarak şekil verelim\n" +
                        " ve pişirme kağıdı serdiğimiz fırın tepsimize alalım. Bu ölçüler ile\n" +
                        " yaptığınızda 20 adet kurabiye elde edebilirsiniz.\n" +
                        "-Ardından kurabiyelerimizin üzerine tel çırpıcının en küçüğünün ucu ile\n" +
                        " bastırarak şekil verelim.\n" +
                        "-Daha sonra kurabiyelerimizi önceden ısıttığımız 160°C fırında yaklaşık\n" +
                        " 15 dakika kadar pişmeye bırakalım. Kurabiyelerimizin üzerinin beyaz \n" +
                        "kalmasına dikkat edelim.\n" +
                        "-Pişen kurabiyelerimizi fırından alalım ve soğumaya bırakalım.\n" +
                        "-Soğuduktan sonra üzerine pudra şekeri serperek servis edelim. Afiyet olsun.\n");
                uyariPenceresi33.show();
            }
        });
        Button button40= findViewById(R.id.button40);
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi34= new AlertDialog.Builder(Diyabet.this);
                uyariPenceresi34.setTitle("Püf Noktaları");
                uyariPenceresi34.setMessage("- Malzemelerin taze olduğuna dikkat edin. ");
                uyariPenceresi34.show();
            }
        });
        Button button41 = findViewById(R.id.button41);
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi35= new AlertDialog.Builder(Diyabet.this);
                uyariPenceresi35.setTitle("Kaç Kalori?");
                uyariPenceresi35.setMessage("- 100gramı 400 kalori.\n ");
                uyariPenceresi35.show();
            }
        });
        Button button42 = findViewById(R.id.button42);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi36= new AlertDialog.Builder(Diyabet.this);
                uyariPenceresi36.setTitle("Malzemeler");
                uyariPenceresi36.setMessage("- 1 litresüt\n" +
                        "-13 adetkuru incir\n" +
                        "-1 çay kaşığıtarçın\n" +
                        "-Üzeri için:\n" +
                        "-20 gramceviz içi\n" +
                        "-20 gramantep fıstığı içi");
                uyariPenceresi36.show();
            }
        });
        Button button43 = findViewById(R.id.button43);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi37= new AlertDialog.Builder(Diyabet.this);
                uyariPenceresi37.setTitle("Nasıl Yapılır?");
                uyariPenceresi37.setMessage("-Kuru incirleri sıcak suyun içinde yaklaşık 10 dakika kadar bekletin.\n" +
                        "\n" +
                        "Kuru incirleri suyun içinden çıkarın ve sap kısımlarını dahil etmeden minik küpler halinde doğrayın.\n" +
                        "\n" +
                        "Sütü orta boy bir tencerenin içine alın.\n" +
                        "\n" +
                        "Kaynama noktasına gelene kadar ısıtın. Ama kaynatmamaya özen gösterin.\n" +
                        "\n" +
                        "Bir kabın içine doğranmış incirleri, ısıtılmış sütü ve tarçını ilave edin ve karıştırın.\n" +
                        "\n" +
                        "Kabın ağzını kapatarak oda sıcaklığında yaklaşık 20 dakika bekletin.\n" +
                        "\n" +
                        "İncirlerin şiştiğini gözlemleyeceksiniz. İncirler şiştiğinde el blenderı ile tüm malzemeleri ezerek karıştırın.\n" +
                        "\n" +
                        "Ağzını yeniden kapatarak oda sıcaklığında yaklaşık 30 dakika kadar bekletin.\n" +
                        "\n" +
                        "Ardından dolapta 2 saat kadar dinlendirin.\n" +
                        "\n" +
                        "Çıkarıp üzerini süsleyerek afiyetle tüketin.");
                uyariPenceresi37.show();
            }
        });
        Button button44= findViewById(R.id.button44);
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi38= new AlertDialog.Builder(Diyabet.this);
                uyariPenceresi38.setTitle("Püf Noktaları");
                uyariPenceresi38.setMessage("-İçerisine yenibahar, muskat, zencefil gibi farklı\n" +
                        "baharatlar ilave edebilirsiniz.\n" +
                        "-Üzerini Antep fıstığı, ceviz ya da dilediğiniz başka baharatlarla \n" +
                        "süsleyerek servis edebilirsiniz.");
                uyariPenceresi38.show();
            }
        });
        Button button45 = findViewById(R.id.button45);
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi39= new AlertDialog.Builder(Diyabet.this);
                uyariPenceresi39.setTitle("Kaç Kalori?");
                uyariPenceresi39.setMessage("-346 kalori.\n ");
                uyariPenceresi39.show();
            }
        });
    }
}