import java.util.Scanner;

public class calculadoraAplicacion {
    public static void main(String[] args) {
        int numeroUno = 0;
        int numeroDos = 0;
        int numeroTres = 0;
        Scanner cin = new Scanner(System.in);
        
        System.out.println("Ingrese el numero 1");
        numeroUno = cin.nextInt();
        System.out.println("Ingrese el numero 2");
        numeroDos = cin.nextInt();

        calculadora casio = new calculadora(numeroUno, numeroDos);
        
        double res1 = casio.sumar();
        System.out.println("el resultado es:" +res1);
    
        double res2 = casio.restar();
        System.out.println("el resultado es:" +res2);
        
        double res3 = casio.multiplicar();
        System.out.println("el resultado es:" +res3);
        
        double res4 = casio.dividir();
        System.out.println("el resultado es:" +res4);
        
        System.out.println("ingrese el numero 3 que reemplaza el (2)");
        numeroTres=cin.nextInt();

        casio.setNum2(numeroTres);
        double res5 = casio.sumar();
        System.out.println("a suma es:" +res5);

    }
}
