package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        pedirNumero ();
        int num1 = scanner.nextInt();
        pedirNumero ();
        int num2 = scanner.nextInt();
        pedirNumero ();
        int num3 = scanner.nextInt();
        pedirNumero ();
        int num4 = scanner.nextInt();

        System.out.println("Los números decrementados que has introducido son: " +
                --num1 + " " + --num2 + " " + --num3 + " " + --num4);
    }


    public static void pedirNumero () {
            System.out.println("Introduzca un número");
        }
}
