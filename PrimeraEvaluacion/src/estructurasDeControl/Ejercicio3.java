package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num1 = scanner.nextInt();
        System.out.println("Introduzca un numero");
        int num2 = scanner.nextInt();
        if(num1>num2){
            System.out.println("El primer numero es mayor que el segundo");
        }else{
            System.out.println("El primer numero no es mayor que el segundo");
        }
    }
}
