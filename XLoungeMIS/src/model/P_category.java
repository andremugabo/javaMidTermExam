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
public class P_category {
    private int pc_id;
    private String pc_name;

    public P_category() {
    }

    public P_category(int pc_id, String pc_name) {
        this.pc_id = pc_id;
        this.pc_name = pc_name;
    }

    public int getPc_id() {
        return pc_id;
    }

    public String getPc_name() {
        return pc_name;
    }

    public void setPc_id(int pc_id) {
        this.pc_id = pc_id;
    }

    public void setPc_name(String pc_name) {
        this.pc_name = pc_name;
    }
    
    
}
