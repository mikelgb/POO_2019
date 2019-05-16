package atracciones;

import personas.GrupoEdad;

public class AtraccionA extends Atraccion {

    public AtraccionA() {
        super(
                1.2f,
                0,
                true,
                new GrupoEdad[]{GrupoEdad.NINOGRATIS, GrupoEdad.NINO, GrupoEdad.ADULTO, GrupoEdad.SENIOR},
                6,
                1
        );
    }
}
