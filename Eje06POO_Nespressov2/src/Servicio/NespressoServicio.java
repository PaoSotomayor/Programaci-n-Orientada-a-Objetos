/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Nespresso;
import java.util.Scanner;

/*
- Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
-  Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
- Método vaciarCafetera(): pone la cantidad de café actual en cero.
- Método agregarCafe(int): se le pide al usuario una cantidad de 
 */
public class NespressoServicio {

    Scanner leer = new Scanner(System.in);
    Nespresso cafetera = new Nespresso();

    public Nespresso crearCafetera() {
        System.out.println("Ingrese la capacidad máxima de la cafetera en ml: ");
        cafetera.setCantidadMaxima(leer.nextDouble());
        return cafetera;
    }

    public void llenarCafetera(Nespresso b) {
        cafetera.setCantidadActual(cafetera.getCantidadMaxima());
        System.out.println("La cafetera tiene " + cafetera.getCantidadActual() + " ml de cafe.");
    }

    public void servirTaza(Nespresso c) {
        System.out.println("Ingrese el tamaño de su taza en ml: ");
        double taza = leer.nextDouble();
        if (taza <= cafetera.getCantidadActual()) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
            System.out.println("Se ha llenado su taza!. Restan " + cafetera.getCantidadActual() + " ml de cafe.");
        } else {
            System.out.println("Cafe insuficiente.");
            System.out.println("El porcentaje que se ha llenado de la taza es: " + (100 * cafetera.getCantidadActual()) / taza + "%.");
            cafetera.setCantidadActual(0);
        }
    }

    public void vaciarCafetera(Nespresso d) {
        if (cafetera.getCantidadActual() == 0) {
            System.out.println("La cafetera se encuentra vacia.");
        } else {
            cafetera.setCantidadActual(0);
            System.out.println("Se ha vaciado por completo la cafetera.");
        }
    }

    public void agregarCafe(Nespresso e) {
        System.out.println("Puede agregar un maximo de: " + (cafetera.getCantidadMaxima() - cafetera.getCantidadActual()) + " ml de cafe.");
        cafetera.setCantidadActual(cafetera.getCantidadActual() + leer.nextInt());
        System.out.println("Se ha agregado su cafe. Ahora cuenta con " + cafetera.getCantidadActual() + " ml de cafe.");
    }
}
