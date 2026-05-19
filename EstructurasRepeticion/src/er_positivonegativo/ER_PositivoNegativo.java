/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package er_positivonegativo;

import java.util.Scanner;

/**
 *
 * @author nymz1
 */
public class ER_PositivoNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner noor = new Scanner(System.in);
        
        int numero;
        int positivos = 0;
        int negativos = 0;

        System.out.println("---------------------");
        System.out.println("POSITIVOS Y NEGATIVOS ");
        System.out.println("---------------------");

        System.out.println("Ingrese un numero (0 para finalizar):");
        numero = noor.nextInt();
 
        // Ciclo centinela
        
        while (numero != 0) {

            if (numero > 0) {

                System.out.println("POSITIVO");
                positivos++;

            } else {

                System.out.println("NEGATIVO");
                negativos++;

            }

            System.out.println("--------------------------------");

            System.out.println("Ingrese otro numero (0 para finalizar):");
            numero = noor.nextInt();
        }

        // Resultados
        System.out.println("========== RESULTADOS ==========");
        System.out.println("Cantidad de positivos: " + positivos);
        System.out.println("Cantidad de negativos: " + negativos);

   
        
    }//FIN MAIN
    
}//FIN CLASE
