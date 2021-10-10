package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int n = scanner.nextInt();
        int resultado = ((n + 1) * n + 2) * n + 3;
        System.out.println("El resultado de la espresion aritmetica ((n + 1) * n + 2) * n + 3 es: " +
                resultado);


    }
}
