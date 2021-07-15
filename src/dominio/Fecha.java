package dominio;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    private int anio;
    private int mes;
    private int dia;

    public Fecha(int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void calcularN() {
        GregorianCalendar gc = new GregorianCalendar();
        int anioac = gc.get(Calendar.YEAR);
        int mesac = gc.get(Calendar.MONTH) + 1;
        int diac = gc.get(Calendar.DATE);

        if (mesac >= this.mes) {
            this.mes = mesac - this.mes;
            this.anio = anioac - this.anio;
        } else {
            this.mes = 12 - (this.mes - mesac);
            this.anio = anioac - this.anio - 1;
        }

        if (diac >= this.dia) {
            this.dia = diac - this.dia;
        } else {
            this.dia = 31 - (this.dia - diac);
        }

        System.out.println("Su Edad es: " + this.anio + "años ," + this.mes + "meses y " + this.dia + "dias");
    }

    public void calcularI() {
        GregorianCalendar gc = new GregorianCalendar();
        int anioac = gc.get(Calendar.YEAR);
        int mesac = gc.get(Calendar.MONTH) + 1;
        int diac = gc.get(Calendar.DATE);

        if (mesac >= this.mes) {
            this.mes = mesac - this.mes;
            this.anio = anioac - this.anio;
        } else {
            this.mes = 12 - (this.mes - mesac);
            this.anio = anioac - this.anio - 1;
        }

        if (diac >= this.dia) {
            this.dia = diac - this.dia;
        } else {
            this.dia = 31 - (this.dia - diac);
        }

        System.out.println("Su Tiempo de trabajo es: " + this.anio + "años ," + this.mes + "meses y " + this.dia + "dias");
    }
    
    
    @Override
    public String toString() {
        return this.anio + " " + this.mes + " " + this.dia;
    }

 
}
