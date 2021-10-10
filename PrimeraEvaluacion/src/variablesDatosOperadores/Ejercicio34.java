package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pedirNumero ();
        int num1 = scanner.nextInt();
        pedirNumero ();
        int num2 = scanner.nextInt();
        pedirNumero ();
        int num3 = scanner.nextInt();
        boolean numIguales = (num1==num2) || (num1==num3) || (num2==num3);
        System.out.println(numIguales);
    }
    public static void pedirNumero () {
        System.out.println("Introduzca un número");
    }

}
