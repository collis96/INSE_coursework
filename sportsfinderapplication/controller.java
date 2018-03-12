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

public class controller {
    
    public static void controller() {
    
    }
  
    public static boolean isAlpha(String word) {
        return word.matches("[a-zA-Z]+");
    }
    
    public static boolean checkLength(String word) 
    {
        if(word.length() <= 20 && word.length() > 0) 
        {
            return true;
        } 
            return false;
    }
    
    public static boolean isNumeric(String str)
    {
        for (char c : str.toCharArray())
        {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
    
    public static boolean inputsValid(String userid, String fname, String lname, String password, String age)
    {
        if(checkLength(userid) == true && checkLength(fname) == true && checkLength(lname) == true && checkLength(password) == true && isAlpha(fname) == true && isAlpha(lname) == true && isNumeric(age) == true){
            return true;
        } 
        return false;
    }
    
    
}


