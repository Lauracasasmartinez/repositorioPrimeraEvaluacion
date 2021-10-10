package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Eres cualpable? (sí/no)");

        String culpable = scanner.nextLine();

        if(culpable.equals("sí")){
            System.out.println("A la carcel");
        }else if (culpable.equals("no"))  {
            System.out.println("A casa");
        }else{
            System.out.println("Respuesta incorrecta");
        }
    }
}
