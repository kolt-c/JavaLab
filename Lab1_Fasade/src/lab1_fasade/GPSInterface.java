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
public class GPSInterface {

    private GPSPower power;
    private GPSNotifier notifier;
    private RoadAdvisor advisor;

    public GPSInterface(GPSPower power, GPSNotifier notifier, RoadAdvisor advisor){
        this.power = power;
        this.notifier = notifier;
        this.advisor = advisor;
    }
    
    public void activate(){
        power.powerOn();
        notifier.downloadRoadInfo();
        advisor.route();
    }
}
