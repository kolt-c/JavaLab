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
public class Solution7 {
    public String recursion(int n){
        if(n < 10){
            return Integer.toString(n);
        } else {
            return recursion(n / 10) + " " + n % 10;
        }
    }
}
