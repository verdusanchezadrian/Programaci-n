package RelacionEjercicios4;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        final int TABLADEL10 = 10;
        Scanner scanner = new Scanner(System.in);

        int tabla;
        int multiplicacion = 0;
        int iteracionUsuario;

        System.out.println("Introduce el número: ");
        tabla = scanner.nextInt();

        for (int i = 0; i < TABLADEL10; i++) {
            iteracionUsuario = i + 1;
            multiplicacion = tabla * iteracionUsuario;
            System.out.println(tabla + " x " + iteracionUsuario + " = " + multiplicacion);
        }
        scanner.close();
    }
}
