package entradas;

import descuentos.Descuento;
import personas.GrupoEdad;
import personas.Persona;

import java.util.Date;

public class EntradaNino extends Entrada {

    private int variacionNino = -50;
    private boolean entradaGratis;

    public EntradaNino(Persona p, boolean vip, Descuento[] descuentos) {
        super(new Date(), vip, descuentos);
        entradaGratis = p.getGrupoEdad() == GrupoEdad.NINOGRATIS;
    }

    @Override
    public boolean ventaValida(Persona p) {
        return p.getGrupoEdad() == GrupoEdad.SENIOR;
    }

    @Override
    public void calcPrecio() {
        if (entradaGratis) {
            super.setPrecioFinal(0);
        } else {
            float precio = super.getPrecioBase();
            precio += precio * (variacionNino / 100);
            precio += precio * (super.getVariacionTemporada() / 100);
            precio += precio * (super.getVariacionDescuentos() / 100);
            super.setPrecioFinal(precio);
        }
    }
}
