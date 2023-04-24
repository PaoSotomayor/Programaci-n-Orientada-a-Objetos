/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class Movil {

    //marca, precio, modelo, memoriaRam, almacenamiento y codigo
    private String marca;
    private double precio;
    private String modelo;
    private String memoriaRam;
    private int almacenamiento;
    private int[] codigo;

    public Movil() {
      this.codigo = new int [7]; 
    }


    public Movil(String marca, double precio, String modelo, String memoriaRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = new int [7]; 
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
    

    @Override
    public String toString() {
        return "Movil{" + "Marca=" + marca + ", Precio=" + precio + ", Modelo=" + modelo + ", memoriaRam=" + memoriaRam + ", Almacenamiento=" + almacenamiento + ", Código=" + Arrays.toString(codigo) + '}';
    }   
}


