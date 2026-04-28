package Tarea_POO_Multinivel;

public class DocenteInvestigador extends Docente{
    private int publicaciones;

    public DocenteInvestigador(String codigo, String nombre, int edad, int horasClases, double valorHora, int publicaciones) {
        super(codigo, nombre, edad, horasClases, valorHora);
        setPublicaciones(publicaciones);
    }

    public int getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(int publicaciones) {
        if (publicaciones >= 0)
            this.publicaciones = publicaciones;
        else{
            System.out.println("Numero de publicaciones invalidas");
            this.publicaciones = 0;
        }
    }

    @Override
    public double calcularPago() {
        double pagoBase = super.calcularPago();
        double bono = publicaciones * 20;
        return pagoBase + bono;
    }

    public double calcularPago(double bonoExtra){
        return calcularPago()+bonoExtra;
    }

    @Override
    public void describirRol() {
        System.out.println("Rol: Docente investigador con produccion academica");
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Valor horas: "+getValorHora());
        System.out.println("Horas de clase: " + getHorasClases());
        System.out.println("Publicaciones: " + publicaciones);
    }
}
