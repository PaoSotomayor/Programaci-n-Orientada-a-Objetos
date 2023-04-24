/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ExtraEje04_POO;

import Entidad.NIF;
import Servicio.NIFServicio;

/**
 *
 * @author user
 */
public class Eje04extraPOO_NIF {

    public static void main(String[] args) {
        NIFServicio nf = new  NIFServicio ();

        NIF nif = nf.crearNif();

        nf.mostrar(nif);

    }
}