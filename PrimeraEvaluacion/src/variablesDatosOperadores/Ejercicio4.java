package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        solicitarNumero();
        int num1 = scanner.nextInt();
        solicitarNumero();
        int num2 = scanner.nextInt();
        solicitarNumero();
        int num3 = scanner.nextInt();
        solicitarNumero();
        int num4 = scanner.nextInt();
        int suma= num1+num2;
        int producto=num3*num4;
        System.out.println("El resultado de sumar el num1 y el num2 es: "
                + num1 + "+" + num2 + " = " + suma);
        System.out.println("El resultado de multiplicar el num3 y el num4 es: "
                + num3 + "*" + num4 + " = " + producto);
    }
    public static void solicitarNumero(){

        System.out.println("Introduzca un numero");
    }
}
