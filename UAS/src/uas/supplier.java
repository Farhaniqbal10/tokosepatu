/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Farhan
 */
public class supplier {
    private String id_supplier;
    private String nama_supplier;
    private String alamat;
    private int jumlah;

    public supplier() {
        this.id_supplier = id_supplier;
        this.nama_supplier = nama_supplier;
        this.alamat = alamat;
        this.jumlah = jumlah;
    }

    public String getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(String id_supplier) {
        this.id_supplier = id_supplier;
    }

    public String getNama_supplier() {
        return nama_supplier;
    }

    public void setNama_supplier(String nama_supplier) {
        this.nama_supplier = nama_supplier;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
      public void tambahsupplier(supplier supplier){
        
        
        String SQL = "INSERT INTO supplier(id_supplier,nama_supplier,alamat,jumlah) " 
                + "VALUES(?,?,?,?)";
        
        try {
        PreparedStatement tambah;
        
        tambah = koneksi.conn.prepareStatement(SQL);
        tambah.setString(1, supplier.getId_supplier());
        tambah.setString(2, supplier.getNama_supplier());
        tambah.setString(3, supplier.getAlamat());
        tambah.setInt(4, supplier.getJumlah());
        int i = tambah.executeUpdate();
            System.out.println(i+""+"data supplier berhasil di tambah");
            System.out.println("");
            tambah.close();
        }catch (SQLException e) {
            System.err.println("tambah data gagal" + e.getMessage());
        }
          }
        
    public void hapusdatasupplier(supplier supplier){
        String sql ="DELETE FROM supplier WHERE id_supplier  = ?";
        
        try{
            PreparedStatement hapus;
            
            hapus = koneksi.conn.prepareStatement(sql);
            hapus.setString(1, supplier.getId_supplier());
            int i = hapus.executeUpdate();
            System.out.println(i + "data supplier berhasil dihapus");
            System.out.println("");
            hapus.close();
            
         } catch (SQLException e){
    System.err.println("hapus data gagal " + e.getMessage());
        
    }
        }
        public void updatedatasupplier(supplier supplier){
        
        
        String SQL =  "UPDATE  supplier SET nama_supplier=?,alamat=?,jumlah=? WHERE id_supplier=?";
        
        try {
        PreparedStatement update;
        
        update = koneksi.conn.prepareStatement(SQL);
        update.setString(1, supplier.getNama_supplier());
        update.setString(2, supplier.getAlamat());
        update.setInt(3, supplier.getJumlah());
        update.setString(4, supplier.getId_supplier());
        int i = update.executeUpdate();
            System.out.println(i+""+"data member berhasil di update");
            System.out.println("");
            update.close();
        }catch (SQLException e) {
            System.err.println("update data gagal" + e.getMessage());
        }

        

        
    }

    
    }
    

