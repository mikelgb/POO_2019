package entradas;

import descuentos.Descuento;
import personas.Persona;

import java.util.Date;

public abstract class Entrada {

    private float precioBase = 60;
    private Temporada temporada = Temporada.MEDIA;
    private int variacionTemporada = 0;
    private Date fechaVenta;
    private boolean vip;
    private float precioVip = 0;
    private Descuento[] descuentos;
    private int variacionDescuentos = 0;
    private float precioFinal;
    private float precioMinimo;

    public Entrada(Date fechaVenta, boolean vip, Descuento[] descuentos) {
        this.fechaVenta = fechaVenta;
        this.vip = vip;
        if (vip) {
            precioVip = 50;
        }
        this.descuentos = descuentos;
        this.precioMinimo = this.precioBase * 0.10f;
        this.calcVariacionTemporada();
        this.calcVariacionDescuentos();
    }

    private void calcVariacionTemporada() {
        this.temporada = temporada.calcTemporada(fechaVenta);
        switch (this.temporada) {
            case ALTA:
                this.variacionTemporada = 15;
                break;
            case BAJA:
                this.variacionTemporada = -15;
                break;
            case MEDIA:
                this.variacionTemporada = 0;
                break;
        }
    }

    private void calcVariacionDescuentos() {
        for (Descuento d : descuentos) {
            variacionDescuentos += d.getVariacion();
        }
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public int getVariacionTemporada() {
        return variacionTemporada;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public boolean isVip() {
        return vip;
    }

    public float getpPrecioVip() {
        return precioVip;
    }

    public Descuento[] getDescuentos() {
        return descuentos;
    }

    public int getVariacionDescuentos() {
        return variacionDescuentos;
    }

    public void setPrecioFinal(float precioFinal) {
        this.precioFinal = precioFinal;
    }

    public float getPrecioFinal() {
        if (this.precioFinal > this.precioMinimo) {

            return precioFinal + precioVip;
        } else {
            return this.precioMinimo;
        }
    }

    public abstract boolean ventaValida(Persona p);
    public abstract void calcPrecio();

}
