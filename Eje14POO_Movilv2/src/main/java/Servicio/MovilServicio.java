/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MovilServicio {
    Scanner leer = new Scanner(System.in);
    Movil M1 = new Movil();
    
    public Movil cargarCelular(){
        
        System.out.println("- Tienda de Celulares -");
        System.out.println(". Marca del calular: ");
        M1.setMarca(leer.next());
        
        System.out.println(". Ingrese el precio: ");
        M1.setPrecio(leer.nextInt());
        
        System.out.println(". Modelo: ");
        M1.setModelo(leer.next());
        
        System.out.println(". Cantidad de Memoria RAM: ");
        M1.setMemoriaRam(leer.nextInt());
        
        System.out.println(". Cantidad de Almacenamiento: ");
        M1.setAlmacenaiento(leer.nextInt());
        
        
        return M1;
    }
    
    public void ingresarCodigo(){
        
        int aux [] = new int [7];
        
        System.out.println("Ingrese cógido del celular");
        
        for (int i = 0; i < 7; i++) {
            
            aux[i] = leer.nextInt();
            
        }
        
        for (int i = 0; i < 7; i++) {
            System.out.print("[" + aux[i] + "]  ");
        }
        
        System.out.println("");
        
        M1.setCodigo(aux);
        
    }
    
    
}
    

