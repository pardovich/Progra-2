import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la fecha de nacimiento (dd/mm/aaaa): ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int anio = scanner.nextInt();

        int numeroCaminoVida = calcularNumeroCaminoVida(dia, mes, anio);

        System.out.printf("Tu número de camino de vida es: %d\n", numeroCaminoVida);

        scanner.close();
    }

    public static int reducirANumeroSimple(int numero) {
        int suma = 0;

        while (numero > 0 || suma > 9) {
            if (numero == 0) {
                numero = suma;
                suma = 0;
            }
            suma += numero % 10;
            numero /= 10;
        }

        return suma;
    }

    public static int calcularNumeroCaminoVida(int dia, int mes, int anio) {
        int sumaFecha = reducirANumeroSimple(dia) + reducirANumeroSimple(mes) + reducirANumeroSimple(anio);
        return reducirANumeroSimple(sumaFecha);
    }
}
