/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less4;

/**
 *
 * @author 1cadmin
 */
public class Less4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1
        hello();
        welcome();
        welcome();
        
        int a = 6;
        int b = 8;
        System.out.println(sum(a,b));
        System.out.println(sum(3,a));
        System.out.println(sum(5,23,1,10));
        System.out.println(sum(5.0,23.3,1.7,10));
    }
    
    static void hello(){
        System.out.println("Hello");
    }
    
    static void welcome(){
        System.out.println("Welcome to java");
    }
    
    static int sum(int ...nums){
        int z = 0;
        for(int n: nums)
            z += n;
        return z;
    }
    
    static double sum(double ...nums){
        double z = 0;
        for(double n: nums)
            z += n;
        return z;
    }
}
