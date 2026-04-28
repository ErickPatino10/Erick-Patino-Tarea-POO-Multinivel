package Tarea_POO_Multinivel;

public class PersonaAcademica {
    private String codigo;
    private String nombre;
    private int edad;

    public PersonaAcademica(String codigo, String nombre, int edad) {
        setCodigo(codigo);
        setNombre(nombre);
        setEdad(edad);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null && ! codigo.isEmpty())
            this.codigo = codigo;
        else
            System.out.println("Codigo invalido");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && ! nombre.isEmpty())
            this.nombre = nombre;
        else
            System.out.println("Edad invalida");

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 18)
            this.edad = edad;
        else{
            System.out.println("Edad en rango invalido");
            this.edad=18;
        }
    }

    public void mostrarDatos(){
        System.out.println("Codigo: "+codigo);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }

    public void describirRol(){};

    public double calcularPago(){
        return 0;
    };
}
