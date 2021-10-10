package estructurasDeControl;

import java.util.Scanner;

/*
a. si son 100 alumnos o más, el costo por cada alumno es de 65 euros;
b. de 50 a 99 alumnos, el costo es de 70 euros,
c. de 30 a 49, de 95 euros,
d. y si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("Cuantos alumnos hay:");
        Scanner scanner=new Scanner(System.in);
        int numAlumnos = scanner.nextInt();

        if (numAlumnos >= 100) {
            System.out.println("El costo por cada alumno es de 65 euros y el coste del autobus es: " + numAlumnos*100);
        } else if (numAlumnos >= 50 && numAlumnos <= 99) {
            System.out.println("El costo por cada alumno es de 70 euros y el coste del autobus es: "+ numAlumnos*70);
        } else if (numAlumnos >= 30 && numAlumnos <= 49) {
            System.out.println("El costo por cada alumno es de 95 euros y el coste del autobus es: "+ numAlumnos*95);
        }else{
            System.out.println("El costo de la renta del autobús es de 4000 euros");
        }


    }
}
