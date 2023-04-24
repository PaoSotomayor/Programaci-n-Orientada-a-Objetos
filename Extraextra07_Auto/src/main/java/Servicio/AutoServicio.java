/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Auto;
import java.util.Scanner;

/*Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.
 */
public class AutoServicio {
    
    Scanner leer = new Scanner(System.in);
    public Auto cargarFicha(){
        Auto A1 = new Auto();
          System.out.println("""
                                -           __
                              --          ~( @\\   \\
                             ---   _________]_[__/_>________
                                  /  ____ \\ <>     |  ____  \\
                                 =\\_/ __ \\_\\_______|_/ __ \\__D
                             ________(__)_____________(__)____""");
          System.out.println("----------------------------------------------------");
        System.out.println("* C A R G U E  S U  F I C H A  D E  U S U A R I O *");
          System.out.println("----------------------------------------------------");
        System.out.println("Ingrese nombre del dueño del vehículo");
        A1.setNombreDueño(leer.nextLine());
        System.out.println("Ingrese la fecha de vencimiento del carnet de conducir (día/mes/año)");
        A1.setFechaVencimiento(leer.nextLine());
        System.out.println("Ingrese el color del auto");
        A1.setColorAuto(leer.nextLine());
        System.out.println("Ingrese el modelo del auto");
        A1.setModelo(leer.nextLine());
        
        return A1;
    }
    public Auto Transferencia(Auto A1){
            A1.setNombreDueño(leer.nextLine());
            A1.setFechaVencimiento(leer.nextLine());
          return A1;  
        }
    public Auto AgregarKm(Auto A1){
        
        System.out.println("Ingrese los Km recorridos");
        int newKm = leer.nextInt();
        A1.setKmMotor( A1.getKmMotor() + newKm );
     return A1;   
    }
    public Auto ServiceDe10000Km(Auto A1){
        if (A1.getKmMotor() >= 10000 ) {
            System.out.println("Su auto supero los 10.000Km!!!!!!");
            System.out.println("Tiene que llevarlo al Servicio Tecnico");   
        }
     return A1;   
    }    
    }


