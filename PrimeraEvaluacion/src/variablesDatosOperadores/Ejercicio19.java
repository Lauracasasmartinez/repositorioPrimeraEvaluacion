package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        solicitarNumero();
        double x1= scanner.nextDouble();
        solicitarNumero();
        double y1= scanner.nextDouble();
        solicitarNumero();
        double x2= scanner.nextDouble();
        solicitarNumero();
        double y2= scanner.nextDouble();
        double distanciaDosPuntos =Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.printf("La distancia entre los dos puntos es: %.2f", distanciaDosPuntos);
    }
    public static void solicitarNumero(){

        System.out.println("Introduzca un numero");
    }

}
