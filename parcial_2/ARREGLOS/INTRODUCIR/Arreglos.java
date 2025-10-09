import java.util.Scanner;  
public class Arreglos {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);

        int[] A = new int[5];   

        System.out.println("Ejemplo de arreglos unidimensionales");

        System.out.print("¿Cuántos elementos vas a guardar (máx 5)? ");
        int N = sc.nextInt();   

        
        for (int i = 0; i < N && i < A.length; i++) {
            System.out.print("Introduce el valor para la posición " + i + ": ");
            A[i] = sc.nextInt();
        }

        
        System.out.println("\nLos elementos del arreglo son:");
        for (int i = 0; i < N && i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        
        System.out.println("\n\nLos elementos usando length:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        
        System.out.println("\n\nUtilizando foreach:");
        for (int valor : A) {
            System.out.print(valor + " ");
        }

        sc.close();
    }
}
