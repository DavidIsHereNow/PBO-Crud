/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heroes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Heroes {
    public static Connection con;

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/one","root","");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error Driver");
        } catch (SQLException ex) {
            System.out.println("Error Databse");
       
        }
       
    
}
      }