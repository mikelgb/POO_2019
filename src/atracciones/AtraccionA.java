package atracciones;

import personas.AgeGroup;

public class AtraccionA extends Atraccion {

    public AtraccionA() {
        super(
                1.2f,
                0,
                true,
                new AgeGroup[]{AgeGroup.FREEKID, AgeGroup.KID, AgeGroup.ADULT, AgeGroup.SENIOR},
                6,
                1
        );
    }
}
