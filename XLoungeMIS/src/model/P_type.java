/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author A.M
 */
public class P_type {
    private String p_type_name;
    private Integer p_type_id;

    public P_type() {
    }

    public P_type(String p_type_name, Integer p_type_id) {
        this.p_type_name = p_type_name;
        this.p_type_id = p_type_id;
    }

    public Integer getP_type_id() {
        return p_type_id;
    }

    public void setP_type_id(Integer p_type_id) {
        this.p_type_id = p_type_id;
    }

    

    public String getP_type_name() {
        return p_type_name;
    }

    public void setP_type_name(String p_type_name) {
        this.p_type_name = p_type_name;
    }
    
    
    
}
