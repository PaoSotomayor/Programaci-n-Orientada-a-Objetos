/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Eje14_POO;

import Entidad.Movil;
import Servicio.MovilServicio;

/**
 *
 * @author user
 */
public class Eje14POO_Movilv2 {

    public static void main(String[] args) {
        MovilServicio ser = new MovilServicio();
        Movil M1 = new Movil();

        ser.cargarCelular();
        ser.ingresarCodigo();

        System.out.println(M1.toString());
    }
}
