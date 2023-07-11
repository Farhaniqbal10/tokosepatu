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
public class member { 
    private String id_member;
    private String nama_member;
    private String jk;
    private String no_telepon;
    private String alamat;

    public member() {
        this.id_member = id_member;
        this.nama_member = nama_member;
        this.jk = jk;
        this.no_telepon = no_telepon;
        this.alamat = alamat;
    }

    public String getId_member() {
        return id_member;
    }

    public void setId_member(String id_member) {
        this.id_member = id_member;
    }

    public String getNama_member() {
        return nama_member;
    }

    public void setNama_member(String nama_member) {
        this.nama_member = nama_member;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getNo_telepon() {
        return no_telepon;
    }

    public void setNo_telepon(String no_telepon) {
        this.no_telepon = no_telepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    



    public void tambahmember(member member){
        
        
        String SQL = "INSERT INTO member(id_member,nama_member,jk,no_telepon,alamat) " 
                + "VALUES(?,?,?,?,?)";
        
        try {
        PreparedStatement tambah;
        
        tambah = koneksi.conn.prepareStatement(SQL);
        tambah.setString(1, member.getId_member());
        tambah.setString(2, member.getNama_member());
        tambah.setString(3, member.getJk());
        tambah.setString(4, member.getNo_telepon());
        tambah.setString(5, member.getAlamat());
        int i = tambah.executeUpdate();
            System.out.println(i+""+"data member berhasil di tambah");
            System.out.println("");
            tambah.close();
        }catch (SQLException e) {
            System.err.println("tambah data gagal" + e.getMessage());
        }
        }
        
    public void hapusdatamember(member member){
        String sql ="DELETE FROM member WHERE id_member  = ?";
        
        try{
            PreparedStatement hapus;
            
            hapus = koneksi.conn.prepareStatement(sql);
            hapus.setString(1, member.getId_member());
            int i = hapus.executeUpdate();
            System.out.println(i + "data member berhasil dihapus");
            System.out.println("");
            hapus.close();
            
         } catch (SQLException e){
    System.err.println("hapus data gagal " + e.getMessage());
        
    }
        }
        public void updatedatamember(member member){
        
        
        String SQL =  "UPDATE  member SET nama_member=?,jk=?,no_telepon=?,alamat=? WHERE id_member=?";
        
        try {
        PreparedStatement update;
        
        update = koneksi.conn.prepareStatement(SQL);
        update.setString(1, member.getNama_member());
        update.setString(2, member.getJk());
        update.setString(3, member.getNo_telepon());
        update.setString(4, member.getAlamat());
        update.setString(5, member.getId_member());
        int i = update.executeUpdate();
            System.out.println(i+""+"data member berhasil di update");
            System.out.println("");
            update.close();
        }catch (SQLException e) {
            System.err.println("update data gagal" + e.getMessage());
        }

        
    }

    
    }
    


