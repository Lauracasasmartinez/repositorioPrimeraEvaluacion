package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el precio de venta del producto");
        double precio = scanner.nextDouble();
        System.out.println("Introduzca la cantidad de productos");
        int cantidad = scanner.nextInt();
        System.out.println("Introduzca el IVA aplicado");
        double iva = scanner.nextDouble();

        System.out.println("El importe a abonar es: " + ((precio*cantidad)*(1+(iva/100))));
    }
}
