
package model;

public class Products {
    private int pt_id;
    private int pc_id;
    private String p_name;
    private int qty;
    private Float p_purchase_price;
    private Float p_selling_price;
    public Products() {
    }

    public Products(int pt_id, int pc_id, String p_name, int qty, Float p_purchase_price, Float p_selling_price) {
        this.pt_id = pt_id;
        this.pc_id = pc_id;
        this.p_name = p_name;
        this.qty = qty;
        this.p_purchase_price = p_purchase_price;
        this.p_selling_price = p_selling_price;
    }

    public int getPt_id() {
        return pt_id;
    }

    public int getPc_id() {
        return pc_id;
    }

    public String getP_name() {
        return p_name;
    }

    public int getQty() {
        return qty;
    }

    public Float getP_purchase_price() {
        return p_purchase_price;
    }

    public Float getP_selling_price() {
        return p_selling_price;
    }

    public void setPt_id(int pt_id) {
        this.pt_id = pt_id;
    }

    public void setPc_id(int pc_id) {
        this.pc_id = pc_id;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setP_purchase_price(Float p_purchase_price) {
        this.p_purchase_price = p_purchase_price;
    }

    public void setP_selling_price(Float p_selling_price) {
        this.p_selling_price = p_selling_price;
    }
    
}
