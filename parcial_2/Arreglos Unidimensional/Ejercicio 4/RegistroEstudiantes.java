import java.util.Scanner;
import java.util.Arrays;

class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-8d %-10.2f", nombre, edad, promedio);
    }
}

public class RegistroEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes deseas registrar? ");
        int n = Integer.parseInt(sc.nextLine());

        Estudiante[] estudiantes = new Estudiante[n];

        System.out.println("\n=== CAPTURA DE DATOS ===");
        for (int i = 0; i < n; i++) {
            System.out.println("\nEstudiante " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine().trim();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(sc.nextLine());

            System.out.print("Promedio: ");
            double promedio = Double.parseDouble(sc.nextLine());

            estudiantes[i] = new Estudiante(nombre, edad, promedio);
        }

        // Menú de opciones
        int opcion;
        do {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Mostrar lista de estudiantes");
            System.out.println("2. Ordenar por nombre");
            System.out.println("3. Ordenar por promedio");
            System.out.println("4. Buscar por nombre");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    mostrarLista(estudiantes);
                    break;
                case 2:
                    ordenarPorNombre(estudiantes);
                    mostrarLista(estudiantes);
                    break;
                case 3:
                    ordenarPorPromedio(estudiantes);
                    mostrarLista(estudiantes);
                    break;
                case 4:
                    System.out.print("Ingresa el nombre a buscar: ");
                    String buscar = sc.nextLine().trim();
                    buscarPorNombre(estudiantes, buscar);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }

    public static void mostrarLista(Estudiante[] estudiantes) {
        System.out.println("\n=== LISTADO DE ESTUDIANTES ===");
        System.out.printf("%-20s %-8s %-10s%n", "NOMBRE", "EDAD", "PROMEDIO");
        System.out.println("---------------------------------------------");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }

    public static void ordenarPorNombre(Estudiante[] estudiantes) {
        Arrays.sort(estudiantes, (a, b) -> a.getNombre().compareToIgnoreCase(b.getNombre()));
        System.out.println("\nEstudiantes ordenados por nombre.");
    }

    public static void ordenarPorPromedio(Estudiante[] estudiantes) {
        Arrays.sort(estudiantes, (a, b) -> Double.compare(b.getPromedio(), a.getPromedio()));
        System.out.println("\nEstudiantes ordenados por promedio (mayor a menor).");
    }

    public static void buscarPorNombre(Estudiante[] estudiantes, String nombre) {
        boolean encontrado = false;
        for (Estudiante e : estudiantes) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("\nEstudiante encontrado:");
                System.out.printf("%-20s %-8s %-10s%n", "NOMBRE", "EDAD", "PROMEDIO");
                System.out.println(e);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún estudiante con ese nombre.");
        }
    }
}