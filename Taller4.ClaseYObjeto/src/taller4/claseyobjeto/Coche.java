/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4.claseyobjeto;

import java.util.Scanner;

/**
 * a través de la cual se pueda conocer el color del coche, la marca,
 * el modelo, el número de caballos, el número de puertas y la matricula
 * @author Laura
 */
public class Coche {
    // Declarando Atributos
        private String color;
        private String marca;
        private int modelo;
        private int numeroCaballos;
        private int numeroPuertas;
        private String matricula;
        
         // crear constructor 
    public Coche (){
    
    }
    // creando metodos Getter

    public String getColor() { return color; }
    public String getMarca() {return marca;}
    public int getModelo() {return modelo;}
    public int getNumeroCaballos() {return numeroCaballos;}
    public int getNumeroPuertas() {return numeroPuertas;}
    public String getMatricula() {return matricula; }
    
    // creando metodos Sether .. estos son para mostrar 
    public void setColor(String color) {this.color = color;}
    public void setMarca(String marca) {this.marca = marca;}
    public void setModelo(int modelo) { this.modelo = modelo;}
    public void setNumeroCaballos(int numeroCaballos) { this.numeroCaballos = numeroCaballos;}
    public void setNumeroPuertas(int numeroPuertas) { this.numeroPuertas = numeroPuertas;}
    public void setMatricula(String matricula) { this.matricula = matricula; }
    
    
    public void registrarCoche (){
        Scanner Entrada = new Scanner (System.in);

        System.out.println(" Nuevo Coche. ");
        System.out.print("\ncolor  ");
        color = Entrada.nextLine();
        System.out.print("\nmarca  ");
        marca = Entrada.nextLine();
        System.out.print("\nmodelo  ");
        modelo = Entrada.nextInt();
        Entrada.nextLine();
        System.out.print("\nnumero de caballos ");
        numeroCaballos = Entrada.nextInt();
        System.out.print("\nnumero de puertas ");
        numeroPuertas = Entrada.nextInt();
        Entrada.nextLine();
        System.out.print("\nmatricula ");
        matricula = Entrada.nextLine();
       System.out.println("\n____________________________________________________________");
    }

   
  

    
        
    
    
}
