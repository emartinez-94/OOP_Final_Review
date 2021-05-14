/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author hazama
 */
public class fileio {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        //Scanner input = null;
        int line;
        int small = 0,large = 0;
        try (Scanner input = new Scanner(new FileInputStream("/Users/hazama/NetBeansProjects/FinalReview/src/main/java/fileio/num.txt"))) {
            while(input.hasNextInt()){
                line = input.nextInt();
                
                if (small == 0 && large == 0){
                    small = line;
                    large = line;
                }
                if (line > large){
                    large = line;
                }
                if(line < small){
                    small = line;
                }
                
            }
            System.out.println(small + " "+ large);
        }
    }
    
}
