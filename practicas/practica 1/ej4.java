import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class ej4 {
    public static void escribir() {
        try {
            FileWriter o = new FileWriter("tarifario.txt", true);
            Scanner scanner = new Scanner(System.in);
            int n, credi;
            String nom;
            
            System.out.print("Ingrese su nombre: ");
            nom = scanner.next();
            
            System.out.print("Cuantas materias tomara: ");
            n = scanner.nextInt();
            
            for (int i = 0; i < n; i++) {
                System.out.printf("Materia n. %d\n", i + 1);
                
                System.out.print("Nombre de la Materia: ");
                nom = scanner.next();
                
                System.out.print("Cuantos créditos tiene: ");
                credi = scanner.nextInt();
                
                o.write(nom + ";" + credi + "\n");
            }
            
            o.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reporte() {
        try {
            FileReader i = new FileReader("tarifario.txt");
            BufferedReader reader = new BufferedReader(i);
            double suma = 0;
            int pp = 582;
            String line;
            
            System.out.println("NOMBRE DE LA MATERIA\t\tCRÉDITOS");
            System.out.println("===================================");
            
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(";");
                String nom = tokens[0];
                int credi = Integer.parseInt(tokens[1]);
                double creditos = credi;
                
                suma += creditos * pp;
                System.out.printf("%-20s%5.2f\n", nom, creditos);
            }
            
            reader.close();
            
            System.out.println("=====================================");
            System.out.printf("Total a pagar: %-24.2f\n", suma);
            System.out.println("=====================================");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reporteConDescuento() {
        try {
            FileReader i = new FileReader("tarifario.txt");
            BufferedReader reader = new BufferedReader(i);
            double suma = 0;
            int pp = 582;
            double descuento = 0.08;
            String line;
            
            System.out.println("NOMBRE DE LA MATERIA\t\tCRÉDITOS CON DESCUENTO");
            System.out.println("=====================================");
            
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(";");
                String nom = tokens[0];
                int credi = Integer.parseInt(tokens[1]);
                double creditos = credi;
                double totalDescuento = creditos * pp * (1 - descuento);
                
                suma += totalDescuento;
                System.out.printf("%-20s%5.2f\n", nom, totalDescuento);
            }
            
            reader.close();
            
            System.out.println("=====================================");
            System.out.printf("Total a pagar con descuento: %-24.2f\n", suma);
            System.out.println("=====================================");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        
        System.out.println("BIENVENIDO");
        
        while (true) {
            System.out.println("Selecciona la opción a ejecutar:");
            System.out.println("   1. Toma de asignaturas");
            System.out.println("   2. Reporte");
            System.out.println("   3. Descuento por pronto pago");
            System.out.println("   4. Salir");
            
            try {
                op = scanner.nextInt();

                switch (op) {
                    case 1: escribir(); break;
                    case 2: reporte(); break;
                    case 3: reporteConDescuento(); break;
                    case 4: System.exit(0);
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        scanner.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Error: Ingresa un número entero válido.");
                scanner.nextLine();
            }
            
            System.out.println("----------------------------");
        }
    }
}
