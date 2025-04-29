import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Principal {


    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try {
            productos.add(new ProductoFresco("Manzanas", "2025-05-10", 101, "2025-04-20", "Perú"));
            productos.add(new ProductoRefrigerado("Leche", "2025-04-30", 202, "ORG-12345"));
            productos.add(new ProductoCongelado("Pescado", "2025-12-15", 303, -18.0));

            System.out.println("¿Desea agregar un nuevo producto fresco? (s/n): ");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("s")) {
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();

                System.out.print("Fecha de Caducidad (YYYY-MM-DD): ");
                String fechaCaducidad = scanner.nextLine();

                System.out.print("Número de lote: ");
                int numeroLote = scanner.nextInt();  
                scanner.nextLine();

                System.out.print("Fecha de Envasado (YYYY-MM-DD): ");
                String fechaEnvasado = scanner.nextLine();

                System.out.print("País de Origen: ");
                String paisOrigen = scanner.nextLine();

                productos.add(new ProductoFresco(nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen));
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: dato ingresado no válido. Se canceló la carga."); 
            scanner.nextLine(); // Limpiar buffer
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage()); 
        }

        System.out.println("\n=== Lista de Productos ===");
        for (Producto p : productos) {
            System.out.println("--------------------------");
            p.mostrarInfo();
        }

        scanner.close();
    
    }
    
}
