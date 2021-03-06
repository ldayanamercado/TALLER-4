
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class PrincipalBicicleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Bicicleta miCicla = new Bicicleta ();
        
        miCicla.Registrar();
        System.out.printf("\n Acelerar = [ %d ] ", miCicla.acelerar());
        System.out.printf("Frenar = [ %.2f ]", miCicla.frenar());
    }
    
}
