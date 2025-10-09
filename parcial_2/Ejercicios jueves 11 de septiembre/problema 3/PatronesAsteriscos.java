import java.util.Scanner;

public class PatronesAsteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();

        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            
            System.out.print("    ");

            
            int estrellas = 2 * (n - i) + 1;
            int espacios = i - 1;
            for (int j = 1; j <= espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= estrellas; j++) {
                System.out.print("*");
            }

            
            System.out.print("    ");

            
            int estrellas2 = 2 * i - 1;
            for (int j = 1; j <= estrellas2; j++) {
                System.out.print("*");
            }

            
            System.out.println();
        }
    }
}
