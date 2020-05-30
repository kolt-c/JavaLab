/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less1;

import java.util.Scanner;

/**
 *
 * @author 1cadmin
 */
public class Less1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1
        {
        int a = 25;
        int b = 13;
        
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("Частное: " + (a / b));
        System.out.println("Остаток: " + (a % b));
        }
        
        //2
        {int a, b, c;
        Scanner in = new Scanner(System.in);
        
        System.out.print("A=");
        a = in.nextInt();
        System.out.print("B=");
        b = in.nextInt();
        
        c = a % b;
        System.out.println("Остаток: " + c);
        }
        
        //3
        {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        System.out.println("Ваше имя: " + name + " Ваш возраст: " + age);
        }
        
        //4
        {
        System.out.print("Введите любое дробное число: ");
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();
        System.out.println("Вы ввели число " + number);
        }
    }
    }
    

