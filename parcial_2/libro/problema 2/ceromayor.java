import java.util.Scanner;
public class ceromayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=1, ca=0, cp=0, cn=0, nu=0;
        
        System.out.print("Ingresa la cantidad de numeros que va a ingresar: ");
        nu = sc.nextInt();
        
        for(c=1;c<=nu;c++){
            System.out.print("Ingresa un numero: ");
            ca = sc.nextInt();
            
            if(ca>0){
                cp++;
            }else{
                cn++;
            }
        }
        System.out.print("Positivos: "+cp);
        System.out.print("\nNegativos: "+cn);
    }
}