import java.util.Scanner;

public class ejFinal04 {
    public static void main(String[] args) {
        double num1 = 100.0;

        System.out.print("Ingrese en Bs: ");
        Scanner cin = new Scanner(System.in);

        num1 = cin.nextDouble();
        ej04 maria = new ej04(num1);

        double res1 = maria.cambio1();
        System.out.println("De Bs a dólares es: " + res1);
        double res2 = maria.cambio2();
        System.out.println("El cambio bilateral es: " + res2);
        double res3 = maria.cambio3();
        System.out.println("El cambio bilateral es: " + res3);
        double res4 = maria.cambio4();
        System.out.println("El cambio bilateral es: " + res4);

    }
    
}
