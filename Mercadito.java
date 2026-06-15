/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mercadito;

import java.util.Scanner;

/**
 *
 * @author nymz1
 */
public class Mercadito {

    /**
     * 
     * @param args
     */
    
    
    //variablesFUNCIONES
    static Scanner mercado = new Scanner(System.in);
    static int contadorproductos = 0;
    static final int MAX = 100;
    static String[] nombre = new String[MAX];
    static double[] precios = new double[MAX]; 
    static int[] inventario = new int[MAX];
    
    public static void main(String[] args) {
      
      //Variables
      int opcion = 0;
        
      //MENU
      
      do{
          
        System.out.println("\n---------------------");
        System.out.println("=== MERCADITO ===");
        System.out.println("---------------------");
            System.out.println("1. Registrar Productos");
            System.out.println("2. Ver Inventario");
            System.out.println("3. Buscar Productos");
            System.out.println("3. Facturacion");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = mercado.nextInt();
            mercado.nextLine();
            
        switch (opcion) {

                case 1 -> RegistroProducto ();

                case 2 -> Inventario ();

                case 3 -> Buscar();
                
                case 4 -> Facturacion();

                case 5 -> System.out.println("Saliendo del sistema...");

                default -> System.out.println("Opcion invalida.");    
      
        }//fin switch
        
      }while(opcion !=5);
      
  
    }//FIN DE MAIN
    
    // Regiatro de productos  
    public static void RegistroProducto (){
        
        //variables        
        char continuar;

        do {

        System.out.println("\n---------------------");
        System.out.println("=== REGISTRO DE PRODUCTOS ===");
        System.out.println("---------------------");

            //nombre
            System.out.println("Ingrese nombre del producto: ");
            nombre[contadorproductos] = mercado.nextLine();

            //precio
            System.out.println("Ingrese precio del producto: ");
            precios[contadorproductos] = mercado.nextDouble();

            //cantidad
            System.out.print("Ingrese cantidad disponible: ");
            inventario[contadorproductos] = mercado.nextInt();

            mercado.nextLine(); // Limpiar buffer si no se me trava

            contadorproductos++;

            // opt out
            System.out.print("Desea registrar otro producto? (s/n): ");
            continuar = mercado.nextLine().charAt(0);

        } while (continuar == 's' || continuar == 'S');
        

        
    }//FIN REGISTRO
    
    //Mostrar Producto
    public static void Inventario (){
        
        // Listado
        System.out.println("\n---------------------");
        System.out.println("=== INVENTARIO ===");
        System.out.println("---------------------");

        for (int i = 0; i < contadorproductos; i++) {

            System.out.println("\nProducto #" + (i + 1));
            System.out.println("Nombre: " + nombre[i]);
            System.out.println("Precio: L. " + precios[i]);
            System.out.println("Inventario: " + inventario[i]);
        }//fin de for
        
    }//fin funcion                 
    
    //Inventario
    public static void Buscar(){
        
        //variables
        String buscarproducto;
        boolean encontrado = false;

        System.out.println("\n---------------------");
        System.out.println("=== BUSQUEDA ===");
        System.out.println("---------------------");

        // Consultar producto
        System.out.print("Ingrese el nombre del producto a consultar: ");
        buscarproducto = mercado.nextLine();

        for (int i = 0; i < contadorproductos; i++) {
 
             if (buscarproducto.equalsIgnoreCase(nombre[i])) {

             encontrado = true;

              // Mostrar informacion del producto
             System.out.println("\nProducto encontrado");
             System.out.println("Nombre: " + nombre[i]);
             System.out.println("Precio: L. " + precios[i]);
             System.out.println("Cantidad disponible: " + inventario[i]);

             }//fin if
             
         }//fin for

         if (!encontrado) {

          System.out.println("Producto no encontrado.");

         }//fin if
    
    }//fin inventario producto
    
    //Facturacion abdiel
    public static void Facturacion(){
        
    }//fin facturacion
   
    
}//FIN DE CLASE
