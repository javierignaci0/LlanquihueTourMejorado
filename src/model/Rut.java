package model;

/**
 * Clase Rut como composicion para usarse en Clase Persona
 */
public class Rut {


    private String rut;

    /**
     * Constructor de objeto Rut con el valor indicado
     *
     * @param rut valor de la Persona
     */
    public Rut(String rut) {
        this.rut = rut;
    }

    /**
     *
     * @return retorna como valor legible el atributo rut de la Persona.
     */
    public String toString(){
        return rut;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     *
     * @return un booleano true si el rut tiene menos de 11 caracteres y contiene guion, false en caso contrario
     */
    public boolean rutValido(){
        // 12345678-9
        return rut.length() < 11 && rut.contains("-");
    }

}
