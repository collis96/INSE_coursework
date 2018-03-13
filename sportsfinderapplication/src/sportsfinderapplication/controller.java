
package sportsfinderapplication;

/**
 *
 * The controller class handles the controller aspect of an MVC system architecture
 * 
 * @author up782738
 * @version 1.0
 * @since 13/03/2018
 * 
 */

public class controller {
    
    /**
     * Creates new controller object
     */
    public static void controller() {
    
    }

    /**
     *
     * Method that returns true if 'word' is comprised of only letters
     * 
     * @param word
     * @return true or false
     */
    public static boolean isAlpha(String word) {
        return word.matches("[a-zA-Z]+");
    }
    

    /**
     *
     * Method that returns true if 'word' length fits the conditional statement
     * 
     * @param word
     * @return true or false
     */
    public static boolean checkLength(String word) 
    {
        if(word.length() <= 20 && word.length() > 0) 
        {
            return true;
        } 
            return false;
    }
    
    //Return true if String 'str' is only numeric

    /**
     *
     * Method that returns true if 'str' is only numeric
     * 
     * @param str
     * @return true or false
     */
    public static boolean isNumeric(String str)
    {
        for (char c : str.toCharArray())
        {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    /**
     *
     * Method that returns true if all previous methods return true
     * 
     * @param userid
     * @param fname
     * @param lname
     * @param password
     * @param age
     * @return true or false
     */
    public static boolean inputsValid(String userid, String fname, String lname, String password, String age)
    {
        if(checkLength(userid) == true && checkLength(fname) == true && checkLength(lname) == true && checkLength(password) == true && isAlpha(fname) == true && isAlpha(lname) == true && isNumeric(age) == true){
            return true;
        } 
        return false;
    }
    
    
}


