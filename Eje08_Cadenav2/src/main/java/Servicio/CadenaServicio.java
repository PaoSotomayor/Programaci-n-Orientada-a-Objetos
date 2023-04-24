/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/*
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
h) Método contiene(String letra), deberá comprobar 
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in);
    Cadena f1 = new Cadena();

    public Cadena Ingresarfrase() {
        System.out.println("Ingrese una frase");
        f1.setCadena(leer.nextLine());
        f1.setLongitud(f1.getCadena().length());
        System.out.println("La cantidad de caracteres mas espacios es: ");
        System.out.println(f1.getLongitud());
        return f1;
    }

    public void Contarvocales(Cadena f1) {
        int a = 0;
        for (int i = 0; i < f1.getLongitud(); i++) {
            if ("a".equals(f1.getCadena().substring(i, i + 1)) || ("e".equals(f1.getCadena().substring(i, i + 1))) || ("i".equals(f1.getCadena().substring(i, i + 1)))
                    || ("o".equals(f1.getCadena().substring(i, i + 1))) || ("u".equals(f1.getCadena().substring(i, i + 1)))) {
                a++;
            }
        }
        System.out.println("El número de vocales es: " + a);
    }

    public void Invertirfrase(Cadena f1) {
        String invertida = "";
        for (int i = f1.getLongitud() - 1; i >= 0; i--) {
            invertida += f1.getCadena().substring(i, i + 1);
        }
        System.out.println("La frase invertida es: " + invertida);
    }

    public void vecesRepetido(Cadena f1) {
        int contador = 0;
        String letra;
        System.out.println("Ingrese una letra y detectaremos cuántas veces se repite");
        letra = leer.nextLine();
        for (int i = 0; i < f1.getLongitud(); i++) {
            if (letra.equals(f1.getCadena().substring(i, i + 1))) {
                contador++;
            }
        }
        System.out.println("La letra " + letra + " se repite " + contador + " veces");
    }

    public void compararFrase(Cadena f1) {
        System.out.println("Ingrese una segunda frase");
        String frase2 = leer.nextLine();
        if (f1.getLongitud() == frase2.length()) {
            System.out.println("Las frases ingresadas tienen la misma longitud");
        } else {
            System.out.println("Las frases ingresadas no tienen la misma longitud");
        }
        System.out.println(unirFrase(f1, frase2));
    }

    public String unirFrase(Cadena f1, String frase2) {
        System.out.println("Las dos frases juntas son: ");
        return f1.getCadena() + " " + frase2;
    }

    public String reemplazar(Cadena f1) {
        System.out.println("Ingrese un caracter para reemplazar la letra A de la primera frase");
        String letra2 = leer.nextLine();
        String cambio = f1.getCadena().replace("a", letra2);
        System.out.println("La nueva frase es: " + cambio);
        return cambio;
    }

    public void contieneLetra(Cadena f1) {
        Scanner lire = new Scanner(System.in);
        boolean a = false;
        String letra;
        System.out.println("Ingrese una letra para ver si existe en la frase");
        letra = lire.nextLine();
        for (int i = 0; i < f1.getLongitud(); i++) {
            if (letra.equals(f1.getCadena().substring(i, i + 1))) {
                a = true;
            }
        }
        System.out.println("¿Se encuentra el caracter " + letra + " en la frase? " + a);
    }
}
