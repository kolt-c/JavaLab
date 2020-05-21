/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.example.square;

/**
 *
 * @author 1cadmin
 */
public class SquarePeg {
    private double width;
    
    public SquarePeg(double width) {
        this.width = width;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getSquare() {
        double result;
        result = Math.pow(this.width,2);
        return result;
    }
}
