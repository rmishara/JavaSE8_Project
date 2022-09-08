package Conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Database {
    
    public static String url = "jdbc:mysql://localhost:3306/pharmacy";
    public static String user= "root";
    public static String password="123";
    
    public static Connection con= null;
    
    public static Connection getDatabaseConnection() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
            
           // JOptionPane.showMessageDialog(null,"Database Connected !");
    }catch(Exception ex){
    JOptionPane.showMessageDialog(null,"Database No Access.");
            System.exit(0);
    }
    return con;      
            
        }
public static void disconnectDatabase(){

try{
con.close();

  // JOptionPane.showMessageDialog(null,"Database Dissconnected");
}catch(SQLException ex){
JOptionPane.showMessageDialog(null,"Error : \n"+ex);
    }
    
}
}