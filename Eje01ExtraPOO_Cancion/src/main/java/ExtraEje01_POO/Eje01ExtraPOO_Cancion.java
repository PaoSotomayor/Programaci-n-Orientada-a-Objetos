/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ExtraEje01_POO;

import Entidad.Cancion;
import Servicio.CancionServicio;

/*Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́ definir además dos constructores: 
uno vacío que inicializa el titulo y el autor a cadenas vacías y otro que reciba como parámetros 
el titulo y el autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.
 */
public class Eje01ExtraPOO_Cancion {

    public static void main(String[] args) {

        CancionServicio cs = new CancionServicio();
        Cancion cancion = cs.Titulo();

        System.out.println(cancion);
    }
}
