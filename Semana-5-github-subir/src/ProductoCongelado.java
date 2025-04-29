
public class ProductoCongelado extends Producto {
    private double temperaturaCongelacion;

    public ProductoCongelado(String nombre, String fechaCaducidad, int numeroLote, double temperaturaCongelacion) {
        super(nombre, fechaCaducidad, numeroLote);
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Temperatura de Congelación: " + temperaturaCongelacion + "°C");
    }
}
