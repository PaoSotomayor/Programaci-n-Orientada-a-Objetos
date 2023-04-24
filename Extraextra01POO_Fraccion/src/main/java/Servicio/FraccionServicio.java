/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Fraccion;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class FraccionServicio {

    Scanner leer = new Scanner(System.in);
    Fraccion Fr = new Fraccion();
    
    int d1 = Fr.getDenominador1();
    int d2 = Fr.getDenominador2();
    int n1 = Fr.getNumerador1();
    int n2 = Fr.getNumerador2();

    public Fraccion IngresoDatos() {

        System.out.println("Ingrese numerador y denominador de la primera fracción");
        n1 = (leer.nextInt());
        d1 = (leer.nextInt());
        System.out.println("Ingrese numerador y denominador de la segunda fracción");
        n2 = (leer.nextInt());
        d2 = (leer.nextInt());
        return Fr;
    }

    public void suma(Fraccion Fr) {
        // num1/den3 + num4/den3
        if (d1 == d2) {
            int suma = n1 + n2;
            System.out.println(suma + "/" + d1);

        } else {
            // num1/den3 + num4/den4 
            // num1*den4 + num4*den3 / den3*den4
            int suma1 = n1 * d2 + n2 * d1;
            int sumad = n1 * d2;
            System.out.println(suma1 + "/" + sumad);
        }
    }

    public void Resta() {
        if (d1 == d2) {
            int resta = n1 - n2;
            System.out.println(resta + "/" + d1);
        } else {
            int resta1 = n1 * d2 - n2 * n1;
            int restad = d1 * d2;
            System.out.println(resta1 + "/" + restad);
        }
    }

    public void Multiplicacion() {
        if (d1 == d2){
            int mult = n1 * n2;
            int mult1 = d1 * d2;
            System.out.println(mult + "/" + mult1);
        } else {
            int mult2 = n1 * d2;
            int mult3 = n2 * d1;
            System.out.println(mult2 + "/" + mult3);
        }

    }

    public void Division() {
        int div1 = n1 * d2;
        int div2 = n2 * d1;
        System.out.println(div1 + "/" + div2);
    }
}
