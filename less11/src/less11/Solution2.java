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
public class Solution2 {
    public String recursion(int a, int b) {
        if(a > b){
            if(a == b){
                return Integer.toString(a);
            }
            return a + " " + recursion(a -1, b);
        } else {
            if(a == b){
                return Integer.toString(a);
            }
            return a + " " + recursion(a +1, b);
        }
    }
}
