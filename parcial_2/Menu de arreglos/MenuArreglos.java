import java.util.Arrays;
import java.util.Scanner;

public class MenuArreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arreglo = null;  
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE ARREGLOS ===");
            System.out.println("1. Guardar/Almacenar elementos");
            System.out.println("2. Recorrer arreglo ascendente");
            System.out.println("3. Recorrer arreglo descendente");
            System.out.println("4. Buscar elemento");
            System.out.println("5. Modificar elemento");
            System.out.println("6. Eliminar todo el arreglo");
            System.out.println("7. Ordenar arreglo ascendente");
            System.out.println("8. Ordenar arreglo descendente");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos elementos quieres guardar? ");
                    int n = sc.nextInt();
                    arreglo = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Elemento [" + (i + 1) + "]: ");
                        arreglo[i] = sc.nextInt();
                    }
                    System.out.println("Arreglo almacenado correctamente.");
                    break;

                case 2:
                    if (arreglo != null) {
                        System.out.println("\nRecorrido ascendente:");
                        for (int i = 0; i < arreglo.length; i++) {
                            System.out.print(arreglo[i] + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Primero guarda elementos en el arreglo.");
                    }
                    break;

                case 3:
                    if (arreglo != null) {
                        System.out.println("\nRecorrido descendente:");
                        for (int i = arreglo.length - 1; i >= 0; i--) {
                            System.out.print(arreglo[i] + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Primero guarda elementos en el arreglo.");
                    }
                    break;

                case 4:
                    if (arreglo != null) {
                        System.out.print("Ingresa el elemento a buscar: ");
                        int buscar = sc.nextInt();
                        boolean encontrado = false;
                        for (int i = 0; i < arreglo.length; i++) {
                            if (arreglo[i] == buscar) {
                                System.out.println("Elemento encontrado en la posición " + i);
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Elemento no encontrado.");
                        }
                    } else {
                        System.out.println("Primero guarda elementos en el arreglo.");
                    }
                    break;

                case 5:
                    if (arreglo != null) {
                        System.out.print("Ingresa la posición a modificar (0 a " + (arreglo.length - 1) + "): ");
                        int pos = sc.nextInt();
                        if (pos >= 0 && pos < arreglo.length) {
                            System.out.print("Nuevo valor: ");
                            arreglo[pos] = sc.nextInt();
                            System.out.println("Elemento modificado correctamente.");
                        } else {
                            System.out.println("Posición inválida.");
                        }
                    } else {
                        System.out.println("Primero guarda elementos en el arreglo.");
                    }
                    break;

                case 6:
                    arreglo = null;
                    System.out.println("Arreglo eliminado.");
                    break;

                case 7:
                    if (arreglo != null) {
                        Arrays.sort(arreglo);
                        System.out.println("Arreglo ordenado en forma ascendente.");
                    } else {
                        System.out.println("Primero guarda elementos en el arreglo.");
                    }
                    break;

                case 8:
                    if (arreglo != null) {
                        Arrays.sort(arreglo);
                        
                        for (int i = 0; i < arreglo.length / 2; i++) {
                            int temp = arreglo[i];
                            arreglo[i] = arreglo[arreglo.length - 1 - i];
                            arreglo[arreglo.length - 1 - i] = temp;
                        }
                        System.out.println("Arreglo ordenado en forma descendente.");
                    } else {
                        System.out.println("Primero guarda elementos en el arreglo.");
                    }
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
}