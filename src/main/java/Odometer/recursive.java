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
public class recursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "Elmer";
        reverse(s);
        int num[] = {1,2,3};
        sum(num);
        
    }
    static void reverse(String s){
        if(s.length()>0){
            //char temp = ;
            System.out.print(s.charAt(s.length()-1));
            String substring = s.substring(0, s.length()-1);
            reverse(substring);
        }
    }
    static int sum(int[] num){
        
        return 0;
        
    }
}
