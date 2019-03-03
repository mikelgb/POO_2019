package atracciones;

import personas.AgeGroup;

public class AtraccionD extends Atraccion {

    public AtraccionD() {
        super(
                0,
                0,
                true,
                new AgeGroup[]{AgeGroup.FREEKID, AgeGroup.KID, AgeGroup.ADULT, AgeGroup.SENIOR},
                5,
                1
        );
    }
}
