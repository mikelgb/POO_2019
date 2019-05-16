package atracciones;

import personas.GrupoEdad;

public class AtraccionC extends Atraccion {

    public AtraccionC() {
        super(
                0,
                1.2f,
                false,
                new GrupoEdad[]{GrupoEdad.NINOGRATIS, GrupoEdad.NINO},
                3,
                1
        );
    }
}
