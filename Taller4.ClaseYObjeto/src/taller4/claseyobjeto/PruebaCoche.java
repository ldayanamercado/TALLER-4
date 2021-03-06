/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4.claseyobjeto;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class PruebaCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Entrada = new Scanner (System.in);
        Coche miCoche = new Coche();
        Coche miCoche2 = new Coche ();
        
        miCoche.registrarCoche();
        miCoche2.registrarCoche();
        imprimirCoche(miCoche);
        imprimirCoche(miCoche2);
        
       
    }
    public static void  imprimirCoche (Coche coche ){
        
        System.out.println("Datos del coche ");
        System.out.print("\n el color del coche es:  "+coche.getColor() );
        System.out.print("\n la marca del coche es:  "+coche.getMarca() );
        System.out.print("\n el modelo del coche es:  "+coche.getModelo() );
        System.out.print("\n el numero de caballos del coche es:  "+coche.getNumeroCaballos() );
        System.out.print("\n el numero de puertas  del coche es:  "+coche.getNumeroPuertas() );
        System.out.print("\n La matricula del coche es:  "+coche.getMatricula() );
        System.out.println("\n____________________________________________________________");
    }
    
}
