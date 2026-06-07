package model;

public class Persona {

    private String nombre;
    private String apellido;
    private Rut rut;
    // composicion - direccion
    private Direccion direccion;
    private int telefono;

    // constructor
    public Persona(String nombre, String apellido, Rut rut, Direccion direccion, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString(){
        return nombre + " " + apellido + ", Rut: " + rut + ", Direccion: " + direccion +  ", Telefono: " + telefono;

    }



    // getter y setter

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
