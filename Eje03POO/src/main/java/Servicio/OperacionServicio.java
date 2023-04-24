/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

public class OperacionServicio {

    Scanner leer = new Scanner(System.in);
    Operacion op = new Operacion();

    public Operacion crearOperacion() {
        System.out.println("Ingrese dos numeros: ");
        op.setNro1(leer.nextInt());
        op.setNro2(leer.nextInt());

        return op;
    }

    public int suma(Operacion op) {

        return (op.getNro1() + op.getNro2());
    }

    public int resta(Operacion op) {

        return (op.getNro1() - op.getNro2());
    }

    public int multiplicacion(Operacion op) {
        int multiplicacion = op.getNro1() * op.getNro2();
        if (multiplicacion == 0) {
            System.out.println("ERROR");
        }
        return multiplicacion;
    }

    public float division(Operacion op) {
        float division = 0;
        if (op.getNro2() == 0) {
            System.out.println("ERROR");

        } else {
            division = (float) op.getNro1() / op.getNro2();
        }
        return division;
    }
}
