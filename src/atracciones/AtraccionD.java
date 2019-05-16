package atracciones;

import personas.GrupoEdad;

public class AtraccionD extends Atraccion {

    public AtraccionD() {
        super(
                0,
                0,
                true,
                new GrupoEdad[]{GrupoEdad.NINOGRATIS, GrupoEdad.NINO, GrupoEdad.ADULTO, GrupoEdad.SENIOR},
                5,
                1
        );
    }
}
