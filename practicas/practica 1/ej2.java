import java.util.Scanner;
public class ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el texto: ");
        String texto = scanner.nextLine();

        int resultado = contarPalabras(texto);

        System.out.println("El texto ingresado tiene " + resultado + " palabra(s).");

        scanner.close();
    }

    public static int contarPalabras(String texto) {
        int contador = 0;
        boolean enPalabra = false;

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            if (caracter == ' ' || caracter == '\t' || caracter == '\n' || caracter == '\r') {
                enPalabra = false;
            } else {
                if (!enPalabra) {
                    contador++;
                    enPalabra = true;
                }
            }
        }

        return contador;
    }
}


