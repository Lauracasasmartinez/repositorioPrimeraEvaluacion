package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        double numero = scanner.nextDouble();
        System.out.println("Introduzca un porcentaje");
        double porcentaje = scanner.nextDouble();
        System.out.println("El valor incrementado es:" + numero*(1+(porcentaje/100)));
        System.out.println("El valor decrementado es "+ numero*(1-(porcentaje/100)));

    }
}
