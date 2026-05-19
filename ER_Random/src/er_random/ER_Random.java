/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package er_random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nymz1
 */
public class ER_Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Random random = new Random();
    Scanner noor = new Scanner(System.in);
    
    
    //Variables
    int numero;
    int sumapar = 0;
    int sumaimpar = 0;
    int cantidadpar = 0;
    int cantidadimpar = 0; 
    
    
    //Tarea 1 numeros random
    
    System.out.println("--------------------------------");
    System.out.println("GENERADOR DE NUMEROS ALEATORIOS ");
    System.out.println("--------------------------------");
    
    for (int i = 1; i <= 25; i++) {
        
       numero = random.nextInt(10) + 1;
       System.out.println("Numero " + i + ": " + numero); 
        
      if (numero / 2 == 0) {
 
                sumapar += numero;
                cantidadpar++;

            }//fin if
      else {

                sumaimpar += numero;
                cantidadimpar++;

            }//fin else
       
    }//FIN DE FOR
    
     //impresion de ifno
     
        System.out.println("\nRESULTADOS");
        System.out.println("-----------------------------");

        System.out.println("Cantidad de numeros pares: " + cantidadpar);
        System.out.println("Suma total de pares: " + sumapar);

        System.out.println("-----------------------------");

        System.out.println("Cantidad de numeros impares: " + cantidadimpar);
        System.out.println("Suma total de impares: " + sumaimpar); 
        
        
        
    }//FIN DE MAIN
    
}//FIN DE CLASE
