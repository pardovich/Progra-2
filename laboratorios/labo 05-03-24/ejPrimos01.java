import java.util.Scanner;
public class ejPrimos01 {
        public static void main(String[] args) {
        int num1=0 ;
        Scanner cin = new Scanner(System.in);
        System.out.println("ingrese el numero 1");
        num1 = cin.nextInt();
        ej01 esPrimo = new ej01();
        int res1 = esPrimo.primos(num1);

        if (res1==1){
            System.out.println("No es Primo");
        num1 = cin.nextInt();

        }else{System.out.println("Es primo");
        num1 = cin.nextInt();
        }

    }
}       
