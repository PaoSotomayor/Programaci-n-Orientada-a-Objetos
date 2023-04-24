/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/*Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF). Los atributos 
serán el número de DNI (entero largo) y la letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
- Métodos getters y setters para el número de DNI y la letra.
- Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. Una vez calculado, 
le asigna la letra que le corresponde según el resultado del calculo.
- Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que funciona de la siguiente manera: 
Para calcular la letra se toma el resto de dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22). 
El método debe buscar en un array (vector) de caracteres la posición que corresponda al resto de la división para obtener la 
letra correspondiente
 */
public class NIFServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public NIF crearNif() {

        NIF nif = new NIF();

        System.out.println("Ingrese el DNI");

        nif.setDNI(leer.nextInt());

        int NIF = (int) (nif.getDNI() % 23);

        String [] vector1 = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V","H", "L", "C", "K", "E"};
       
        nif.setLetra((vector1[NIF]));

        return nif;
    }

    public void mostrar(NIF nif) {
        System.out.println("Su DNI más el NIF es: ");

        System.out.println(nif.getDNI() + "-" + nif.getLetra());
    }

}