/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author hazama
 */
public class Pizza {
    private String size;
    private int cheese,pepperoni,ham;
    public Pizza(){
        cheese = 0;
        pepperoni = 0;
        ham = 0;
        size = "";
    }
    public Pizza(int cTopping, int pTopping, int hTopping,String Size){
        cheese = cTopping;
        pepperoni = pTopping;
        ham = hTopping;
        size = Size;
    }
    void setCheese(int cTopping){
        cheese = cTopping;
    }
    int getCheese(){
        return cheese;
    }
    void setPepperoni(int pTopping){
        pepperoni = pTopping;
    }
    int getPepperoni(){
        return pepperoni;
    }
    void setHam(int hTopping){
        ham = hTopping;
    }
    int getHam(){
        return ham;
    }
    void setSize(String Size){
        size = Size;
    }
    String getSize(){
        return size;
    }
    double calcCost(){
        String s = this.getSize();
        if (s.equals("Small"))
            return 10 + (this.getCheese()+this.getPepperoni()+this.getHam())*2;
        else if (s.equals("Medium"))
            return 12 + (this.getCheese()+this.getPepperoni()+this.getHam())*2;
        else //if (s.equals("Large"))
            return 14 + (this.getCheese()+this.getPepperoni()+this.getHam())*2;
    }
    String getDescription(){
        String cost = String.valueOf(this.calcCost());
        return "Size: "+ this.getSize()+" , Cheese Toppings: " + this.getCheese() + " Pepperoni Toppings: " + this.getPepperoni() + " Ham Toppings: " + this.getHam() + ". Cost: " + cost;
    }
}
