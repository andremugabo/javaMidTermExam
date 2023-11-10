package model;


public class Session {
    private int s_id;
    private int session_creator;
    private String s_reference;
    private String s_date; 

    public Session() {
    }

    public Session(int s_id, int session_creator, String s_reference, String s_date) {
        this.s_id = s_id;
        this.session_creator = session_creator;
        this.s_reference = s_reference;
        this.s_date = s_date;
    }

    public int getS_id() {
        return s_id;
    }

    public int getSession_creator() {
        return session_creator;
    }

    public String getS_reference() {
        return s_reference;
    }

    public String getS_date() {
        return s_date;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public void setSession_creator(int session_creator) {
        this.session_creator = session_creator;
    }

    public void setS_reference(String s_reference) {
        this.s_reference = s_reference;
    }

    public void setS_date(String s_date) {
        this.s_date = s_date;
    }
    
    
    
}
