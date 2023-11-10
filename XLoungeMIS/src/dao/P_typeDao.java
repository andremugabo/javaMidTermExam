
package dao;
import model.*;
import java.sql.*;
import java.util.*;

public class P_typeDao {
    
    String db_url = "jdbc:mysql://localhost:3306/xloungepub_managment_system_db";
    String username = "root";
    String password = "";
    
    Connection con = null;
    PreparedStatement pst = null;
    String query = "";
    int rowAffected;
    ResultSet result = null;
    
            

    public P_typeDao() {
    }
    
    public List<P_type>  selectProductType(P_type ptypeObj)
    {
        try {
            con = DriverManager.getConnection(db_url, username, password);
            query = "select * from p_type where pt_status = 1";
            pst = con.prepareStatement(query);
            result = pst.executeQuery();
            List<P_type> ptypeList = new ArrayList<>();
            
            while(result.next())
            {
            P_type ptype = new P_type();
            ptype.setP_type_id(result.getInt("pt_id"));
            ptype.setP_type_name(result.getString("pt_name"));
            ptypeList.add(ptype);         
                       
            }
            con.close();
            return ptypeList; 
            
            
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            return null;
        }
    }
    
}
