import java.util.ArrayList;
import java.util.Scanner;

public class FuncionesExamen {
    // PREPARAR FUNCIONES TÍPICAS QUE PENSAMOS QUE VAYAN A CAER EN EL EXAMEN TEMA 4
    // POR EJEMPLO: LEER STTRING_DE_ARRAYS, EVITAR_DUPLICADOS, IMPRIMIR_MENSAJE ETC
    // ¡¡¡¡¡ FALTA EL MANEJO DE ERRORES!!!!


     public static boolean esNegativo(int n) {
        if (n < 0) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean esPositivo(int n) {
        if (n > 0) {
            return true;
        } else {
            return false;
        }
    }


     public static boolean esImpar(int n) {
        if (n % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

      public static boolean esPar(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int contarVocales(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                contador++;
            }
        }
        return contador;
    }

    public static int leerNumero(String mensaje, Scanner sc) {
        System.out.println(mensaje);
        int numero = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        return numero;
    }

    public static int contarImpares(ArrayList<Integer> array) {
        int contador = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 != 0) {
                contador++;
            }
        }
        return contador;
    }

     public static void imprimirArrayList(ArrayList<String> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }

    public static int numeroAleatorioEntreDosValores(int min, int max) {
        int resultado = (int) (Math.random() * (max - min + 1)) + min;
        return resultado;
    }

    public static ArrayList<Integer> invertirArrayList(ArrayList<Integer> array) {
        ArrayList<Integer> invertido = new ArrayList<>();
        for (int i = array.size() - 1; i >= 0; i--) {
            invertido.add(array.get(i));
        }
        return invertido;
    }

    public static int contarVocalesEnCadena(String cadenaTexto) {
        int cantidadVocales = 0;
        char caracterTexto;
        for (int i = 0; i < cadenaTexto.length(); i++) {
            caracterTexto = cadenaTexto.charAt(i);
            if (caracterTexto == 'a' || caracterTexto == 'e' || caracterTexto == 'i' || caracterTexto == 'o'
                    || caracterTexto == 'u') {
                cantidadVocales++;
            }
        }
        return cantidadVocales;
    }

    public static int valorMinimo(ArrayList<Integer> array) {
        if (array.size() == 0) {
            return 0;
        }

        int min = array.get(0);

        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < min) {
                min = array.get(i);
            }
        }

        return min;
    }

    public static int valorMaximo(ArrayList<Integer> array) {
        if (array.size() == 0) {
            return 0;
        }

        int max = array.get(0);

        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) > max) {
                max = array.get(i);
            }
        }

        return max;
    }

    public static int sumarArray(ArrayList<Integer> array) {
        int suma = 0;
        for (int i = 0; i < array.size(); i++) {
            suma += array.get(i);
        }
        return suma;
    }

    public static ArrayList<Integer> filtrarNumeroMayores(ArrayList<Integer> arrayNumeros, int valor) {
        ArrayList<Integer> nuevoArray = new ArrayList<>();
        for (int i = 0; i < arrayNumeros.size(); i++) {
            if (arrayNumeros.get(i) > valor) {
                nuevoArray.add(arrayNumeros.get(i));
            }
        }
        return nuevoArray;
    }

    public static String capitalizarPrimeraLetra(String cadena) {
        String resultado = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (i == 0) {
                resultado += Character.toUpperCase(cadena.charAt(i));
            } else {
                resultado += cadena.charAt(i);
            }
        }
        return resultado;
    }

    public static String revertirCadena(String cadena) {
        String ordenInverso = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            ordenInverso += cadena.charAt(i);
        }
        return ordenInverso;
    }

    public static void numeroAleatorio() {
        int numero = (int) (Math.random() * 10);
        System.out.println("Número aleatorio: " + numero);
    }

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
