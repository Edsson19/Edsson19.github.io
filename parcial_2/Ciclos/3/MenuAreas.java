import java.util.Scanner;

public class MenuAreas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("=== MENÚ DE CÁLCULO DE ÁREAS ===");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triangulo");
            System.out.println("5. Circulo");
            int opcion = sc.nextInt();

            double area = 0;

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el lado del cuadrado: ");
                    double lado = sc.nextDouble();
                    area = lado * lado;
                    System.out.println("El área del cuadrado es: " + area);
                    break;

                case 2:
                    System.out.print("Ingresa la base del rectángulo: ");
                    double baseRect = sc.nextDouble();
                    System.out.print("Ingresa la altura del rectángulo: ");
                    double alturaRect = sc.nextDouble();
                    area = baseRect * alturaRect;
                    System.out.println("El área del rectángulo es: " + area);
                    break;

                case 3:
                    System.out.print("Ingresa la base del triángulo: ");
                    double baseTri = sc.nextDouble();
                    System.out.print("Ingresa la altura del triángulo: ");
                    double alturaTri = sc.nextDouble();
                    area = (baseTri * alturaTri) / 2;
                    System.out.println("El área del triángulo es: " + area);
                    break;

                case 4:
                    System.out.print("Ingresa el radio del círculo: ");
                    double radio = sc.nextDouble();
                    area = Math.PI * Math.pow(radio, 2);
                    System.out.println("El área del círculo es: " + area);
                    break;

                default:
                    System.out.println("Opción inválida. Elige un número entre 1 y 4.");
            }

            System.out.print("¿Quieres calcular otra área? (s/n): ");
            continuar = sc.next();
            System.out.println("----------------------------------");

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Programa terminado. ");
        sc.close();
    }
}
