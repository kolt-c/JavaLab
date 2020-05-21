/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_factory;

/**
 *
 * @author 1cadmin
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarFactory myLuxFactory = new LuxCarFactory();
        CarFactory myBasicFactory = new BasicCarFactory();
        
        Car myLuxCar = myLuxFactory.createCar();
        Car myBasicCar = myBasicFactory.createCar();
        
        System.out.println(myLuxCar);
        System.out.println(myBasicCar);
    }
    
}
