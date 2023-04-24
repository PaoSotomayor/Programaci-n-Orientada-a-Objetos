/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ejercicio04_POO;

import Entidad.Rectangulo;
import Servicio.RectanguloServicio;

/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un 
atributo privado altura. La clase incluirá un método para crear el rectángulo con los datos del 
Rectángulo dados por el usuario. También incluirá un método para calcular la superficie del rectángulo y un 
método para calcular el perímetro del rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class Eje04POO {

    public static void main(String[] args) {

        RectanguloServicio Service = new RectanguloServicio();
        Rectangulo r1 = Service.crearRectangulo();

        System.out.println(Service.Superficie(r1));
        System.out.println(Service.Perimetro(r1));
        System.out.println(Service.Dibujo(r1));

    }
}
