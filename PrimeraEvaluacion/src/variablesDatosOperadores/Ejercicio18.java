package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        System.out.println("Introduce los grados centigrados");
        Scanner scanner = new Scanner(System.in);
        double grados = scanner.nextDouble();
        double reamur= grados*0.8;
        double fahenheit=(grados*9/5)+32;
        double kelvin=grados+273;

        System.out.println(+grados + " grados centigrados son: " +reamur+ " reamur, "
                +fahenheit+ " fahenheit y "+kelvin+ " kelvin. ");
    }
}
