/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/*
- Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y 
después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba 
que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
- Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de 
su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 
(incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. 
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona 
tiene sobrepeso, y la función devuelve un 1.
- Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los 
métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o 
está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas 
variables, para después en el main, calcular un porcentaje de esas 4 personas cuantas están 
por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos 
un porcentaje de cuantos son mayores de edad y cuantos menores
 */
public class PersonaServicio {
    

Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
       
        Persona per = new Persona();
        System.out.print("Introduce el nombre: ");

        per.setNombre(leer.next());

        System.out.print("Introduce la edad: ");
        per.setEdad(leer.nextInt());

        System.out.print("Introduce el sexo (H/M/O): ");

        per.setSexo(leer.next().charAt(0));
        while (per.getSexo() != 'H' && per.getSexo() != 'h' && per.getSexo() != 'M' && per.getSexo() != 'm' && per.getSexo() != 'O' && per.getSexo() != 'o' )  {
            System.out.print("Sexo incorrecto, introduce el sexo de nuevo (H/M/O): ");
            per.setSexo(leer.next().charAt(0));
        }

        System.out.print("Introduce el peso en kg: ");
        per.setPeso(leer.nextDouble());

        System.out.print("Introduce la altura en metros: ");
        per.setAltura(leer.nextDouble());

        return per;
    }

    public int calcularIMC(Persona per) {
        double imc = per.getPeso() / (per.getAltura() * per.getAltura());

        if (imc < 20) {
            return -1;  //Por debajo del peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0;   //Peso Ideal
        } else {
            return 1;   //Sobrepeso
        }
    }


    public boolean mayorDeEdad(Persona per) {
        return per.getEdad() >= 18;
    }
    public String toString(Persona per) {
          
        return "Persona{" + "nombre=" + per.getNombre()+ ", edad=" + per.getEdad() + ", sexo=" + per.getSexo() + ", peso=" + per.getPeso() + ", altura=" + per.getAltura() + '}';
    }
   
}