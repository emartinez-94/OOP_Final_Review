/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hazama
 */
public class crypto {
    private String plaintext_filename, ciphertext_filename;
    private int key;

    public crypto(String plain,String cipher, int k){
        plaintext_filename = plain;
        ciphertext_filename = cipher;
        key = k;
        Encrypt();
    }
    void Encrypt(){
        Scanner input;
        PrintWriter output;
        try {
            input = new Scanner(new FileInputStream("/Users/hazama/NetBeansProjects/FinalReview/src/main/java/fileio/" + plaintext_filename));
            output = new PrintWriter(new FileOutputStream("/Users/hazama/NetBeansProjects/FinalReview/src/main/java/fileio/"+ciphertext_filename));
            char ch;
            int num;
            String line = "";
            while(input.hasNextLine()){
                line = input.nextLine();
            }
            for (int i = 0; i < line.length();i++){
                ch = line.charAt(i);
                num = ch + key;
                
                output.print(num + " ");
            }
            input.close();
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(crypto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void decryption(String c_text, String p_text, int k){
        Scanner input;
        PrintWriter output;
        try {
            input = new Scanner(new FileInputStream("/Users/hazama/NetBeansProjects/FinalReview/src/main/java/fileio/" + c_text));
            output = new PrintWriter(new FileOutputStream("/Users/hazama/NetBeansProjects/FinalReview/src/main/java/fileio/"+p_text));
            char ch;
            int num;
            //String line = "";
            while(input.hasNextInt()){
                num = input.nextInt() - k;
                ch = (char)num;
                output.print(ch);
            }
            input.close();
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(crypto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
