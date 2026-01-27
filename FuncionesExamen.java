import java.util.ArrayList;
import java.util.Scanner;

public class FuncionesExamen {
    // PREPARAR FUNCIONES TÍPICAS QUE PENSAMOS QUE VAYAN A CAER EN EL EXAMEN TEMA 4 
    // POR EJEMPLO: LEER STTRING_DE_ARRAYS, EVITAR_DUPLICADOS, IMPRIMIR_MENSAJE ETC
    // ¡¡¡¡¡ FALTA EL MANEJO DE ERRORES!!!!

    public static void aniadirSinDuplicados(String posibleDuplicado, ArrayList<String> array) {
        boolean duplicadosEncontrado = false;
        for (int i = 0; i < array.size() && !duplicadosEncontrado; i++) {
            if (array.get(i).equalsIgnoreCase(posibleDuplicado)) {
                duplicadosEncontrado = true;
            }
        }

        if (!duplicadosEncontrado) {
            array.add(posibleDuplicado);
        } else {
            imprimirMensaje("No se añade " + posibleDuplicado + " ya que está en el array");
        }
    }

    public static void leerStringArray(String mensajeString, ArrayList<String> array, Scanner sc) {
        String stringUsuario;
        imprimirMensaje(mensajeString);
        stringUsuario = sc.nextLine();
        aniadirSinDuplicados(stringUsuario, array);
    }

    public static void imprimirMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }
}
