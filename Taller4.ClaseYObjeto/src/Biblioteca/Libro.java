/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

/**
 *
 * @author Laura
 */
public class Libro {
   String título, primerNombre, segundoNombre, primerApellido, ISBN;
   String páginas, edición, editorial, ciudad, país , fechaEdición;
   //CONSTUCTOR
   
    public Libro() {
    }
   //METODOS GET
    public String getTítulo() {return título;}
    public String getPrimerNombre() {return primerNombre;}
    public String getSegundoNombre() {return segundoNombre;}
    public String getPrimerApellido() {return primerApellido;}
    public String getISBN() {return ISBN;}
    public String getPáginas() {return páginas;}
    public String getEdición() {return edición;}
    public String getEditorial() {return editorial;}
    public String getCiudad() {return ciudad;}
    public String getPaís() {return país;}
    public String getFechaEdición() {return fechaEdición;}
    //METTODOS SET
    public void setTítulo(String título) {this.título = título;}
    public void setPrimerNombre(String primerNombre) {this.primerNombre = primerNombre;}
    public void setSegundoNombre(String segundoNombre) {this.segundoNombre = segundoNombre;}
    public void setPrimerApellido(String primerApellido) {this.primerApellido = primerApellido;}
    public void setISBN(String ISBN) {this.ISBN = ISBN;}
    public void setPáginas(String páginas) {this.páginas = páginas;}
    public void setEdición(String edición) {this.edición = edición;}
    public void setEditorial(String editorial) {this.editorial = editorial;}
    public void setCiudad(String ciudad) {this.ciudad = ciudad;}
    public void setPaís(String país) {this.país = país;}
    public void setFechaEdición(String fechaEdición) {this.fechaEdición = fechaEdición;}
    
    
}
