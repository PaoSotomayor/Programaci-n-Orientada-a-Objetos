/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06_POO;

//Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima

import Entidad.Nespresso;
import Servicio.NespressoServicio;
import java.util.Scanner;

//(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
//cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
//métodos:
//    - Constructor predeterminado o vacío
//    - Constructor con la capacidad máxima y la cantidad actual.
//    - Métodos getters y setters.
//    - Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//        máxima.
//    - Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//        tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//        cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//        método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//        cuanto quedó la taza.
//    - Método vaciarCafetera(): pone la cantidad de café actual en cero.
//    - Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//        recibe y se añade a la cafetera la cantidad de café indicada.

public class Eje06POO_Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        NespressoServicio servicio = new NespressoServicio();
        Nespresso cafetera = servicio.crearCafetera();

        int opcion;

        do {

            System.out.println("---------------------");
            System.out.println("CAFETERIA");
            System.out.println("1 - Llenar cafetera");
            System.out.println("2 - Servir cafe");
            System.out.println("3 - Agregar cafe");
            System.out.println("4 - Vaciar cafetera");
            System.out.println("5 - SALIR");
            System.out.println("---------------------");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    servicio.llenarCafetera(cafetera);
                    break;
                case 2:
                    servicio.servirTaza(cafetera);
                    break;
                case 3:
                    servicio.agregarCafe(cafetera);
                    break;
                case 4:
                    servicio.vaciarCafetera(cafetera);
                    break;
                case 5:
                    System.out.println("Saliendo . . . .");
                    break;
                default:
                    System.out.println("Error al elegir una opcion. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);
    }
}