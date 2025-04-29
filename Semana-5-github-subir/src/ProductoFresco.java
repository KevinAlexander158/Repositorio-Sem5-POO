
public class ProductoFresco extends Producto{
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(String nombre, String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
        super(nombre, fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Fecha de Envasado: " + fechaEnvasado);
        System.out.println("País de Origen: " + paisOrigen);
    }
    
}
