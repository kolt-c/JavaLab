/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_factory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1cadmin
 */
abstract class Car {
    String name;
    List <String> accessories = new ArrayList();
    
    public String toString(){
        return "Model car: " + name + "\n" + accessories;
    }
}
