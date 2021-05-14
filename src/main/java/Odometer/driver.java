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
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Odometer car = new Odometer();
        //Trip 1
        car.setOdometer(100);
        car.setEfficiency(45);
        System.out.print("For your fuel-efficient small car\n"
                +"After 100 miles, " + car.gasConsumed() + " gallons used."
                
        );
        car.setOdometer(150);
        car.setEfficiency(45);
        System.out.print("After another 50 miles, " 
                + car.gasConsumed() 
                + " gallons used."
        );
        
    }
    
}
