package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Introduce un número de dos cifras");
        Scanner scanner = new Scanner(System.in);
        int numero= scanner.nextInt();
        /*int resto;
        int numInvertido=0;
        while(numero>0){
          resto=numero%10;
          numInvertido =numInvertido*10+resto;
          numero/=10;
        }
        System.out.println("El numero invertido es " + numInvertido);*/
        int decenas= numero/10;
        int unidades = numero%10;
        int numeroInvertido = (unidades*10)+decenas;
        System.out.println("El numero invertido es " + numeroInvertido);

    }
}
