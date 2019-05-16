package atracciones;

import personas.GrupoEdad;
import personas.Persona;

import java.util.Arrays;
import java.util.List;

public class Atraccion {

    /**
     * Altura mínima, 0 si no existe
     */
    private float alturaMinima;
    /**
     * Altura máxima, 0 si no existe
     */
    private float alturaMaxima;
    /**
     * Permite suplemento VIP
     */
    private boolean vipPermitido;
    /**
     * Grupos de edad permitidos
     */
    private GrupoEdad[] gruposEdadPermitidos;
    /**
     * Número de ayudantes de atracción
     */
    private int numTrabajadores;
    /**
     * Número de supervisores de atraccion
     */
    private int numSupervisores;

    public Atraccion(float alturaMinima, float alturaMaxima, boolean vipPermitido, GrupoEdad[] gruposEdadPermitidos, int numTrabajadores, int numSupervisores) {
        this.alturaMinima = alturaMinima;
        this.alturaMaxima = alturaMaxima;
        this.vipPermitido = vipPermitido;
        this.gruposEdadPermitidos = gruposEdadPermitidos;
        this.numTrabajadores = numTrabajadores;
        this.numSupervisores = numSupervisores;
    }

    /**
     * Devuelve la altura mínima para montar en la atracción
     *
     * @return Altura mínima
     */
    public float getAlturaMinima() {
        return alturaMinima;
    }

    /**
     * Devuelve la altura máxima para montar en la atracción
     *
     * @return Altura máxima
     */
    public float getAlturaMaxima() {
        return alturaMaxima;
    }

    /**
     * Devuelve si la atracciónj permite o no suplemento VIP
     *
     * @return Permite o no suplemento VIP
     */
    public boolean isVipPermitido() {
        return vipPermitido;
    }

    /**
     * Devuelve la lista de grupos de edad permitidos en la atracción
     *
     * @return Grupos de edad permitidos
     */
    public GrupoEdad[] getGruposEdadPermitidos() {
        return gruposEdadPermitidos;
    }

    /**
     * Devuelve la cantidad de ayudantes de atracción requeridos
     *
     * @return Número de ayudantes de atracción
     */
    public int getNumTrabajadores() {
        return numTrabajadores;
    }

    /**
     * Devuelve la cantidad de supervisores de atracción requeridos
     *
     * @return Número de supervisores de atracción
     */
    public int getNumSupervisores() {
        return numSupervisores;
    }

    /**
     * Comprueba si una persona cumple las condiciones para poder montar en una atracción
     *
     * @param p Persona que quiere acceder a la atracción
     * @return Si cumple o no las condiciones para acceder
     */
    public boolean personaPermitida(Persona p) {
        List ageGroupsAsList = Arrays.asList(gruposEdadPermitidos);
        if (
                (this.alturaMinima == 0 || (this.alturaMinima != 0 && p.getAltura() > this.alturaMinima)) &&
                        (this.alturaMaxima == 0 || (this.alturaMaxima != 0 && p.getAltura() < this.alturaMaxima)) &&
                        ageGroupsAsList.contains(p.getGrupoEdad())
        ) {
            return true;
        } else {
            return false;
        }

    }
}
