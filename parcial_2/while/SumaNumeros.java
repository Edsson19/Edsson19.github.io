public class SumaNumeros {
    public static void main(String[] args){
        int n = 1;
        int resultado = 0;
        while (n<10) {
            resultado += n;
            n++;
        }
        System.out.println("Resultado: " + resultado);
    }
}