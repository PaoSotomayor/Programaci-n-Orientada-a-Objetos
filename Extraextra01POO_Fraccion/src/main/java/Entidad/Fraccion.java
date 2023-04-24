/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author user
 */
public class Fraccion {
    private int denominador1, denominador2;
    private int numerador1, numerador2; 

    public Fraccion() {
    }

    public Fraccion(int denominador1, int denominador2, int numerador1, int numerador2) {
        this.denominador1 = denominador1;
        this.denominador2 = denominador2;
        this.numerador1 = numerador1;
        this.numerador2 = numerador2;
    }

    public int getDenominador1() {
        return denominador1;
    }

    public void setDenominador1(int denominador1) {
        this.denominador1 = denominador1;
    }

    public int getDenominador2() {
        return denominador2;
    }

    public void setDenominador2(int denominador2) {
        this.denominador2 = denominador2;
    }

    public int getNumerador1() {
        return numerador1;
    }

    public void setNumerador1(int numerador1) {
        this.numerador1 = numerador1;
    }

    public int getNumerador2() {
        return numerador2;
    }

    public void setNumerador2(int numerador2) {
        this.numerador2 = numerador2;
    }

    @Override
    public String toString() {
        return "Fraccion{" + "denominador1=" + denominador1 + ", denominador2=" + denominador2 + ", numerador1=" + numerador1 + ", numerador2=" + numerador2 + '}';
    }
    
    
}
