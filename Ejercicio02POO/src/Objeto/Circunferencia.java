/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objeto;

/**
 *
 * @author user
 */
public class Circunferencia {
    // Creo parametros parametros
    
    private Double radio;
    private Double circunferencia;
    private Double area;
    private Double perimetro;
    
//get y set
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(Double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }
    
    //toString
    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", circunferencia=" + circunferencia + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    

    }
    

