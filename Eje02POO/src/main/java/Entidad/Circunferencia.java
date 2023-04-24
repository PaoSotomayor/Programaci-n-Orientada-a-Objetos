/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author user
 */
public class Circunferencia {
    //atributos
    private float radio;
    
    
    //constructor
    public Circunferencia(float radio) {
        this.radio = radio;
    }
//get and set
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    //toSring
    @Override
    public String toString() {
        return "Circunferencia{[" + "Radio= " + radio + ']';
    }
    
    
}
    

