public class ejemplo { 
    public int multiplicar(int a, int b) {     
        return a * b; 
    }

    public static void main(String[] args) {
        ejemplo obj = new ejemplo(); 
        int resultado = obj.multiplicar(4, 5);
        System.out.println(resultado);
    }
}