/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Eje11_POOv2;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Eje11_Datev2 {
    
     public static void main(String[] args) {
     
    Scanner leer = new Scanner(System.in);
    int dia, mes, anio;
        
        System.out.println("Ingrese un día: ");
        dia = leer.nextInt();
        System.out.println("Ingrese un mes: ");
        mes = leer.nextInt();
        System.out.println("Ingrese un año: ");
        anio = leer.nextInt();
        
        Date fecha = new Date(anio-1900, mes-1, dia);
        Date fechaActual = new Date();
        
        System.out.println("La fecha ingresada es: " + fecha.toString());
        System.out.println("Hay " + (fechaActual.getYear()-fecha.getYear()) + " años de diferencia.");
        System.out.println("La fecha actual es: " + fechaActual.toString());
    }
}
