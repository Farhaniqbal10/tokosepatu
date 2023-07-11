/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;
import java.util.Scanner;
/**
 *
 * @author Farhan
 */
public class UAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        koneksi koneksi = new koneksi();
        koneksi.koneksi();
        admin admin = new admin();
        pelanggan pelanggan = new pelanggan();
          Scanner keyboard = new Scanner(System.in);
        int pilihmenu;
        System.out.println("selamat datang di toko sepatu ");
        System.out.println("===========================================");
        System.out.println("masuk sebagai  :                           ");
        System.out.println("-------------------------------------------");
        System.out.println("1. pelanggan                               ");
        System.out.println("2. admin                                   ");
        System.out.print("masukan pilihan  :                           ");
        
         pilihmenu = keyboard.nextInt();
        switch (pilihmenu){ 
            case 1:
                pelanggan.pelanggan();
                break;
            case 2:
                admin.menuadmin();
                break;

        
}
    }
}

