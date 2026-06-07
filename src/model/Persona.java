package model;

/**
 * Representacion de una persona del sistema con nombre, apellido, rut, direccion y telefono
 * Rut y Direccion son de tipo Composicion
 */
public class Persona {
    private String nombre;
    private String apellido;
    // composicion - rut
    private Rut rut;
    // composicion - direccion
    private Direccion direccion;
    private int telefono;

    /**
     *
     * @param nombre Nombre de la persona
     * @param apellido Apellido de la persona
     * @param rut Rut de la persona
     * @param direccion Direccion de la persona
     * @param telefono Telefono de la persona
     */
    public Persona(String nombre, String apellido, Rut rut, Direccion direccion, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     *
     * @return Retorna la informacion legible de los atributos de persona
     */
    @Override
    public String toString(){
        return nombre + " " + apellido + ", Rut: " + rut + ", Direccion: " + direccion +  ", Telefono: " + telefono;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
