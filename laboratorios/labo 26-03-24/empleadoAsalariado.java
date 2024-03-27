public class empleadoAsalariado extends empleado {
    public empleadoAsalariado(String nombre, String cedula, double salarioBase) {
        super();
        setNombre(nombre);
        setCedula(cedula);
        setSalarioBase(salarioBase);
    }
    

    @Override
    public double calcularSalarioMensual(){    
        
        return (4 * getSalarioBase());
    }



}
