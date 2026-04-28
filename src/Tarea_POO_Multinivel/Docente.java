package Tarea_POO_Multinivel;

public class Docente extends PersonaAcademica {
    private int horasClases;
    private double valorHora;

    public Docente(String codigo, String nombre, int edad, int horasClases, double valorHora) {
        super(codigo, nombre, edad);
        setHorasClases(horasClases);
        setValorHora(valorHora);
    }

    public int getHorasClases() {
        return horasClases;
    }

    public void setHorasClases(int horasClases) {
        if (horasClases >= 1 && horasClases<= 40 )
            this.horasClases = horasClases;
        else{
            System.out.println("Horas de clase invalidas");
            this.horasClases = 1;
        }
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if (valorHora > 0)
            this.valorHora = valorHora;
        else{
            System.out.println("Valor de la hora invalida");
            this.valorHora = 1;
        }
    }

    @Override
    public double calcularPago() {
        return getHorasClases() * getValorHora();
    }

    @Override
    public void describirRol() {
        System.out.println("Rol: Docente");
    }
}
