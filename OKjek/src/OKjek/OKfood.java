package OKjek;

public class OKfood {

        String nama;
        int harga,total;
        int ongkir = 4000;

        OKfood(String nama1,int harga1){
            this.nama =nama1;
            this.harga=harga1;
            total=harga+ongkir;
        }

        void tampilOKfood(){
            System.out.println("Anda memilih "+nama);
            System.out.println("Total order  : "+total);
        }
    }

