import java.util.Scanner;

public class CalificacionesEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        System.out.print("Ingrese el número de estudiantes: ");
        n = sc.nextInt();
        System.out.print("Ingrese el número de exámenes: ");
        m = sc.nextInt();

        double[][] calificaciones = new double[n][m];

        // ===== Ingreso de calificaciones =====
        System.out.println("\n=== Ingrese las calificaciones ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            for (int j = 0; j < m; j++) {
                double nota;
                do {
                    System.out.print("  Examen " + (j + 1) + ": ");
                    nota = sc.nextDouble();
                    if (nota < 0 || nota > 10) {
                        System.out.println("  ⚠️ Calificación inválida. Debe estar entre 0 y 10.");
                    }
                } while (nota < 0 || nota > 10);
                calificaciones[i][j] = nota;
            }
        }

        // ===== Cálculo del promedio de cada estudiante =====
        double[] promedios = new double[n];
        for (int i = 0; i < n; i++) {
            double suma = 0;
            for (int j = 0; j < m; j++) {
                suma += calificaciones[i][j];
            }
            promedios[i] = suma / m;
        }

        // ===== Mostrar promedios =====
        System.out.println("\n=== Promedios de los estudiantes ===");
        for (int i = 0; i < n; i++) {
            System.out.printf("Estudiante %d: %.2f%n", (i + 1), promedios[i]);
        }

        // ===== Determinar estudiantes con mejor promedio (9-10) =====
        int contAlto = 0;
        for (int i = 0; i < n; i++) {
            if (promedios[i] >= 9 && promedios[i] <= 10) contAlto++;
        }

        if (contAlto > 0) {
            double[][] altos = new double[contAlto][m];
            int fila = 0;
            for (int i = 0; i < n; i++) {
                if (promedios[i] >= 9 && promedios[i] <= 10) {
                    for (int j = 0; j < m; j++) {
                        altos[fila][j] = calificaciones[i][j];
                    }
                    fila++;
                }
            }

            System.out.println("\n=== Estudiantes con promedio entre 9 y 10 ===");
            for (int i = 0; i < contAlto; i++) {
                System.out.print("Estudiante " + (i + 1) + ": ");
                for (int j = 0; j < m; j++) {
                    System.out.print(altos[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nNo hay estudiantes con promedio entre 9 y 10.");
        }

        // ===== Determinar estudiantes con promedio bajo (<7) =====
        int contBajo = 0;
        for (int i = 0; i < n; i++) {
            if (promedios[i] < 7.0) contBajo++;
        }

        if (contBajo > 0) {
            double[][] bajos = new double[contBajo][m];
            int fila = 0;
            for (int i = 0; i < n; i++) {
                if (promedios[i] < 7.0) {
                    for (int j = 0; j < m; j++) {
                        bajos[fila][j] = calificaciones[i][j];
                    }
                    fila++;
                }
            }

            System.out.println("\n=== Estudiantes con promedio inferior a 7.0 ===");
            for (int i = 0; i < contBajo; i++) {
                System.out.print("Estudiante " + (i + 1) + ": ");
                for (int j = 0; j < m; j++) {
                    System.out.print(bajos[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nNo hay estudiantes con promedio inferior a 7.0.");
        }

        // ===== Calcular promedios por examen =====
        double[] promedioExamen = new double[m];
        for (int j = 0; j < m; j++) {
            double suma = 0;
            for (int i = 0; i < n; i++) {
                suma += calificaciones[i][j];
            }
            promedioExamen[j] = suma / n;
        }

        // ===== Examen con promedio más alto y más bajo =====
        double maxProm = promedioExamen[0], minProm = promedioExamen[0];
        int examenAlto = 0, examenBajo = 0;
        for (int j = 1; j < m; j++) {
            if (promedioExamen[j] > maxProm) {
                maxProm = promedioExamen[j];
                examenAlto = j;
            }
            if (promedioExamen[j] < minProm) {
                minProm = promedioExamen[j];
                examenBajo = j;
            }
        }

        System.out.println("\n=== Promedios por examen ===");
        for (int j = 0; j < m; j++) {
            System.out.printf("Examen %d: %.2f%n", (j + 1), promedioExamen[j]);
        }

        System.out.println("\nExamen con promedio más alto: Examen " + (examenAlto + 1) + " con promedio " + maxProm);
        System.out.println("Examen con promedio más bajo: Examen " + (examenBajo + 1) + " con promedio " + minProm);

        sc.close();
    }
}
