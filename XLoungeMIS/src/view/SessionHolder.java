/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author A.M
 */
public  class SessionHolder {
  static  Integer  userID;
  static  String userName;

    public static Integer getUserID() {
        return userID;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserID(Integer userID) {
        SessionHolder.userID = userID;
    }

    public static void setUserName(String userName) {
        SessionHolder.userName = userName;
    }

    public SessionHolder() {
    }
  
    
    
    
}
