/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ExtraExtraEje07_POO;

import Entidad.Auto;
import Servicio.AutoServicio;
import java.util.Scanner;

/*Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.
 */
public class Extraextra07_Auto {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AutoServicio auser = new AutoServicio();
        Auto A = auser.cargarFicha();

        boolean op1 = true;
        int opcion;

        do {
            System.out.println("---------------------");
            System.out.println("Elija una opción:");
            System.out.println("1- Tranferencia");
            System.out.println("2- Agregar Kms");
            System.out.println("3- Análisis de Service");
            System.out.println("4- Salir del menú ");
         
            System.out.println("---------------------");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Desea cambiar la titularidad del Vehiculo?. Coloque S para si o N para no ");
                    String op = leer.next();
                    if ("S".equalsIgnoreCase(op)) {
                        System.out.println("Los datos originales del vehiculo son : ");
                        System.out.println(A.toString());
                        System.out.println("Coloque el nombre del nuevo dueño y el vencimiento del carnet");
                        auser.Transferencia(A);
                        System.out.println("El nuevo dueño es: ");
                        System.out.println(A.getNombreDueño());
                        System.out.println("El vencimiento de su carnet es :");
                        System.out.println(A.getFechaVencimiento());
                        System.out.println("---------------------");
                        System.out.println(A.toString());
                        break;
                    } else if ("N".equalsIgnoreCase(op)) {
                        break;
                    }
                case 2:
                    System.out.println(A.toString());
                    auser.AgregarKm(A);
                    System.out.println("El nuevo kilometraje es : ");
                    System.out.println(A.getKmMotor());
                    break;

                case 3:
                    auser.ServiceDe10000Km(A);
                    break;
                case 4:
                    System.out.println("Gracias por su actualización! :)");
                op1 = false;
                    break;
                default:
                    System.out.println("La opción es incorrecta");
                    
            }

        } while (op1);

    }

}

