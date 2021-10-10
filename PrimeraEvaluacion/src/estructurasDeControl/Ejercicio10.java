package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        pedirNumero();
        int a = scanner.nextInt();
        pedirNumero();
        int b = scanner.nextInt();
        pedirNumero();
        int c = scanner.nextInt();

        if (a>b && b>c) {
            System.out.println(a + " " + b + " " + c);
        }else if(a>b && c>b ){
            System.out.println(a + " " + c + " " + b);
        }else if(b>a && a>c ){
            System.out.println(b + " " + a + " " + c);
        }else if(b>a && a>c ){
            System.out.println(b + " " + a + " " + c);
        }
    }

    public static void pedirNumero(){
        System.out.println("Inserte un numero");
    }
}
