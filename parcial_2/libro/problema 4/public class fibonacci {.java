import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=0, b=1, c=0, m=1, n=0;
        
        System.out.print("Ingresa la canidad de elementos: ");
        n= sc.nextInt();
        
        System.out.print(a+" "+b+" ");
        while (m<=(n-2)){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            m++;
        }
    }
}