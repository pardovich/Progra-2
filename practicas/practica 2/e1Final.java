
public class e1Final {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        ej1 contador = new ej1();

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        contador.contarLetras(palabra);
        contador.mostrarConteo();

        scanner.close();
    }
}