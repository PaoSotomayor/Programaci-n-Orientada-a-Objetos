
import Objeto.Circunferencia;
import Servicio.CircunferenciaServicio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

 /*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real. A continuación, se deben crear los siguientes métodos: 
a) Método constructor que inicialice el radio pasado como parámetro. 
b) Métodos get y set para el atributo radio de la clase Circunferencia. 
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto. 
d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚=𝛑∗𝐫𝐚𝐝𝐢𝐨𝟐). 
e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨=𝟐∗𝛑∗𝐫𝐚𝐝𝐢𝐨).
 */
public class Ejercicio02POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircunferenciaServicio service = new CircunferenciaServicio();

        Circunferencia Circunferencia1 = service.crearCircunferencia();

        service.mostrarCircunferencia(Circunferencia1);
        service.mostrarPerimetro(Circunferencia1);
        service.mostrarArea(Circunferencia1);
    }

}
