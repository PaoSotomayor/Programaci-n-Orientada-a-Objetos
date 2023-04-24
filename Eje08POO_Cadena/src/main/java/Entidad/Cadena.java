/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author user
 */
public class Cadena {
    
private String frase;
    private int longitud;

    public Cadena() {
        this.frase = "";
        this.longitud = 0;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud=frase.length();
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

  
    
    
}