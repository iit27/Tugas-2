 /* NIM  : 13020210037
Nama     : Iit al arwaihti
Hari/Tgl : Jumat, 24 Maret 2023
Waktu    : 08.33 PM */

import java.util.Scanner;

/* Maksimum dua bilangan yang dibaca */
public class Max2 {

    /** 
    *@param args
    */

    public static void main(String[] args) {
        //TODO Auto-generted method stub
        /* Kamus */
        int a,b;
        Scanner masukan = new Scanner(System.in);

        /* Program */
        System.out.print ("Maksimum dua bilangan : \n");
        System.out.print ("Ketikkan dua bilangan, pisahkan dengan RETURN : \n");
        a = masukan.nextInt();
        b = masukan.nextInt();
        System.out.println ("Kedua bilangan : a = "+a + " b = "+b);
        if (a >= b){
            System.out.println ("Nilai a yang maksimum "+a);
        } else /* a > b */ {
            System.out.println ("Nilai b yang maksimum: "+b);
        }
    }
}