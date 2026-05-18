/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrosclinicamedica;

import java.util.Scanner;

/**
 *
 * @author nymz1
 */
public class RegistrosClinicaMedica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner noor = new Scanner(System.in);

        // Variables
        int opcion;
        String nombrePaciente = "";
        int edadPaciente = 0;
        String fechaCita = "";
        double costoConsulta = 0;
        double subtotal = 0;
        double isv = 0;
        double total = 0;

        // Menu principal
        do {

            System.out.println("====================================");
            System.out.println("      CLINICA MEDICA MARTINEZ ");
            System.out.println("====================================");
            System.out.println("1. Registro del Paciente");
            System.out.println("2. Registro de Citas");
            System.out.println("3. Facturacion");
            System.out.println("4. Mostrar Informacion");
            System.out.println("5. Salir");
            System.out.println("====================================");
            System.out.println("Seleccione una opcion:");
            opcion = noor.nextInt();
            noor.nextLine();

            switch (opcion) {

                // REGISTRO DE PACIENTES
                case 1:

                    System.out.println("===== REGISTRO DE PACIENTES =====");

                    System.out.println("Ingrese nombre del paciente:");
                    nombrePaciente = noor.nextLine();

                    System.out.println("Ingrese edad del paciente:");
                    edadPaciente = noor.nextInt();
                    noor.nextLine();

                    System.out.println("Paciente registrado correctamente.");
                    break;

                // CONTROL DE CITAS
                case 2:

                    System.out.println("===== CONTROL DE CITAS =====");

                    System.out.println("Ingrese fecha de la cita:");
                    fechaCita = noor.nextLine();

                    System.out.println("Cita registrada correctamente.");
                    break;

                // FACTURACION
                case 3:

                    System.out.println("===== FACTURACION =====");

                    System.out.println("Ingrese costo de consulta:");
                    costoConsulta = noor.nextDouble();

                    subtotal = costoConsulta;
                    isv = subtotal * 0.15;
                    total = subtotal + isv;

                    System.out.println("Factura generada correctamente.");
                    break;

                // MOSTRAR INFORMACION
                case 4:

                    System.out.println("===== INFORMACION GENERAL =====");

                    System.out.println("Paciente: " + nombrePaciente);
                    System.out.println("Edad: " + edadPaciente);

                    System.out.println("Fecha de cita: " + fechaCita);

                    System.out.println("Subtotal: " + subtotal);
                    System.out.println("ISV: " + isv);
                    System.out.println("Total a pagar: " + total);

                    break;

                // SALIR
                case 5:

                    System.out.println("Saliendo del sistema...");
                    break;

                default:

                    System.out.println("Opcion invalida.");
            }

            System.out.println();

        } while (opcion != 5);

    }//FIN MAIN
    
}//FIN CLASE
