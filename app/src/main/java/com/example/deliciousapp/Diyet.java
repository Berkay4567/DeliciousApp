package com.example.deliciousapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
public class Diyet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_diyet);
        Button button106 = findViewById(R.id.button106);
        button106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iii = new Intent(getApplicationContext(), com.example.deliciousapp.Menu.class);
                startActivity(iii);
            }
        });
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi= new AlertDialog.Builder(Diyet.this);
                uyariPenceresi.setTitle("Malzemeler");
                uyariPenceresi.setMessage("- 1 su bardağı nohut\n" +
                        "- 5 su bardağı sıcak su\n" +
                        "- 1 su bardağı et ya da tavuk suyu\n" +
                        "- Tuz\n" +
                        "- 1 su bardağı kepekli erişte\n" +
                        "- 1 su bardağı light yoğurt\n" +
                        "- 1 yemek kaşığı tam buğday unu\n" +
                        "- 2 tatlı kaşığı tereyağı\n" +
                        "- 1 yemek kaşığı kuru nane");
                uyariPenceresi.show();
            }
        });
        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi1= new AlertDialog.Builder(Diyet.this);
                uyariPenceresi1.setTitle("Nasıl Yapılır?");
                uyariPenceresi1.setMessage("- Nohutları bol suyla yıkayıp suyunu süzün. Üzerine su ekleyip 1 gece bekletin. Suyunu değiştirip yumuşayıncaya kadar haşlayın.\n" +
                        "- Su ve et suyunu kaynamaya bırakın. Tuz ve erişteleri ekleyerek yumuşayıncaya kadar pişirin. Nohutları ekleyin ve 15 dakika daha pişirin.\n" +
                        "- Bir kasede yoğurt ve unu iyice karıştırın. Çorbanın suyundan 1 kepçe kadar ekleyerek çırpın ve bunu çorbaya yavaş yavaş ekleyerek karıştırın.\n" +
                        "- 15 dakika pişirin. Ayrı bir tavada tereyağını eritip nane ile karıştırın ve çorbaya ekleyin.\n" +
                        "- Yoğurt çorbasını, klasik köfte ve patates salatası ile birlikte servis edebilirsiniz. Şimdiden afiyet olsun.");
                uyariPenceresi1.show();
            }
        });
        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi2= new AlertDialog.Builder(Diyet.this);
                uyariPenceresi2.setTitle("Püf Noktaları");
                uyariPenceresi2.setMessage("- Tarifte kullanacağınız yoğurdun ev yapımı veya süzme olmasına özen gösterin.\n" +
                        "- Yoğurtlu karışımı mikser ile çırpın ve tencereye yavaş yavaş ekleyin. Böylece kesilmesini önleyebilirsiniz.\n" +
                        "- Topaklanmalar oluşmaması için çorbayı sürekli karıştırın.\n" +
                        "- Sosu, çorbayı servis edeceğiniz zaman hazırlayın ve ılık çorbanın üzerine dökün");
                uyariPenceresi2.show();
            }
        });
        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi3= new AlertDialog.Builder(Diyet.this);
                uyariPenceresi3.setTitle("Kaç Kalori?");
                uyariPenceresi3.setMessage("- Bir kepçe erişteli yoğurt çorbası, yaklaşık 80 kaloridir. " +
                        "Kalsiyum, B vitamini ve fosfor değeri yüksek olan bu tarifi, diyet listelerine " +
                        "ekleyebilirsiniz. Bağışıklığı güçlendirmesi için, haftada bir kez tüketilmesi önerilir.");
                uyariPenceresi3.show();
            }
        });
        Button button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi4= new AlertDialog.Builder(Diyet.this);
                uyariPenceresi4.setTitle("Malzemeler");
                uyariPenceresi4.setMessage("- 1 kg kereviz\n" +
                        "- 2 patates\n" +
                        "- 1 havuç\n" +
                        "- 1 su bardağı bezelye\n" +
                        "- 1 soğan\n" +
                        "- Zeytinyağı\n" +
                        "- 1 portakal\n" +
                        "- 1 limon\n" +
                        "- 1 tatlı kaşığı toz şeker\n" +
                        "- Tuz");
                uyariPenceresi4.show();
            }
        });
        Button button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi5= new AlertDialog.Builder(Diyet.this);
                uyariPenceresi5.setTitle("Nasıl Yapılır?");
                uyariPenceresi5.setMessage("- İlk olarak kerevizin kabuğunu soyun, sap kısımlarını kesin ve ortadan ikiye ayırın.\n" +
                        "- Kerevizlerin kararmasını önlemek için, limonlu suda bekletin.\n" +
                        "- Bu esnada bezelyeleri haşlayın. Soğan, patates ve havuçları küp küp doğrayın.\n" +
                        "- Bir tencereye zeytinyağı ekleyin ve soğanları alarak kavurun.\n" +
                        "- Soğanlar pembeleşmeye başladığında patates ve havucu da üzerine ekleyin.\n" +
                        "- Kerevizlerin orta kısmını oyacak yardımıyla oyun ve bu kısımları da harca atın.\n" +
                        "- Kerevizlerin içini patatesli harç ile doldurun ve hazırladığınız kerevizleri başka tencereye yerleştirin.\n" +
                        "- Üzerine 2 çay bardağı sıcak su, 1 adet portakalın suyu ve 1 limonun suyunu ekleyin.\n" +
                        "- 1 tatlı kaşığı şeker, karabiber ve tuz ekleyerek kerevizler yumuşayana kadar pişirin.");
                uyariPenceresi5.show();
            }
        });
        Button button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi6= new AlertDialog.Builder(Diyet.this);
                uyariPenceresi6.setTitle("Püf Noktaları");
                uyariPenceresi6.setMessage("- Kerevizleri en az 15 dakika limonlu suda bekletin.\n" +
                        "- Kerevizleri uygun ölçüde soyabilmek için, kereviz nasıl temizlenir yazımızdan yararlanabilirsiniz.\n" +
                        "- Portakalın kabuğunu rendeleyerek patatesli harcın içerisine ekleyebilirsiniz.\n" +
                        "- Zeytinyağlı yemeklerde 1 tatlı kaşığı şeker kullanmayı unutmayın.");
                uyariPenceresi6.show();
            }
        });
        Button button13 = findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi7= new AlertDialog.Builder(Diyet.this);
                uyariPenceresi7.setTitle("Kaç Kalori?");
                uyariPenceresi7.setMessage("- İçerdiği zeytinyağı nedeniyle bir porsiyon (orta boy " +
                        "tabak 422 gram) kereviz, 220 kaloridir. 200 gram zeytinyağlı kereviz yemeğinde " +
                        "104 kalori bulunur. Buna 1 tane portakal (47 kalori) eklediğimizde 151 kalori olur.");
                uyariPenceresi7.show();
            }
        });
        Button button14 = findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi8= new AlertDialog.Builder(Diyet.this);
                uyariPenceresi8.setTitle("Malzemeler");
                uyariPenceresi8.setMessage("- 3 yemek kaşığı pilavlık bulgur\n" +
                        "- 1 demet semizotu\n" +
                        "- 1 soğan\n" +
                        "- 3 yemek kaşığı zeytinyağı\n" +
                        "- 1 tatlı kaşığı biber salçası\n" +
                        "- 1 tatlı kaşığı domates salçası\n" +
                        "- 1 çay bardağı sıcak su\n" +
                        "- Tuz\n" +
                        "- Kırmızı pul biber\n"+
"--------------------------------------------------------\n"+
                        "Sunum için\n"+
                "- Sarımsaklı light yoğurt\n" +
                        "- Kırmızı pul biber");

                uyariPenceresi8.show();
            }
        });
        Button button15 = findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi9= new AlertDialog.Builder(Diyet.this);
                uyariPenceresi9.setTitle("Nasıl Yapılır?");
                uyariPenceresi9.setMessage("- İlk olarak bulguru bol suyla yıkayıp suyunu süzün. " +
                        "Soğanı yemeklik doğrayıp zeytinyağında pembeleşinceye kadar kavurun.\n" +
                        "- Ardından salçaları ekleyip kavurmaya devam edin. Yıkanmış ve kökleri temizlenmiş " +
                        "semizotlarını da ilave edin.\n" +
                        "- Üzerine sıcak su ekleyip orta ateşte kaynamaya bırakın. Bulguru ekleyip kapağı" +
                        "kapalı olarak kısık ateşte bulgur yumuşayıncaya kadar pişirin.\n" +
                        "- Tuz ve kırmızı pul biber ekleyip kapağı kapalı olarak 5-10 dakika dinlendirin. " +
                        "Yemeği servis tabağına alıp üzerine sarımsaklı yoğurt gezdirin.\n" +
                        "- Bulgurlu semizotunu; fajita ya da barbunya pilaki ile birlikte servis edebilirsiniz. " +
                        "Şimdiden afiyet olsun.");
                uyariPenceresi9.show();
            }
        });
        Button button16 = findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi10= new AlertDialog.Builder(Diyet.this);
                uyariPenceresi10.setTitle("Püf Noktaları");
                uyariPenceresi10.setMessage("- Semizotunu bıçakla kesmek yerine dallarını elinizle " +
                        "ayırın. Uygun boyutlara getirdikten sonra bol su ile durulayabilirsiniz.\n" +
                        "- Semizotunu lezzetlendirmek için, pişirme işleminin sonlarına doğru birkaç " +
                        "damla limon suyu ilave edebilirsiniz.\n" +
                        "- Salça yerine rendelenmiş domates kullanabilirsiniz. Fakat kullanacağınız " +
                        "domatesin sulu ve olgun olmasına özen gösterin.\n" +
                        "- Tarife başlamadan önce bulguru suda geçirin ve süzün. Bu sayede daha çabuk " +
                        "pişmesini sağlayabilirsiniz.");
                uyariPenceresi10.show();
            }
        });
        Button button17 = findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi11= new AlertDialog.Builder(Diyet.this);
                uyariPenceresi11.setTitle("Kaç Kalori?");
                uyariPenceresi11.setMessage("- Standart malzemelerle hazırlanan bulgurlu semizotu, " +
                        "yaklaşık 85 kaloridir. Kolesterol değerini düşüren semizotu tarifini diyet " +
                        "listelerine ekleyebilirsiniz.");
                uyariPenceresi11.show();
            }
        });
        Button button18 = findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi12= new AlertDialog.Builder(Diyet.this);
                uyariPenceresi12.setTitle("Malzemeler");
                uyariPenceresi12.setMessage("- 1 su bardağı kuru fasulye\n" +
                        "- 1 diş sarımsak\n" +
                        "- 2 yemek kaşığı zeytinyağı\n" +
                        "- Tuz\n" +
                        "- Karabiber\n" +
                        "- Kırmızı pul biber");

                uyariPenceresi12.show();
            }
        });
        Button button19 = findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi13= new AlertDialog.Builder(Diyet.this);
                uyariPenceresi13.setTitle("Nasıl Yapılır?");
                uyariPenceresi13.setMessage("- Kuru fasulyeleri bir gece suda bekletin. Bol suyla " +
                        "yıkayıp süzün. Üzerini geçecek kadar su ekleyip haşlayın.\n" +
                        "- Haşlanmış fasulyelerin kabuklarını soyduktan sonra çukur bir kaba alın. " +
                        "El blenderi ile pürüzsüz olmasını sağlayın.\n" +
                        "- Üzerine ince kıyılmış sarımsak, zeytinyağı ve tuz ilave edip karıştırın " +
                        "ve servis tabağına alın. Üzerine pul biber serpin.\n" +
                        "- Kuru fasulye ezmesini, ızgara köfte ile birlikte servis edebilirsiniz. " +
                        "Şimdiden afiyet olsun.");
                uyariPenceresi13.show();
            }
        });
        Button button20 = findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi14= new AlertDialog.Builder(Diyet.this);
                uyariPenceresi14.setTitle("Püf Noktaları");
                uyariPenceresi14.setMessage("- Kuru fasulyelerin daha çabuk pişmesi ve yumuşaması " +
                        "için, mutlaka suda bekletin.\n" +
                        "- Kabuklarını kolay çıkarabilmek için, haşlama işlemini uzun tutun.\n" +
                        "- Sarımsakları doğramak yerine ezmeyi de tercih edebilirsiniz. Böylece daha " +
                        "yoğun bir tat elde edebilirsiniz.\n" +
                        "- Kuru fasulye ezmesini servis etmeden önce, üst kısmını maydanoz ve nane " +
                        "yaprakları ile süsleyebilirsiniz.");
                uyariPenceresi14.show();
            }
        });
        Button button21 = findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi15= new AlertDialog.Builder(Diyet.this);
                uyariPenceresi15.setTitle("Kaç Kalori?");
                uyariPenceresi15.setMessage("- Kuru fasulye ezmesinin bir porsiyonu, yaklaşık 310 kaloridir. " +
                        "İçeriğinde A ve B vitamini barındıran bu tarifi, diyet listelerine ekleyebilirsiniz.");
                uyariPenceresi15.show();
            }
        });
        Button button22 = findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi16= new AlertDialog.Builder(Diyet.this);
                uyariPenceresi16.setTitle("Malzemeler");
                uyariPenceresi16.setMessage("- 1 su bardağı nohut\n" +
                        "- 3 su bardağı buğday\n" +
                        "- 1 su bardağı kuru fasulye\n" +
                        "- 5-6 adet kuru incir\n" +
                        "- 5-6 adet kuru kayısı\n" +
                        "- 1 avuç kuru üzüm\n" +
                        "- 1 portakal rendesi\n" +
                        "- 2-3 adet karanfil\n" +
                        "- 1 çubuk tarçın\n" +
                        "- 1.5 su bardağı süt\n" +
                        "- 2 çay bardağı çam balı\n" +
                        "-----------------------------------------------------------\n" +
                        "Üzeri için:\n" +
                        "\n" +
                        "- Nar\n" +
                        "- Antep fıstığı\n" +
                        "- Fındık\n" +
                        "- Tarçın");

                uyariPenceresi16.show();
            }
        });
        Button button23 = findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi17= new AlertDialog.Builder(Diyet.this);
                uyariPenceresi17.setTitle("Nasıl Yapılır?");
                uyariPenceresi17.setMessage("- Öncelikle nohut ve kuru fasulyeyi farklı kaplara koyun " +
                        "ve bir gece önceden ıslatın.\n" +
                        "- Buğdayı ise düdüklü tencereye koyun. Buğdayların üzerini 3 parmak geçecek " +
                        "şekilde su ekleyin. \n" +
                        "- Tencereden kaynama sesi geldikten 20 dakika sonra ocaktan alabilirsiniz.\n" +
                        "- Bu işlemleri akşam uyguladıktan sonra, sabah büyük bir tencere alın ve su " +
                        "kaynatın.\n" +
                        "- Kaynayan suyun içerisine haşlanmış buğdayı ekleyin. 15 dakika sonra fasulye " +
                        "ve nohutu da ekleyin.\n" +
                        "- Bu sırada kuru meyveleri yıkayın ve suyun içerisinde bekletin. Kuru meyveleri " +
                        "küçük parçalar halinde doğrayın.\n" +
                        "- 10 dakika boyunca birlikte pişen kuru fasulye, nohut ve buğdayın üzerine " +
                        "doğradığınız kuru meyveleri ilave edin.\n" +
                        "- Karanfil, portakal kabuğu rendesi ve çubuk tarçını da ilave edin.\n" +
                        "- 1-1.5 su bardağı sütü de ekleyin. Ardından çam balını da ekledikten sonra " +
                        "fokurdayana kadar kısık ateşte pişirin.\n" +
                        "- Aralıklı olarak malzemeleri karıştırmayı da unutmayın. Hazırladığınız aşureleri " +
                        "kaselere paylaştırın ve üzerini nar, tarçın ve fıstık ile süsleyin. Afiyet olsun.");
                uyariPenceresi17.show();
            }
        });
        Button button24 = findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi18= new AlertDialog.Builder(Diyet.this);
                uyariPenceresi18.setTitle("Püf Noktaları");
                uyariPenceresi18.setMessage("- Diyet tatlıların içerisine çubuk tarçın kullanmak " +
                        "oldukça önemlidir. Tatlının aromasını arttırır.\n" +
                        "- Kalori değeri en düşük olan bal çeşidi, çam balıdır. Bu nedenle tarifte " +
                        "çam balı kullanın.\n" +
                        "- Aşurenin kıvamı ne çok sıvı, ne de çok koyu olmalıdır. Özellikle sıvıya " +
                        "yakın olması daha önemlidir.\n" +
                        "- Eğer aşure çok koyu olduysa, kenarda beklettiğiniz kaynar sudan ilave " +
                        "ederek yoğunluğunu açabilirsiniz.\n" +
                        "- Verilen ölçülerden ortalama 8-10 kase çıkmaktadır.");
                uyariPenceresi18.show();
            }
        });
        Button button25 = findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder uyariPenceresi19= new AlertDialog.Builder(Diyet.this);
                uyariPenceresi19.setTitle("Kaç Kalori?");
                uyariPenceresi19.setMessage("- Diyet aşurenin bir porsiyonu, yaklaşık 150 kaloridir.");
                uyariPenceresi19.show();
            }
        });
    }
}