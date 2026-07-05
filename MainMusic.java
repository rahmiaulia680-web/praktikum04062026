/*
 * Nama  : Rahmi Aulia
 * NIM   : 2501083021 
 */
package com.mycompany.praktikum04062026;

/**
 *
 * @author Rahmi Aulia
 */
public class MainMusic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gitar gitar = new Gitar(6,"Gitar Klasik","Petik");
        Keyboard keyboard = new Keyboard(true,"Yamaha PSR","Elektronik");
        
        System.out.println("==  Info Gitar  ==");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
        
        System.out.println("==  Info Keyboard  ==");
        keyboard.info();
        keyboard.nyalakan();
        keyboard.mainkan();
        keyboard.stem();
        keyboard.matikan();
    }
    
}
