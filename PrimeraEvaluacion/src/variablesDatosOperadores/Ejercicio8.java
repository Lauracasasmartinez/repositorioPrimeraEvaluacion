package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los segundos:");
        int segundos = scanner.nextInt();
        int horas = segundos/3600;
        int min =(segundos-(3600*horas))/60;
        int seg = segundos-((3600*horas)+(60*min));
        System.out.println( segundos + " segundos son " + horas + " horas , " + min + " minutos y "
        + seg + " segundos");
    }
}
