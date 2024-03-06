import java.util.Scanner;
public class ejfinal2 {
    public static void main(String[] args) {
        double num1;
        System.out.println("ingrese en Bs");
        Scanner cin = new Scanner(System.in);

        num1= cin.nextInt();
        ej02 maria = new ej02();

        double res1 = maria.cambio(num1);
        System.out.println("de bs a dolares es:"+res1);
        double res2 = maria.cambioB(num1);
        System.out.println("el cambio bilateral es:"+res2);

    }

}
