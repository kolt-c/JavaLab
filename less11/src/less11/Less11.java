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
public class Less11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1 Recursion
        Factorial fact = new Factorial();
        System.out.println("Факториал 5 = " + fact.fact(5));
        System.out.println("Факториал 10 = " + fact.fact(10));
        System.out.println("Факториал 12 = " + fact.fact(12));
        System.out.println("Факториал 15 = " + fact.fact(15));
        
        //2 Recursion
        Solution sol = new Solution();
        System.out.println(sol.recursion(10));
        
        //3
        Solution2 sol2 = new Solution2();
        
        System.out.println(sol2.recursion(20, 15));
        
        System.out.println(sol2.recursion(10, 15));
        
        //4
        double n = 64;
        Solution3 sol3 = new Solution3();
        if(sol3.recursion(n) == 1){
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
        
        //5
        Solution5 sol5 = new Solution5();
        System.out.println(sol5.recursion(123));
        
        //6
        Solution6 sol6 = new Solution6();
        System.out.println(sol6.recursion(123));
        
        //7
        Solution7 sol7 = new Solution7();
        System.out.println(sol7.recursion(153));
        
        //8
        Solution8 sol8 = new Solution8();
        System.out.println(sol8.recursion("radar"));
        
        if(sol8.recursion2("radar")){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
}
