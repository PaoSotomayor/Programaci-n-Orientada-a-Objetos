/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

public class RectanguloServicio {

    Scanner leer = new Scanner(System.in);

    public Rectangulo crearRectangulo() {
        System.out.println("Ingrese la base del rectangulo seguido de la altura");
        Rectangulo r1 = new Rectangulo(leer.nextInt(), leer.nextInt());

        return r1;
    }
//Superficie = base * altura 
    public int Superficie(Rectangulo r1) {

        return r1.getAltura() + r1.getBase();

    }
/// Perímetro = (base + altura) * 2.
    public int Perimetro(Rectangulo r1) {

        return (r1.getAltura() + r1.getBase()) * 2;
    }

    public int Dibujo(Rectangulo r1) {

        for (int i = 0; i < r1.getAltura(); i++) {

            for (int j = 0; j < r1.getBase(); j++) {
                if (i == 0 || i == r1.getAltura() - 1 || j == 0 || j == r1.getBase() - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
        return 0;
    }
}
