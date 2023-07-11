/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Farhan
 */
public class tampildata {
    public void tampildatabarang(){
        String sql = "SELECT * FROM barang";
        try{
            Statement stmt;
            ResultSet rs;
            
            stmt = koneksi.conn.createStatement();
            
            rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                System.out.println("kode barang : " + rs.getString("kode_barang"));
                System.out.println("merk        : " + rs.getString("merk"));
                System.out.println("jenis       : " + rs.getString("jenis"));
                System.out.println("harga       : " + "Rp" + rs.getInt("harga"));
                System.out.println("stok        : " + rs.getInt("stok"));
                System.out.println("");
            }
            stmt.close();
        } catch (SQLException e){
            System.err.println("koneksi gagal" +e.getMessage());
        }
    }
    
        public void tampildatamember(){
        String sql = "SELECT * FROM member";
        try{
            Statement stmt;
            ResultSet rs;
            
            stmt = koneksi.conn.createStatement();
            
            rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                System.out.println("id member         : " + rs.getString("id_member"));
                System.out.println("nama member       : " + rs.getString("nama_member"));
                System.out.println("jenis kelamin     : " + rs.getString("jk"));
                System.out.println("nomor telepon     : " + rs.getString("no_telepon"));
                System.out.println("alamat            : " + rs.getString("alamat"));
                System.out.println("");
            }
            stmt.close();
        } catch (SQLException e){
            System.err.println("koneksi gagal" +e.getMessage());
        }
        
    }
        public void tampildatapenjualan(){
        String sql = "SELECT * FROM penjualan";
        try{
            Statement stmt;
            ResultSet rs;
            
            stmt = koneksi.conn.createStatement();
            
            rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                System.out.println("no_transaksi        : " + rs.getInt("no_transaksi"));
                System.out.println("kode_barang         : " + rs.getString("kode_barang"));
                System.out.println("merk                : " + rs.getString("merk"));
                System.out.println("harga               : " + "Rp." + rs.getInt("harga"));
                System.out.println("jumlah              : " + rs.getInt("jumlah"));
                System.out.println("total               : " + "Rp." + rs.getInt("total"));
            }
            stmt.close();
        } catch (SQLException e){
            System.err.println("koneksi gagal" +e.getMessage());
        }
}
    public void tampildatasupllier(){
        String sql = "SELECT * FROM supplier";
        try{
            Statement stmt;
            ResultSet rs;
            
            stmt = koneksi.conn.createStatement();
            
            rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                System.out.println("id supplier          : " + rs.getInt("id_supplier"));
                System.out.println("nama supplier        : " + rs.getString("nama_supplier"));
                System.out.println("alamat               : " + rs.getString("alamat"));
                System.out.println("jumlah               : " + rs.getInt("jumlah"));
               
            }
            stmt.close();
        } catch (SQLException e){
            System.err.println("koneksi gagal" +e.getMessage());
        }    
}
    
}
