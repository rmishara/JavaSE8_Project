
package pharmacy;

public class Student {
    
 
    
    String UserName = "admin";
    String Password = "admin123";
    
            
    boolean checkLogin(String username,String password){
        
        boolean login = false;
        
        if(username.equals(UserName)&& password.equals(Password)){
            login = true;
            
        }
        else{
            login = false;
            
        }
        return login;
        
    }
    
    
    
    
    
    
    }
    
    

