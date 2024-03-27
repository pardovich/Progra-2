public class empleadoComision extends empleado {
    
    private double comision;
    private double ventas;

    public empleadoComision(String nombre, String cedula, double comision, double ventas) {
        super();
        setNombre(nombre);
        setCedula(cedula);
        this.comision = comision;
        this.ventas = ventas;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    public double getComision() {
        return comision;
    }
    
    public void setVentas(double ventas) {
        this.ventas = ventas;
    }
    
    public double getVentas() {
        return ventas;
    }

    @Override
    public double calcularSalarioMensual(){
       
        return 4 * (getComision() * 100);
    }
}
