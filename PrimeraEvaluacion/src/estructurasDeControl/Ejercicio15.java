package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("¿Que lenguaje de programación estas estudiando?\n1. Java\n2. Kotlin\n3. Scala\n4. Python ");
        Scanner scanner= new Scanner(System.in);
        int respuesta = scanner.nextInt();


        if(respuesta==1){
            System.out.println("¡Sí!");
        }else if ( respuesta>=2 && respuesta<=4 ){
            System.out.println("¡No!");
        }else{
            System.out.println("Opción desconocida");
        }


    }
}
