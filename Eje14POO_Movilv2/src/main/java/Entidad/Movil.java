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
    
private String marca;
    private int precio;
    private String modelo;
    private int memoriaRam;
    private int almacenaiento;
    private int [] codigo;

    public Movil() {
    }

    public Movil(String marca, int precio, String modelo, int memoriaRam, int almacenaiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenaiento = almacenaiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenaiento() {
        return almacenaiento;
    }

    public void setAlmacenaiento(int almacenaiento) {
        this.almacenaiento = almacenaiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", memoriaRam=" + memoriaRam + ", almacenaiento=" + almacenaiento + ", codigo=" + Arrays.toString(codigo) + '}';
    }
    
    
    
}
