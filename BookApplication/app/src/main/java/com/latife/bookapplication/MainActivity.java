package com.latife.bookapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;


import com.latife.bookapplication.databinding.ActivityDetailsBinding;
import com.latife.bookapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<Bookapp>BooksArrayList;

    private ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        BooksArrayList= new ArrayList<>();

        Bookapp f= new Bookapp("Fahrenheit 451","\t\tBir itfaiye eri olan Guy Montag, işini severek yapmaktadır. Fakat itfaiyecilerin görevi yangın söndürmek değil yangın başlatmaktır. Zaman idrak edilemeyecek kadar hızlı bir şekilde akarken Montag, 17 yaşındaki komşusu Clarisse McClellan ile tanışır. Genç kız ile sohbet ettikçe Montag, içinde bulunduğu ideolojiyi, eşini, işini, var olan düzeni sorgulamaya başlar. Kitaplar neden yakılıyor? Düşünmek, sorgulamak neden yasak? Olaylar hızlı bir şekilde gelişir ve Montag'ın sorularına yönelik cevapları arama serüveni başlar...",R.drawable.fahre);
        Bookapp k= new Bookapp("Küçük Prens","\t\tKüçük Prens, kendi galaksisinde, kendi dünyasında tek bir gül ile yaşayan bir Küçük Prens'in başka galaksileri gezmek için tek gülünü tek başına bırakıp yolculuk yapmasını anlatır. Ancak bu yolculuk esnasında vurgulamak istediği şey 'büyümek'tir. İnsanların yaş aldıkça, büyüdükçe insani ve temel değerlerden uzaklaşmalarını, hatta yozlaşmalarını masum Küçük Prens'in gözlerinden bize aktarır.", R.drawable.kucuk);
        Bookapp b= new Bookapp("1984","\t\t2. Dünya Savaşı’ndan sonra yeniden kurulan bir dünyanın 1984 yılını anlatan romanda Winston Smith’in sisteme karşı kendi içinde ayaklanmasını ve bu ayaklanma için destek arayışını görmekteyiz. Winston Smith’in bu arayış içerisinde güvendiği kişilerin, en başından bu yana sistemin savunucusu olması ve Winston Smith’in tuzağa çekilmesi sonucu türlü işkenceler ile Winston Smith’i de sisteme ayak uyduran ve sistemden memnun olan birine dönüştürülmesi ile karşı karşıya kalırız.", R.drawable.bin);
        Bookapp i= new Bookapp("İnsancıklar","\t\tMakar çok saf, çok temiz yürekli, fakir bir katiptir. Uzak bir akrabadan yetim kalan ve bazı kötü olayları yaşamış olan Varvara Alekseyevna’ya yardım etmeye çalışır.Çok üzüldüğü Varvara’ya bakmaya çalışan Makar, ona aşık olur, ancak kendisine aşık olduğunu itiraf edememiştir. Fakat yardıma muhtaçken Varvara’nın mali sorunlarını çözmek için elinden gelen tüm imkanları harcamaya başlar. Ancak, Varvara sonunda zengin bir adam bulup, evlenmeye karar verir.",R.drawable.insan);
        Bookapp a= new Bookapp("Anna Karenina","\t\tRusya’da geçen trajik bir aşk hikayesidir.  Zeki, kültürlü bir kadın olan Anna’nın mutsuz evliliğinden sonra aşık olduğu yasak aşkı ile başına gelenleri anlatmaktadır. Romanda buna benzer farklı hikayeler olsa da Anna kadar cesaret ve aşkını anlatmaya yeltenecek kadar cesaretli olan kimseler yoktur.Başlangıç: (Bütün mutlu aileler birbirine benzer; her mutsuz aileninse kendine özgü bir mutsuzluğu vardır.)",R.drawable.anna);
        Bookapp d= new Bookapp("Dava", "\t\tBir sabah ansızın tutuklandığını; ama normal yaşamına devam edebileceğini öğrenen Josef K., neyle suçlandığı bildirilmediği için önce bunu bir şaka sansa da, kısa sürede durumun ciddiyetini kavrar. Ancak ne mahkemeye çıkarılır ne de savcılarla görüşebilir. Çalıştığı bankada, kaldığı pansiyonda, gittiği yerlerde herkes, anlaşılmaz bir biçimde bu davadan haberdardır. Kaderin bir tür oyunuyla sürüklenir durur, savunma gücü yoktur, bir hiçtir o.Yavaş yavaş bir saplantı haline getirdiği davasıyla arasında hiçbir aracı bulunmadığını, kaçınılmaz bir biçimde bu davanın tam merkezinde kendisinin yer aldığını anladığında ise, cezasını beklemeye başlar.",R.drawable.dava);
        Bookapp w= new Bookapp("Don Kişot","\t\tLa Mancha eyaletinde yaşayan 50’li yaşlarında bir aristokrat olan Alonso Quijano, şövalye kitaplarına takıntılıdır. O kadar çok okur ki sonunda delirir. Ama sadece şövalye meselelerinde delirir ve diğer meselelerde son derece zeki bir asilzadedir. Quijano, şövalyenin kitaplarını okuyarak öykünür. Dedesinden kalan zırh, kılıç vb. aletleri temizler, kendisi gibi sıska olan atını eyerler ve yola çıkar. Sonra komşusu Sancho Panza’yı vali yapma sözü vererek kandırır ve kendini yaver yapar. Bir köylü kızının sevgilisi olduğunu söyler. Ve her şeyi bırakıp yola çıkar.",R.drawable.donkisot);
        Bookapp h= new Bookapp("Hayvan Çiftliği","\t\tFabl türünde yazılmış bir romandır. Amacı Rusya’da yaşanan Sosyalist devrimine gönderme yapmaktır. Bu yüzden iğneleyici ve sivri bir dil ile alay edilmiştir. Yazar George Orwell da sosyalist olmasına rağmen hikayesini bunun üzerine kurgulamıştır. Olaylar İngiltere’de bir çiftlikte insanların kurduğu sisteme karşı gelip, daha eşit bir hayat için hayvanlar isyan edip başkaldırır. Eşitlikçi bir toplumu hedeflerken, çiftlikteki domuzların bu yoldan sapıp insanlardan daha acımasız ve diktatör bir düzen kurması işlerin gidişatını değiştirir.",R.drawable.hayvan);
        Bookapp s= new Bookapp("Kürk Mantolu Madonna","\t\tRoman kahramanı bankada çalıştığı işinden atılır ve yeni bir iş aramaya koyulur. Bu sırada okul arkadaşı ona kendi işyerinde bir iş verir ve bu işyerinde Raif isimli çok konuşmayan bir adamla tanışır. Kahramanımız Raif’i tanıdıkça aslında geçmişinin oldukça gizemli olduğunu öğrenir.Roman Almanya’da bir kadına tutkuyla aşık olan bir adamın hüzünlü öyküsünü anlatmaktadır.",R.drawable.kurk);
        Bookapp e= new Bookapp("Sefiller","\t\tRomanda Fransız halkının o dönemde yaşamış oldukları sefaleti ve bunun sonucunda yaşanan siyasi çalkantılar anlatılıyor. Kesişen hayatların birbirleri üzerindeki etkileri, yanlış kararların insan hayatının ne denli seyrini değiştirdiği yazar tarafından ustalıkla işlenmiştir.",R.drawable.sefille);
        Bookapp y= new Bookapp("Şeker Portakalı","\t\tBüyük acılar yaşamak zorunda kalan bir çocuğun olgunlaşma öyküsü anlatılır. Ailesinde tamamlayamadığı sevgi açlığını başka şeylerde tamamlamaya çalışır ancak hep eksik kalır.",R.drawable.seker);
        Bookapp l= new Bookapp("Sol Ayağım","\t\tSol ayağım kitabının konusu kitabı yazan Christy Brown isimli yazarın kendi otobiyografisidir. Christy Brown bir beyin felci geçirmesi sebebiyle sadece vücudunun sol ayağının işlevde kalması ve hayatını sol ayağı ile azim, cesaret ile olağanüstü yaşam savaşını anlatmaktadır. Sol ayak parmaklarının sadece işlevsel olması ve buna rağmen hayatını tek başına idame ettirebilmenin başarısını yazar bu kitabında işlemiştir.",R.drawable.sol);
        Bookapp p= new Bookapp("Suç ve Ceza","\t\tDünya klasikleri arasında yer alan yapıt toplumsal kötülüklerin sebeplerini ortaya koyarken kötülükleri yapanların cezalarını çekmesi gerektiğini anlatır.\r\tSuç ve Ceza; Rodion Romanoviç Raskolnikov adındaki bir gencin işlediği çifte cinayet üzerine yaşadıklarını konu alan kitap, Tefeci kadını öldürüp mücevherleri alır ancak işlediği cinayete kimsenin tanıklık etmemesi için onun kız kardeşini de öldürmek zorunda kalır.",R.drawable.suc);



        BooksArrayList.add(f);
        BooksArrayList.add(k);
        BooksArrayList.add(b);
        BooksArrayList.add(i);
        BooksArrayList.add(a);
        BooksArrayList.add(d);
        BooksArrayList.add(w);
        BooksArrayList.add(h);
        BooksArrayList.add(s);
        BooksArrayList.add(e);
        BooksArrayList.add(y);
        BooksArrayList.add(l);
        BooksArrayList.add(p);


        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);
        BookappAdapter bookappAdapter=new BookappAdapter(BooksArrayList);
        binding.recyclerView.setAdapter(bookappAdapter);



    }
}