/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawan.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author afrihar
 */
public class KoneksiDatabase {

    private static Connection koneksi;

    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:postgresql://192.168.1.252:5432/data_karyawan";
                String user = "afrihar";
                String pass = "nokiae71";

                DriverManager.registerDriver(new org.postgresql.Driver());
                koneksi = DriverManager.getConnection(url, user, pass);
            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(null, "Terjadi Error !!!");
            }
        }
        return koneksi;
    }
}
