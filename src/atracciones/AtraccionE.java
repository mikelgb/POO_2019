package atracciones;

import personas.AgeGroup;

public class AtraccionE extends Atraccion {

    public AtraccionE() {
        super(
                0,
                0,
                true,
                new AgeGroup[]{AgeGroup.ADULT, AgeGroup.SENIOR},
                7,
                1
        );
    }
}
