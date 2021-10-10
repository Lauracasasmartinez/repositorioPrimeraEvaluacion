package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la nota de BBDD");
        double notaBBDD = scanner.nextDouble();
        System.out.println("Introduzca la nota de Lenguaje de marcas");
        double notaLM = scanner.nextDouble();
        System.out.println("Introduzca la nota de Programacion");
        double notaProg = scanner.nextDouble();
        System.out.println("Introduzca la nota de Sistemas informaticos");
        double notaSI = scanner.nextDouble();
        System.out.println("Introduzca la nota de Entornos de desarrollo");
        double notaED = scanner.nextDouble();
        double media = (notaED+notaBBDD+notaLM+notaSI+notaProg)/5;
        System.out.println(media);
        System.out.println("La nota final del curso: " + Math.round(media));
    }
}
