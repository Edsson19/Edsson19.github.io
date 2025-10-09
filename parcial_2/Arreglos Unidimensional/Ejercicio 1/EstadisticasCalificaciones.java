import java.util.Scanner;

public class EstadisticasCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("¿Cuántas calificaciones deseas capturar? ");
        int n = sc.nextInt();

        
        double[] calificaciones = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa la calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();
        }

        
        double suma = 0;
        double max = calificaciones[0];
        double min = calificaciones[0];

        for (int i = 0; i < calificaciones.length; i++) {
            double cal = calificaciones[i];
            suma += cal;

            if (cal > max) {
                max = cal;
            }
            if (cal < min) {
                min = cal;
            }
        }

        
        double promedio = suma / calificaciones.length;

        
        System.out.println("\n=== CALIFICACIONES CAPTURADAS ===");
        for (double c : calificaciones) {
            System.out.print(c + "  ");
        }
        System.out.println("\nPromedio: " + promedio);
        System.out.println("Calificación máxima: " + max);
        System.out.println("Calificación mínima: " + min);

        sc.close();
    }
}
