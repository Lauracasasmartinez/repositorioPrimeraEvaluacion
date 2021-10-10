package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los minutos:");
        int minutos = scanner.nextInt();
        int horas = minutos/60;
        int min =minutos%60;
        System.out.println( minutos + " minutos son " + horas + " horas y " + min + " minutos.");
    }
}
