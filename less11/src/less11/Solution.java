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
public class Solution {
    public String recursion(int n){
        if(n == 1) return "1";
        return recursion(n - 1) + " " + n;
    }
}
