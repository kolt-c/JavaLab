/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_fasade;

/**
 *
 * @author 1cadmin
 */
public class Example {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
       GPSPower power = new GPSPower();
       GPSNotifier notifier = new GPSNotifier();
       RoadAdvisor advisor = new RoadAdvisor();
       
       power.powerOn();
       
       notifier.downloadRoadInfo();
       
       advisor.route();
       
       power.powerOff();
   }
    
}
