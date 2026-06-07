package model;

/**
 * Representa la direccion de una persona con algun vinculo a la agencia de turismo
 *
 * Clase Direccion para usarse como composicion en clase Persona
 */
public class Direccion {
    private String calle;
    private String comuna;
    private int numero;
    private String region;

    /**
     *
     * @param calle calle de la direccion de la persona
     * @param comuna comuna de la direccion de la persona
     * @param numero numero de calle de la direccion de la persona
     * @param region region de la direccion de la persona
     */
    public Direccion(String calle, String comuna, int numero, String region) {
        this.calle = calle;
        this.comuna = comuna;
        this.numero = numero;
        this.region = region;
    }

    /**
     *
     * @return Retorna informacion legible por consola sobre la direccion de una Persona
     */
    @Override
    public String toString(){
        return calle + " #" + numero + ", Comuna de " + comuna + ", Region: " + region + ".";
    }


    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }


}