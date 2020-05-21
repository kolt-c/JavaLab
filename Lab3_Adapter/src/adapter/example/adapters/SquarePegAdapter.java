/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.example.adapters;

/**
 *
 * @author 1cadmin
 */

import adapter.example.round.RoundPeg;
import adapter.example.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;
    
    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }
    
    @Override
    public double getRadius() {
        double result;
        
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
