/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/*Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, 
color del vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.
 */
public class Auto {
    
    private String NombreDueño;
    private String FechaVencimiento;
    private String ColorAuto;
    private String Modelo;
     private int KmMotor = 7500;

    public Auto() {
    }

    public Auto(String NombreDueño, String FechaVencimiento, String ColorAuto, String Modelo, int KmMotor) {
        this.NombreDueño = NombreDueño;
        this.FechaVencimiento = FechaVencimiento;
        this.ColorAuto = ColorAuto;
        this.Modelo = Modelo;
        this.KmMotor = KmMotor = 7500;
    }

    public String getNombreDueño() {
        return NombreDueño;
    }

    public void setNombreDueño(String NombreDueño) {
        this.NombreDueño = NombreDueño;
    }

    public String getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(String FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }

    public String getColorAuto() {
        return ColorAuto;
    }

    public void setColorAuto(String ColorAuto) {
        this.ColorAuto = ColorAuto;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getKmMotor() {
        return KmMotor;
    }

    public void setKmMotor(int KmMotor) {
        this.KmMotor = KmMotor;
    }

    @Override
    public String toString() {
        return "DATOS DEL VEHICULO: [" + "Titular del Vehículo: " + NombreDueño + ", Fecha de Vencimiento del Carnet: " + FechaVencimiento + ", Color del Vehículo: " + ColorAuto + ", Modelo: " + Modelo + ", Km del Motor: " + KmMotor + ']';
    }
    
    
}
