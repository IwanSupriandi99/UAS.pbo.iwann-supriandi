package Mahasiswa;
import java.sql.*;
import javax.swing.JOptionPane;
public class koneksii {
    Connection iwan;
    public static Connection BukaKoneksi(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection iwan = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahasiswa","root","");
            return iwan;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
