package dao;

import java.sql.*;
import model.*;

public class sessionDao {
    String db_url = "jdbc:mysql://localhost:3306/xloungepub_managment_system_db";
        String username = "root";
        String password = "";
        Connection con = null;
        PreparedStatement pst = null;
        String query = "";
        int rowAffected;
        ResultSet result = null;
        Session theSession = new Session();
        boolean flag = false;
        
        public String createSession(Session sessObj)
    { 
        try 
        {
            con = DriverManager.getConnection(db_url, username, password);
            query = "insert into session(u_id,s_reference) values(?,?)";
            pst = con.prepareStatement(query);
            pst.setInt(1, sessObj.getSession_creator());
            pst.setString(2,sessObj.getS_reference());
           
            
            rowAffected =pst.executeUpdate();
            con.close();
            if(rowAffected >= 1)
            {
                return "SESSION CREATED SUCCESSFULLY ";
            }
            else
            {
                return "CREATING SESSION FAILED";
            }
        } 
        catch (Exception e)
        {
            e.printStackTrace();
            return "SERVER ERROR";
        }
    
    
    }
        
        
    public int countSession()
    {
        try {
            con = DriverManager.getConnection(db_url, username, password);
            query= "select count(*) as counter from session";
            pst = con.prepareStatement(query);
            result = pst.executeQuery();
            int check = -1;
            if (result.next()) {
                check = result.getInt("counter");
                con.close();
               
            }
           
            return check;
            
            
            
        } 
        catch (Exception e)
        {
            e.printStackTrace();
            return -1;
        }
    
    
    
    
    } 
    
    
    public int countOpenSession()
    {
        try {
            con = DriverManager.getConnection(db_url, username, password);
            query= "select count(*) as counter from session where s_status = 'OPEN'";
            pst = con.prepareStatement(query);
            result = pst.executeQuery();
            int check = 0;
            if (result.next()) {
                check = result.getInt("counter");
                con.close();
               
            }
           
            return check;
            
            
            
        } 
        catch (Exception e)
        {
            e.printStackTrace();
            return 2;
        }
    
    
    
    
    } 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
