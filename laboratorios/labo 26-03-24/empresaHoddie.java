import java.util.Scanner;

public class empresaHoddie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la informacion del empleado");
        System.out.println("Nombre: ");
        String nombreEmpleado = scanner.nextLine();
        System.out.println("Cedula: ");
        String cedulaEmpleado = scanner.nextLine();
        System.out.println("Tipo de empleado (1: Asalariado, 2: Por horas, 3: Por comision): ");
        int tipoEmpleado = scanner.nextInt();

        double salarioBase;
        double horasExtra;
        double comision;

        switch (tipoEmpleado) {
            case 1:
                System.out.println("Salario base: ");
                salarioBase = scanner.nextDouble();
                empleado empleadoAsalariado = new empleadoAsalariado(nombreEmpleado, cedulaEmpleado, salarioBase);
                System.out.println("\nInformacion del empleado asalariado");
                System.out.println("Nombre: " + empleadoAsalariado.getNombre());
                System.out.println("Cedula: " + empleadoAsalariado.getCedula());
                System.out.println("Salario Mensual: " + empleadoAsalariado.calcularSalarioMensual());
                break;

            case 2:
                System.out.println("Horas trabajadas en la semana: ");
                double horasTrabajadasPorHoras = scanner.nextDouble();
                System.out.println("Horas extra: ");
                double horasExtraPorHoras = scanner.nextDouble();
                empleado empleadoPorHoras = new empleadoHoras(nombreEmpleado, cedulaEmpleado, horasTrabajadasPorHoras, horasExtraPorHoras);
                System.out.println("\nInformacion del empleado por horas");
                System.out.println("Nombre: " + empleadoPorHoras.getNombre());
                System.out.println("Cedula: " + empleadoPorHoras.getCedula());
                System.out.println("Salario Mensual: " + empleadoPorHoras.calcularSalarioMensual());
                break;

            case 3:
                System.out.println("Dinero ganado semanalmete por todas las ventas: ");
                double ventass = scanner.nextDouble();
                System.out.println("Comision (por ejemplo 10 para 10%): ");
                double comisionn = scanner.nextDouble();
                empleado empleadoPorComision = new empleadoComision(nombreEmpleado, cedulaEmpleado, comisionn, ventass);
                System.out.println("\nInformacion del empleado por comision");
                System.out.println("Nombre: " + empleadoPorComision.getNombre());
                System.out.println("Cedula: " + empleadoPorComision.getCedula());
                System.out.println("Salario Mensual: " + empleadoPorComision.calcularSalarioMensual());
                break;
            
            default:
                System.out.println("Tipo de empleado no valido");
        }
    }
}
