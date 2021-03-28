package AYOjek;

public class AYOfood {
    String nama;
    int harga,total;
    int ongkir = 4000;

    AYOfood(String nama1,int harga1){
        this.nama =nama1;
        this.harga=harga1;
        total=harga+ongkir;
    }

    void tampilAYOfood(){
        System.out.println("Anda memilih "+nama);
        System.out.println("Total order  : "+total);
    }
}
