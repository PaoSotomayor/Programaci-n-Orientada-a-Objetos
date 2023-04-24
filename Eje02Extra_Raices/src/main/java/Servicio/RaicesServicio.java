/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/*
- Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante 
debe ser mayor o igual que 0.
- Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante 
debe ser igual que 0.
- Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
- Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una 
única solución posible.
- Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones 
que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en 
caso de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
*/

public class RaicesServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public double getDiscriminante(Raices raiz) {
        
        double a = raiz.getA();
        double b = raiz.getB();
        double c = raiz.getC();
        double discriminante = Math.pow(b, 2) - 4 * a * c;        
        
        return discriminante;
    }

    public boolean tieneRaices(Raices raiz) {
        double tieneraices = getDiscriminante(raiz);
        return tieneraices >0;
    }

    public boolean tieneRaiz(Raices raiz) {
        double tieneraiz = getDiscriminante(raiz);
        return tieneraiz == 0;
    }

    public void obtenerRaices(Raices raiz) {
        boolean solucion = tieneRaices(raiz);
        double a = raiz.getA();
        double b = raiz.getB();
        double c = raiz.getC();

        double s1 = (-(b) + Math.sqrt(((Math.pow(b, 2) - 4 * a * c)))) / 2 * a;
        double s2 = (-(b) - Math.sqrt(((Math.pow(b, 2) - 4 * a * c)))) / 2 * a;
        if (solucion == true) {

            System.out.println("solucion 1 " + s1);
            System.out.println("solucion 2 " + s2);

        }
    }

    public void obtenerRaiz(Raices raiz) {
        boolean solucion = tieneRaiz(raiz);
        double a = raiz.getA();
        double b = raiz.getB();
        double c = raiz.getC();

        double s1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        if (solucion == true) {

            System.out.println("La unica Solucion  ");
            System.out.println(s1);

        }
    }

    public void calcular(Raices raiz) {

        boolean tieneraices = tieneRaices(raiz);

        boolean tieneraiz = tieneRaiz(raiz);

        if (tieneraices == true) {
            obtenerRaices(raiz);

        } else if (tieneraiz == true) {
            obtenerRaiz(raiz);
        } else {
            System.out.println("Ninguna tiene solucion");
        }
    }
}
