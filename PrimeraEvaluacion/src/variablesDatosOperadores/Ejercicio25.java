package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el precio de venta del producto");
        double precio = scanner.nextDouble();
        System.out.println("Introduzca la cantidad de productos");
        double cantidad = scanner.nextDouble();
        System.out.println("Introduzca el IVA aplicado");
        double iva = scanner.nextDouble();
        double precioTotal = ((precio*cantidad)*(1+(iva/100)));

        System.out.println("El importe a abonar es: " + precioTotal);
        System.out.println("El importe a abonar menos el descueto del 15% es : " + (precioTotal/1.15));
    }
}
