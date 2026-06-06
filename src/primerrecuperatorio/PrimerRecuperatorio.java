
package primerrecuperatorio;

import java.util.Scanner;


public class PrimerRecuperatorio {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Viajes viajesList = new Viajes();
        
        int opcion;

        do {
            System.out.println("\n===== SISTEMA DE GESTIÓN DE TRANSPORTE TURÍSTICO =====");
            System.out.println("1. Registrar un nuevo viaje");
            System.out.println("2. Mostrar todos los viajes realizados");
            System.out.println("3. Ordenar los viajes por costo ");
            System.out.println("4. Ordenar los viajes por nombre de pasajero ");
            System.out.println("5. Mostrar el total recaudado");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    agregarViaje(scanner, viajesList);
                    
                    break;
                case 2:
                    //agencia.mostrarTodos();
                    break;
                case 3:
                    //agencia.realizarServicios();
                    break;
                case 4:
                    System.out.print("Ingrese la patente a buscar: ");
                    String patente = scanner.nextLine();
                    //agencia.buscarPorPatente(patente);
                    break;
                case 5:
                    System.out.print("Ingrese la capacidad mínima: ");
                    int capacidad = scanner.nextInt();
                    scanner.nextLine();
                    //agencia.mostrarPorCapacidadMayorA(capacidad);
                    break;
                case 6:
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Ingrese un número entre 1 y 8.");
            }

        } while (opcion != 6);

        scanner.close();
    }
    
        private static void agregarViaje(Scanner scanner, Viajes viaje) {
            Vehiculos vehiculosList = new Vehiculos();
            
            System.out.println("\n¿Qué tipo de vehículo realizo el viaje?");
            System.out.println("1. Colectivo");
            System.out.println("2. Tren");
            System.out.println("3. Subte");
            System.out.print("Opción: ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Patente: ");
            String patente = scanner.nextLine().trim();
            if (patente.isEmpty()) {
                System.out.println("Error: la patente no puede estar vacía.");
                return;
            }

            System.out.print("Capacidad: ");
            int capacidad = scanner.nextInt();
            scanner.nextLine();
            if (capacidad <= 0) {
                System.out.println("Error: la capacidad debe ser mayor a cero.");
                return;
            }

            System.out.print("Empresa: ");
            String empresa = scanner.nextLine().trim();
            if (empresa.isEmpty()) {
                System.out.println("Error: la patente no puede estar vacía.");
                return;
            }
            
            

            
            System.out.print("Tipo de pasajero: ");
            System.out.print("\nOpción: ");
            System.out.println("1. Normal");
            System.out.println("2. Estudiante");
            System.out.println("3. Jubilado");
            System.out.print("Opción: ");
            int pasajero = scanner.nextInt();
            TipoPasajero pasajeroTipo; 
            double costo;
           
            if (pasajero == 1){
                pasajeroTipo = TipoPasajero.NORMAL;
                pasajeComun pasajeTipo = new pasajeComun();
                costo = 2;
            } else if (pasajero == 2){
                pasajeroTipo = TipoPasajero.ESTUDIANTE;
                PasajeEstudiante pasajeTipo = new PasajeEstudiante();
                costo = 1;
            }else if (pasajero == 3){
                pasajeroTipo = TipoPasajero.JUBILADO;
                PasajeJubilado pasajeTipo = new PasajeJubilado();
                costo = 0.5;
            }
            
            scanner.nextLine();
            
            
            
            

            switch (tipo) {
                case 1:
                    //vehiculosList.agregarVehiculo();
                    //viajesList.agregarViaje(new Colectivo(patente, capacidad, empresa), pasajero, pasajeroTipo, pasajeTipo, costo);
                    break;
                case 2:
                    vehiculosList.agregarVehiculo(new Tren(patente, capacidad, empresa));
                    break;
                case 3:
                    vehiculosList.agregarVehiculo(new Subte(patente, capacidad, empresa));
                    break;
                default:
                    System.out.println("Opción inválida. Ingrese un número entre 1 y .");
            } 

        }
    
}
