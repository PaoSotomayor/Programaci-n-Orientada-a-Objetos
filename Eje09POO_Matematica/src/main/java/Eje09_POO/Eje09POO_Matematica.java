/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Eje09_POO;

import Entidad.Matematica;
import Servicio.MatematicaServicio;

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
public class Eje09POO_Matematica {

    public static void main(String[] args) {
//         Cadena cadena = new Cadena();
//        CadenaServicio service = new CadenaServicio();
       Matematica matematica = new Matematica();
       MatematicaServicio mat = new MatematicaServicio();
       
       matematica.setNum1(Math.random()*10);
       matematica.setNum2(Math.random()*10);
       
      
        System.out.println("El número mayor es: "+ mat.devolverMayor(matematica));
        System.out.println("El número menor es: " + mat.devolverMenor(matematica));
        System.out.println("La Potencia es: " + mat.calcularPotencia(matematica));
        System.out.println("La Raíz cuadrada del número menor es: " + mat.calcularRaiz(matematica));
    }
}

//public class EjemploNumerosAleatorios {
//    public static void main(String[] args) {
//        Random rand = new Random();
//        int numeroPositivo1 = rand.nextInt(100);
//        int numeroPositivo2 = rand.nextInt(100);
//        int numeroNegativo = numeroPositivo1 - numeroPositivo2;
//        System.out.println("Número aleatorio negativo: " + numeroNegativo);
//    }
//}