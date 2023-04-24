/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/*Una tienda que vende teléfonos móviles quiere tener registro de cada producto que posee en un sistema computacional. 
Para ello, crearemos un programa donde se pueda almacenar cada producto con su información. Crear una entidad Movil con 
los atributos marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será un arreglo numérico de 
dimensión 7 (siete) donde cada subíndice alojará un número correspondiente al código. A continuación, se implementarán 
los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para instanciar un objeto Celular y 
poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete números de un celular. 
Para ello, puede utilizarse un bucle repetitivo
 */
public class MovilServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Movil tienda = new Movil();

    public Movil cargarCelular() {
        System.out.println("Marca de celular: ");
        tienda.setMarca(leer.next());
        System.out.println("Precio: ");
        tienda.setPrecio(leer.nextInt());
        System.out.println("Modelo");
        tienda.setModelo(leer.next());
        System.out.println("Memoria Ram: ");
        tienda.setMemoriaRam(leer.next());
        System.out.println("Almacenamiento: ");
        tienda.setAlmacenamiento(leer.nextInt());
        return tienda;

    }

    public void cargarCodigo(Movil t) {
        int numero[] = t.getCodigo();
        int[] cod = new int[tienda.getCodigo().length];

        for (int i = 0; i < cod.length ; i++) {
          System.out.println("Ingresar código de este celular: ");
            numero[i] = leer.nextInt();
        }

        
    }
}
