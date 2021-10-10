package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pedirNumero ();
        int num1 = scanner.nextInt();
        pedirNumero ();
        int num2 = scanner.nextInt();
        pedirNumero ();
        int num3 = scanner.nextInt();
        boolean num1enter2y3 = (num1>=num2) && (num1<=num3) || (num1>=num3) && (num1<=num2);
        System.out.println(num1enter2y3);
    }
    public static void pedirNumero () {
        System.out.println("Introduzca un número");
    }
}
