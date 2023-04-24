/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ExtraEje02_POO;

import Entidad.Puntos;
import Servicio.PuntosServicio;

/*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2, 
siendo cada x e y un punto. Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números 
y los ingresa en los atributos del objeto. Después, a través de otro método calcular y devolver la distancia que existe entre 
los dos puntos que existen en la clase Puntos.
 */
public class Eje02ExtraPOO_Puntos {

    public static void main(String[] args) {
        PuntosServicio service = new PuntosServicio();
      
      Puntos puntos = service.Crearpuntos();
      
        System.out.println(service.Calcular(puntos));
    }
}