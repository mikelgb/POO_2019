package entradas;

import descuentos.Descuento;
import personas.GrupoEdad;
import personas.Persona;

import java.util.Date;

public class EntradaSenior extends Entrada {

    private int variacionSenior = -35;

    public EntradaSenior(Persona p, boolean vip, Descuento[] descuentos) {
        super(new Date(), vip, descuentos);
    }

    @Override
    public boolean ventaValida(Persona p) {
        return p.getGrupoEdad() == GrupoEdad.SENIOR;
    }

    @Override
    public void calcPrecio() {
        float precio = super.getPrecioBase();
        precio += precio * (variacionSenior / 100);
        precio += precio * (super.getVariacionTemporada() / 100);
        precio += precio * (super.getVariacionDescuentos() / 100);
        super.setPrecioFinal(precio);
    }
}
