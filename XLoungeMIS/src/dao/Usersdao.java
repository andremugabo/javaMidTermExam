
package dao;

import java.sql.*;
import model.Users;
import java.util.*;


public class Usersdao {
        String db_url = "jdbc:mysql://localhost:3306/xloungepub_managment_system_db";
        String username = "root";
        String password = "";
        Connection con = null;
        PreparedStatement pst = null;
        String query = "";
        int rowAffected;
        ResultSet rs = null;
        Users theUSer = new Users();
        boolean flag = false;

    public Usersdao() {
    }
    
    
        
    
    public String createUsers(Users usersObj)
    { 
        try 
        {
            con = DriverManager.getConnection(db_url, username, password);
            query = "insert into users(u_name,u_phone,u_email,u_password) values(?,?,?,?)";
            pst = con.prepareStatement(query);
            pst.setString(1, usersObj.getU_names());
            pst.setString(2,usersObj.getU_phone());
            pst.setString(3,usersObj.getU_email());
            pst.setString(4,usersObj.getU_password());
            
            rowAffected =pst.executeUpdate();
            con.close();
            if(rowAffected >= 1)
            {
                return "User Created Successfully ";
            }
            else
            {
                return "CREATING USER FAILED";
            }
        } 
        catch (Exception e)
        {
            e.printStackTrace();
            return "SERVER ERROR";
        }
    
    
    }
    
    
    
    public Users checkIfUserExits(Users usersObj)
    { 
        try 
        {
            con = DriverManager.getConnection(db_url, username, password);
            query = "select count(*) as user from  users where u_phone = ? and u_password = ? and u_status = 1";
            pst = con.prepareStatement(query);
            pst.setString(1,usersObj.getU_phone());
            pst.setString(2,usersObj.getU_password());
            
            rs =pst.executeQuery();
            if(rs.next())
            {
               int count = rs.getInt("user");
               if(count >= 1){
                    query = "select u_role  from  users where u_phone = ? and u_password = ? and u_status = 1";
                    pst = con.prepareStatement(query);
                    pst.setString(1,usersObj.getU_phone());
                    pst.setString(2,usersObj.getU_password());
                    ResultSet result = null;
                    result =pst.executeQuery();
                    
                    while (result.next()) {                       
                       theUSer.setU_role(result.getString("u_role")); 
                       flag = true;
                   }
                   con.close();  
                   
                  
               }else
               {
                   return null;
               }
            }
             if(flag)
                   {
                     return theUSer;
                   }
             else{
                       return null;
                   }
        } 
       
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    
        
        
        
    
    }
    
    
    
    
    
    
}
