package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero de ardillas:");
        int ardillas = scanner.nextInt();
        System.out.println("Numero de nueces:");
        int nueces = scanner.nextInt();
        int nuecesXArdilla = nueces/ardillas;
        int nuecesSobrantes = nueces%ardillas;

        System.out.println("Cada ardilla recibe  " + nuecesXArdilla + " nueces y sobran "
                + nuecesSobrantes + " nueces");

    }
}
