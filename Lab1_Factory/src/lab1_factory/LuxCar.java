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
class LuxCar extends Car{
    public LuxCar(){
        name = "Luxury car";
        accessories.add("Leather salon");
        accessories.add("Air condition");
        accessories.add("GPS");
        accessories.add("Heated steering wheel");
    }
}
