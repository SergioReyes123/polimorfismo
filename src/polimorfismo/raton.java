/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author chejo
 */
public class raton extends Animal {
private String tamaño;

    public raton (String tamaño,String nombre,String tipodealimentacion, int edad) {
        super(nombre, tipodealimentacion, edad);
        this.tamaño = tamaño;
        
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    

    @Override
    public void alimentacion() {
        System.out.println("el raton se alimenta de sobras");
        System.out.println("el raton es de color gris");
    }
    public void mostrar(){
        System.out.println("el nombre del raton es: " + getNombre());
        System.out.println("el raton se alimenta de: " + getTipodealimentacion());
        System.out.println("la edad del raton es: " + getEdad());
        System.out.println("el tamaño del raton es: " + getTamaño());
    }
}
 
    

