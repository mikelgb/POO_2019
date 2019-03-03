package personas;

/**
 * Clase Persona con las propiedades de la misma para la gestión del parque
 */
public class Persona {
    /**
     * Nombre de la persona
     */
    private String name;
    /**
     * Edad de la persona
     */
    private int age;
    /**
     * Altura de la persona
     */
    private float height;
    /**
     * Grupo de edad al que pertenece la persona (niño, adulto o senior)
     */
    private AgeGroup ageGroup;

    /**
     * Constructor principal
     *
     * @param name Nombre de la persona
     * @param age Edad de la persona
     * @param height Altura de la persona
     */
    public Persona(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
        this._calcAgeGroup();
    }

    /**
     * Método para calcular a qué grupo de edad pertenece la persona
     */
    private void _calcAgeGroup() {
        if (age < 3) {
            this.ageGroup = AgeGroup.FREEKID;
        } else if (age < 13) {
            this.ageGroup = AgeGroup.KID;
        } else if (age < 65) {
            this.ageGroup = AgeGroup.ADULT;
        } else {
            this.ageGroup = AgeGroup.SENIOR;
        }
    }

    /**
     * Devuelve el nombre de la persona
     *
     * @return Nombre de la persona
     */
    public String getName() {
        return name;
    }

    /**
     * Devuelve la edad de la persona
     *
     * @return Edad de la persona
     */
    public int getAge() {
        return age;
    }

    /**
     * Devuelve la altura de la persona
     *
     * @return Altura de la persona
     */
    public float getHeight() {
        return height;
    }

    /**
     * Devuelve el grupo de edad al que pertenece la persona
     *
     * @return Grupo de edad de la persona
     */
    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", ageGroup=" + ageGroup +
                '}';
    }
}
