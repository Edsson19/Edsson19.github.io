import java.util.Scanner;

public class ChoferesEmpresa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numChoferes = 5;
        int dias = 6; 

        String[] nombres = new String[numChoferes];
        double[][] horas = new double[numChoferes][dias];
        double[] sueldoHora = new double[numChoferes];
        String[] descanso = new String[numChoferes];
        double[] totalHoras = new double[numChoferes];
        double[] sueldoSemanal = new double[numChoferes];

        
        System.out.println("=== INGRESO DE DATOS DE CHOFERES ===");
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};

        for (int i = 0; i < numChoferes; i++) {
            System.out.println("\nChofer #" + (i + 1));
            System.out.print("Nombre: ");
            nombres[i] = sc.next();

            System.out.print("Sueldo por hora: ");
            sueldoHora[i] = sc.nextDouble();

            System.out.print("Día de descanso (Lunes a Sábado): ");
            descanso[i] = sc.next();

            for (int j = 0; j < dias; j++) {
                if (diasSemana[j].equalsIgnoreCase(descanso[i])) {
                    horas[i][j] = 0;
                    System.out.println("  " + diasSemana[j] + ": DESCANSO");
                } else {
                    System.out.print("  Horas trabajadas el " + diasSemana[j] + ": ");
                    horas[i][j] = sc.nextDouble();
                }
            }
        }

        
        double totalEmpresa = 0;
        double maxHorasLunes = 0;
        String choferMasLunes = "";

        for (int i = 0; i < numChoferes; i++) {
            totalHoras[i] = 0;
            for (int j = 0; j < dias; j++) {
                totalHoras[i] += horas[i][j];
            }

            sueldoSemanal[i] = totalHoras[i] * sueldoHora[i];
            totalEmpresa += sueldoSemanal[i];

            
            if (horas[i][0] > maxHorasLunes) {
                maxHorasLunes = horas[i][0];
                choferMasLunes = nombres[i];
            }
        }

        
        System.out.println("\n===== REPORTE SEMANAL =====");
        for (int i = 0; i < numChoferes; i++) {
            System.out.println("\nChofer: " + nombres[i]);
            System.out.println("Día de descanso: " + descanso[i]);
            System.out.println("Sueldo por hora: $" + sueldoHora[i]);
            System.out.println("Horas por día:");
            for (int j = 0; j < dias; j++) {
                System.out.println("  " + diasSemana[j] + ": " + horas[i][j]);
            }
            System.out.println("Total de horas trabajadas: " + totalHoras[i]);
            System.out.println("Sueldo semanal: $" + sueldoSemanal[i]);
        }

        System.out.println("\n===== RESUMEN GENERAL =====");
        System.out.println("Total que pagará la empresa: $" + totalEmpresa);
        System.out.println("Chofer que trabajó más horas el día lunes: " + choferMasLunes +
                           " (" + maxHorasLunes + " horas)");

        sc.close();
    }
}
