package Tarea_POO_Herencia_Multinivel;

public class Estudiante {
    private String  codigo;
    private String nombre;
    private double promedio;
    private double valorMatricula;

    public Estudiante(String codigo, String nombre, double promedio, double valorMatricula) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.promedio = promedio;
        this.valorMatricula = valorMatricula;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.isEmpty())
            this.codigo = codigo;
        else
            System.out.println("El codigo no puede estar vacio");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if ( nombre != null && !nombre.isEmpty())
            this.nombre = nombre;
        else
            System.out.println("El nombre no puede estar vacio");
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 10)
            this.promedio = promedio;
        else
            System.out.println("Promedio invalido");
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(double valorMatricula) {
        if (valorMatricula > 0)
            this.valorMatricula = valorMatricula;
        else
            System.out.println("Valor invalido del valor de la matricula");
    }

    public boolean validarPromedio() {
        return promedio >= 0 && promedio <= 10;
    }

    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Matrícula: $" + valorMatricula);
    }

    public double calcularPagoFinal() {
        return valorMatricula;
    }

    public double calcularPagoFinal(double descuentoExtra) {
        return calcularPagoFinal() - descuentoExtra;
    }
}
