
package model;


public class Users {
    private Integer u_id;
    private String u_names;
    private String u_phone;
    private String u_email;
    private String u_password;
    private String u_role;

    public Users() {
    }

    public Users(Integer u_id, String u_names, String u_phone, String u_email, String u_password, String u_role) {
        this.u_id = u_id;
        this.u_names = u_names;
        this.u_phone = u_phone;
        this.u_email = u_email;
        this.u_password = u_password;
        this.u_role = u_role;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }


    public String getU_names() {
        return u_names;
    }

    public String getU_phone() {
        return u_phone;
    }

    public String getU_email() {
        return u_email;
    }

    public String getU_password() {
        return u_password;
    }

    public String getU_role() {
        return u_role;
    }

    public void setU_names(String u_names) {
        this.u_names = u_names;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public void setU_role(String u_role) {
        this.u_role = u_role;
    }
    
    
    
    
    
    
    
    
    
}

