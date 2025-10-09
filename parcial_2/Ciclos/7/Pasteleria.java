import java.util.Scanner;

public class Pasteleria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            double precio = 0;

            System.out.print("¿Qué sabor de tarta quieres? (manzana, fresa, chocolate): ");
            String sabor = sc.next().toLowerCase();

            switch (sabor) {
                case "manzana":
                    precio = 200;
                    break;
                case "fresa":
                    precio = 250;
                    break;
                case "chocolate":
                    System.out.print("¿Chocolate negro o blanco?: ");
                    String tipoChoco = sc.next().toLowerCase();
                    if (tipoChoco.equals("negro")) {
                        precio = 280;
                    } else if (tipoChoco.equals("blanco")) {
                        precio = 300;
                    } else {
                        System.out.println("Opción de chocolate inválida.");
                        break;
                    }
                    break;
                default:
                    System.out.println("Sabor inválido.");
                    break;
            }

            
            if (precio > 0) {
                System.out.print("¿Quieres añadir un snack? (si/no): ");
                String snack = sc.next().toLowerCase();
                if (snack.equals("si")) {
                    System.out.print("¿Cuántos snacks quieres añadir?: ");
                    int cantidadSnacks = sc.nextInt();
                    precio += cantidadSnacks * 25;
                }

                System.out.print("¿Quieres personalizar con nombre? (si/no): ");
                String nombre = sc.next().toLowerCase();
                if (nombre.equals("si")) {
                    precio += 30;
                }

                System.out.println("💰 El precio total de la tarta es: $" + precio);
            }

            System.out.print("¿Quieres hacer otro pedido? (s/n): ");
            continuar = sc.next();
            System.out.println("------------------------------");

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Gracias por tu compra en la pastelería 🍰");
        sc.close();
    }
}
