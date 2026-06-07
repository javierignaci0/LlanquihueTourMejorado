package model;

/**
 * Clase hija Cliente que extiende de Clase padre Persona
 */
public class Cliente extends Persona {
    private int idCliente;
    private String emailCliente;

    /**
     *
     * @param nombre Nombre del cliente
     * @param apellido Apellido del cliente
     * @param rut Rut del cliente
     * @param direccion Direccion del cliente
     * @param telefono Telefono del cliente
     * @param idCliente ID del cliente
     * @param emailCliente Email del cliente
     */
    public Cliente(String nombre, String apellido, Rut rut , Direccion direccion, int telefono, int idCliente, String emailCliente) {
        super(nombre, apellido, rut, direccion, telefono);
        this.idCliente = idCliente;
        this.emailCliente = emailCliente;
    }

    /**
     *
     * @return Entrega la info de la clase Cliente, con los atributos heradados de la clase Persona
     * mas los propios de Cliente
     */
    @Override
    public String toString(){
        return "Cliente: " + super.toString() + ", ID: " +  idCliente + ", Email: " + emailCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
}
