
package dao;
import java.sql.*;
import model.*;


public class ProductsDao {
    private String db_url = "jdbc:mysql://localhost:3306/xloungepub_managment_system_db";
    private String username = "root";
    private String password = "";
    Products pdObj = null;
    int rowAffected;
    Connection con = null;
    PreparedStatement pst = null;
    String query = "";
    ResultSet result = null;
    

    public ProductsDao() {
    }
    
    public String productsInsert(Products productObj)
    {
        try {
            
            con = DriverManager.getConnection(db_url, username, password);
            query = "insert into products(pt_id,pc_id,p_name,p_qty,p_purchase,p_selling_price) values(?,?,?,?,?,?)";
            pst = con.prepareStatement(query);
            pst.setInt(1,productObj.getPt_id());
            pst.setInt(2,productObj.getPc_id());
            pst.setString(3, productObj.getP_name());
            pst.setInt(4, productObj.getQty());
            pst.setFloat(5,productObj.getP_purchase_price());
            pst.setFloat(6,productObj.getP_selling_price());
            
            rowAffected = pst.executeUpdate();
            con.close();
            if(rowAffected >= 1)
            {
                return "PRODUCT REGISTERED SUCCESSFULLY";
            }
            else
            {
               return "REGISTRATION FAILED ";     
            }
            
            
           
        }
        catch (Exception e) 
        {
            e.printStackTrace();
            return "SERVER ERROR";
        }
    }
    
    public boolean checkIfProductExist(Products proDObj)
    {
        try {
            con = DriverManager.getConnection(db_url, username, password);
            query= "select count(*) as pro from products where p_name = ? ";
            pst = con.prepareStatement(query);
            pst.setString(1, proDObj.getP_name());
            result = pst.executeQuery();
            
            if (result.next()) {
                int check = result.getInt("pro");
                con.close();
                if (check >= 1) {
                    return false;
                } else {
                    return true;
                }
            }
            else
            {
             return false;
            }
            
            
            
            
        } 
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
}
