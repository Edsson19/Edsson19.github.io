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

        
        int contadorReprobadas = 0;
        String reprobadas = "";  

        for (double cal : calificaciones) {
            suma += cal;

            if (cal > max) max = cal;
            if (cal < min) min = cal;

            
            if (cal < 7.0) {
                contadorReprobadas++;
                reprobadas += cal + "  ";
            }
        }

        double promedio = suma / calificaciones.length;

        
        System.out.println("\n=== RESULTADOS ===");
        System.out.print("Calificaciones capturadas: ");
        for (double c : calificaciones) {
            System.out.print(c + "  ");
        }

        System.out.println("\nPromedio: " + promedio);
        System.out.println("Calificación máxima: " + max);
        System.out.println("Calificación mínima: " + min);

        
        if (contadorReprobadas > 0) {
            System.out.println("Calificaciones reprobatorias (" + contadorReprobadas + "): " + reprobadas);
        } else {
            System.out.println("No hay calificaciones reprobatorias.");
        }

        sc.close();
    }
}
