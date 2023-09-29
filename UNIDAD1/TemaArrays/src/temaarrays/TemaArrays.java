package temaarrays;

import java.util.Scanner;

public class TemaArrays {

    public static void main(String[] args) {
        // Guardar las ventas de días en un arreglo y determinar cuáles son mayores a 2000
        double ventas[] = new double[10];
        Scanner entrada = new Scanner(System.in);
        System.out.println("*************** VENTAS MAYORES A 2000 ***********\n");
        System.out.println("Ingrese las 10 ventas del mes:");

        // Llenar el arreglo
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Ingrese la venta " + (i + 1) + ": ");
            ventas[i] = entrada.nextDouble();
        }

        // Determinar cuáles ventas en el arreglo son mayores o iguales a 2000
        ventasMayores2000(ventas);
    }

    public static void ventasMayores2000(double x[]) {
        int total = 0;
        double acumuladorVentas = 0;
        System.out.println("Estas son las ventas mayores o iguales a 2000:");

        // Recorrer el arreglo
        for (int j = 0; j < x.length; j++) {
            if (x[j] >= 2000) {
                System.out.println("$" + x[j]);
                total++;
                acumuladorVentas += x[j]; // Acumular el valor de ventas mayores a 2000
            }
        }

        System.out.println("El total de las ventas >= 2000 es: " + total);
        System.out.println("El acumulado total es: $" + acumuladorVentas);
    }
}
