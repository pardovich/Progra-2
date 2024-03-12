import java.util.Scanner;

public class ej5Final {
    public static void main(String[] args) {
        int n = 0;
        Scanner cin = new Scanner(System.in);
        System.out.println("Ingresa el tamaño de la matriz: ");
        n = cin.nextInt();
        ej5 matriz = new ej5(n);
        matriz.matris_completa();
    }
}
