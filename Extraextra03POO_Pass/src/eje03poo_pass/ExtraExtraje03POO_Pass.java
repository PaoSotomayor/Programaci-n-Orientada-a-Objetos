/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eje03poo_pass;

import Objeto.Pass;
import Servicio.PassServicio;
import java.util.Scanner;

/*Crear una clase Pass, donde declaremos los siguientes atributos:
● pass : Del tipo String
● nombre: Del tipo String
● dni: Del tipo int.

 */
public class ExtraExtraje03POO_Pass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        PassServicio PS = new PassServicio();
        Pass p = PS.ingresarContr();
        
        int op,val;
        do {
            System.out.println("Menu");
        
        System.out.println("1- Que nivel de seguridad tiene la contraseña"); //analizarpass
        System.out.println("2- Modificar contraseña");//validacion y Cambiodecontra
        System.out.println("3- Modificar Nombre");//validacion y cambionombre
        System.out.println("4- Modificar DNI");//validacion y cambioDNI
        System.out.println("5- Salir");
        op = leer.nextInt();
        switch (op) {
                case 1:
                PS.AnalizarPass(p);
                break;
                case 2:
                val = PS.Validacion(p);
                    if (val < 3) {
                        PS.CambioContra(p);
                    } else  System.out.println("Puede Fallar, Recuerde y vuelva");
                      
                    System.out.println(p.toString());
                break;
                case 3:
                val = PS.Validacion(p);
                if (val < 3) {
                    PS.CambioNombre(p, val);
                }
                    System.out.println("Su nombre se cambio con exito");
                    System.out.println(p.toString());
                break;
                case 4:
                    val = PS.Validacion(p);
                if (val < 3) {
                    PS.CambioDNI(p, val);
                }
                    System.out.println("Su DNI se guardo con exito");
                    System.out.println(p.toString());
                break;
                case 5:
                    System.out.println("Vuelva pronto");
                    break;
            default:
                System.out.println("Ingrese una opcion valida");;
        }
        } while (op != 5);
        }
    }