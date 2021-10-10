package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduca la primera calificacion parcial");
        double calParcial1 = scanner.nextDouble();
        System.out.println("Introduca la segunda calificacion parcial");
        double calParcial2 = scanner.nextDouble();
        System.out.println("Introduca la tercera calificacion parcial");
        double calParcial3 = scanner.nextDouble();
        System.out.println("Introduca la calificacion del examen final");
        double examenFinal = scanner.nextDouble();
        System.out.println("Introduca la calificacion del trabajo final");
        double trabajoFinal = scanner.nextDouble();

        System.out.println("Su calificacion final es: " +((((calParcial1+calParcial2+calParcial3)
    /3)*0.55) + (examenFinal*0.30) + (trabajoFinal*0.15)));




    }

}
