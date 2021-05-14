/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;
import javax.swing.*;
public class Driver {
    static void pizzaCost(Pizza pizza){
        JOptionPane.showMessageDialog(null, pizza.getDescription(),"Pizza",JOptionPane.PLAIN_MESSAGE);
        
    }
     static void pizzaToppings(Pizza pizza){
         String cheese = JOptionPane.showInputDialog(
            null,
            "How many cheese toppings do you want?",
            "Pizza Cheese",
            JOptionPane.PLAIN_MESSAGE
        );
        String pepperoni = JOptionPane.showInputDialog(
            null,
            "How many pepperoni toppings do you want?",
            "Pizza Pepperoni",
            JOptionPane.PLAIN_MESSAGE
        );
        String ham = JOptionPane.showInputDialog(
            null,
            "How many ham toppings do you want?",
            "Pizza Ham",
            JOptionPane.PLAIN_MESSAGE
        );
        
        try{
            int c = Integer.parseInt(cheese);
            int h = Integer.parseInt(ham);
            int p = Integer.parseInt(pepperoni);
            pizza.setCheese(c);
            pizza.setHam(h);
            pizza.setPepperoni(p);
            pizzaCost(pizza);
            
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, e,"Error!",JOptionPane.ERROR_MESSAGE);
        }
        
     }
    static void pizzaSize(Pizza pizza){
        String size = JOptionPane.showInputDialog(
            null,
            "What Size do you want your Pizza to be?",
            "Pizza Size",
            JOptionPane.PLAIN_MESSAGE
        );
        if (size.equals("small") || size.equals("medium") || size.equals("large")){
            String s = size.substring(0, 1).toUpperCase() + size.substring(1);
            pizza.setSize(s);
            pizzaToppings(pizza);
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid Size!","Error!",JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args) {
        //ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();
        String userInput = JOptionPane.showInputDialog(
            null,
            "How Many Pizzaz do you Want?",
            "Order Pizza",
            JOptionPane.PLAIN_MESSAGE
        );
        try{
            double totalCost = 0;
            int x = Integer.parseInt(userInput);
            for (int i = 0; i < x; i++){
                Pizza pizza = new Pizza();
                pizzaSize(pizza);
                totalCost += pizza.calcCost();
            }
            String total = String.valueOf(totalCost);
            JOptionPane.showMessageDialog(null, 
                    "The total cost is: "+total,
                    "Total",
                    JOptionPane.PLAIN_MESSAGE
            );
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, e,"Error!",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
