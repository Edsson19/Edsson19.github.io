import java.util.Scanner;

public class AhorrosMensuales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ahorroTotal = 0;
        int mes = 1;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Mes " + mes + " - Ingresa la cantidad que ahorraste: ");
            double ahorroMes = scanner.nextDouble();
            ahorroTotal += ahorroMes;

            System.out.println("Llevas ahorrado: $" + ahorroTotal);

            System.out.print("¿Quieres seguir ahorrando el próximo mes? (s/n): ");
            String respuesta = scanner.next();

            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            } else {
                mes++;
            }
        }

        System.out.println("\nPrograma terminado. Ahorro total: $" + ahorroTotal);
        scanner.close();
    }
}