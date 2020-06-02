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
public class Solution5 {
    public int recursion(int n){
        if(n < 10){
            return n;
        } else {
            return n%10 + recursion(n/10);
        }
    }
}
