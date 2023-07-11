/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Farhan
 */
public class barang {    
    private String kode_barang;
    private String merk;
    private String jenis;
    private int harga;
    private int stok;

    public barang() {
        this.kode_barang = kode_barang;
        this.merk = merk;
        this.jenis = jenis;
        this.harga = harga;
        this.stok = stok;
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

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
   
    public void tambahbarang(barang barang){
        
        
        String SQL = "INSERT INTO barang(kode_barang,merk,jenis,harga,stok) " 
                + "VALUES(?,?,?,?,?)";
        
        try {
        PreparedStatement tambah;
        
        tambah = koneksi.conn.prepareStatement(SQL);
        tambah.setString(1, barang.getKode_barang());
        tambah.setString(2, barang.getMerk());
        tambah.setString(3, barang.getJenis());
        tambah.setInt(4, barang.getHarga());
        tambah.setInt(5, barang.getStok());
        int i = tambah.executeUpdate();
            System.out.println(i+""+"data barang berhasil di tambah");
            System.out.println("");
            tambah.close();
        }catch (SQLException e) {
            System.err.println("tambah data gagal" + e.getMessage());
        }
    }
        
    public void hapusdatabarang(barang barang){
        String sql ="DELETE FROM barang WHERE kode_barang = ?";
        
        try{
            PreparedStatement hapus;
            
            hapus = koneksi.conn.prepareStatement(sql);
            hapus.setString(1, barang.getKode_barang());
            int i = hapus.executeUpdate();
            System.out.println(i + "data barang berhasil dihapus");
            System.out.println("");
            hapus.close();
            
         } catch (SQLException e){
    System.err.println("hapus data gagal " + e.getMessage());
        
    }
    }
        public void updatedatabarang(barang barang){
        
        
        String SQL =  "UPDATE  barang SET merk=?,jenis=?,harga=?,stok=? WHERE kode_barang=?";
        
        try {
        PreparedStatement update;
        
        update = koneksi.conn.prepareStatement(SQL);
        update.setString(1, barang.getMerk());
        update.setString(2, barang.getJenis());
        update.setInt(3, barang.getHarga());
        update.setInt(4, barang.getStok());
        update.setString(5, barang.getKode_barang());
        int i = update.executeUpdate();
            System.out.println(i+""+"data barang berhasil di update");
            System.out.println("");
            update.close();
        }catch (SQLException e) {
            System.err.println("update data gagal" + e.getMessage());
        }
    }
    }

    
    
    

