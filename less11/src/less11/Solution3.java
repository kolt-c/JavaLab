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
public class Solution3 {
    public int recursion(double n) {
        if(n == 1) {
            return 1;
        } else if (n > 1 && n < 2){
            return 0;
        } else {
            return recursion(n / 2);
        }
    }
}
