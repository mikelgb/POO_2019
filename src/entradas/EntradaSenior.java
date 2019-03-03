package entradas;

import personas.Persona;

import java.util.Date;

public class EntradaSenior extends Entrada {


    public EntradaSenior(Persona p) {
        super(new Date());
    }

    @Override
    public boolean validSale(Persona p) {
        return false;
    }

    @Override
    public float calcPrice() {
        return 0;
    }
}
