package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique su sueldo anual");
        int sueldo = scanner.nextInt();
        if(sueldo>9000){
            System.out.println("Debe abonar impuestos");
        }else{
            System.out.println("No debe abonar impuestos");
        }
    }
}
