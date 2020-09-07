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
public class conejo extends Animal {
private String color;
    public conejo(String color,String nombre,String tipodealimentacion, int edad) {
        super(nombre, tipodealimentacion, edad);
        this.color = color;
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void alimentacion() {
        System.out.println("el conejo se alimenta de zanahorias");
        System.out.println("el conejo es de color cafe");
    }
    public void mostrar(){
        System.out.println("el nombre del conejo es: " + getNombre());
        System.out.println("el conejo se alimenta de: " + getTipodealimentacion());
        System.out.println("la edad del conejo es: " + getEdad());
        System.out.println("el color del conejo es: " + getColor());
    }
}
