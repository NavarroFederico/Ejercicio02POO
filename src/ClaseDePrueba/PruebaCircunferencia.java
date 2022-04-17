/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseDePrueba;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PruebaCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Circunferencia circunferencia = new Circunferencia();
        
        circunferencia=circunferencia.crearCircunferencia();
        double radio;
        
      
       
        
        System.out.println(circunferencia.calcularArea());
        System.out.println(circunferencia.calcularPerimetro());
        
        
        
    }
    
}
