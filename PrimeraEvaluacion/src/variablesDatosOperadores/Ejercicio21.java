package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la nota de la primera evaluacion");
        double nota1evaluacion = scanner.nextDouble();
        System.out.println("Introduzca la nota de la segunda evaluacion");
        double nota2evaluacion = scanner.nextDouble();
        System.out.println("Introduzca la nota de la tercera evaluacion");
        double nota3evaluacion = scanner.nextDouble();


        System.out.println("La nota final es: " + ((nota1evaluacion+nota2evaluacion+nota3evaluacion)/3));
    }

}
