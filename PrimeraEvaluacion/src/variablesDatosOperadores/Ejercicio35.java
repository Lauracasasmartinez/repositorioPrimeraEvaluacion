package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pedirNumero ();
        int numA = scanner.nextInt();
        pedirNumero ();
        int numB = scanner.nextInt();
        pedirNumero ();
        int numC = scanner.nextInt();
        boolean sum20 = (numA+numB)==20 || (numA+numC)==20 || (numB+numC)==20;
        System.out.println(sum20);
    }
    public static void pedirNumero () {
        System.out.println("Introduzca un número");
    }

}
