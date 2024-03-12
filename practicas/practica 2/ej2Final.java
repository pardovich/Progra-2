import java.util.Scanner;

public class ej2Final {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Ingrese el numero de jugadores: ");
        int numJugadores = scanner.nextInt();
        scanner.nextLine(); 

        ej2[] jugadores = new ej2[numJugadores];
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println("Ingrese los datos para el Jugador " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Tarjetas amarillas: ");
            int amarillas = scanner.nextInt();
            System.out.print("Tarjetas rojas: ");
            int rojas = scanner.nextInt();
            System.out.print("Goles: ");
            int goles = scanner.nextInt();

            scanner.nextLine();

            jugadores[i] = new ej2(nombre, amarillas, rojas, goles);
        }


        ej2 masExpulsado = obtenerJugadorMasExpulsado(jugadores);
        ej2 mejorAmarillas = obtenerMejorAmarillas(jugadores);
        ej2 masFaltasTotales = obtenerJugadorMasFaltasTotales(jugadores);
        double promedioGoles = obtenerPromedioGoles(jugadores);
        int totalGoles = obtenerTotalGoles(jugadores);


        System.out.println("Jugador con mas expulsiones: " + masExpulsado.getNombre());
        System.out.println("Mejor jugador en tarjetas amarillas: " + mejorAmarillas.getNombre());
        System.out.println("Jugador con mas faltas totales: " + masFaltasTotales.getNombre());
        System.out.println("Promedio de goles: " + promedioGoles);
        System.out.println("Total de goles: " + totalGoles);


    }

    public static ej2 obtenerJugadorMasExpulsado(ej2[] jugadores) {
        ej2 masExpulsado = null;
        int maxExpulsiones = -1;

        for (ej2 jugador : jugadores) {
            if (jugador.getRojas() > maxExpulsiones) {
                maxExpulsiones = jugador.getRojas();
                masExpulsado = jugador;
            }
        }

        return masExpulsado;
    }

    public static ej2 obtenerMejorAmarillas(ej2[] jugadores) {
        ej2 mejorAmarillas = null;
        int minAmarillas = Integer.MAX_VALUE;

        for (ej2 jugador : jugadores) {
            if (jugador.getAmarillas() < minAmarillas) {
                minAmarillas = jugador.getAmarillas();
                mejorAmarillas = jugador;
            }
        }

        return mejorAmarillas;
    }

    public static ej2 obtenerJugadorMasFaltasTotales(ej2[] jugadores) {
        ej2 masFaltasTotales = null;
        int maxFaltasTotales = -1;

        for (ej2 jugador : jugadores) {
            int faltasTotales = jugador.getTotalTarjetas();
            if (faltasTotales > maxFaltasTotales) {
                maxFaltasTotales = faltasTotales;
                masFaltasTotales = jugador;
            }
        }

        return masFaltasTotales;
    }

    public static double obtenerPromedioGoles(ej2[] jugadores) {
        if (jugadores.length == 0) {
            return 0.0;
        }

        int totalGoles = 0;
        for (ej2 jugador : jugadores) {
            totalGoles += jugador.getGoles();
        }

        return (double) totalGoles / jugadores.length;
    }

    public static int obtenerTotalGoles(ej2[] jugadores) {
        int totalGoles = 0;
        for (ej2 jugador : jugadores) {
            totalGoles += jugador.getGoles();
        }
        return totalGoles;
    }
}
