import java.util.Scanner;

public class CineEntradas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        final double PRECIO_NORMAL = 50;
        final double PRECIO_MIERCOLES = 30;
        final double PRECIO_PAREJA_JUEVES = 75;

        do {
            System.out.print("Ingresa el número de personas: ");
            int personas = sc.nextInt();

            System.out.print("Ingresa el día de la semana (ej. lunes, martes, miercoles, jueves...): ");
            String dia = sc.next().toLowerCase();

            System.out.print("¿Cuentas con membresía? (true/false): ");
            boolean membresia = sc.nextBoolean();

            double total = 0;

            switch (dia) {
                case "miercoles":
                    total = personas * PRECIO_MIERCOLES;
                    break;

                case "jueves":
                    int parejas = personas / 2;
                    int sobrante = personas % 2;
                    total = (parejas * PRECIO_PAREJA_JUEVES) + (sobrante * PRECIO_NORMAL);
                    break;

                default:
                    total = personas * PRECIO_NORMAL;
            }

            if (membresia) {
                total = total * 0.9; 
            }

            System.out.println(" El precio total es: $" + total);

            System.out.print("¿Quieres hacer otra compra? (s/n): ");
            continuar = sc.next();
            System.out.println("----------------------------------");

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println(" Gracias por tu compra. Disfruta la función 🍿");
        sc.close();
    }
}
