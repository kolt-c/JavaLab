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
public class Factorial {

    int fact(int n){
        int result;
        if(n==1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}

