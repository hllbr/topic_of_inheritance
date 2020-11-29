
public class manager extends employee{//subclass
    //miras almak için extends kullanmak gerekiyor
    //empployee sınıfının bütün özelliklerini ve metodlarını miras almak istiyorum dedik
    
    
    
    private int sorumlu_oldugu_kisi;
    public manager(String isim, int maas, String departman,int sorumlu_oldugu_kisi) {
        super(isim, maas, departman);
        this.sorumlu_oldugu_kisi =sorumlu_oldugu_kisi;

        /*
        this li yapı kuramayız private tanımladık direkt erişim yok 
        super = miras aldığım classın constructor'ını kullanıcam dedim 
        yönetici sınıfına extra özellikler ekliyebliyoruz
        */
    }
    public void zamYap(int zam_miktarı){
        System.out.println("Çalışanlara " +zam_miktarı +" tl zam yapıldı");
    }
    public void bilgileriGoster(){
        /*
        1.yöntem :
        System.out.println("isim : "+getIsim());
        System.out.println("maas : "+getMaas());
        System.out.println("departman : "+getDepartman());*/
        super.bilgileriGoster();
        System.out.println("sorumlu olduğu kişi sayısı : "+this.sorumlu_oldugu_kisi);
    }

    
}
