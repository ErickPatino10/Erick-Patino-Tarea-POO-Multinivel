package Tarea_POO_Multinivel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese código: ");
        String codigo = sc.nextLine();

        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = sc.nextInt();

        System.out.print("Horas de clase: ");
        int horasClases = sc.nextInt();

        System.out.print("Valor por hora: ");
        double valorHora = sc.nextDouble();

        System.out.print("Publicaciones: ");
        int publicaciones = sc.nextInt();


        PersonaAcademica docente = new DocenteInvestigador(codigo, nombre, edad, horasClases, valorHora, publicaciones);

        System.out.println("\n--- RESULTADOS ---");
        docente.mostrarDatos();

        docente.describirRol();

        System.out.println("Pago final: $" + docente.calcularPago());

        System.out.println("Pago con bono extra: $" +
                ((DocenteInvestigador) docente).calcularPago(50));
    }
}