
package sportsfinderapplication;

/**
 * User class to create and manipulate a user object
 * 
 * @author up782738
 * @version 1.0
 * @since 13/03/2018
 * 
 */

public class user {
    
    private String username;
    private String fName;
    private String lName;
    private int age;
    
    /**
     * 
     * Creates a new user object.
     * 
     */
    public user() {
        
    }
    
    /**
     *
     * Creates a new user object.
     * 
     * @param aUsername
     * 
     */
    public user(String aUsername) {
        username = aUsername;
    }
    
    /**
     *
     * Creates a new user object.
     * 
     * @param aUsername
     * @param aFname
     * @param aLname
     * @param aAge
     * 
     */
    public user(String aUsername, String aFname, String aLname, int aAge) {
        
        username = aUsername;
        fName = aFname;
        lName = aLname;
        age = aAge;
        
    }
    
    /**
     *
     * Set the username of a user object.
     * 
     * @param newUsername
     */
    public void setUsername (String newUsername) {
        username = newUsername;
    }
    
    /**
     *
     * Get the username of a user object.
     * 
     * @return
     */
    public String getUsername () {
        return username;
    }
    
    /**
     *
     * Set the first name of a user object.
     * 
     * @param newFname
     */
    public void setFname (String newFname) {
        fName = newFname;
    }
    
    /**
     *
     * Get the first name of the user object.
     * 
     * @return
     */
    public String getFname () {
        return fName;
    }
    
    /**
     *
     * Set the last name of a user object.
     * 
     * @param newLname
     */
    public void setLname (String newLname) {
        lName = newLname;
    }
    
    /**
     *
     * Get the last name of a user object.
     * 
     * @return
     */
    public String getLname () {
        return lName;
    }
    
    /**
     *
     * Set the age of a user object.
     * 
     * @param newAge
     */
    public void setAge (int newAge) {
        age = newAge;
    }
    
    /**
     *
     * Get the age of a user object.
     * 
     * @return
     */
    public int getAge () {
        return age;
    }
   
}