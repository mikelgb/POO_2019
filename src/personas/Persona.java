package personas;

/**
 * Clase Persona con las propiedades de la misma para la gestión del parque
 */
public class Persona {
    /**
     * Nombre de la persona
     */
    private String nombre;
    /**
     * Edad de la persona
     */
    private int edad;
    /**
     * Altura de la persona
     */
    private float altura;
    /**
     * Grupo de edad al que pertenece la persona (niño, adulto o senior)
     */
    private GrupoEdad grupoEdad;

    /**
     * Constructor principal
     *
     * @param nombre Nombre de la persona
     * @param edad Edad de la persona
     * @param altura Altura de la persona
     */
    public Persona(String nombre, int edad, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.calcGrupoEdad();
    }

    /**
     * Método para calcular a qué grupo de edad pertenece la persona
     */
    private void calcGrupoEdad() {
        if (edad < 3) {
            this.grupoEdad = GrupoEdad.NINOGRATIS;
        } else if (edad < 13) {
            this.grupoEdad = GrupoEdad.NINO;
        } else if (edad < 65) {
            this.grupoEdad = GrupoEdad.ADULTO;
        } else {
            this.grupoEdad = GrupoEdad.SENIOR;
        }
    }

    /**
     * Devuelve el nombre de la persona
     *
     * @return Nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la edad de la persona
     *
     * @return Edad de la persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Devuelve la altura de la persona
     *
     * @return Altura de la persona
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Devuelve el grupo de edad al que pertenece la persona
     *
     * @return Grupo de edad de la persona
     */
    public GrupoEdad getGrupoEdad() {
        return grupoEdad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", grupoEdad=" + grupoEdad +
                '}';
    }
}
