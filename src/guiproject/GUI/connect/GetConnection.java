
package guiproject.GUI.connect;

import java.sql.*;
public class GetConnection {
    
 public static Connection connectdb(){
     try{
             
            Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstbank","root","");
           System.out.println("connected");
                 
           //Statement mystatment =conn.createStatement();
           //ResultSet myRS=mystatment.executeQuery("SELECT * from user_id");
           return conn;
     }
          
           catch(Exception e){
        
        System.out.println("Error:"+e.getMessage());
    }
             return null;
 }
        
   public static void main(String args[]){ 
       connectdb();
       
   } 
       
     
     
 
}
   

  
