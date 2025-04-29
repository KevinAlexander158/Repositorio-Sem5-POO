
public class ProductoRefrigerado extends Producto {
     private String codigoOrganismo;

    public ProductoRefrigerado(String nombre, String fechaCaducidad, int numeroLote, String codigoOrganismo) {
        super(nombre, fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Código del Organismo: " + codigoOrganismo);
    }
}
