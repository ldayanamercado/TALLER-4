/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Titulo: ");
        String titulo = entrada.nextLine();
        System.out.print("1° Nombre: ");
        String primerNombre= entrada.next();
        System.out.print("2° Nombre: ");
        String segundoNombre = entrada.next();
        System.out.print("1° Apellido: ");
        String apellido = entrada.next();
        System.out.print(" ISBN: ");
        String ISBN = entrada.next();
        System.out.print("Paginas: ");
        String paginas =entrada.next();
        System.out.print("Edicion : ");
        String edicion = entrada.next();
        entrada.nextLine();
        System.out.print("editorial ");
        String editorial = entrada.nextLine();
        entrada.nextLine();
        System.out.print(" ciudad: ");
        String ciudad = entrada.nextLine();
        System.out.print("Pais : ");
        String pais = entrada.nextLine();
        System.out.print("Fecha de edicion : ");
        String fechaE = entrada.nextLine();
        
         Libro Libro1 = leer(titulo,primerNombre,segundoNombre,apellido ,ISBN,paginas ,edicion ,editorial ,ciudad , pais,fechaE  );
         mostrar(Libro1);
    }
    
    public static Libro leer (String titulo, String primerNombre, String segundoNombre,String primerApellido,String ISBN,String páginas,String edición,String editorial,String ciudad,String país ,String fechaEdición ){
    Libro miLibro = new Libro();
    Scanner entrada = new Scanner (System.in);
        miLibro.setTítulo(titulo);
        miLibro.setPrimerNombre(primerNombre);
        miLibro.setSegundoNombre(segundoNombre);
        miLibro.setPrimerApellido(primerApellido);
        miLibro.setISBN(ISBN);
        miLibro.setPáginas(páginas);
        miLibro.setEdición(edición);
        miLibro.setEditorial(editorial);
        miLibro.setCiudad(ciudad);
        miLibro.setPaís(país);
        miLibro.setFechaEdición(fechaEdición);
    return miLibro;
    }
    
     public static void mostrar(Libro miLibro){
         System.out.println("___________________________________");
         System.out.println("Titulo: "+miLibro.getTítulo());
         System.out.println(""+miLibro.getEdición()+" Edicion");
         System.out.println(" Autor: "+miLibro.getPrimerApellido()+" , "+miLibro.getPrimerNombre()+" . "+miLibro.getSegundoNombre());
         System.out.println("ISBN: "+miLibro.getISBN());
         System.out.println(miLibro.getEditorial()+" , "+miLibro.getCiudad()+"["+miLibro.getPaís()+"] ,"+miLibro.getFechaEdición() );
         System.out.println(miLibro.getPáginas()+" Paginas");
         System.out.println("___________________________________");
         
         
     }
    
}
