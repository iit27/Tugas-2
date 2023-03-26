 /* NIM  : 13020210037
Nama     : Iit al arwaihti
Hari/Tgl: Rabu, 22 Maret 2023
Waktu   : 02.10 */

/* contoh pemakaian IF satu kasus */
/* membaca nilai integer, menuliskan nilainya jika positif */

import java.util.Scanner;

public class If1 {

    /** 
    * @param args
    */

    public static void main (String [] args) {
        //TODO Auto-geneated method stub
        /* Kamus */

        Scanner masukan = new Scanner(System.in);
        int a;

        /* Program */
        System.out.print ("Contoh IF satu kasus\n");
        System.out.print ("Ketikkan suatu nilai integer : ");
        a = masukan.nextInt();
        if (a >= 0)
        System.out.print ("\nNilai a postitif "+ a);

    }
}