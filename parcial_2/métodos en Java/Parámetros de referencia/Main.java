class Persona {
    private String nombre;

 
    public Persona(String nombre) {
        this.nombre = nombre;
    }

  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

public class Main {

    public static void cambiarNombre(Persona persona, String nuevoNombre) {
        persona.setNombre(nuevoNombre);
        System.out.println("Nombre cambiado dentro del método: " + persona.getNombre());
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Juan");

        cambiarNombre(persona, "Pedro");

        System.out.println("Nombre fuera del método: " + persona.getNombre());
    }
}
