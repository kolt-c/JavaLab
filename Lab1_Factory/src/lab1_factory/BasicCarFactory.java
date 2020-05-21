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
class BasicCarFactory extends CarFactory{
    public Car createCar(){
        return new BasicCar();
    }
}
