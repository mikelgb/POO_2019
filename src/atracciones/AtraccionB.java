package atracciones;

import personas.GrupoEdad;

public class AtraccionB extends Atraccion {

    public AtraccionB() {
        super(
                1.2f,
                1.9f,
                false,
                new GrupoEdad[]{GrupoEdad.ADULTO, GrupoEdad.SENIOR},
                5,
                1
        );
    }
}
