
public class ej1 {

    private static final int ALFABETO_SIZE = 26;
    private int[] conteoLetras;

    public ej1() {
        conteoLetras = new int[ALFABETO_SIZE];
    }

    public void contarLetras(String palabra) {
        for (int i = 0; i < ALFABETO_SIZE; i++) {
            conteoLetras[i] = 0;
        }

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (!esEspacioBlanco(letra)) {
                int indice = obtenerIndice(letra);
                conteoLetras[indice]++;
            }
        }
    }

    private int obtenerIndice(char letra) {
        char lowerCaseLetra = (char) (letra | 32);
        return lowerCaseLetra - 'a';
    }

    private boolean esEspacioBlanco(char c) {
        return c == ' ' || c == '\t' || c == '\n' || c == '\r';
    }

    public void mostrarConteo() {
        for (int i = 0; i < ALFABETO_SIZE; i++) {
            char letra = (char) ('A' + i);
            if (conteoLetras[i] > 0) {
                System.out.println(letra + " = " + conteoLetras[i]);
            }
        }

        int total = 0;
        for (int conteo : conteoLetras) {
            total += conteo;
        }
        System.out.println("TOTAL = " + total);
    }
}