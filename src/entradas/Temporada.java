package entradas;

import java.util.Date;

public enum Temporada {
    ALTA,
    MEDIA,
    BAJA;

    public Temporada calcTemporada(Date date) {
        /**
         * 1 al 8 de enero 2019, temporada alta
         */
        Date dHS1 = new Date(118, 11, 31);
        Date dHS2 = new Date(119, 0, 9);
        /**
         * Abril de 2019, temporada alta
         */
        Date dHS3 = new Date(119, 2, 30);
        Date dHS4 = new Date(119, 4, 1);
        /**
         * Agosto de 2019, temporada alta
         */
        Date dHS5 = new Date(119, 6, 31);
        Date dHS6 = new Date(119, 8, 1);
        /**
         * Diciembre de 2019, temporada alta
         */
        Date dHS7 = new Date(119, 10, 30);
        Date dHS8 = new Date(120, 0, 1);

        /**
         * Febrero de 2019, temporada baja
         */
        Date dLS1 = new Date(119, 0, 31);
        Date dLS2 = new Date(119, 2, 1);
        /**
         * Noviembre de 2019, temporada baja
         */
        Date dLS3 = new Date(119, 9, 30);
        Date dLS4 = new Date(119, 11, 1);
        if (
                (date.after(dHS1) && date.before(dHS2)) ||
                        (date.after(dHS3) && date.before(dHS4)) ||
                        (date.after(dHS5) && date.before(dHS6)) ||
                        (date.after(dHS7) && date.before(dHS8))
        ) {
            return ALTA;
        } else if (
                (date.after(dLS1) && date.before(dLS2)) ||
                        (date.after(dLS3) && date.before(dLS4))
        ) {
            return BAJA;
        } else {
            return MEDIA;
        }
    }
}
