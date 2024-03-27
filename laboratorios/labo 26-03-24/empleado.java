public abstract class empleado {
    
        private String nombre;
        private String cedula;
        private double salarioBase;
        private double comision;

        public void setComision(double comision) {
            this.comision = comision;
        }

        public double getComision() {
            return comision;
        }
        
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCedula() {
            return cedula;
        }

        public void setCedula(String cedula) {
            this.cedula = cedula;
        }

        public double getSalarioBase() {
            return salarioBase;
        }
        
        public void setSalarioBase(double salarioBase) {
            this.salarioBase = salarioBase;
        }

        public abstract double calcularSalarioMensual();

}
