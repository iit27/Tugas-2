 /* NIM  : 13020210037
Nama     : Iit al arwaihti
Hari/Tgl: Rabu, 22 Maret 2023
Waktu   : 01.56 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.*;

public class BacaString{

    /**
    * @pqaram args
    * @throw IOException
    */

    public static void main (String[] args) throws IOException {
        // TODO Auto-generated method stub
        /* Kamus */
        String str;

        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        /* Program */

        System.out.print ("\nBaca String dan Integer: \n");
        System.out.print ("Masukkan sebuah string: ");
        str = dataIn.readLine();
        System.out.print ("String yang dibaca : "+ str);
    }
}