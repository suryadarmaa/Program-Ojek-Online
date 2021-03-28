package OKjek;
import java.util.Scanner;

public class OKjek {
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
            System.out.println("1.OKride");
            System.out.println("2.OKfood");
            System.out.println("3.OKsend");
            System.out.print("Masukkan pilihan : ");
            int pilih = input.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("Anda memilih menu OKride silahkan pilih");
                    System.out.println("1.Nusa Dua - Jimbaran");
                    System.out.println("2.Nusa Dua - Kuta");
                    System.out.println("3.Nusa Dua - Denpasar");
                    System.out.print("Masukkan pilihan : ");
                    int pilih1=input.nextInt();
                    switch(pilih1){
                        case 1:
                            OKride a =new OKride("Nusa Dua","Jimbaran",3000,5);
                            a.tampilOKride();
                            break;
                        case 2:
                            OKride b =new OKride("Nusa Dua","Kuta",3000,7);
                            b.tampilOKride();
                            break;
                        case 3:
                            OKride c =new OKride("Nusa Dua","Denpasar",3000,9);
                            c.tampilOKride();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Anda memilih menu OKfood silahkan pilih");
                    System.out.println("1.Nasi Goreng");
                    System.out.println("2.Ikan Bakar");
                    System.out.println("3.Ayam Lalapan");
                    System.out.print("Masukkan pilihan : ");
                    int pilih2=input.nextInt();
                    switch(pilih2){
                        case 1:
                            OKfood a =new OKfood("Nasi Goreng",12000);
                            a.tampilOKfood();
                            break;
                        case 2:
                            OKfood b =new OKfood("Ikan Bakar",20000);
                            b.tampilOKfood();
                            break;
                        case 3:
                            OKfood c =new OKfood("Ayam Lalapan",15000);
                            c.tampilOKfood();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Anda memilih menu OKsend silahkan pilih");
                    System.out.println("1.Barang kain");
                    System.out.println("2.Barang plastik");
                    System.out.println("3.Barang kaca");
                    System.out.print("Masukkan pilihan : ");
                    int pilih3=input.nextInt();
                    switch(pilih3){
                        case 1:
                            OKsend a =new OKsend("Barang kain",5.5,1.28);
                            a.tampilOKsend();
                            break;
                        case 2:
                            OKsend b =new OKsend("Barang plastik",5.5,2);
                            b.tampilOKsend();
                            break;
                        case 3:
                            OKsend c =new OKsend("Barang kaca",5.5,3.5);
                            c.tampilOKsend();
                            break;
                    }
            }
            System.out.print("Terima kasih sudah menggunakan jasa kami :)");
        } else {
            System.out.println("login anda salah");

        }
    }
}


