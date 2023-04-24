/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) y su longitud. 
En el main se creará el objeto y se le pedirá al usuario que ingrese una frase que puede ser una palabra o 
varias palabras separadas por un espacio en blanco y a través de los métodos set, se guardará la frase y 
la longitud de manera automática según la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: 
Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar 
cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la 
clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase 
ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y 
devuelve verdadero si la contiene y falso si no
 */
public class CadenaServicio {

        public void mostrarVocales(Cadena cadena) {

            int contador = 0;
            String frase = cadena.getFrase();

            for (int i = 0; i < frase.length(); i++) {
                char c = Character.toLowerCase(frase.charAt(i));
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    contador++;
                }
            }
            System.out.println("La frase tiene " + contador + " vocales.");
        }

        public void invertirFrase(Cadena cadena) {
            String frase = cadena.getFrase();
            StringBuilder sb = new StringBuilder(frase);  //Nueva Clase java
            sb.reverse();

            System.out.println("La frase invertida es: " + sb.toString());
        }

        public void vecesRepetido(Cadena cadena, String letra) {
            char c = letra.charAt(0);
            String frase = cadena.getFrase();
            int contador = 0;
            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == c) {
                    contador++;
                }
            }
            System.out.println("El carácter '" + letra + "' se repite " + contador + " veces.");
        }

        public void compararLongitud(Cadena cadena, String frase) {

            int longitud = cadena.getLongitud();
            int longitudFrase = frase.length();
            if (longitud == longitudFrase) {
                System.out.println("Las frases tienen la misma longitud.");
            } else if (longitud > longitudFrase) {
                System.out.println("La frase contenida en la clase es más larga.");
            } else {
                System.out.println("La frase ingresada por el usuario es más larga.");
            }
        }

        public void unirFrases(Cadena cadena, String frase) {
            String frasec = cadena.getFrase();
            System.out.println("La frase resultante es: " + frasec + " " + frase);
        }

        public void reemplazar(Cadena cadena) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese letra a reemplazar");
            String letra = leer.next();

            char c = letra.charAt(0);
            String frase = cadena.getFrase();
            String nuevaFrase = frase.replace('a', c);
            System.out.println("La frase resultante es: " + nuevaFrase);
        }

        public boolean contiene(Cadena cadena, String letra) {
            boolean a;
            String frase = cadena.getFrase();

            return frase.contains(letra);
        }
    }
    

