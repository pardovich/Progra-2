import java.util.Scanner;

public class ej3Final {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Ingrese la hora de entrada (formato Hora:Min): ");
        String horaEntrada = scanner.nextLine();

        System.out.print("Ingrese la hora de salida (formato Hora:Min): ");
        String horaSalida = scanner.nextLine();


        System.out.print("Ingrese el salario por hora: ");
        double salarioHora = scanner.nextDouble();


        ej3 empleado = new ej3(horaEntrada, horaSalida, salarioHora);

        double ingresoMensual = empleado.calcularIngresoMensual();
        System.out.println("El ingreso mensual del empleado es: " + ingresoMensual);

    }
}
