
package sportsfinderapplication;

/**
 *
 * @author up782738
 */

public class controller {
    
    public static void controller() {
    
    }
  
    //Return true if String 'word' contains only letters
    public static boolean isAlpha(String word) {
        return word.matches("[a-zA-Z]+");
    }
    
    //Return true if String 'word' has a length higher than 0 and is less than or equal to 20
    public static boolean checkLength(String word) 
    {
        if(word.length() <= 20 && word.length() > 0) 
        {
            return true;
        } 
            return false;
    }
    
    //Return true if String 'str' is only numeric
    public static boolean isNumeric(String str)
    {
        for (char c : str.toCharArray())
        {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
    
    //Return true if all previous methods return true
    public static boolean inputsValid(String userid, String fname, String lname, String password, String age)
    {
        if(checkLength(userid) == true && checkLength(fname) == true && checkLength(lname) == true && checkLength(password) == true && isAlpha(fname) == true && isAlpha(lname) == true && isNumeric(age) == true){
            return true;
        } 
        return false;
    }
    
    
}


