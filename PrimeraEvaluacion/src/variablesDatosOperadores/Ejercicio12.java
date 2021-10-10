package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        System.out.println("Introduce un número de tres cifras");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        /*int resto;
        int numInvertido = 0;
        while (numero > 0) {
            resto = numero % 10;
            numInvertido = numInvertido * 10 + resto;
            numero /= 10;
            }*/
        int centenas= numero/100;
        int decenas = (numero%100)/10;
        int unidades = (numero%100)%10;
        int numInvertido= (unidades*100)+(decenas*10)+centenas;

        System.out.println("El numero invertido es " + numInvertido);
    }
}
