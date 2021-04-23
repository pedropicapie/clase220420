/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase220420;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Clase220420 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        System.out.println("ingresa un numero del 1 al 5");
        int numero1 =leer.nextInt();
        
        switch(numero1){
        
           case 1: 
                 System.out.println("valor 1");
                 break;
            case 2: 
                System.out.println("valor 2");
                break;
            case 3:
                System.out.println("valor 3");
                break;
            case 4: 
                System.out.println("valor 4");
                break;
            case 5:
                System.out.println("valor 5");
                break;
            default:
                System.out.println("no valido");
        }
    }
            
    
}
