import java.util.Scanner;

public class ParametrosValorDoWhile {

    
    public static void duplicar(int numero) {
        numero = numero * 2;
        System.out.println("Número dentro del método: " + numero);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int numero;

        do {
            System.out.print("Ingresa un número: ");
            numero = sc.nextInt();

            duplicar(numero);

            System.out.println("Número fuera del método: " + numero);

            System.out.print("¿Deseas ingresar otro número? (1 = Sí, 0 = No): ");
            opcion = sc.nextInt();
        } while (opcion != 0);

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
