package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero de tazas de mantequilla de cacahuete:");
        int tazas = scanner.nextInt();
        System.out.println("Es fin de semana (true/false)");

        boolean isFinde = scanner.nextBoolean();

        if(((tazas>=10)&&(tazas<=20)&&!isFinde) || ((tazas>=15)&&(tazas<=25)&&isFinde)){
            System.out.println("true");
        }else  {
            System.out.println("false");
        }
    }
}
