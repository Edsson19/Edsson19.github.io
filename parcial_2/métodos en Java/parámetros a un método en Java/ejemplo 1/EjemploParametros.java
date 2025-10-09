public class EjemploParametros {

    
    public static void sumar(int a, int b) {
        int suma = a + b;
        System.out.println("La suma de " + a + " y " + b + " es: " + suma);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        
        sumar(num1, num2);
    }
}
