/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

/**
 *
 * @author hazama
 */
public class cryptodriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        crypto c = new crypto("plain.txt","cipher.txt",5);
        c.decryption("cipher.txt", "plain2.txt", 5);
    }
    
}
