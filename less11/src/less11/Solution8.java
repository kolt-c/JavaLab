/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less11;

/**
 *
 * @author 1cadmin
 */
public class Solution8 {
    public String recursion(String s) {
        if (s.length() == 1){
            return "YES";
        } else {
            if(s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))){
                if(s.length() == 2){
                    return "YES";
                }
                return recursion(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }
    
    public boolean recursion2(String s) {
        char firstChar;
        char lastChar;
        int size = s.length();
        String subString;
        if(size <= 1) {
            return true;
        } else {
            firstChar = s.toCharArray()[0];
            lastChar = s.toCharArray()[size - 1];
            subString = s.substring(1, size - 1);
            return firstChar == lastChar && recursion2(subString);
        }
    }
}
