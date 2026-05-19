/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasderepeticion;

import java.util.Scanner;

/**
 *
 * @author nymz1
 */
public class EstructurasdeRepeticion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner noor = new Scanner(System.in);
  
     
        //VARIABLES
        double precio = 0.0;
        double subtotal = 0.0;
        double isv;
        double total;
        
        System.out.println("---------------------------------");
        System.out.println("    SUPERMERCADOS TITO    ");
        System.out.println("---------------------------------");
        
        // Ciclo CONTADOR
        
         for (int i = 1; i <= 10; i++) {
         
             
             System.out.println("Ingrese el precio del producto #" + i + ":");
            precio = noor.nextDouble();

            subtotal += precio;

            System.out.println("Subtotal actual: L. " + subtotal);
            System.out.println("--------------------------------------");
         }//FIN DE FOR
        
         
        //TAXES
        isv = subtotal * 0.15;
        total = subtotal + isv;
        
       //FACTURA
       
        System.out.println("\n============== FACTURA ==============");
        System.out.println("Subtotal: L. " + subtotal);
        System.out.println("ISV (15%): L. " + isv);
        System.out.println("--------------------------------------");
        System.out.println("Total a pagar: L. " + total);

         
         
    }//FIN CLASEE
    
}//FIN DE MAIN
