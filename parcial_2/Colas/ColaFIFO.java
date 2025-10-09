import java.util.Scanner;

public class ColaFIFO {
    
    static final int MAX = 6;

    
    static String[] COLA = new String[MAX];
    static int FRENTE = 0;
    static int ULTIMO = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ DE COLAS (FIFO) =====");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    insertar(sc);
                    break;
                case 2:
                    eliminar();
                    break;
                case 3:
                    mostrar();
                    break;
                case 4:
                    System.out.println("👋 Saliendo del programa...");
                    break;
                default:
                    System.out.println("❌ Opción no válida.");
                    break;
            }
        } while (opcion != 4);
        sc.close();
    }

    
    static void insertar(Scanner sc) {
        if (estaLlena()) {
            System.out.println("⚠️ Cola llena. No se puede insertar más elementos.");
        } else {
            ULTIMO++;
            System.out.print("Ingresa un nombre: ");
            COLA[ULTIMO] = sc.next();
            System.out.println("✅ " + COLA[ULTIMO] + " fue agregado a la cola.");
        }
    }

    
    static void eliminar() {
        if (estaVacia()) {
            System.out.println("⚠️ Cola vacía. No hay elementos que eliminar.");
        } else {
            System.out.println("🚫 " + COLA[FRENTE] + " ha sido eliminado de la cola.");
            FRENTE++;

            
            if (FRENTE > ULTIMO) {
                FRENTE = 0;
                ULTIMO = -1;
            }
        }
    }

   
    static void mostrar() {
        if (estaVacia()) {
            System.out.println("⚠️ Cola vacía.");
        } else {
            System.out.println("\n📋 Contenido de la cola:");
            for (int i = FRENTE; i <= ULTIMO; i++) {
                System.out.println("[" + i + "] " + COLA[i]);
            }
        }
    }


    static boolean estaVacia() {
        return (ULTIMO == -1);
    }

    static boolean estaLlena() {
        return (ULTIMO == MAX - 1);
    }

    static String frente() {
        if (!estaVacia())
            return COLA[FRENTE];
        else
            return null;
    }

    static String ultimo() {
        if (!estaVacia())
            return COLA[ULTIMO];
        else
            return null;
    }
}
