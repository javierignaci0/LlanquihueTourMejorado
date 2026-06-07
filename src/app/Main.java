package app;

import model.*;

public class Main {
    public static void main(String[] args) {

        Rut r1 = new Rut("25545433-8");
        Rut r2 = new Rut("17303944-4");
        Rut r3 = new Rut("15432946-5");
        Rut r4 = new Rut("12345678-9");

        Direccion direccion1 = new Direccion("avenida 31minutos", "Osorno", 343, "Los Lagos");
        Direccion direccion2 = new Direccion("San Martin", "Llanquihue", 654, "Los Lagos");
        Direccion direccion3 = new Direccion("Freire", "Frutillar", 99, "Los Lagos");
        Direccion direccion4 = new Direccion("O'Higgins", "Puerto Varas", 123, "Los Lagos");


        System.out.println(r1.rutValido());

        Persona persona1 = new Persona("Andres", "Andrada", r4, direccion4, 87654321);
        Cliente cliente1 = new Cliente("Tulio", "Trivinho", r1, direccion1, 123456789, 232, "tulio@mail.com");
        Empleado empleado1 = new Empleado("Juan Carlos", "Bodoque", r2, direccion2, 334682923, "Full-Time", "Campo", "Experto en Humedales" );
        Partner partner1 = new Partner("Juanin Juan", "Harris", r3 , direccion3, 123456789, "PullmanTur", "Conductor");

        // Llamada implicita a toString()
        System.out.println(cliente1);
        System.out.println(empleado1);
        System.out.println(partner1);

        System.out.println("\n");

        cliente1.setApellido("Gomez Pereira");
        System.out.println(cliente1.toString());

    }
}
