package model;

/**
 * Clase hija Empleado, con herencia de clase padre Persona
 */
public class Empleado extends Persona {
     private String tipoContrato;
     private String area;
     private String cargo;

     /**
      *
      * @param nombre Nombre del empleado
      * @param apellido Apellido del empleado
      * @param rut Rut del empleado
      * @param direccion Direccion del empleado
      * @param telefono telefono del emplado
      * @param tipoContrato Tipo de contrato del empleado
      * @param area Area a la que pertenece el empleado
      * @param cargo Cargo que tiene el empleado
      */
     public Empleado(String nombre, String apellido, Rut rut, Direccion direccion, int telefono, String tipoContrato, String area, String cargo) {
          super(nombre, apellido, rut, direccion, telefono);
          this.tipoContrato = tipoContrato;
          this.area = area;
          this.cargo = cargo;
     }

     /**
      *
      * @return Retorna informacion de empleado, con atributos de Persona
      * mas los propios de Empleado
      */
     @Override
     public String toString(){
          return "Empleado: " + super.toString() + ", Tipo de contrato: " +  tipoContrato + ", Area: " + area + ", Cargo: " + cargo;
     }

     public String getTipoContrato() {
          return tipoContrato;
     }

     public void setTipoContrato(String tipoContrato) {
          this.tipoContrato = tipoContrato;
     }

     public String getArea() {
          return area;
     }

     public void setArea(String area) {
          this.area = area;
     }

     public String getCargo() {
          return cargo;
     }

     public void setCargo(String cargo) {
          this.cargo = cargo;
     }
}
