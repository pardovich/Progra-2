import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        if (sonNumerosAmigos(num1, num2)) {
            System.out.printf("%d y %d son numeros amigos.\n", num1, num2);
        } else {
            System.out.printf("%d y %d no son numeros amigos.\n", num1, num2);
        }
        scanner.close();
    }

    public static int sumarDivisoresPropios(int numero) {
        int suma = 1;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
    public static boolean sonNumerosAmigos(int num1, int num2) {
        return sumarDivisoresPropios(num1) == num2 && sumarDivisoresPropios(num2) == num1;
    }
}
