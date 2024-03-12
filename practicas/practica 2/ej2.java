
public class ej2 {

    private String nombre;
    private int amarillas;
    private int rojas;
    private int goles;


    public ej2(String nombre, int amarillas, int rojas, int goles) {
        this.nombre = nombre;
        this.amarillas = amarillas;
        this.rojas = rojas;
        this.goles = goles;
    }


    public String getNombre() {
        return nombre;
    }

    public int getAmarillas() {
        return amarillas;
    }

    public void setAmarillas(int amarillas) {
        this.amarillas = amarillas;
    }

    public int getRojas() {
        return rojas;
    }

    public void setRojas(int rojas) {
        this.rojas = rojas;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

  
    public int getTotalTarjetas() {
        return amarillas + rojas;
    }
}
