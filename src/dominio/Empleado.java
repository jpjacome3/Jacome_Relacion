/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author JEAN_PIERRE
 */
public class Empleado {
    private String nombre;
    private Fecha fechaN;
    private Fecha fechaI;

    public Empleado(String nombre, Fecha fechaN, Fecha fechaI) {
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.fechaI = fechaI;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaN() {
        return fechaN;
    }

    public Fecha getFechaI() {
        return fechaI;
    }

    public void verDatosN() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Fecha de Nacimiento: ");
        System.out.println("Año: " + fechaN.getAnio() + " Mes: " + fechaN.getMes() + " Dia: " + fechaN.getDia());
    }

    public void verDatosI() {
        System.out.println("Fecha de Ingreso: ");
        System.out.println("Año: " + fechaI.getAnio() + " Mes: " + fechaI.getMes() + " Dia: " + fechaI.getDia());
    }

    @Override
    public String toString() {
        return this.nombre+"\n"+this.getFechaN()+"\n"+this.getFechaI();
    }
    
}
