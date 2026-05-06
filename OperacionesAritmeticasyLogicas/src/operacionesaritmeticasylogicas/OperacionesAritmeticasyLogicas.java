/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesaritmeticasylogicas;
import java.util.Scanner;
/**
 *
 * @author nymz1
 */
public class OperacionesAritmeticasyLogicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner noor = new  Scanner(System.in);
        
        //Tarea 1: Nombre del usuario
        String usuario;
        System.out.println("Buenas! \nPorfavor ingrese su nombre de usuario:");
        usuario=noor.next();
        System.out.println("-----------------------------------------");
        
        //Tarea 2: Marca de Electrodomestico
        String marca;
        System.out.println("Porfavor ingrese la marca del electrodomestico:");
        noor.nextLine();
        marca=noor.nextLine();
        System.out.println("-----------------------------------------");
        
        
        //Tarea 3: Consumo en Watts
        double watts;
        System.out.println("Porfavor ingrese el consumo de Watts del aparato:");
        watts=noor.nextInt();
        System.out.println("-----------------------------------------");
        
        //Tarea 4: Pedir cantidad de horas uqe se usa al dia
        double horas;
        System.out.println("Porfavor ingrese la cantidad de horas de uso del aparato:");
        horas=noor.nextInt();
        System.out.println("-----------------------------------------");
        
        //Tarea 5: Procesamiento
        double kwh;
        kwh=(watts*horas)/1000;
        System.out.printf("kwh: %.2f",kwh);
        
        
        //Tarea 6: consumo mensual
        double consumomensual;
        consumomensual = kwh*30;
        System.out.printf("%nConsumo Mensual: %.2f",consumomensual);
        
        
        //Tarea 7: Costo Mensual
        double costo;
        costo=consumomensual*0.15;
        System.out.printf("%nCosto: %.2f",costo);
        System.out.println("\n-----------------------------------------");
        
        //Tarea 8:  impresion
        System.out.printf("Su total sera de: %.2f",costo);
        
        
        
        
    }//FIN DE MAIN
    
}//FIN DE TAREA
