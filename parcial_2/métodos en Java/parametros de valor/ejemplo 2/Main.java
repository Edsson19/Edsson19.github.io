import java.util.Scanner;

public class Main {

    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        String nombreUsuario = obtenerNombreUsuario();

      
        System.out.println("¡Hola, " + nombreUsuario + "!");
    }

   
    public static String obtenerNombreUsuario() {
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        return nombre;
    }
}
