
package Conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Database {
    
    public static String url = "jdbc:mysql://localhost:3306/library";
    public static String user = "root";
    public static String password = "";
    
    public static Connection con = null;
    
    public static Connection getDatabaseConnection(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
            
            //JOptionPane.showMessageDialog(null, "Database Connected !");
 
        }
        catch(Exception Ex){
            JOptionPane.showMessageDialog(null, "Database can't be access !");
            System.exit(0);
            
        
        }
        
        return con;
    
    }
    
    public static void disconnectDatabase(){
    
        try{
            con.close();
        
            //JOptionPane.showMessageDialog(null, "Database disconnected");
            
        }catch(Exception ex){
        
            JOptionPane.showMessageDialog(null,"Error : \n"+ex);
            
        }
    }
    
}
