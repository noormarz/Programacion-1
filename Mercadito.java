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
        do {
            System.out.println("\n---------------------");
            System.out.println("=== MERCADITO ===");
            System.out.println("---------------------");
            System.out.println("1. Registrar Productos");
            System.out.println("2. Ver Inventario");
            System.out.println("3. Buscar Productos");
            System.out.println("4. Facturacion"); // <-- ¡Corregido aquí! Ya no se repite el 3
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = mercado.nextInt();
            mercado.nextLine();
            
            switch (opcion) {
                case 1 -> RegistroProducto();
                case 2 -> Inventario();
                case 3 -> Buscar();
                case 4 -> Facturacion(); // Llama correctamente a la opción 4
                case 5 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opcion invalida.");    
            }//fin switch
            
        } while(opcion != 5);
    
    }//FIN DE MAIN
    
    // Registro de productos  
    public static void RegistroProducto (){
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

            mercado.nextLine(); // Limpiar buffer

            contadorproductos++;

            // opt out
            System.out.print("Desea registrar otro producto? (s/n): ");
            continuar = mercado.nextLine().charAt(0);

        } while (continuar == 's' || continuar == 'S');
        
    }//FIN REGISTRO
    
    //Mostrar Producto
    public static void Inventario (){
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
    
    //Buscar Producto
    public static void Buscar(){
        String buscarproducto;
        boolean encontrado = false;

        System.out.println("\n---------------------");
        System.out.println("=== BUSQUEDA ===");
        System.out.println("---------------------");

        System.out.print("Ingrese el nombre del producto a consultar: ");
        buscarproducto = mercado.nextLine();

        for (int i = 0; i < contadorproductos; i++) {
             if (buscarproducto.equalsIgnoreCase(nombre[i])) {
                 encontrado = true;
                 System.out.println("\nProducto encontrado");
                 System.out.println("Nombre: " + nombre[i]);
                 System.out.println("Precio: L. " + precios[i]);
                 System.out.println("Cantidad disponible: " + inventario[i]);
             }//fin if
         }//fin for

         if (!encontrado) {
             System.out.println("Producto no encontrado.");
         }//fin if
    
    }//fin buscar producto
    
    //Facturacion
    public static void Facturacion(){
        
     System.out.println("\n---------------------");
     System.out.println("=== PROCESO DE FACTURACION ===");
     System.out.println("---------------------");

     char continuar;
     double subtotalGeneral = 0;

    do {

    System.out.print("Ingrese el nombre del producto a comprar: ");
    String productoBuscar = mercado.nextLine();

    int indiceEncontrado = -1;

    // Buscar el producto en los arreglos
    for (int i = 0; i < contadorproductos; i++) {
        if (productoBuscar.equalsIgnoreCase(nombre[i])) {
            indiceEncontrado = i;
            break;
        }
    }

    // Si el producto existe, procedemos con los cálculos
    if (indiceEncontrado != -1) {

        System.out.println("Producto: " + nombre[indiceEncontrado]
                + " | Precio: L. " + precios[indiceEncontrado]);

        System.out.println("Unidades en existencia: "
                + inventario[indiceEncontrado]);

        System.out.print("Ingrese la cantidad que desea comprar: ");
        int cantidadComprar = mercado.nextInt();
        mercado.nextLine(); // Limpiar buffer

        // Validación de Stock
        if (cantidadComprar <= inventario[indiceEncontrado]) {

            if (cantidadComprar > 0) {

                // Operaciones matemáticas
                double subtotal = precios[indiceEncontrado] * cantidadComprar;

                // Acumular al total general
                subtotalGeneral += subtotal;

                // Restar del inventario las unidades vendidas
                inventario[indiceEncontrado] =
                        inventario[indiceEncontrado] - cantidadComprar;

                System.out.println("Producto agregado a la factura.");

            } else {
                System.out.println("La cantidad debe ser mayor a 0.");
            }

            } else {
            System.out.println("Error: No hay suficiente inventario disponible.");
            }

            } else {
             System.out.println("El producto no esta registrado en el sistema.");
            }

            System.out.println("\nDesea agregar otro producto? (S/N): ");
            continuar = mercado.nextLine().charAt(0);

            } while (continuar == 'S' || continuar == 's');


         // Factura final
        double impuesto = subtotalGeneral * 0.15;
        double totalPagar = subtotalGeneral + impuesto;

         System.out.println("\n=================================");
         System.out.println("          FACTURA COMERCIAL");
         System.out.println("=================================");
         System.out.println("Subtotal:    L. " + subtotalGeneral);
         System.out.println("ISV (15%):   L. " + impuesto);
         System.out.println("Total pagar: L. " + totalPagar);
         System.out.println("=================================");
         System.out.println("Gracias por su compra!");
        
    }//fin facturacion
    
}//fin de todo
