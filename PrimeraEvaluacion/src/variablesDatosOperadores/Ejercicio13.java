package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        System.out.println("Introduce un importe");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int bill500= numero/500;
        int resto = numero%500;
        int bill200= resto/200;
        resto %= 200;
        int bill100=resto/100;
        resto %= 100;
        int bill50=resto/50;
        resto %=50;
        int bill20=resto/20;
        resto %= 20;
        int bill10=resto/10;
        resto %= 10;
        int bill5=resto/5;
        resto %= 5;

        System.out.println(+bill500+" billetes de 500, "+bill200+" billetes de 200, "+
                bill100+" billetes de 100, "+bill50+" billetes de 50, "+bill20+" billetes de 20, "+
                bill10+" billetes de 10, "+bill5+" billetes de 5 y sobra "
                +resto+" euros ");
    }

}
