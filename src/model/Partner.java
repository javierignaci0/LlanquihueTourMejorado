package model;

/**
 * Clase hija Partner, a partir de atributos de clase padre Persona
 *
 */
public class Partner extends Persona {
    private String empresa;
    private String cargo;


    /**
     *
     * @param nombre Nombre del partner
     * @param apellido Apellido del partner
     * @param rut Rut del partner
     * @param direccion Direccion del partner
     * @param telefono Telefono del partner
     * @param empresa Empresa a la que pertenece el partner
     * @param cargo Cargo que ostenta el partner
     */
    public Partner(String nombre, String apellido, Rut rut , Direccion direccion, int telefono, String empresa, String cargo) {
        super(nombre, apellido, rut , direccion, telefono);
        this.empresa = empresa;
        this.cargo = cargo;
    }

    /**
     *
     * @return Retorna la informacion de Partner, con herencia de Persona
     * mas informacion propia de Partner
     */
    @Override
    public String toString(){
        return "Partner: " + super.toString() + ", Empresa: " + this.empresa + ", Cargo: " + this.cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
