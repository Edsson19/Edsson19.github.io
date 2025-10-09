public class Ejemplo {
    
    public void saludar(String nombre) { 
        System.out.println("¡Hola, " + nombre + "!"); 
    } 

    public static void main(String[] args) { 
        Ejemplo ejemplo = new Ejemplo(); 
        ejemplo.saludar("Juan");         
    } 
}
