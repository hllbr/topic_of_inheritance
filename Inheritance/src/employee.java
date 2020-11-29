
public class employee {//superclass or baseclass
    
    //here is main class
    private String isim;
    private int maas ;
    private String departman ;
    public employee(String isim,int maas,String departman){
        this.isim = isim ;
        this.maas = maas ;
        this.departman = departman;
    }
    public void calıs(){
        System.out.println("Çalışan Çalışıyor");
    }
    public void bilgileriGoster(){
        System.out.println("isim : "+isim);
        System.out.println("maas : "+maas);
        System.out.println("departman : "+departman);
        //this kullanabiliriz kullanmayada biliriz.
    }
    public void departman_degistir(String yeni_departman){
        System.out.println("eski departman : " +this.departman);
        System.out.println("Departman değiştiriliyor...");
        this.departman = yeni_departman ;
        System.out.println("yeni departman : "+this.departman);
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the maas
     */
    public int getMaas() {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(int maas) {
        this.maas = maas;
    }

    /**
     * @return the departman
     */
    public String getDepartman() {
        return departman;
    }

    /**
     * @param departman the departman to set
     */
    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
