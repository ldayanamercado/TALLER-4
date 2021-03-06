/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4.claseyobjeto.Ejercicio3;
import java.util.Scanner;


/**
 *
 * @author Laura
 */
public class PruebaTrianguloIsoscele {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        TrianguloIsoscele triangulo = new TrianguloIsoscele ();
        
        triangulo.registrarDato();
        System.out.printf(" \nel area es:[ %.1f ]", triangulo.calcularArea());
        System.out.printf(" \nlos lados son:[%.1f ] ", triangulo.longitudLados());
        System.out.printf(" \nel perimetro es:[%.1f] ", triangulo.perimetro());
        System.out.printf(" \nel angulo vertice  es:[%.1f] ", triangulo.anguloVertice ( ) );
        
        
         
    }
    
    
    
    
}
