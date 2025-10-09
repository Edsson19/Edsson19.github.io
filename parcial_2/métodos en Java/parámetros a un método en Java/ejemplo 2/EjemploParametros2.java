public class EjemploParametros2 {

    
    public static void imprimirDatos(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
        
        String nombre = "Juan";
        int edad = 25;

        
        imprimirDatos(nombre, edad);
    }
}
