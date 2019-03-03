package atracciones;

import personas.AgeGroup;

public class AtraccionC extends Atraccion {

    public AtraccionC() {
        super(
                0,
                1.2f,
                false,
                new AgeGroup[]{AgeGroup.FREEKID, AgeGroup.KID},
                3,
                1
        );
    }
}
