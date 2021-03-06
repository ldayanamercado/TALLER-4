
package taller4.claseyobjeto.Ejercicio3;

import java.util.Scanner;


/**
 *Diseñe e implemente una clase para trabajar con triángulos isósceles. Defina
 * atributos para la base y la altura,proporcione un método constructor, métodos 
 * getter y setter e implemente métodos para calcular: el área, la longitud de
 * sus lados iguales, el perímetro, el valor del ángulo vértice
 * @author Laura
 */
public class TrianguloIsoscele {
    double base;
    double altura;
    // metodo constructor
    public TrianguloIsoscele (){
    
    }
    // metodo get
    public double getBase (){ return base;}
    public double getAltura (){ return altura;}
    // metodo Set
    public void  setBase (double base){ this.base = base ;}
    public void setAltura (double altura ) { this.altura = altura;}
    // metodos 
    
    public void registrarDato (){
        Scanner entrada = new Scanner (System.in);
        System.out.print(" Digite Base ");
        base=entrada.nextDouble();
        System.out.print(" Digite Altura ");
        altura = entrada.nextDouble();
        System.out.println("\n_________________");
        
        
    }
    
    public double calcularArea (){
        return (this.base*this.altura)/2;
    }
    public double longitudLados(){
        double aux= this.base/2;
        double h = (altura*altura)+(aux*aux);
        double lados = Math.sqrt(h); // raiz cuadrada
        return  lados; 
    }
    public double perimetro ( ){
        return (2*this.longitudLados()+base);
    }
    public double anguloVertice ( ){
    double valor ;
    double angulo ;
    angulo =  altura/this.longitudLados();
     valor = Math.acos(angulo);
    double aux = Math.toDegrees(valor);
    return aux*2;
    
    }
    
}
