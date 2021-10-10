package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num = scanner.nextInt();
        if((num%2==0)){
            System.out.println("Numero PAR");
        }else{
            System.out.println("Numero IMPAR");
        }
    }
}
