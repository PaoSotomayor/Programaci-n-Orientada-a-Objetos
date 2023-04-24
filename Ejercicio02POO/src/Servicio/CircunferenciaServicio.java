/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Objeto.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class CircunferenciaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double radio;

    // Funcion para crear circunferencia
    public Circunferencia crearCircunferencia() {
        Circunferencia Circunferencia1 = new Circunferencia();
        System.out.println("Ingrese el radio");
        Circunferencia1.setRadio(leer.nextDouble());
        System.out.println("El perímetro es: ");
        Circunferencia1.setPerimetro(leer.nextDouble());
        System.out.println("El área es: ");
        Circunferencia1.setArea(leer.nextDouble());
        
        return Circunferencia1;
    }
    public void mostrarCircunferencia(Circunferencia Circunferencia1){
        System.out.println(Circunferencia1.toString());
}

   //crear perimetro
    public Double mostrarPerimetro(double radio) {
        // Retorno perimetro
        return 2 * Math.PI * this.radio;
    }
    
    //crear area
    public Double mostrarArea(){
       // Retorno area
        return Math.PI * Math.pow(this.radio, 2); 
    }

    public void mostrarPerimetro(Circunferencia Circunferencia1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void mostrarArea(Circunferencia Circunferencia1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
