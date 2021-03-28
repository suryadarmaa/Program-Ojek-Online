package AYOjek;
import java.util.Scanner;

public class AYOjek {
    String username;
    int password;

    public static void main(String[] args) {
        String user="surya";
        int pass = 12345;

        Scanner input = new Scanner(System.in);
        System.out.println("LOGIN");
        System.out.print("Masukkan username : ");
        String username=input.nextLine();
        System.out.print("Masukkan password : ");
        int password=input.nextInt();
        if(username.equals(user)&&password==pass){

            System.out.println("Silahkan pilih menu :");
            System.out.println("1.AYOride");
            System.out.println("2.AYOfood");
            System.out.println("3.AYOsend");
            System.out.print("Masukkan pilihan : ");
            int pilih = input.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("Anda memilih menu AYOride silahkan pilih");
                    System.out.println("1.Nusa Dua - Jimbaran");
                    System.out.println("2.Nusa Dua - Kuta");
                    System.out.println("3.Nusa Dua - Denpasar");
                    System.out.print("Masukkan pilihan : ");
                    int pilih1=input.nextInt();
                    switch(pilih1){
                        case 1:
                            AYOride a =new AYOride("Nusa Dua","Jimbaran",3000,5);
                            a.tampilAYOride();
                            break;
                        case 2:
                            AYOride b =new AYOride("Nusa Dua","Kuta",3000,7);
                            b.tampilAYOride();
                            break;
                        case 3:
                            AYOride c =new AYOride("Nusa Dua","Denpasar",3000,9);
                            c.tampilAYOride();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Anda memilih menu AYOfood silahkan pilih");
                    System.out.println("1.Nasi Goreng");
                    System.out.println("2.Ikan Bakar");
                    System.out.println("3.Ayam Lalapan");
                    System.out.print("Masukkan pilihan : ");
                    int pilih2=input.nextInt();
                    switch(pilih2){
                        case 1:
                            AYOfood a =new AYOfood("Nasi Goreng",12000);
                            a.tampilAYOfood();
                            break;
                        case 2:
                            AYOfood b =new AYOfood("Ikan Bakar",20000);
                            b.tampilAYOfood();
                            break;
                        case 3:
                            AYOfood c =new AYOfood("Ayam Lalapan",15000);
                            c.tampilAYOfood();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Anda memilih menu AYOsend silahkan pilih");
                    System.out.println("1.Barang kain");
                    System.out.println("2.Barang plastik");
                    System.out.println("3.Barang kaca");
                    System.out.print("Masukkan pilihan : ");
                    int pilih3=input.nextInt();
                    switch(pilih3){
                        case 1:
                            AYOsend a =new AYOsend("Barang kain",5.5,1.28);
                            a.tampilAYOsend();
                            break;
                        case 2:
                            AYOsend b =new AYOsend("Barang plastik",5.5,2);
                            b.tampilAYOsend();
                            break;
                        case 3:
                            AYOsend c =new AYOsend("Barang kaca",5.5,3.5);
                            c.tampilAYOsend();
                            break;
                    }
            }
            System.out.print("Terima kasih sudah menggunakan jasa kami :)");
        } else {
            System.out.println("login anda salah");

        }
    }
}
