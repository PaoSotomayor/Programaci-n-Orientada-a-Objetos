/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2, 
siendo cada x e y un punto. Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números 
y los ingresa en los atributos del objeto. Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos.
 */
public class PuntosServicio {

    public Puntos Crearpuntos() {
        Scanner leer = new Scanner(System.in);
        Puntos puntos = new Puntos();

        System.out.println(" Ingrese las dos primeras cordenadas");
        puntos.setX1(leer.nextDouble());
        puntos.setY1(leer.nextDouble());

        System.out.println(" Ingrese las dos segundas cordenadas");
        puntos.setX2(leer.nextDouble());
        puntos.setY2(leer.nextDouble());

        return puntos;
    }

    public double Calcular(Puntos puntos) {

        return Math.sqrt((Math.pow(puntos.getX2() - puntos.getX1(), 2)) + (Math.pow(puntos.getY2() - puntos.getY1(), 2)));

    }
}
