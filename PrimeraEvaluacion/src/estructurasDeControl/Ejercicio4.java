package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Edad:");
        int edad = scanner.nextInt();
        System.out.println("Nivel de estudios:");
        int nivelDeEstudios = scanner.nextInt();
        System.out.println("Ingresos:");
        int ingresos = scanner.nextInt();
        boolean jasp;

        if( edad<=28 && nivelDeEstudios>3 || edad<30 && ingresos>28000 ){
            System.out.println(jasp=true);
        }else{
            System.out.println(jasp=false);
        }
    }
}
