import java.util.Scanner;

public class PilaNumeros {
    static final int MAX = 6;  
    static int[] PILA = new int[MAX];
    static int TOPE = -1;      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ DE PILAS (LIFO) =====");
            System.out.println("1. Insertar número (PUSH)");
            System.out.println("2. Eliminar número (POP)");
            System.out.println("3. Mostrar pila");
            System.out.println("4. Mostrar TOPE");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    push(sc);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    mostrar();
                    break;
                case 4:
                    mostrarTope();
                    break;
                case 5:
                    System.out.println(" Saliendo del programa...");
                    break;
                default:
                    System.out.println(" Opción no válida.");
                    break;
            }
        } while (opcion != 5);
        sc.close();
    }

   
    static void push(Scanner sc) {
        if (estaLlena()) {
            System.out.println(" Pila llena. No se puede insertar más números.");
        } else {
            TOPE++;
            System.out.print("Ingresa un número: ");
            PILA[TOPE] = sc.nextInt();
            System.out.println( + PILA[TOPE] + " fue agregado a la pila.");
        }
    }

    
    static void pop() {
        if (estaVacia()) {
            System.out.println(" Pila vacía. No hay elementos que eliminar.");
        } else {
            System.out.println( + PILA[TOPE] + " fue eliminado de la pila.");
            TOPE--;
        }
    }

    
    static void mostrar() {
        if (estaVacia()) {
            System.out.println(" Pila vacía.");
        } else {
            System.out.println("\n Contenido de la pila:");
            for (int i = TOPE; i >= 0; i--) {
                System.out.println("[" + i + "] " + PILA[i]);
            }
        }
    }

   
    static void mostrarTope() {
        if (estaVacia()) {
            System.out.println(" La pila está vacía, no hay TOPE.");
        } else {
            System.out.println(" El tope actual es: " + PILA[TOPE]);
        }
    }

    
    static boolean estaLlena() {
        return (TOPE == MAX - 1);
    }

    static boolean estaVacia() {
        return (TOPE == -1);
    }
}
