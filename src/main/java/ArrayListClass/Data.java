/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListClass;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hazama
 */
public class Data {
    private ArrayList<Integer> numbers;
    Scanner keyboard = new Scanner(System.in);
    public Data() {
        this.numbers = new ArrayList<>();
    }
    
    public void Display_Menu(){
        System.out.println("*********************************************"
                +"\nMain Menu"
                +"\n0 - Quit"
                +"\n1 - Input Numbers"
                +"\n2 - Display Numbers"
                +"\n3 - Search Numbers"
                +"\n4 - Delete Numbers"
        );
        int choice = keyboard.nextInt();
        switch (choice){
            case 0 -> {
                System.out.println("Goodbye.");
                System.exit(0);
            }
            case 1 -> {
                System.out.println("Input Numbers");
                inputNumbers();
            }
            case 2 -> {
                System.out.println("Display Numbers");
                displayNumbers();
            }
            case 3 ->{
                System.out.println("Search Numbers");
                searchNumbers();
            }
            case 4 ->{
                System.out.println("Delete Numbers");
                deleteNumbers();
            }
                
        }
    }
    void inputNumbers(){
         
        System.out.println("Hou many numbers will you inut?");
        int number = keyboard.nextInt();
        for (int i = 0 ; i < number; i++){
            System.out.println("Input number " + i + "-> ");
            int n = keyboard.nextInt();
            numbers.add(n);
        }
        Display_Menu();
        
    }
    void displayNumbers(){
        for (int i = 0; i < numbers.size();i++){
            System.out.println(numbers.get(i));
        }
        Display_Menu();
    }
    void searchNumbers(){
        System.out.println("What number will you search for? ");
        int search = keyboard.nextInt();
        
        for (int i = 0; i < numbers.size();i++){
            if (search == numbers.get(i)){
                System.out.println("Number " + search + " was found in position " + i + ".");
                Display_Menu();
            }
        }
        System.out.println("Number " + search + " was not found.");
        Display_Menu();
       
    }
    void deleteNumbers(){
        numbers.clear();
        System.out.println("Array list " + numbers + " has been cleared.");
        Display_Menu();
    }
    
}
