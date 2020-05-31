/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less3;

import java.util.Arrays;

/**
 *
 * @author 1cadmin
 */
public class Less3 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1
        {
            String[] a = {"Каждый ", " охотник ", " желает ", " знать ", " где "
                    , " сидит ", " фазан "};
            for (int i = 0; i < a.length; i++){
                System.out.print(a[i]);
            }
            System.out.println();
            
            int n = a.length;
            
            String temp;
            
            for (int i = 0; i < n/2; i++){
                temp = a[n-i-1];
                a[n-i-1] = a[i];
                a[i] = temp;
            }
            
            for (int i = 0; i < a.length; i++){
                System.out.print(a[i]);
            }
            System.out.println();
        }
        
        //2
        {
            int[] mas1 = new int[5];
            int[] mas2 = new int[5];
            
            for (int i = 0; i < 5; i++){
                mas1[i] = (int) (Math.random()*6);
                mas2[i] = (int) (Math.random()*6);
            }
            System.out.println(Arrays.toString(mas1));
            System.out.println(Arrays.toString(mas2));
            
            double average1 = 0;
            double average2 = 0;
            
            for (int i = 0; i < 5; i++) {
                average1 +=mas1[i];
                average2 +=mas2[i];
            }
            
            average1 /=5;
            average2 /=5;
            
            if (average1 > average2) {
                System.out.println("Среднее арифметическое первого массива ("
                        + average1 + ") больше среднего арифметического " 
                        + "второго массива (" + average2 + ")");
            } else if (average1 < average2) {
                System.out.println("Среднее арифметическое первого массива ("
                        + average1 + ") меньше среднего арифметического " 
                        + "второго массива (" + average2 + ")");
            } else {
                System.out.println("Средние арифметические массивов равны ("
                        +average1+")");
            }
        }
        
        //3
        {
            int n = 4;
            int[][] a = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                   a[i][j] = n * i + j;
                }
            }
            
            System.out.println("Начальная матрица");
            System.out.println("------");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                   System.out.printf("%4d", a[i][j]);
                }
                System.out.println();
            }
            
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                   int temp = a[i][j];
                   a[i][j] = a[j][i];
                   a[j][i] = temp;
                   
                }
            }
            
            System.out.println("Новая матрица");
            System.out.println("------");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                   System.out.printf("%3d", a[i][j]);
                }
                System.out.println();
            }
        }
    }
    
}
