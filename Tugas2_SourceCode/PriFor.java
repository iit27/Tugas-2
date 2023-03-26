 /* NIM  : 13020210037
Nama     : Iit al arwaihti
Hari/Tgl : Jumat, 24 Maret 2023
Waktu    : 08. 45 */

import java.util.Scanner;

/* Baca N, Print 1 s/d N dengan FOR */
public class PriFor {

    /** 
    *@param args
    */

    public static void main(String[] args) {
        //TODO Auto-generated method stub
        /* Kamus */
        int i,N;
        Scanner masukan = new Scanner(System.in);

        /* Program */
        System.out.println ("Baca N, Print 1 s/d N ");
        System.out.println ("N = ");

        N = masukan.nextInt();

        for (i = 1; i <= N; i++){
            System.out.println (i); };
            System.out.println ("Akhir progrram \n");


    }
}