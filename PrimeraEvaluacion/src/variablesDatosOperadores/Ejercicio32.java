package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int num = scanner.nextInt();
        boolean may0menor10 = (num>0) && (num <10);
        System.out.println(may0menor10);
    }
}
