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
public class Solution6 {
    public int recursion(int n){
        if(n < 10){
            return n;
        } else {
            System.out.print(n%10 + " ");
            return recursion(n / 10);
        }
    }
}
