package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduca el sueldo base");
        double sueldoBase = scanner.nextDouble();
        System.out.println("Introduca el importe de la primera venta");
        double venta1 = scanner.nextDouble();
        System.out.println("Introduca el importe de la segunda venta");
        double venta2 = scanner.nextDouble();
        System.out.println("Introduca el importe de la tercera venta");
        double venta3 = scanner.nextDouble();
        double comision = 0.1;
        double comisionVentas= (venta1+venta2+venta3)*comision;
        System.out.println("En concepto de comisiones obtendra: " +comisionVentas + " €.");
        System.out.println("Su salario sera: " + (comisionVentas + sueldoBase) + " €.");



    }
}
