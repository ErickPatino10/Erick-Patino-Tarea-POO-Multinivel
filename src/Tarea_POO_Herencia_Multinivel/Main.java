package Tarea_POO_Herencia_Multinivel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> lista = new ArrayList<>();

        System.out.println("=== INGRESO DE BECADO EXCELENCIA ===");

        System.out.print("Código: ");
        String codigo = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Promedio: ");
        double promedio = sc.nextDouble();

        System.out.print("Valor matrícula: ");
        double matricula = sc.nextDouble();

        System.out.print("Porcentaje beca: ");
        double beca = sc.nextDouble();

        System.out.print("Bono excelencia: ");
        double bono = sc.nextDouble();

        Estudiante e1 = new BecadoExcelencia(codigo, nombre, promedio, matricula, beca, bono);
        lista.add(e1);


        sc.nextLine();

        System.out.println("\n=== INGRESO REGULAR CON RECARGO ===");

        System.out.print("Código: ");
        codigo = sc.nextLine();

        System.out.print("Nombre: ");
        nombre = sc.nextLine();

        System.out.print("Promedio: ");
        promedio = sc.nextDouble();

        System.out.print("Valor matrícula: ");
        matricula = sc.nextDouble();

        System.out.print("Número de materias: ");
        int materias = sc.nextInt();

        System.out.print("Recargo pendiente: ");
        double recargo = sc.nextDouble();


        Estudiante e2 = new RegularConRecargo(codigo, nombre, promedio, matricula, materias, recargo);
        lista.add(e2);


        System.out.println("\n=== RESULTADOS ===");
        for (Estudiante e : lista) {
            e.mostrarDatos();
            System.out.println("Pago final: $" + e.calcularPagoFinal());
            System.out.println("Pago con descuento extra: $" + e.calcularPagoFinal(10));
            System.out.println("----------------------");
        }

        sc.close();
    }
}