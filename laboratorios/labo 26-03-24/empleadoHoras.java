public class empleadoHoras extends empleado {

    private double HorasExtra;

    public empleadoHoras(String nombre, String cedula, Double salarioBase, double HorasExtra){
        super();
        setNombre(nombre);
        setCedula(cedula);
        setSalarioBase(salarioBase);    
        this.HorasExtra = HorasExtra;
    }

    public double getHorasExtra() {
        return HorasExtra;
    }

    public void setHorasExtra(double horasExtra) {
        this.HorasExtra = horasExtra;
    }

    @Override
    public double calcularSalarioMensual() {
    double salarioRegular = 30; 
    double salarioExtra = getHorasExtra() * 300; 

    return salarioRegular + salarioExtra;
    }

}
