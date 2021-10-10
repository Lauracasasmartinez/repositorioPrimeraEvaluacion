package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la base del triangulo");
        int base = scanner.nextInt();
        System.out.println("Introduzca la altura del triangulo");
        int altura = scanner.nextInt();
        System.out.println("El area del triangulo es: " + (base*altura)/2);

        System.out.println("Introduzca la base del triangulo");
        float baseF = scanner.nextFloat();
        System.out.println("Introduzca la altura del triangulo");
        float alturaF = scanner.nextFloat();
        System.out.println("El area del triangulo es: " + (baseF*alturaF)/2);

    }
}
