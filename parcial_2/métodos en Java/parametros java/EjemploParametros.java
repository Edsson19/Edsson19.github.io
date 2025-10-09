public class EjemploParametros {

    
    public void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "! ¿Cómo estás?");
    }

    
    public static void main(String[] args) {
        
        EjemploParametros ejemplo = new EjemploParametros();
        
        
        ejemplo.saludar("Melissa");
        ejemplo.saludar("Edsson");
    }
}
