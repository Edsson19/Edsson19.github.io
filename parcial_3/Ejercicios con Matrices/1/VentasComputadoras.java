import java.util.Scanner;

public class VentasComputadoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        System.out.print("Ingrese el número de vendedores: ");
        n = sc.nextInt();
        System.out.print("Ingrese el número de zonas: ");
        m = sc.nextInt();

        int[][] ventas = new int[n][m];

        System.out.println("\n=== Ingrese la cantidad de computadoras vendidas por cada vendedor en cada zona ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Vendedor " + (i + 1) + ":");
            for (int j = 0; j < m; j++) {
                System.out.print("  Zona " + (j + 1) + ": ");
                ventas[i][j] = sc.nextInt();
            }
        }

        int zonaMasVentas = 0;
        int totalZonaMax = 0;

        for (int j = 0; j < m; j++) {
            int sumaZona = 0;
            for (int i = 0; i < n; i++) {
                sumaZona += ventas[i][j];
            }
            if (j == 0 || sumaZona > totalZonaMax) {
                totalZonaMax = sumaZona;
                zonaMasVentas = j;
            }
        }

       
        int vendedorMenos = 0, vendedorMas = 0;
        int totalMenor = 0, totalMayor = 0;

        for (int i = 0; i < n; i++) {
            int sumaVendedor = 0;
            for (int j = 0; j < m; j++) {
                sumaVendedor += ventas[i][j];
            }

            if (i == 0) {
                totalMenor = sumaVendedor;
                totalMayor = sumaVendedor;
                vendedorMenos = 0;
                vendedorMas = 0;
            } else {
                if (sumaVendedor < totalMenor) {
                    totalMenor = sumaVendedor;
                    vendedorMenos = i;
                }
                if (sumaVendedor > totalMayor) {
                    totalMayor = sumaVendedor;
                    vendedorMas = i;
                }
            }
        }

       
        int totalGeneral = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                totalGeneral += ventas[i][j];
            }
        }

        
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Zona que más computadoras vendió: Zona " + (zonaMasVentas + 1) + " con " + totalZonaMax + " computadoras.");
        System.out.println("Vendedor que menos computadoras vendió: Vendedor " + (vendedorMenos + 1) + " con " + totalMenor + " computadoras.");
        System.out.println("Vendedor que más computadoras vendió: Vendedor " + (vendedorMas + 1) + " con " + totalMayor + " computadoras.");
        System.out.println("Cantidad total de computadoras vendidas por todos los vendedores: " + totalGeneral);

        sc.close();
    }
}
