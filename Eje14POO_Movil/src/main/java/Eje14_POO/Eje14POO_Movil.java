/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Eje14_POO;

import Entidad.Movil;
import Servicio.MovilServicio;
import java.util.Arrays;

/*Una tienda que vende teléfonos móviles quiere tener registro de cada producto que posee en un sistema computacional. Para ello, 
crearemos un programa donde se pueda almacenar cada producto con su información. Crear una entidad Movil con los atributos marca, 
precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será un arreglo numérico de dimensión 7 (siete) donde cada subíndice 
alojará un número correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
public class Eje14POO_Movil {

    public static void main(String[] args) {
        MovilServicio sv = new MovilServicio();
        Movil movil = sv.cargarCelular();
        
        //sv.cargarCelular();
        sv.cargarCodigo(movil);
        System.out.println(movil.toString());
        System.out.println("Códigos: " + Arrays.toString(movil.getCodigo()));
//        System.out.println("Los datos ingresados son: " + Arrays.toString(cel.getCodigo()));
//        
//       System.out.println(sv.toString());
    }
}
//curso1.setAlumnos(cs.cargarAlumnos(curso1));
//    System.out.println("Los nombres de los alumnos son: "+ Arrays.toString(curso1.getAlumnos()));
