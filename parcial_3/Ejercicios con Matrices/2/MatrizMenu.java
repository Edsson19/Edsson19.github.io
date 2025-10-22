import java.util.Scanner;

public class MatrizMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        boolean rellenada = false; 
        int opcion;

        do {
            System.out.println("\n===== MENÚ DE MATRIZ 4x4 =====");
            System.out.println("1. Rellenar toda la matriz (sin repetir números)");
            System.out.println("2. Suma de cada fila y columna");
            System.out.println("3. Suma de una fila indicada por el usuario");
            System.out.println("4. Suma de una columna indicada por el usuario");
            System.out.println("5. Mostrar el mayor y menor número y sus posiciones");
            System.out.println("6. Contar cuántos son pares");
            System.out.println("7. Contar cuántos son impares");
            System.out.println("8. Generar nueva matriz con el cuadrado de cada valor");
            System.out.println("9. Sumar diagonal principal");
            System.out.println("10. Sumar diagonal inversa");
            System.out.println("11. Calcular la media de todos los valores");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    rellenarMatriz(matriz, sc);
                    rellenada = true;
                    mostrarMatriz(matriz);
                    break;

                case 2:
                    if (!rellenada) aviso();
                    else sumaFilasColumnas(matriz);
                    break;

                case 3:
                    if (!rellenada) aviso();
                    else sumaFila(matriz, sc);
                    break;

                case 4:
                    if (!rellenada) aviso();
                    else sumaColumna(matriz, sc);
                    break;

                case 5:
                    if (!rellenada) aviso();
                    else mayorMenor(matriz);
                    break;

                case 6:
                    if (!rellenada) aviso();
                    else contarPares(matriz);
                    break;

                case 7:
                    if (!rellenada) aviso();
                    else contarImpares(matriz);
                    break;

                case 8:
                    if (!rellenada) aviso();
                    else matrizCuadrada(matriz);
                    break;

                case 9:
                    if (!rellenada) aviso();
                    else diagonalPrincipal(matriz);
                    break;

                case 10:
                    if (!rellenada) aviso();
                    else diagonalInversa(matriz);
                    break;

                case 11:
                    if (!rellenada) aviso();
                    else mediaMatriz(matriz);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }

    

    static void aviso() {
        System.out.println("⚠️ Debes rellenar la matriz primero (opción 1).");
    }

    static void mostrarMatriz(int[][] matriz) {
        System.out.println("\nMatriz actual:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static boolean existeNumero(int[][] matriz, int num) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] == num) return true;
            }
        }
        return false;
    }

    static void rellenarMatriz(int[][] matriz, Scanner sc) {
        System.out.println("\nRellena la matriz con números (no repetidos):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num;
                do {
                    System.out.print("Valor para [" + i + "][" + j + "]: ");
                    num = sc.nextInt();
                    if (existeNumero(matriz, num)) {
                        System.out.println("❌ Ese número ya existe en la matriz. Intenta con otro.");
                    }
                } while (existeNumero(matriz, num));
                matriz[i][j] = num;
            }
        }
        System.out.println("✅ Matriz rellenada correctamente.");
    }

    static void sumaFilasColumnas(int[][] matriz) {
        mostrarMatriz(matriz);
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 4; j++) sumaFila += matriz[i][j];
            System.out.println("Suma de fila " + i + ": " + sumaFila);
        }
        for (int j = 0; j < 4; j++) {
            int sumaCol = 0;
            for (int i = 0; i < 4; i++) sumaCol += matriz[i][j];
            System.out.println("Suma de columna " + j + ": " + sumaCol);
        }
    }

    static void sumaFila(int[][] matriz, Scanner sc) {
        mostrarMatriz(matriz);
        int fila;
        do {
            System.out.print("Elige una fila (0-3): ");
            fila = sc.nextInt();
        } while (fila < 0 || fila > 3);

        int suma = 0;
        for (int j = 0; j < 4; j++) suma += matriz[fila][j];
        System.out.println("Suma de la fila " + fila + ": " + suma);
    }

    static void sumaColumna(int[][] matriz, Scanner sc) {
        mostrarMatriz(matriz);
        int col;
        do {
            System.out.print("Elige una columna (0-3): ");
            col = sc.nextInt();
        } while (col < 0 || col > 3);

        int suma = 0;
        for (int i = 0; i < 4; i++) suma += matriz[i][col];
        System.out.println("Suma de la columna " + col + ": " + suma);
    }

    static void mayorMenor(int[][] matriz) {
        mostrarMatriz(matriz);
        int mayor = matriz[0][0], menor = matriz[0][0];
        int fMayor = 0, cMayor = 0, fMenor = 0, cMenor = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    fMayor = i;
                    cMayor = j;
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    fMenor = i;
                    cMenor = j;
                }
            }
        }

        System.out.println("Mayor: " + mayor + " en posición [" + fMayor + "][" + cMayor + "]");
        System.out.println("Menor: " + menor + " en posición [" + fMenor + "][" + cMenor + "]");
    }

    static void contarPares(int[][] matriz) {
        mostrarMatriz(matriz);
        int cont = 0;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                if (matriz[i][j] % 2 == 0) cont++;
        System.out.println("Cantidad de números pares: " + cont);
    }

    static void contarImpares(int[][] matriz) {
        mostrarMatriz(matriz);
        int cont = 0;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                if (matriz[i][j] % 2 != 0) cont++;
        System.out.println("Cantidad de números impares: " + cont);
    }

    static void matrizCuadrada(int[][] matriz) {
        int[][] cuadrado = new int[4][4];
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                cuadrado[i][j] = matriz[i][j] * matriz[i][j];

        System.out.println("\nMatriz con los cuadrados de los valores:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(cuadrado[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void diagonalPrincipal(int[][] matriz) {
        mostrarMatriz(matriz);
        int suma = 0;
        for (int i = 0; i < 4; i++) suma += matriz[i][i];
        System.out.println("Suma de la diagonal principal: " + suma);
    }

    static void diagonalInversa(int[][] matriz) {
        mostrarMatriz(matriz);
        int suma = 0;
        for (int i = 0; i < 4; i++) suma += matriz[i][3 - i];
        System.out.println("Suma de la diagonal inversa: " + suma);
    }

    static void mediaMatriz(int[][] matriz) {
        mostrarMatriz(matriz);
        int suma = 0, total = 16;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                suma += matriz[i][j];
        double media = (double) suma / total;
        System.out.println("Media de todos los valores: " + media);
    }
}
