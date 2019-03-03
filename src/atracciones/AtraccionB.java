package atracciones;

import personas.AgeGroup;

public class AtraccionB extends Atraccion {

    public AtraccionB() {
        super(
                1.2f,
                1.9f,
                false,
                new AgeGroup[]{AgeGroup.ADULT, AgeGroup.SENIOR},
                5,
                1
        );
    }
}
