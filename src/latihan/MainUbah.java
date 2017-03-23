package Latian23;
import java.util.Scanner;
public class MainUbah {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        convert c=new convert();
        
        System.out.print("ubah dari:\n1.angka->kata\n2.kata->angka\npilih: ");
        int pilih = in.nextInt();
        if (pilih==1){
            System.out.print("Masukkan angka: ");
            int angka = in.nextInt();
            c.angkaToKata(angka);
            c.ubah(angka);
        }
        else if (pilih==2){
            System.out.print("Masukkan : ");
            in.nextLine();
            String kata = in.nextLine();
            System.out.println(c.kataToAngka(kata));
        }
    }
    
}
