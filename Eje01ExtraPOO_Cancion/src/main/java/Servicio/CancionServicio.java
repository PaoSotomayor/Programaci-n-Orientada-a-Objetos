/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cancion;
import java.util.Scanner;

/*Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́ definir además dos constructores: 
uno vacío que inicializa el titulo y el autor a cadenas vacías y otro que reciba como parámetros 
el titulo y el autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.
 */
public class CancionServicio {

    
    public Cancion Titulo() {
Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cancion musica = new Cancion();

        System.out.println("Ingrese el titulo de la canción    ");
        musica.setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor de la canción    ");
        musica.setAutor(leer.nextLine());

        return musica;
    }

}
