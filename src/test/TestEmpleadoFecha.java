
package test;

import dominio.Empleado;
import dominio.Fecha;

import java.util.Date;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestEmpleadoFecha {

    public static void main(String[] args) {
        GregorianCalendar gc =new GregorianCalendar();
        Scanner entrada = new Scanner(System.in);
        Fecha fNacimiento;
        Fecha fIngreso;
        Empleado empleado1;
        int anio, mes, dia;
        String nombre;
        System.out.println("Ingrese nombre del empleado: ");
        nombre = entrada.nextLine();
        System.out.println("Fecha de Nacimiento: ");
        System.out.println("Año: ");
        anio = entrada.nextInt();
        System.out.println("Mes: ");
        mes = entrada.nextInt();
        System.out.println("Dia: ");
        dia = entrada.nextInt();
        fNacimiento = new Fecha(anio, mes, dia);

        System.out.println("Fecha de Ingreso a la empresa");
        System.out.println("Año:");
        anio = entrada.nextInt();
        System.out.println("Mes: ");
        mes = entrada.nextInt();
        System.out.println("Dia: ");
        dia = entrada.nextInt();

        fIngreso = new Fecha(anio, mes, dia);
        empleado1 = new Empleado(nombre, fNacimiento, fIngreso);
        //System.out.println(empleado1);

        empleado1.verDatosN();
        fNacimiento.calcularN();
        System.out.println("--------------------------------");
        empleado1.verDatosI();
        fIngreso.calcularI();



        
    }
    
}
