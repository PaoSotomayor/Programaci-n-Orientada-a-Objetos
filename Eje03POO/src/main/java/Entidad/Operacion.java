/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author user
 */
public class Operacion {
    private int nro1;
    private int nro2;

    public Operacion(int nro1, int nro2) {
        this.nro1 = nro1;
        this.nro2 = nro2;
    }

    public Operacion() {
    }
    

    public int getNro1() {
        return nro1;
    }

    public void setNro1(int nro1) {
        this.nro1 = nro1;
    }

    public int getNro2() {
        return nro2;
    }

    public void setNro2(int nro2) {
        this.nro2 = nro2;
    }

    @Override
    public String toString() {
        return "Operacion{" + "nro1=" + nro1 + ", nro2=" + nro2 + '}';
    }
    
    
    
}