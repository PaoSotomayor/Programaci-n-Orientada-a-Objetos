/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author user
 */
public class PersonaS {
   String nombre;
   Date edad;

    public PersonaS() {
    }

    public PersonaS(String nombre, Date edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getEdad() {
        return edad;
    }

    public void setEdad(Date edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "PersonaS{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    
    }
    
    

