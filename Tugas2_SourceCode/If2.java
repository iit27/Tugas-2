 /* NIM  : 13020210037
Nama     : Iit al arwaihti
Hari/Tgl: Rabu, 22 Maret 2023
Waktu   : 02.15 */

import java.util.Scanner;

/* Contoh pemakaian IF dua kasus komplementer */
/* Membaca sebuah nilai, */
/* menuliskan 'Nilai a positif , nilai a', jika a >= 0 */
/*  'Nilai a negatif , nilai a', jika a < 0 */

public class If2 {

    /** 
    * @param args
    */

    public static void main (String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */

        int a;
        Scanner masukan = new Scanner(System.in);

        /* Prgram */
        System.out.print ("Contoh IF fua kasus \n");
        System.out.print ("Ketikkan suatu nilai integer : ");
        a = masukan.nextInt();

        if (a >= 0) {
            System.out.println ("Nilai a positif "+ a);
        } else /* a< 0 */
        {
            System.out.println ("Nilai a negatif "+ a);
        }
    }
}