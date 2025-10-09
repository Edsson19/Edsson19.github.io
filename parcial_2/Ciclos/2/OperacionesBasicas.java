import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            
            System.out.print("Ingrese el primer número entero: ");
            int num1 = sc.nextInt();

            System.out.print("Ingrese el segundo número entero: ");
            int num2 = sc.nextInt();

            
            System.out.print("Ingrese la operación (+, -, *, /): ");
            char operacion = sc.next().charAt(0);

            
            switch (operacion) {
                case '+':
                    System.out.println("Resultado: " + (num1 + num2));
                    break;

                case '-':
                    System.out.println("Resultado: " + (num1 - num2));
                    break;

                case '*':
                    System.out.println("Resultado: " + (num1 * num2));
                    break;

                case '/':
                    if (num2 != 0) {
                        double division = (double) num1 / num2;
                        System.out.println("Resultado: " + division);
                    } else {
                        System.out.println("Error: división por cero no permitida.");
                    }
                    break;

                default:
                    System.out.println("Operación no válida. Use (+, -, *, /).");
            }

            
            System.out.print("¿Desea realizar otra operación? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
