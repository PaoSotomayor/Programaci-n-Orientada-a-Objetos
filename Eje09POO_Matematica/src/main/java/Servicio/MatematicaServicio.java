/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Matematica;

/*Realizar una clase llamada Matemática que tenga como atributos dos números reales con los cuales se 
realizarán diferentes operaciones matemáticas. La clase deber tener un constructor vacío, parametrizado y 
get y set. En el main se creará el objeto y se usará el Math.random para generar los dos números y 
se guardaran en el objeto con su respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número. 
Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular 
la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class MatematicaServicio {
        public double devolverMayor(Matematica mat){
            double num1 = mat.getNum1();
            double num2 = mat.getNum2();
            return Math.max(num1, num2);
        }
        
        public double devolverMenor (Matematica mat){
            return Math.min(mat.getNum1(), mat.getNum2());
        }
        
        public double calcularPotencia (Matematica mat){
          long max = Math.round(devolverMayor(mat));
          long min = Math.round(devolverMenor(mat));
            System.out.println("El número mayor redondeado es: "+ max);
            System.out.println("El número menor redondeado es: " + min);
            return Math.pow(max, min);
        }
        public double calcularRaiz (Matematica mat){
            return Math.sqrt(Math.abs(devolverMenor(mat)));
        }
}
