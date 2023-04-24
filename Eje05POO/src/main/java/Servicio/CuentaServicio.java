/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/*
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
public class CuentaServicio {
    Scanner leer = new Scanner(System.in);
    Cuenta c1 = new Cuenta();
    
    public Cuenta crearCuenta() {
  
        System.out.println("Ingresar el número de cuenta bancaria");
        c1.setCuentaBancaria(leer.nextInt());
        System.out.println("Ingresar el DNI asociado");
        c1.setDni(leer.nextLong());
        System.out.println("¿Con qué monto abrirás tu cuenta?");
        c1.setSaldoCuenta(leer.nextDouble());
        
        return c1;      
    }
    
    public void ingresar(Cuenta d){
               
        System.out.println("¿Qué monto va a depositar en la cuenta?");
        double ingreso = leer.nextDouble();
        d.setSaldoCuenta(d.getSaldoCuenta()+ingreso);                     
    }
    
    public void retirar(Cuenta e){              
        System.out.println("¿Qué monto va a retirar de la cuenta?");
        double retiro = leer.nextDouble();        
        e.setSaldoCuenta(e.getSaldoCuenta()-retiro);        
        
        if (e.getSaldoCuenta()<0) {
            e.setSaldoCuenta(0);
        }             
    }
    
    public void extraccionRapida(Cuenta f){
        System.out.println("¿Qué monto va a retirar de la cuenta?");
        double retiro = leer.nextDouble();
        
        if ((f.getSaldoCuenta()*0.2)<retiro) {
            System.out.println("Monto a retirar no permitido");
        } else{
            f.setSaldoCuenta(f.getSaldoCuenta()-retiro);            
        }      
    }
    
    public void consultarSaldo(Cuenta g){
        System.out.println("El saldo actual de su cuenta es: "+g.getSaldoCuenta() );
    }
    
    public void consultarDatos(Cuenta h){
        System.out.println("DATOS DE LA CUENTA");
        System.out.println("DNI del titular: " + h.getDni());
        System.out.println("Numero de cuenta: " + h.getCuentaBancaria());
    }
}
