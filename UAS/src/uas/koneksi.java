/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;



import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author Farhan
 */
public class koneksi {
    static final String URL ="jdbc:mysql://localhost/toko_sepatu";
    static final String USER = "root";
    static final String PASSWORD ="";


static Connection conn;

public void koneksi() { 
      try {
         
            Class.forName("com.mysql.jdbc.Driver");
            conn =DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("koneksi berhasil;");
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
    }
    
}


