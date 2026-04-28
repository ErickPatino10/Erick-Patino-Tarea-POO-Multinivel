package Tarea_POO_Herencia_Multinivel;

public class BecadoExcelencia extends EstudianteBecado{
    private double bonoExcelencia;


    public BecadoExcelencia(String codigo, String nombre, double promedio, double valorMatricula, double porcentajeBecas, double bonoExcelencia) {
        super(codigo, nombre, promedio, valorMatricula, porcentajeBecas);
        this.bonoExcelencia = bonoExcelencia;
    }


    @Override
    public double calcularPagoFinal() {
        double pago = super.calcularPagoFinal() - bonoExcelencia;
        if (pago < 0) {
            return 0;
        }
        return pago;
    }

}
