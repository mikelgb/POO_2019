package atracciones;

import personas.AgeGroup;
import personas.Persona;

import java.util.Arrays;
import java.util.List;

public class Atraccion {

    /**
     * Altura mínima, 0 si no existe
     */
    private float minHeight;
    /**
     * Altura máxima, 0 si no existe
     */
    private float maxHeight;
    /**
     * Permite suplemento VIP
     */
    private boolean vipAllowed;
    /**
     * Grupos de edad permitidos
     */
    private AgeGroup[] ageGroupsAllowed;
    /**
     * Número de ayudantes de atracción
     */
    private int numWorkers;
    /**
     * Número de supervisores de atraccion
     */
    private int numSupervisors;

    public Atraccion(float minHeight, float maxHeight, boolean vipAllowed, AgeGroup[] ageGroupsAllowed, int numWorkers, int numSupervisors) {
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.vipAllowed = vipAllowed;
        this.ageGroupsAllowed = ageGroupsAllowed;
        this.numWorkers = numWorkers;
        this.numSupervisors = numSupervisors;
    }

    /**
     * Devuelve la altura mínima para montar en la atracción
     *
     * @return Altura mínima
     */
    public float getMinHeight() {
        return minHeight;
    }

    /**
     * Devuelve la altura máxima para montar en la atracción
     *
     * @return Altura máxima
     */
    public float getMaxHeight() {
        return maxHeight;
    }

    /**
     * Devuelve si la atracciónj permite o no suplemento VIP
     *
     * @return Permite o no suplemento VIP
     */
    public boolean isVipAllowed() {
        return vipAllowed;
    }

    /**
     * Devuelve la lista de grupos de edad permitidos en la atracción
     *
     * @return Grupos de edad permitidos
     */
    public AgeGroup[] getAgeGroupsAllowed() {
        return ageGroupsAllowed;
    }

    /**
     * Devuelve la cantidad de ayudantes de atracción requeridos
     *
     * @return Número de ayudantes de atracción
     */
    public int getNumWorkers() {
        return numWorkers;
    }

    /**
     * Devuelve la cantidad de supervisores de atracción requeridos
     *
     * @return Número de supervisores de atracción
     */
    public int getNumSupervisors() {
        return numSupervisors;
    }

    /**
     * Comprueba si una persona cumple las condiciones para poder montar en una atracción
     *
     * @param p Persona que quiere acceder a la atracción
     * @return Si cumple o no las condiciones para acceder
     */
    public boolean personAllowed(Persona p) {
        List ageGroupsAsList = Arrays.asList(ageGroupsAllowed);
        if (
                (this.minHeight == 0 || (this.minHeight != 0 && p.getHeight() > this.minHeight)) &&
                        (this.maxHeight == 0 || (this.maxHeight != 0 && p.getHeight() < this.maxHeight)) &&
                        ageGroupsAsList.contains(p.getAgeGroup())
        ) {
            return true;
        } else {
            return false;
        }

    }
}
