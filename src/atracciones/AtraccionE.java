package atracciones;

import personas.GrupoEdad;

public class AtraccionE extends Atraccion {

    public AtraccionE() {
        super(
                0,
                0,
                true,
                new GrupoEdad[]{GrupoEdad.ADULTO, GrupoEdad.SENIOR},
                7,
                1
        );
    }
}
