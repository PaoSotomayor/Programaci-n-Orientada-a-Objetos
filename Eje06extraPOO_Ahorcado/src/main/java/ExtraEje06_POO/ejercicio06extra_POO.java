/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExtraEje06_POO;

import Entidad.Ahorcado;
import Servicio.AhorcadoServicio;


/**
 *
 * @author user
 */
public class ejercicio06extra_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AhorcadoServicio service = new AhorcadoServicio();
        Ahorcado juego = new Ahorcado();
        service.juego(juego);
    }        
}