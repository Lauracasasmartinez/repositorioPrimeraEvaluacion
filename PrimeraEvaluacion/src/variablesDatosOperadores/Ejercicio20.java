package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        pedirNumero();
        double num1 = scanner.nextDouble();
        pedirNumero();
        double num2 = scanner.nextDouble();
        pedirNumero();
        double num3 = scanner.nextDouble();
        pedirNumero();
        double num4 = scanner.nextDouble();
        double sumatorio= num1+num2+num3+num4;

        System.out.println("La suma de los numeros es: " +sumatorio+ " y la media: "
                + sumatorio/4);
    }
    public static void pedirNumero(){
        System.out.println("Introduzca un número");
    }
}
