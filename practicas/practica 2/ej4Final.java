import java.util.Scanner;

public class ej4Final {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la contraseña recuerde que tiene que tener estos caracteres %, &, $, /, *, ");
        String contraseña = scanner.nextLine();

        ej4 verificador = new ej4(contraseña);

        boolean esContraseñaValida = verificador.validarContraseña();
        if (esContraseñaValida) {
            System.out.println("La contraseña es valida.");
        } else {
            System.out.println("La contraseña no cumple con los criterios de seguridad.");
        }

        scanner.close();
    }
}
