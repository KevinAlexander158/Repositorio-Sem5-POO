
public class Producto {
    private String nombre;
    private String fechaCaducidad;
    private int numeroLote;

    // Constructor normal
    public Producto(String nombre, String fechaCaducidad, int numeroLote) {
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    // Constructor sobrecargado con solo nombre
    public Producto(String nombre) {
        this(nombre, "Desconocida", 0);
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Caducidad: " + fechaCaducidad);
        System.out.println("Número de Lote: " + numeroLote);
    }
    
}
