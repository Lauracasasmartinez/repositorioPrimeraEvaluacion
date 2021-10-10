package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        System.out.println("Introduzca el lado del cuadrado");
            Scanner scanner = new Scanner(System.in);
            double ladoCuadrado = scanner.nextDouble();
            System.out.println("El perimetro del cuadrado es: " + ladoCuadrado*4);
        }
    }

