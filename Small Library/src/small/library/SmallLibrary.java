
package small.library;


public class SmallLibrary {

    String UserName = "admin";
    String Password = "admin";
    
    boolean checkLogin (String username,String password) {
       
        boolean login = false;
        
        if(username.equals(UserName)&& password.equals(Password)){
            
            login = true;
        }
        
        else {
            login = false;
        }
        return login;
    }
    
}
