/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/*Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para organizar la 
información de cada curso. Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán: nombreCurso, 
cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un arreglo de 
tipo String de dimensión 5 (cinco), donde se alojarán los nombres de cada alumno. A continuación, se implementarán los
siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. 
Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando en cada 
repetición que se ingrese el nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus 
respectivos atributos para llenar el objeto Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor al 
atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. Para ello, 
se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a 
la semana que se repite el encuentro
 */
public class CursoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Curso curso1 = new Curso();

    public String[] cargarAlumnos(Curso curso1) {
        String[] alumno = new String[curso1.getAlumnos().length];
        for (int i = 0; i < alumno.length; i++) {
            System.out.println("Ingrese el nombre del alumno");
            alumno[i] = leer.next();

        }
        return alumno;
    }
    public Curso crearCurso(){
        System.out.println("Ingrese el nombre del curso");
        curso1.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas al día");
        curso1.setCantidadHoras(leer.nextInt());
        System.out.println("Ingrese la cantidad de días a la semana");
        curso1.setCantidadDias(leer.nextInt());
        System.out.println("Ingrese el turno (Mañana o Tarde");
        curso1.setTurno(leer.next());
        System.out.println("Ingrese el precio por hora");
        curso1.setPrecioHora(leer.nextInt());
        return curso1;
    }
    public int calcularGanancia(){
        int horas = curso1.getCantidadHoras()*curso1.getPrecioHora();
       // int precio = curso1.getPrecioHora();
        int alumnos = 5*horas;
        //int semana = alumnos * curso1.getCantidadDias();
        int ganancia = alumnos*curso1.getCantidadDias();
        System.out.println("La ganancia del profesor en una semana es: "+ganancia);
        return ganancia;
}

}
