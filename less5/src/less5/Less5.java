/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less5;

import java.util.Scanner;
/**
 *
 * @author 1cadmin
 */
public class Less5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1 
        task1();
        
        task2();
        task3();
    }
    
    static void task1(){
        int a = 12;
        int b = 2;
        try{
            int result = a / (b - 2);
            System.out.println(result);
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    static void task2(){
        int[] numbers = new int[3];
        
        try{
            numbers[6] = 45;
            numbers[6] = Integer.parseInt("gfd");
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Выход за пределы массива");
        }
        catch(NumberFormatException ex){
            System.out.println("Ошибка преобразования из строки в число");
        }
        
    }
    
    static void task3(){
        try{
            Scanner in = new Scanner(System.in);
            
            int x = in.nextInt();
            if(x >= 30){
                throw new Exception("Число х должно быть меньше 30");
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Программа завершена");
        
    }
}
