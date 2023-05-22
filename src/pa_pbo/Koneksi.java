
package pa_pbo;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class Koneksi {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/pa_pbo";
    static final String USER = "root";
    static final String PASS = ""; 
    public java.sql.Connection koneksi;
    public Statement statement;
    
    public Koneksi(){
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (java.sql.Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            statement = koneksi.createStatement();
            System.out.println("Koneksi Berhasil");
            
        }
        
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
    
    public java.sql.Connection getConnection(){
        return koneksi;
    }
}
