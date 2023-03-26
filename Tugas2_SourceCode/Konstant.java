 /* NIM  : 13020210037
Nama     : Iit al arwaihti
Hari/Tgl : Jumat, 24 Maret 2023
Waktu    : 08.19 */

import java.util.Scanner;

/* Membaca jari-jari, menghitung luas lingkaran */
/* latihan pemakaian konstanta */

public class Konstant {

    /** 
    * @param args
    */

    public static void main (String[] args) {
        //TODO Auto-generated method stub
        /* Kamus */
            final float PHI = 3.1415f;
            float r;
            Scanner masukan = new Scanner(System.in);
        
        /* Program */   /* Baca Data */
            System.out.print ("Jari-jari lingkaran = ");
            r = masukan.nextFloat();
        
        /* Hitung dan tulis hasil */
            System.out.print ("Luas lingkaran = " + (PHI * r * r)+"\n");
            System.out.print ("Akhir program \n");
    }
}