package variablesDatosOperadores;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Momento inicial: \nIntroduce las horas del momento inicial:");
        int horaInicial = scanner.nextInt();
        System.out.println("Introduce los minutos del momento inicial:");
        int minutosInicial = scanner.nextInt();
        System.out.println("Introduce los segundos del momento inicial:");
        int segundosInicial = scanner.nextInt();
        System.out.println("Momento final: \nIntroduce las horas del momento final:");
        int horaFinal = scanner.nextInt();
        System.out.println("Introduce llos minutos del momento final:");
        int minutosFinal = scanner.nextInt();
        System.out.println("Introduce los segundos del momento final:");
        int segundosFinal = scanner.nextInt();


        System.out.println("Datos introducidos: momento inicial: "
                + horaInicial + ":" + minutosInicial + ":" + segundosInicial + "\tmomento final:"
                + horaFinal + ":" + minutosFinal + ":" + segundosFinal);

        int segundosIiniciales = (horaInicial*3600)+(minutosInicial*60)+segundosInicial;
        int segundosFinales = (horaFinal*3600)+(minutosFinal*60)+segundosFinal;
        int segundosDiferencia = segundosFinales-segundosIiniciales;
        int horasDiferencia = segundosDiferencia/3600;
        int minDiferencia =(segundosDiferencia-(3600*horasDiferencia))/60;
        int segDiferenciaDiferencia = segundosDiferencia-((3600*horasDiferencia)+(60*minDiferencia));

        System.out.println("La diferencia entre ambos momentos es: " +horasDiferencia+ ":"
                +minDiferencia+ ":"  +segDiferenciaDiferencia);


    }
}
