import java.util.Scanner;
public class ejFinal03 {
    public static void main(String[] args) {
        int num1;
        Scanner cin = new Scanner(System.in);

        System.out.println("Ingrese el número 1:");
        num1 = cin.nextInt();

        ej03 esPrimo = new ej03(num1, 0);
        double res1 = esPrimo.primos();

        if (res1==1){
            System.out.println("No es Primo");
        num1 = cin.nextInt();

        }else{System.out.println("Es primo");
        num1 = cin.nextInt();
        }
    }
}
