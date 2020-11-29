
public class Main {
    /*
    inhericante(Kalıtım) = bir sınıfın başka bir sınıftan özelliklerini ve metodlarını miras alamsı anlamına geliyor.
    kişinin anne babadan göz rengini,huylarını vb... miras alamsı gibi 
    bir sınıf başka bir sınıfın özelliklerini ve metodlarını miras alabilir
    yönetici de bir işçidir.(Batı düşünme tarzıyla Beyaz yakalılar  aynı zamanda Mavi yakalıdır.Diyebiliriz.
    inheritance temelde --- is a --- ilişkisi bulunmakta -->>manager is a employee
    
    is a görürsen inheritance vardır...
    ****************************************************************************
    Overriding kavramı = biz eğer miras aldığımız metodları aynı isimle kendi classımızda da tanımlarsak extradan yazarsak miraz aldığımız hali değil kendi yazdığımız çağrılacaktır.
    
    */
    public static void main(String[] args) {
        manager man = new manager("@prince", 666666, "developer of everything",58);
        man.bilgileriGoster();
        man.departman_degistir("Software developer");
        man.calıs();
        man.zamYap(250);
    }
    
}
