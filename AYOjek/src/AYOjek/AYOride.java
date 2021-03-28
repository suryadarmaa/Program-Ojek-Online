package AYOjek;

public class AYOride {
    String lokasi;
    String tujuan;
    int biaya;
    int total,jarak;
    int ongkir=3000 ;
    public AYOride (String lokasi1,String tujuan1,int biaya1,int jarak1){
        this.lokasi = lokasi1;
        this.tujuan = tujuan1;
        this.biaya = biaya1;
        this.jarak =jarak1;
        total = (biaya*jarak)+ongkir;
    }
    void  tampilAYOride(){
        System.out.println("Lokasi anda    :"+lokasi);
        System.out.println("Lokasi tujuan  :"+tujuan);
        System.out.println("Biaya order    :"+total);
    }
}
