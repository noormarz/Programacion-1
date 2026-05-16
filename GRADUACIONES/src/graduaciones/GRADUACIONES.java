/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graduaciones;

import java.util.Scanner;

/**
 *
 * @author nymz1
 * 
 * Tiene que desaroolar un algoritmo que tenga la capacidad de sacar el 
 * promedio final de tres asignaturas diferentes. Para cada asignatura
 * debera ingresar una nota acumulativa y una nota examen.
 * 
 * Ejemplo:
 * 1. programacion => NotaAcum = 40, Nota examen = 30
 * 2. Base Datos => NotaAcum = 30, Nota examen = 35
 * 3. Ofimatica => NotaAcum = 50, Nota examen = 50
 * 
 * Para cada nota final de la clase, determinar si esta aprobado 
 * o no se pasa con 65 la clase.
 * 
 * Una vez con las notas finales, sacar el promedio geenral del periodo.
 * 
 * Si elpromedio final es arriba de 95 => Mensaje suma cumlaude
 * Si elpromedio final es arriba de 90 => Mensaje Magna cumlaude
 * Si elpromedio final es arriba de 85 => Mensaje cumlaude
 * 
 */
public class GRADUACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner noor = new Scanner (System.in);
    
    //Variables
    
    double NAcum1 = 0.00;
    double NExamen1 = 0.00;
    double NFina1l = 0.00;
    double NAcum2 = 0.00;
    double NExamen2 = 0.00;
    double NFina12 = 0.00;
    double NAcum3 = 0.00;
    double NExamen3 = 0.00;
    double NFina13 = 0.00;
    double PromedioF = 0.00;
    
    //Tarea 1: Ingresar nota acum, examen y de terminar nota final
    //ASIGNATURA 1

    System.out.println("=========================================");
    System.out.println("CLASE: PROGRAMACION");
    System.out.println("=========================================");
    System.out.println("Ingresar total de acumulativos:");
    NAcum1 = noor.nextDouble();
    System.out.println("Ingresar total de examen:");
    NExamen1 = noor.nextDouble();
    NFina1l = NAcum1 + NExamen1;
    System.out.println("-----------------------------------------");
    System.out.printf("La nota final de la clase de Programacion es de: %.2f", NFina1l);
    
    if(NFina1l>65){
        System.out.println("\nA APROBADO SU CLASE");
    }
    else{
        System.out.println("\nA REPROBADO SU CLASE");
    }
    
    //ASIGNATURA 2

    System.out.println("=========================================");
    System.out.println("CLASE: BASE DE DATOS");
    System.out.println("=========================================");
    System.out.println("Ingresar total de acumulativos:");
    NAcum2 = noor.nextDouble();
    System.out.println("Ingresar total de examen:");
    NExamen2 = noor.nextDouble();
    NFina12 = NAcum2 + NExamen2;
    System.out.println("-----------------------------------------");
    System.out.printf("La nota final de la clase de Base de Datos es de: %.2f", NFina12);
    
    if(NFina12>65){
        System.out.println("\nA APROBADO SU CLASE");
    }
    else{
        System.out.println("\nA REPROBADO SU CLASE");
    }
    
    //ASIGNATURA 3

    System.out.println("=========================================");
    System.out.println("CLASE: OFIMATICA");
    System.out.println("=========================================");
    System.out.println("Ingresar total de acumulativos:");
    NAcum3 = noor.nextDouble();
    System.out.println("Ingresar total de examen:");
    NExamen3 = noor.nextDouble();
    NFina13 = NAcum3 + NExamen3;
    System.out.println("-----------------------------------------");
    System.out.printf("La nota final de la clase de Ofimatica es de: %.2f", NFina13);
    
    if(NFina13>65){
        System.out.println("\nA APROBADO SU CLASE");
    }
    else{
        System.out.println("\nA REPROBADO SU CLASE");
    }
    
    
    //PROMEDIO
    
    System.out.println("=========================================");
    System.out.println("PROMEDIO FINAL");
    System.out.println("=========================================");
    PromedioF = (NFina1l + NFina12 + NFina13)/ 3;
    System.out.printf("Su promedio general es de: %.2f", PromedioF);
    
    if (PromedioF >95){
        System.out.println("\nSUMA CUMLAUDE");
    }
    else if (PromedioF >90){
        System.out.println("\nAGNA CUMLAUDE");
    }
    else if (PromedioF >90){
        System.out.println("\nCUMLAUDE");
    }
    else {
        System.out.println("SIN RECONOCIMIENTO");
    }

    
        
    }//FIN MAIN
    
}//FIN CLASE
