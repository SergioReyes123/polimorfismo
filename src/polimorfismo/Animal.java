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
public abstract class Animal {
    
    private String nombre;
    private String tipodealimentacion;
    private int edad;
    
    public Animal(String nombre, String tipodealimentacion, int edad){
        this.nombre = nombre;
        this.tipodealimentacion = tipodealimentacion;
        this.edad = edad;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipodealimentacion() {
        return tipodealimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipodealimentacion(String tipodealimentacion) {
        this.tipodealimentacion = tipodealimentacion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public abstract void alimentacion();
    
}
