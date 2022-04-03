/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obj_finall_project;

/**
 *
 * @author lenovo
 */
class Book 
{
    public String type;
    public String writer;
    public String bookName;
    public int pageNumber;
    public double price;
    
    public String getType() {
     return this.type;
}
    
}
class ArtDesign extends Book
{
    
    public void VenedikTaciri(){
        type="Art-Design";
        bookName="Venedik Taciri";
        writer="William Shakespeare";
        pageNumber=115;
        price=9.10;
    }
    public void RomeoJuliet(){
        type="Art-Design";
        bookName="Romeo ve Juliet";
        writer="William Shakespeare";
        pageNumber=110;
        price=7.80;
    }
    public void Hamlet(){
        type="Art-Design";
        bookName="Venedik Taciri";
        writer="William Shakespeare";
        pageNumber=115;
        price=9.10;
    }
    public void Velazquez(){
        type="Art-Design";
        bookName="Velázquez";
        writer="Susie Hodge";
        pageNumber=256;
        price=97.50;
    }
    public void Raffaello(){
        type="Art-Design";
        bookName="Raffaello";
        writer="Susie Hodge";
        pageNumber=260;
        price=97.50;
    }
    public void Monet(){
        type="Art-Design";
        bookName="Monet";
        writer="Susie Hodge";
        pageNumber=256;
        price=97.50;
    }
    public void Antigone(){
        type="Art-Design";
        bookName="Antigone";
        writer="Sophokles";
        pageNumber=96;
        price=7.80;
    }
    public void Oidipus(){
        type="Art-Design";
        bookName="Kral Oidipus";
        writer="Sophokles";
        pageNumber=56;
        price=9.10;
    }
    public void Elektra(){
        type="Art-Design";
        bookName="Elektra";
        writer="Sophokles";
        pageNumber=57;
        price=7.80;
    }
}
class Literature extends Book
{
    public void SucVeCeza(){
        type="Literature";
        bookName="Suç ve Ceza";
        writer="Dostoyevski";
        pageNumber=688;
        price=29.00;
    }
    public void YerAltindanNotlar(){
        type="Literature";
        bookName="Yer Altından Notlar";
        writer="Dostoyevski";
        pageNumber=140;
        price=9.10;   
    }
    public void KaramozovKardesler(){
        type="Literature";
        bookName="Karamozov Kardeşler";
        writer="Dostoyevski";
        pageNumber=1002;
        price=40.30;
    }
    public void Donusum(){
        type="Literature";
        bookName="Dönüşüm";
        writer="Franz Kafka";
        pageNumber=113;
        price=4.55;
    }
    public void Aforizmalar(){
        type="Literature";
        bookName="Aforizmalar";
        writer="Franz Kafka";
        pageNumber=109;
        price=9.10;
    }
    public void Dava(){
        type="Literature";
        bookName="Dava";
        writer="Franz Kafka";
        pageNumber=224;
        price=17.40;
    }
    public void Serenad(){
        type="Literature";
        bookName="Serenad";
        writer="Zülfü Livaneli";
        pageNumber=484;
        price=31.30;
    }
    public void Huzursuzluk(){
        type="Literature";
        bookName="Huzursuzluk";
        writer="Zülfü Livaneli";
        pageNumber=160;
        price=27.30;
    }
    public void KardesiminHikayesi(){
        type="Literature";
        bookName="Kardeşimin Hikayesi";
        writer="Zülfü Livaneli";
        pageNumber=280;
        price=27.30;
    }
}
class Philosophy extends Book
{
   public void Devlet(){
        type="Philosophy";
        bookName="Devlet";
        writer="Platon";
        pageNumber=372;
        price=11.70;
    }
   public void Sokrates(){
        type="Philosophy";
        bookName="Sokrates'in Savunması";
        writer="Platon";
        pageNumber=60;
        price=15.05;
    }
   public void Sofist(){
        type="Philosophy";
        bookName="Sofist";
        writer="Platon";
        pageNumber=126;
        price=21.45;
    }
   public void Yabancı(){
        type="Philosophy";
        bookName="Yabancı";
        writer="Albert Camus";
        pageNumber=136;
        price=21.85;
    }
   public void Veba(){
        type="Philosophy";
        bookName="Veba";
        writer="Albert Camus";
        pageNumber=304;
        price=33.80;
    }
   public void Dusus(){
        type="Philosophy";
        bookName="Düşüş";
        writer="Albert Camus";
        pageNumber=99;
        price=17.90;
    }
   public void Zerdust(){
        type="Philosophy";
        bookName="Böyle Buyurdu Zerdüşt";
        writer="Friedrich Nietzsche";
        pageNumber=308;
        price=22.50;
    }
   public void Putlar(){
        type="Philosophy";
        bookName="Putların Alacakaranlığı";
        writer="Friedrich Nietzsche";
        pageNumber=112;
        price=7.80;
    }
   public void IyininOtesi(){
        type="Philosophy";
        bookName="İyinin ve Kötünün Ötesinde";
        writer="Friedrich Nietzsche";
        pageNumber=256;
        price=13.00;
    }
}
class ResearchHistory extends Book
{
    public void HomoDeus(){
        type="Research-History";
        bookName="Homo Deus : Yarının Kısa Tarihi";
        writer="Yuval Noah Harari";
        pageNumber=456;
        price=50.85;
    }
    public void Yuzyil(){
        type="Research-History";
        bookName="21. Yüzyıl için 21 Ders";
        writer="Yuval Noah Harari";
        pageNumber=336;
        price=65.10;
    }
    public void Sapiens(){
        type="Research-History";
        bookName="Hayvanlardan Tanrılara Sapiens";
        writer="Yuval Noah Harari";
        pageNumber=412;
        price=49.34;
    }
    public void GaziAtaturk(){
        type="Research-History";
        bookName="Gazi Mustafa Kemal Atatürk";
        writer="İlber Ortaylı";
        pageNumber=480;
        price=47.43;
    }
    public void TurklerinAltinCagi(){
        type="Research-History";
        bookName="Türklerin Altın Çağı";
        writer="İlber Ortaylı";
        pageNumber=320;
        price=35.00;
    }
    public void Istanbul(){
        type="Research-History";
        bookName="İstanbul'dan Sayfalar";
        writer="İlber Ortaylı";
        pageNumber=304;
        price=32.50;
    }
    public void Ronesans(){
        type="Research-History";
        bookName="Rönesans Avrupası";
        writer="Halil İnalcık";
        pageNumber=400;
        price=24.70;
    }
    public void DevletiAliyye(){
        type="Research-History";
        bookName="Devlet-i Aliyye-Osmanlı İmparatorluğu";
        writer="Halil İnalcık";
        pageNumber=544;
        price=29.25;
    }
    public void FatihSultan(){
        type="Research-History";
        bookName="Fatih Sultan Mehemmed Han";
        writer="Halil İnalcık";
        pageNumber=848;
        price=48.75;
    }
}

class Science extends Book
{
    public void HerSey(){
        type="Science";
        bookName="Her Şeyin Anlamı";
        writer="Richard P. Feynman";
        pageNumber=80;
        price=16.20;
    }
    public void Feynman(){
        type="Science";
        bookName="Feynman Fizik Dersi";
        writer="Richard P. Feynman";
        pageNumber=560;
        price=30.00;
    }
    public void ZorParca(){
        type="Science";
        bookName="Altı Zor Parça";
        writer="Richard P. Feynman";
        pageNumber=225;
        price=21.00;
    }
    public void Zaman(){
        type="Science";
        bookName="Zamanın Kısa Tarihi";
        writer="Stephen Hawking";
        pageNumber=255;
        price=39.00;
    }
    public void Karadelikler(){
        type="Science";
        bookName="Karadelikler";
        writer="Stephen Hawking";
        pageNumber=75;
        price=12.00;
    }
    public void BuyukSoru(){
        type="Science";
        bookName="Büyük Sorulara Kısa Yanıtlar";
        writer="Stephen Hawking";
        pageNumber=200;
        price=22.05;
    }
    public void HiperUzay(){
        type="Science";
        bookName="Hiper Uzay";
        writer="Michio Kaku";
        pageNumber=464;
        price=32.50;
    }
    public void Paralel(){
        type="Science";
        bookName="Paralel Dünyalar";
        writer="Michio Kaku";
        pageNumber=442;
        price=33.80;
    }
    public void Insanlik(){
        type="Science";
        bookName="İnsanlığın Geleceği";
        writer="Michio Kaku";
        pageNumber=370;
        price=42.90;
    }
}
