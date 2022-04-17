/*
 
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Circunferencia {
    
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    public Circunferencia crearCircunferencia(){
         Scanner leer = new Scanner(System.in); 
          System.out.println("Ingrese el radio de la circunferencia a crear");
        double radioIngresado= leer.nextDouble();
        Circunferencia circunferenciaNueva = new Circunferencia(radioIngresado);
        return circunferenciaNueva;
    }
    
    public  double calcularArea(){
        double areaDelCirculo =0;
        
        areaDelCirculo= Math.PI* (Math.pow(radio, 2));
        
        return areaDelCirculo;
        
    }
    public double calcularPerimetro(){
        double perimetroDelCirculo=0;
        perimetroDelCirculo= 2* Math.PI* radio;
        return perimetroDelCirculo;
    }
    
}
