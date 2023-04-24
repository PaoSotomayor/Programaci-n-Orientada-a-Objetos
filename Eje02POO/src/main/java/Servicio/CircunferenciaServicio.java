/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/*a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
 */
public class CircunferenciaServicio {

    Scanner leer = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {

        System.out.println("Ingrese el radio: ");
        Circunferencia c1 = new Circunferencia(leer.nextFloat());
        // o c1.setRadio(leer.nextFloat()); ambos codigos funcionan.
        return c1;
    }

    public Circunferencia mostrarArea(Circunferencia c1) {
        System.out.println("Ingrese el area de la circunferencia");
        float area = leer.nextFloat();
        //Math.pow (consigue la potencia de un numero), get para conseguir el valor del radio, 
        float total = area * (float) Math.pow(c1.getRadio(), 2);
        System.out.println("El area es " + total);

        return c1;
    }

    public Circunferencia mostrarPerimetro(Circunferencia c1) {
        System.out.println("El perímetro es: ");
        float totalp = 2 * (float) Math.PI * c1.getRadio();
        System.out.println(" " + totalp);

        return c1;
    }
}
