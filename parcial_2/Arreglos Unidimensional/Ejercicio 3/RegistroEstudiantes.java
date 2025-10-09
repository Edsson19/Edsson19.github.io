import java.util.Scanner;

public class RegistroEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("¿Cuántos estudiantes deseas registrar? ");
        int n = Integer.parseInt(sc.nextLine());  

        
        String[] estudiantes = new String[n];

        
        System.out.println("\n=== REGISTRO DE ESTUDIANTES ===");
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el nombre del estudiante " + (i + 1) + ": ");
            estudiantes[i] = sc.nextLine().trim(); 
        }

        
        System.out.println("\n=== LISTADO DE ESTUDIANTES ===");
        for (String nombre : estudiantes) {
            int longitud = nombre.length();

          
            String convertido;
            if (nombre.equals(nombre.toLowerCase())) {
               
                convertido = nombre.toUpperCase();
                System.out.println(nombre + " | Caracteres: " + longitud + " | Convertido a MAYÚSCULAS: " + convertido);
            } else if (nombre.equals(nombre.toUpperCase())) {
                
                convertido = nombre.toLowerCase();
                System.out.println(nombre + " | Caracteres: " + longitud + " | Convertido a minúsculas: " + convertido);
            } else {
                
                System.out.println(nombre + " | Caracteres: " + longitud + " | (Formato mixto, no se modifica)");
            }
        }

        sc.close();
    }
}
