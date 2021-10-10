package estructurasDeControl;

import java.util.Scanner;
/*
Escribe un programa que pida un nombre de usuario y una contraseña.
Esos datos se comparan con dos valores guardados previamente.
Si coinciden, se indica “Has entrado al sistema”, en caso contrario se da un error.
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Usuario");
        String user = scanner.nextLine();
        System.out.println("Contraseña");
        String password = scanner.nextLine();
        String usuarioCorrecto = "user";
        String contraseñaCorrecta = "1234";


        if (user.equals(usuarioCorrecto) && contraseñaCorrecta.equals(contraseñaCorrecta)){
            System.out.println("Has entrado al sistema");
        } else {
            System.out.println("Credenciales incorrectas");

        }
    }
}
