package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Introduce un número de dos dígitos");
        Scanner scanner = new Scanner(System.in);
        int numero= scanner.nextInt();
        System.out.println("La decena del numero " + numero + " es " + (numero/10));
    }

}
