public class ej3 {

    private String horaEntrada;
    private String horaSalida;
    private double salarioHora;
    
    public ej3(String horaEntrada, String horaSalida, double salarioHora) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.salarioHora = salarioHora;
    }



    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

 
    public double calcularIngresoMensual() {
        int minutosAtrazo = calcularMinutosAtrazo();
        double salarioDiario = calcularSalarioDiario(minutosAtrazo);
        return salarioDiario * calcularDiasTrabajados();
    }


    private int calcularMinutosAtrazo() {
        int minutosEntrada = convertirHoraAMinutos(horaEntrada);
        int minutosSalida = convertirHoraAMinutos(horaSalida);

        int minutosTolerancia = 30;
        int minutosAtrazo = minutosEntrada - minutosTolerancia;
        minutosAtrazo += 480 - minutosSalida; 

        return Math.max(0, minutosAtrazo);
    }

    private double calcularSalarioDiario(int minutosAtrazo) {
        double salarioDiario = salarioHora * 8 * 60;  

 
        salarioDiario -= minutosAtrazo * (salarioHora / 60.0); 

        return salarioDiario;
    }

    private int convertirHoraAMinutos(String hora) {
        String[] partesHora = hora.split(":");
        int horas = Integer.parseInt(partesHora[0]);
        int minutos = Integer.parseInt(partesHora[1]);
        return horas * 60 + minutos;
    }

    private int calcularDiasTrabajados() {
       
        return 22;
    }
}
