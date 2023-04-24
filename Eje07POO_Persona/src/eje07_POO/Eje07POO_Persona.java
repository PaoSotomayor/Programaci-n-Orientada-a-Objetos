/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Eje07_POO;

import Entidad.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;

/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo 
('H' hombre, 'M' mujer, 'O' otro), peso y altura. 
Si el alumno desea añadir algún otro atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y 
después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba 
que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de 
su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 
(incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. 
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona 
tiene sobrepeso, y la función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los 
métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o 
está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas 
variables, para después en el main, calcular un porcentaje de esas 4 personas cuantas están 
por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos 
un porcentaje de cuantos son mayores de edad y cuantos menores
 */
public class Eje07POO_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        PersonaServicio service= new PersonaServicio();
        System.out.println("Primera persona    ");
         Persona persona1 = service.crearPersona();
         System.out.println("Segunda persona    ");
        Persona persona2 = service.crearPersona();
        System.out.println("Tercera persona    ");
        Persona persona3 = service.crearPersona();
        System.out.println("Cuarta persona    ");
      Persona persona4 = service.crearPersona();
        
        int peso1= service.calcularIMC(persona1);
        int peso2= service.calcularIMC(persona2);
        int peso3= service.calcularIMC(persona3);
        int peso4= service.calcularIMC(persona4);
         
        
    
         
           double pesoideal=0,pesomayor=0,pesomenor=0;
          

        switch (peso1) {
            case 0:
                pesoideal++;
                
             break;
            case 1:
                pesomayor++;
              break;
            case -1:
                pesomenor++;
                break;
        }
        switch (peso2) {

            case 0:
                pesoideal++;
                       
                break;
            case 1:
                pesomayor++;
                break;
            case -1:
                pesomenor++;
                break;
        }
        switch (peso3) {

            case 0:
                pesoideal++;
                break;
            case 1:
                pesomayor++;
                break;
            case -1:
                pesomenor++;
                break;
        }
        switch (peso4) {

            case 0:
                pesoideal++;
                break;
            case 1:
                pesomayor++;
                break;
            case -1:
                pesomenor++;
                break;
        }
        
        double mayor=0 , menor=0;
        if(persona1.getEdad()>18){
            
        mayor++;
        }
        else menor++;
       
        if(persona2.getEdad()>18){
            
        mayor++;
        }
        else menor++;
      
        if(persona3.getEdad()>18){
            
        mayor++;
        }
        else menor++;

        if(persona4.getEdad()>18){
            
        mayor++;
        }
        else menor++;
        
        
        
        double fpesoideal=((pesoideal*100)/4);
        double fpesomayor=((pesomayor*100)/4);
         double fpesomenor=((pesomenor*100)/4);
         double emayor=((mayor*100)/4);
         double emenor=((menor*100)/4);
         
         System.out.println(" --------------------------------  ");
        
         System.out.println("Pocentaje peso ideal: "+fpesoideal+"%");
         System.out.println("Pocentaje peso mayor: "+fpesomayor+"%");
         System.out.println("Pocentaje peso menor: "+fpesomenor+"%");
         
         System.out.println(" Porcentaje de personas mayores: "+emayor+"%");
         System.out.println(" Porcentaje de personas menores: "+emenor+"%");
         
    }
              
        }

  