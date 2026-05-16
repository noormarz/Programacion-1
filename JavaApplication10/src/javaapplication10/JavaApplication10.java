/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author nymz1
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner noor = new Scanner (System.in);

    //Variables
    int edad = 0;
    boolean autorizacion;
    
    
   //EDAD
    System.out.println("=========================================");
    System.out.println("Bienvenido a Corp. Martinez, porfavor ayudanos con tus datos.");
    System.out.println("=========================================");
    System.out.println("Ingresar edad:");
    edad = noor.nextInt();
    System.out.println("---------------");
        
    //AUTORIZACION
    System.out.println("Tiene authorizacion? True or False");
    autorizacion = noor.nextBoolean();
            
    if (edad < 18){
         System.out.println("\u001b[31mACCESO DENEGADO POR NU CUMPLIR REQUISITOS DE EDAD.\u001b[0m");
            
    } //FIN DE IF

    
    if (autorizacion){
        System.out.println("\u001B[32mACCESO PERMITIDO\u001b[0m");
        
    }else {
         System.out.println("\u001b[31mACCESO DENEGADO, NO TIENE AUTORIZACION\u001b[0m");
    } //fin de else
    
   
   
   
        
        
    }// FIN DE MAIN
    
}//FIN DE CLASE
