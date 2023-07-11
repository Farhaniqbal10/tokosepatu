/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class penjualan {
    private int no_transaksi;
    private String kode_barang;
    private String merk;
    private int harga;
    private int jumlah;
    private double total;

    public penjualan() {
        this.no_transaksi = no_transaksi;
        this.kode_barang = kode_barang;
        this.merk = merk;
        this.harga = harga;
        this.jumlah = jumlah;
        this.total = harga*jumlah;
    }

    public int getNo_transaksi() {
        return no_transaksi;
    }

    public void setNo_transaksi(int no_transaksi) {
        this.no_transaksi = no_transaksi;
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getTotal() {
        return this.total = harga*jumlah;
    }

    public void setTotal(double total) {
        this.total = harga*jumlah;
    }
      public String merksepatu(){
        if( "1012".equals(kode_barang)){ 

             merk ="adidas"; 

        }

        else if("1013".equals(kode_barang)){ 
            merk ="nike";
                      
        }

        else if("1014".equals(kode_barang)){ 

            merk="puma"; 

        }

        else if("1015".equals(kode_barang)){ 

            merk="new balance"; 

        }

         else {

              merk="kode yang anda masukan salah"; 


        }
        return merk;
     }
    
    public int hargasepatu(){
        if( "nike".equals(merk)){ 

             harga =500000; 

        }

        else if("adidas".equals(merk)){ 
            harga =500000 ;
                      
        }

        else if("puma".equals(merk)){ 

            harga=300000; 

        }

        else if("new balance".equals(merk)){ 

            harga=300000; 

        }

         else {

              harga=0; 


        }
        return harga;
    }
    
     
     public void tambahpenjualan(penjualan penjualan){
        
        
        String SQL = "INSERT INTO penjualan(no_transaksi,kode_barang,merk,harga,jumlah,total) " 
                + "VALUES(?,?,?,?,?,?)";
        
        try {
        PreparedStatement tambah;
        
        tambah = koneksi.conn.prepareStatement(SQL);
        tambah.setInt(1, penjualan.getNo_transaksi());
        tambah.setString(2, penjualan.getKode_barang());
        tambah.setString(3, penjualan.merksepatu());
        tambah.setInt(4, penjualan.hargasepatu());
        tambah.setInt(5, penjualan.getJumlah());
        tambah.setDouble(6, penjualan.getTotal());
        int i = tambah.executeUpdate();
            System.out.println(i+""+"orderan berhasil tercatat silahkan lakukan pembayaran");
            System.out.println("");
            tambah.close();
        }catch (SQLException e) {
            System.err.println("tambah data gagal" + e.getMessage());
        }
    
        }
        
    public void hapusdatapenjualan(penjualan penjualan){
        String sql ="DELETE FROM penjualan WHERE no_transaksi  = ?";
        
        try{
            PreparedStatement hapus;
            
            hapus = koneksi.conn.prepareStatement(sql);
            hapus.setInt(1, penjualan.getNo_transaksi());
            int i = hapus.executeUpdate();
            System.out.println(i + "data transaksi berhasil dihapus");
            System.out.println("");
            hapus.close();
            
         } catch (SQLException e){
    System.err.println("hapus data gagal " + e.getMessage());
        
    }
  
}
}
