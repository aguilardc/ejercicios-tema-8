public class Main {
    public static void main(String[] args) {
        Persona objPersona = new Persona();
        objPersona.setEdad(28);
        objPersona.setNombre("María");
        objPersona.setTelefono("555-5555");

        System.out.println("Mi nombre es: " + objPersona.getNombre() + " y tengo " + objPersona.getEdad() + " años. Mi teléfono es: " + objPersona.getTelefono());

    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}