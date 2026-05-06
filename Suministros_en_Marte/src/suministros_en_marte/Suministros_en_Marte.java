/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suministros_en_marte;

import java.util.Scanner;

/**
 *
 * @author nymz1
 */
public class Suministros_en_Marte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner noor = new Scanner(System.in);
        
        /* Suministros en Marte
        La mision es registrar todo antes que se agote el oxigeno en la zona de descarga.
        1.- Identificar el codigo del contenedor (numero)
        2.- Cuantas raciones de comida trae el cotnenedor
        3.- Medir la presion del tanque de agua que trae el cohete
        4.- la base necesita saber cuanta comida habra por colono ( 12 COLONOS)
        5.- tambien saber si la presion del agua es suficiente para llenar el tanque princial con capacidad de 500 litros (el cohete solo trae una fraccion de eso)
        6.- Imprimir el reporte de suministros
        */
        
        //Tarea 1: IDENTIFICAR CODIGO DE CCONTNEDOR
        int contenedor;
        System.out.println("Suministros en Marte! \nPorfavor ingrese el codigo del contenedor:");
        contenedor = noor.nextInt();
        System.out.println("-----------------------------------------");
        
        //Tarea 1: INIDADES DE COMIDA
        int raciones;
        System.out.println("Porfavor ingrese las unidades de raciones de comida dentro:");
        raciones = noor.nextInt();
        System.out.println("-----------------------------------------");
        
        //Tarea 3: Presion del tanque
        double agua;
        System.out.println("Porfavor ingrese la cantidad de agua el litros:");
        agua = noor.nextDouble();
        System.out.println("-----------------------------------------");
        
        //INFO FIJA
        int colonos = 12;
        double capacidaddeltanque = 500;
        
        //Tarea 4: COMIDA POR COLONO
        double comidaporcolono;
        comidaporcolono = (raciones/colonos);
        
        // Tarea 5: ES LA PRESION DE AGAU SUFICIENTE?
        boolean suficienteagua;
        suficienteagua = agua >= capacidaddeltanque;
        
        //Reporte
        
        System.out.println("REPORTE DE SUMINISTROS");
        System.out.println("-----------------------------------------");
        System.out.printf("Codigo del Contenedor: %d",contenedor);
        System.out.printf("%nComida por colono: %.2f",comidaporcolono);
        
        if (suficienteagua){
            System.out.println("\nEl agua es suficiente para llenar el tanque principal");
        } //fin de if
        
        else {
            System.out.printf("El agua no es suficiente para llenar el tanque principal");
        }//fin de else
        
    }//FIN DE MAIN
    
}//FIN DE CLASE
