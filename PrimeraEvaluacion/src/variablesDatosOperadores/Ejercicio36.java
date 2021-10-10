package variablesDatosOperadores;

public class Ejercicio36 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5f;
        double d = 6;
        char c = 7;
        boolean bol= true;

        //byte

        b = 1;
        s = b;
        i = b;
        l = b;
        f = b;
        d = b;
        //c = b; NO ES POSIBLE
        //bol= b; NO ES POSIBLE

        //short

        b = (byte) s;
        s = b;
        i = s;
        l = s;
        f = s;
        d = s;
        //c = S; NO ES POSIBLE
        //bol= S; NO ES POSIBLE

    }

}
