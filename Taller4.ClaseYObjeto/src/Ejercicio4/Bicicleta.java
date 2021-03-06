/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *Implementa la clase Bicicleta, que tiene tres atributos, velocidadActual, 
 * platoActual y piñonActual, de tipo entero, método constructor, getters y
 * setters, y los siguientes métodos miembros: acelerar (), frenar (), 
 * cambiarPlato (int plato), y cambiarPiñon (int piñon), donde el primero 
 * dobla la velocidad actual, el segundo reduce a la mitad la velocidad actual,
y el tercero y cuarto ajustan el plato y el piñón actual respectivamente según
* los parámetros recibidos. Crear una clase principal, e instancia un objeto 
* bicicleta y mostrar sus comportamientos
 * @author Laura
 */
public class Bicicleta {
    int velocidadActual, platoActual , pinonActual;

    public Bicicleta() {
        
    }
    public int getVelocidadActual() {return velocidadActual;}
    public void setVelocidadActual(int velocidadActual) {this.velocidadActual = velocidadActual;}
    public int getPlatoActual() {return platoActual;}
    public void setPlatoActual(int platoActual) {this.platoActual = platoActual;}
    public int getPinonActual() { return pinonActual;}
    public void setPinonActual(int pinonActual) {this.pinonActual = pinonActual;}
    
    
    public void Registrar(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("\n nuevo registro");
        System.out.print("\nVelocidad Actual" );
        velocidadActual = entrada.nextInt();
        System.out.print("\nPlato actual " );
        platoActual = entrada.nextInt();
        System.out.print("\nPiñon actual " );
        pinonActual = entrada.nextInt();
        System.out.println("\n________________________________");
    }
    public int acelerar (){
        //dobla la velocidad actual  
        return velocidadActual*2;
    }
    public float  frenar (){
    // el segundo reduce a la mitad la velocidad actual,
        return (float)velocidadActual/2;
    }
    
    
    
    
}
