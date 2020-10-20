/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programpenilangan;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class ProgramPenilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //array
        String[]pelanggaran = {"Masker","SIM","STNK"};
        int[] denda = {15000,40000,50000};
         System.out.println("Selamat Anda Di Tilang");
        System.out.println("List Pelanggaran");
        //perulangan
        for (int i = 0; i <pelanggaran.length; i++)
            System.out.println(i+". "+pelanggaran[i]);
          //scanner
        System.out.println("Silahkan masukkan nomor pelanggaran");
        
        Scanner input = new Scanner(System.in);
        
        int pilihan = input.nextInt();
        
        System.out.println("Input Pelanggaran : "+pelanggaran[pilihan]);
         //percabangan
        System.out.println("Silahkan masukkan uang anda");
        
        int uang = input.nextInt();
        
        if (uang > denda[pilihan]){
            System.out.println("Kembalian Denda "+(uang - denda[pilihan]));
    
        }else if (uang == denda[pilihan]){
            System.out.println("Uang anda pas, Silahkan jalan lagi");
        }else{
            System.out.println("Uang anda kurang "+(denda[pilihan]-uang));
        }
    }
    
}
