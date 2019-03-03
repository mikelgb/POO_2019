package entradas;

import personas.Persona;

import java.util.Date;

public abstract class Entrada {

    private float basePrice = 60;
    private Temporada season = Temporada.MEDIUM;
    private int seasonVariation = 0;
    private Date saleDate;

    public Entrada(Date saleDate) {
        this.saleDate = saleDate;
        this._calcSeason();
    }

    private void _calcSeason() {
        this.season = season.getSeason(saleDate);
        switch (this.season) {
            case HIGH:
                this.seasonVariation = 15;
                break;
            case LOW:
                this.seasonVariation = -15;
                break;
            case MEDIUM:
                this.seasonVariation = 0;
                break;
        }
    }

    public float getBasePrice() {
        return basePrice;
    }

    public Temporada getSeason() {
        return season;
    }

    public int getSeasonVariation() {
        return seasonVariation;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public abstract boolean validSale(Persona p);
    public abstract float calcPrice();

}
