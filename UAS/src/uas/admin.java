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
public class admin {
    public void menuadmin(){
        tampildata tampildata = new tampildata();
        barang barang = new barang();
        supplier supplier = new supplier();
        member member = new member();
        penjualan penjualan = new penjualan();
        Scanner keyboard = new Scanner(System.in);
        String pilihmenu;
        boolean isLanjutkan = true;
         while (isLanjutkan) {
        System.out.println("admin toko sepatu");
        System.out.println("===========================================");
        System.out.println("tampil data :                              ");
        System.out.println("-------------------------------------------");
        System.out.println("1. data barang                             ");
        System.out.println("2. data member                             ");
        System.out.println("3. data penjualan                          ");
        System.out.println("4. data supplier                           ");
        System.out.println("-------------------------------------------");
        System.out.println("tambah data :                              ");
        System.out.println("-------------------------------------------");
        System.out.println("5. data barang                             ");
        System.out.println("6. data supplier                           ");
        System.out.println("-------------------------------------------");
        System.out.println("delete data :                              ");
        System.out.println("-------------------------------------------");
        System.out.println("7. data barang                             ");
        System.out.println("8. data member                             ");
        System.out.println("9. data penjualan                          ");
        System.out.println("10. data supplier                          ");
        System.out.println("-------------------------------------------");
        System.out.println("update data  :                             ");
        System.out.println("11. data barang                            ");
        System.out.println("12. data member                            ");
        System.out.println("13. data supplier                          ");
        System.out.println("-------------------------------------------");
        System.out.print  ("masukan pilihan  :                         ");

             pilihmenu = keyboard.nextLine();
            switch (pilihmenu){ 
            case "1":
                System.out.println("menampilkan data barang");
                System.out.println("=============================");
                tampildata.tampildatabarang();
                break;
            case "2":
                System.out.println("menampilkan data member");
                System.out.println("==============================");
                tampildata.tampildatamember();
                break;
            case "3": 
                System.out.println("menampilkan data penjualan");
                System.out.println("==============================");
                tampildata.tampildatapenjualan();
            
                break;
            case "4":
                System.out.println("menampilkan data supplier");
                System.out.println("==============================");
                tampildata.tampildatasupllier();
                break;
            case "5":
                Scanner input = new Scanner(System.in);
                System.out.println("menu tambah data barang ");
                System.out.println("===============================");
                System.out.println("masukan kode barang ");
                barang.setKode_barang(input.nextLine());
                System.out.println("masukan merk ");
                barang.setMerk(input.nextLine());
                System.out.println("masukan jenis");
                barang.setJenis(input.nextLine());
                System.out.println("masukan harga");
                barang.setHarga(input.nextInt());
                System.out.println("masukan stok");
                barang.setStok(input.nextInt());
                System.out.println("");
                barang.tambahbarang(barang);    
                break;              
            case "6":
                Scanner insert = new Scanner(System.in);
                System.out.println("menu tambah data supplier ");
                System.out.println("===============================");
                System.out.println("masukan id supplier ");
                supplier.setId_supplier(insert.nextLine());
                System.out.println("masukan nama supplier ");
                supplier.setNama_supplier(insert.nextLine());
                System.out.println("masukan alamat");
                supplier.setAlamat(insert.nextLine());
                System.out.println("masukan jumlah");
                supplier.setJumlah(insert.nextInt());
                System.out.println("");
                supplier.tambahsupplier(supplier);
                break;
            case "7":
                Scanner delete1 = new Scanner (System.in);
                System.out.println("menu hapus data barang");
                System.out.println("================================");
                System.out.println("masukan kode barang :");
                barang.setKode_barang(delete1.nextLine());
                barang.hapusdatabarang(barang);
                break;
            case "8":
                Scanner delete2 = new Scanner (System.in);
                System.out.println("menu hapus data barang");
                System.out.println("================================");
                System.out.println("masukan id member :");
                member.setId_member(delete2.nextLine());
                member.hapusdatamember(member);
                break;
            case "9":
                Scanner delete3 = new Scanner (System.in);
                System.out.println("menu hapus data transaksi");
                System.out.println("================================");
                System.out.println("masukan nomer transaksi :");
                penjualan.setNo_transaksi(delete3.nextInt());
                penjualan.hapusdatapenjualan(penjualan);
                break;
            case "10":
                Scanner delete4 = new Scanner (System.in);
                System.out.println("menu hapus data supplier");
                System.out.println("===============================");
                System.out.println("masukan id supplier");
                supplier.setId_supplier(delete4.nextLine());
                supplier.hapusdatasupplier(supplier);
                break;
            case "11":
                Scanner update = new Scanner (System.in);
                System.out.println("menu update data barang");
                System.out.println("===============================");
                System.out.println("masukan kode barang");
                barang.setKode_barang(update.nextLine());
                System.out.println("update merk ");
                barang.setMerk(update.nextLine());
                System.out.println("update jenis");
                barang.setJenis(update.nextLine());
                System.out.println("update harga");
                barang.setHarga(update.nextInt());
                System.out.println("update stok");
                barang.setStok(update.nextInt());
                System.out.println("");
                barang.updatedatabarang(barang);
                break;
            case "12":
                Scanner update1 = new Scanner (System.in);
                System.out.println("menu update data member");
                System.out.println("===============================");
                System.out.println("masukan id member");
                member.setId_member(update1.nextLine());
                System.out.println("update nama member ");
                member.setNama_member(update1.nextLine());
                System.out.println("update jenis kelamin");
                member.setJk(update1.nextLine());
                System.out.println("update nomor telepon member");
                member.setNo_telepon(update1.nextLine());
                System.out.println("update alamat member");
                member.setAlamat(update1.nextLine());
                System.out.println("");
                member.updatedatamember(member);
                break;
            case "13":
                Scanner update2 = new Scanner (System.in);
                System.out.println("menu update data supplier");
                System.out.println("================================");
                System.out.println("masukan id supplier");
                supplier.setId_supplier(update2.nextLine());
                System.out.println("update nama supplier");
                supplier.setNama_supplier(update2.nextLine());
                System.out.println("update alamat supplier");
                supplier.setAlamat(update2.nextLine());
                System.out.println("update jumlah");
                supplier.setJumlah(update2.nextInt());
                supplier.updatedatasupplier(supplier);
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
    
    

