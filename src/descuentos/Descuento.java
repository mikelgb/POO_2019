package descuentos;

public class Descuento {

    private int variacion;

    private String descripcion;

    public Descuento(int variacion, String descripcion) {
        this.variacion = variacion;
        this.descripcion = descripcion;
    }

    public int getVariacion() {
        return variacion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
