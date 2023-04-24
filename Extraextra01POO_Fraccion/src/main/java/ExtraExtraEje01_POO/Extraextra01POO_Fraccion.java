/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ExtraExtraEje01_POO;

import Entidad.Fraccion;
import Servicio.FraccionServicio;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Extraextra01POO_Fraccion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        FraccionServicio Fs = new FraccionServicio();
        Fraccion f = Fs.IngresoDatos();
        boolean op1 = true;

        do {
            int op;
            System.out.println("--------");
            System.out.println("MENU");
            System.out.println("--------");
            System.out.println("1 - Suma");
            System.out.println("2 - Resta");
            System.out.println("3 - Multiplicación");
            System.out.println("4 - División");
            System.out.println("Salir del Menú");

            op = leer.nextInt();

            switch (op) {
                case 1:
                    Fs.suma(f);
                    break;
                case 2:
                    Fs.Resta();
                    break;
                case 3:
                    Fs.Multiplicacion();
                    break;
                case 4:
                    Fs.Division();
                    break;
                case 5:
                    op1 = false;
                default:
                    System.out.println("ERROR! Ingrese una oopción válida");
            }
        } while (op1);
    }
}
