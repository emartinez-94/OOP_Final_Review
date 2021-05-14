/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Odometer;

/**
 *
 * @author hazama
 */
public class Odometer {
    private double milesDriven, fuelEfficiency;
    
    void reset(){
        milesDriven = 0;
    }
    void setEfficiency(double fe){
        fuelEfficiency = fe;
    }
    void setOdometer(double mi){
        milesDriven = mi;
    }
    double gasConsumed(){
        return milesDriven/fuelEfficiency;
    }
}
