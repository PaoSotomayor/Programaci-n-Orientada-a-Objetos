/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Objeto.Pass;
import java.util.Scanner;

/*Métodos para desarrollar:
● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por teclado)
● Crear un método para ingresar una contraseña (crearPass). En este método, debemos validar que la longitud sea correcta. (10). 
En caso de ser correcto, almaceno la contraseña. Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO o Si ninguna condición se cumple es nivel BAJO
● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el acceso a modificar los datos.
● A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
 */
public class PassServicio {

    Scanner leer = new Scanner(System.in);
    Pass p1 = new Pass ("Pao",25123123);

    public Pass ingresarContr() {

        System.out.println("Ingrese la contraseña (10 dígitos): ");
        p1.setPass(leer.nextLine());
        if (10 == p1.getPass().length()) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Ingrese contraseña válida! (10 dígitos)");
        }
        return p1;
    }

    public void AnalizarPass(Pass p1) {

        int cont = 0, cont1 = 0;
        String Z = "z", A = "a";
        char Letra;
        for (int i = 0; i < p1.getPass().length(); i++) {
            Letra = p1.getPass().charAt(i);
            String passValue = String.valueOf(Letra);
            if (passValue.matches(Z)) {
                cont++; 
            }
            if (passValue.matches(A)) {
                cont1++;
            }
        }
        if (cont >= 1 && cont1 >= 2) {
            System.out.println("Su contraseña es de seguridad ALTA");
        } else if (cont >= 1 || cont1 >= 2) {
            System.out.println("su contraseña es de nivel MEDIO");
        } else {
            System.out.println("Su contraseña es insegura");
        }

    }

    public void CambioNombre(Pass P1, int cont) {   
            System.out.println("ingrese el nuevo nombre");
            P1.setNombre(leer.nextLine());
    }

    public int Validacion(Pass P1) {
        String contra;
        int cont = 0;
        do {
            System.out.println("Ingrese la contraseña");
            contra = leer.nextLine();
            cont++;
            System.out.println(cont);
        } while ((!contra.equals(P1.getPass())) &&  cont < 3);
        
        
        return cont;
    }

    public void CambioDNI(Pass P1, int cont) {
        System.out.println("ingrese el nuevo DNI");
        P1.setDni(leer.nextInt());
    }

    public void CambioContra(Pass p1) {
        System.out.println("ingrese la nueva contraseña");
        p1.setPass(leer.nextLine());
        if (10 == p1.getPass().length()) {
            System.out.println("Su contraseña sera guardada");
        } else {
            System.out.println("Ingrese de nuevo su contraseña con 10 digitos");
            p1.setPass(leer.nextLine());
        }
    }
}
