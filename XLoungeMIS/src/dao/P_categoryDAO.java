
package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.*;

public class P_categoryDAO {
    
    private String db_url = "jdbc:mysql://localhost:3306/xloungepub_managment_system_db";
    private String username = "root";
    private String password = "";
    
    String query = "";
    Connection con = null;
    PreparedStatement pst = null;
    int rowAffected;
    P_type thetype  = null;
    P_category theCatecory = null;
    boolean flag = false;    
    ResultSet result = null;

    public P_categoryDAO() {
    }
    
    public List<P_category> selectCategoryByType(P_type ptypeOBJ)
    {
        try {
            con = DriverManager.getConnection(db_url, username,password);
            query = "select * from p_category where pt_id = ?";
            pst = con.prepareStatement(query);
            pst.setInt(1,ptypeOBJ.getP_type_id());
            result = pst.executeQuery();
            List<P_category> categoryItems = new ArrayList<>();
           
            
            while(result.next())
            {
                 theCatecory = new P_category();
                theCatecory.setPc_id(result.getInt("pc_id"));
                theCatecory.setPc_name(result.getString("pc_name"));
                flag = true;
                categoryItems.add(theCatecory);
            }
            con.close();
            if(flag)
            {
            return categoryItems;
            }
            else
            {
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
