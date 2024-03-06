import java.util.Scanner;
public class ej1 {
    static final int MAX_TEXTO = 1000;
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char[] texto = new char[MAX_TEXTO];
            int opcion;

            do {
                System.out.println("\nMenu:");
                System.out.println("1. Ingresa el texto");
                System.out.println("2. Contar vocales");
                System.out.println("3. Contar consonantes");
                System.out.println("4. Encontrar una palabra en el texto");
                System.out.println("5. Reemplazar una palabra por otra palabra");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opcion: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el texto: ");
                        scanner.nextLine(); // Consumir la nueva línea pendiente después de la opción
                        String inputTexto = scanner.nextLine();
                        texto = inputTexto.toCharArray();
                        break;

                    case 2:
                        System.out.println("Numero de vocales: " + contarVocales(texto));
                        break;

                    case 3:
                        System.out.println("Numero de consonantes: " + contarConsonantes(texto));
                        break;

                    case 4:
                        if (texto[0] != '\0') {
                            System.out.print("Ingrese la palabra a buscar: ");
                            String palabraBuscada = scanner.next();
                            if (encontrarPalabra(texto, palabraBuscada)) {
                                System.out.println("La palabra \"" + palabraBuscada + "\" se encuentra en el texto.");
                            } else {
                                System.out.println("La palabra \"" + palabraBuscada + "\" no se encuentra en el texto.");
                            }
                        } else {
                            System.out.println("Primero ingrese un texto.");
                        }
                        break;

                    case 5:
                        if (texto[0] != '\0') {
                            System.out.print("Ingrese la palabra a reemplazar: ");
                            String palabraAntigua = scanner.next();
                            System.out.print("Ingrese la nueva palabra: ");
                            String palabraNueva = scanner.next();

                            reemplazarPalabra(texto, palabraAntigua, palabraNueva);
                            System.out.println("Texto modificado: " + new String(texto));
                        } else {
                            System.out.println("Primero ingrese un texto.");
                        }
                        break;

                    case 6:
                        System.out.println("Saliendo del programa.");
                        break;

                    default:
                        System.out.println("Opcion no valida. Intente de nuevo.");
                }

            } while (opcion != 6);
        }
    }

    public static int contarVocales(char[] texto) {
        int contador = 0;
        for (int i = 0; i < texto.length && texto[i] != '\0'; i++) {
            char c = Character.toLowerCase(texto[i]);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static int contarConsonantes(char[] texto) {
        int contador = 0;
        for (int i = 0; i < texto.length && texto[i] != '\0'; i++) {
            char c = Character.toLowerCase(texto[i]);
            if ((c >= 'a' && c <= 'z')) {
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static boolean encontrarPalabra(char[] texto, String palabra) {
        int i = 0, j = 0;

        while (i < texto.length && texto[i] != '\0') {
            if (Character.toLowerCase(texto[i]) == Character.toLowerCase(palabra.charAt(j))) {
                j++;
                if (j == palabra.length()) {
                    return true;
                }
            } else {
                j = 0;
            }
            i++;
        }

        return false;
    }

    public static void reemplazarPalabra(char[] texto, String palabraAntigua, String palabraNueva) {
        int i = 0, j = 0, k;
    
        while (i < texto.length && texto[i] != '\0') {
            if (Character.toLowerCase(texto[i]) == Character.toLowerCase(palabraAntigua.charAt(j))) {
                j++;
                if (j == palabraAntigua.length()) {
                    int startIndex = i - j + 1;
            
                    if (startIndex >= 0) {
                        for (k = 0; k < palabraNueva.length(); k++) {
                            texto[startIndex + k] = palabraNueva.charAt(k);
                        }
                        while (k + startIndex < texto.length && texto[startIndex + k] != '\0') {
                            texto[startIndex + k] = ' ';
                            k++;
                        }
                    }
                    break;
                }
            } else {
                j = 0;
            }
            i++;
        }
    }
}
