/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sportsfinderapplication;

/**
 *
 * @author up782738
 */

public class user {
    
    private String username;
    private String fName;
    private String lName;
    private int age;
    
    public user() {
        
    }
    
    public user(String aUsername) {
        username = aUsername;
    }
    
    public user(String aUsername, String aFname, String aLname, int aAge) {
        
        username = aUsername;
        fName = aFname;
        lName = aLname;
        age = aAge;
        
    }
    
    public void setUsername (String newUsername) {
        username = newUsername;
    }
    
    public String getUsername () {
        return username;
    }
    
    public void setFname (String newFname) {
        fName = newFname;
    }
    
    public String getFname () {
        return fName;
    }
    
    public void setLname (String newLname) {
        lName = newLname;
    }
    
    public String getLname () {
        return lName;
    }
    
    public void setAge (int newAge) {
        age = newAge;
    }
    
    public int getAge () {
        return age;
    }
   
}