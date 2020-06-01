/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less10;

/**
 *
 * @author 1cadmin
 */
public class Calculator {
    int c;
    
    public void addition(int a, int b){
        c = a + b;
        System.out.println("Сумма чисел: " + c);
    }
    
    public void substraction(int a, int b){
        c = a - b;
        System.out.println("Разность чисел: " + c);
    }
}
