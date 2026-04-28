package Tarea_POO_Herencia_Multinivel;

public class EstudianteBecado extends Estudiante {
    private double porcentajeBecas;


    public EstudianteBecado(String codigo, String nombre, double promedio, double valorMatricula, double porcentajeBecas) {
        super(codigo, nombre, promedio, valorMatricula);
        setPorcentajeBeca(porcentajeBecas);
    }

    public void setPorcentajeBeca(double porcentajeBeca) {
        if (porcentajeBeca >= 0 && porcentajeBeca <= 100) {
            this.porcentajeBecas = porcentajeBeca;
        }
    }

    public double getPorcentajeBeca() {
        return porcentajeBecas;
    }

    @Override
    public double calcularPagoFinal() {
        double descuento = getValorMatricula() * (porcentajeBecas / 100);
        return getValorMatricula() - descuento;
    }
}
