package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Eres cualpable? (true/false)");

        boolean culpable = scanner.nextBoolean();

        if(culpable){
            System.out.println("A la carcel");
        }else  {
            System.out.println("A casa");
        }
    }
}
