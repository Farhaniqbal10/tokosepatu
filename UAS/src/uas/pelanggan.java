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
public class pelanggan {
        public void pelanggan(){
        tampildata tampildata = new tampildata();
        member member = new member();
        penjualan penjualan = new penjualan();
          Scanner keyboard = new Scanner(System.in);
          String pilihmenu;
           boolean isLanjutkan = true;
         while (isLanjutkan) {
        System.out.println("selamat datang ");
        System.out.println("===========================================");
        System.out.println("apa yang mau anda lakukan ? :              ");
        System.out.println("-------------------------------------------");
        System.out.println("1. lihat daftar sepatu                     ");
        System.out.println("2. gabung member                           ");
        System.out.println("3. beli sepatu                             ");
        System.out.print  ("masukan pilihan  :                         ");
        
         pilihmenu = keyboard.nextLine();
        switch (pilihmenu){ 
            case "1":
                System.out.println("daftar sepatu");
                System.out.println("=============================");
                tampildata.tampildatabarang();
                break;
            case "2":
                Scanner input = new Scanner(System.in);
                System.out.println("menu tambah data member ");
                System.out.println("===============================");
                System.out.println("masukan id member ");
                member.setId_member(input.nextLine());
                System.out.println("masukan nama anda ");
                member.setNama_member(input.nextLine());
                System.out.println("masukan jenis kelamin");
                member.setJk(input.nextLine());
                System.out.println("masukan no telepon");
                member.setNo_telepon(input.nextLine());
                System.out.println("masukan alamat anda");
                member.setAlamat(input.nextLine());
                System.out.println("");
                member.tambahmember(member);
                break;
            case "3":
                Scanner jual = new Scanner(System.in);
                System.out.println("menu beli sepatu ");
                System.out.println("================================");
                System.out.println("masukan kode sepatu");
                penjualan.setKode_barang(jual.nextLine());
                penjualan.merksepatu();
                penjualan.hargasepatu();
                System.out.println("masukan jumlah");
                penjualan.setJumlah(jual.nextInt());
                System.out.println("----------------------------------");
                System.out.println("orderan anda :");
                System.out.println("kode barang :" + penjualan.getKode_barang());
                System.out.println("merk : " + penjualan.getMerk());
                System.out.println("harga : " + penjualan.hargasepatu());
                System.out.println("jumlah : " + penjualan.getJumlah());
                System.out.println("total : " + penjualan.getTotal());
                System.out.println("----------------------------------");
                penjualan.tambahpenjualan(penjualan);
                penjualan.setTotal(jual.nextDouble());
                break;
        }
               isLanjutkan = getYesorNo("Apakah Anda ingin melanjutkan");
    }
    }
    private static boolean getYesorNo(String message){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("\n"+message+" (y/n)? ");
        String pilihanmenu = keyboard.nextLine();

        while(!pilihanmenu.equalsIgnoreCase("y") && !pilihanmenu.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n"+message+" (y/n)? ");
            pilihanmenu = keyboard.nextLine();
        }

        return pilihanmenu.equalsIgnoreCase("y");
        }
}
