package variablesDatosOperadores;

import java.util.Scanner;

public class Ejemplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1-num2;
        int producto = num1 * num2;
        int cociente = num2 / num1;
        int resto = num2 % num1;
        int menosdos;

        System.out.println("Suma: " + suma);

    }
}
