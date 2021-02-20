package Ejer7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Se necesita implementar un sistema en el que se puedan cargar alumnos, para
 * esto tendremos una clase Alumno con el nombre y apellido, el número de
 * legajo, el sexo y la nota final. Implemente las clases y métodos necesarios
 * para esta situación, teniendo en cuenta lo que se pide a continuación:
 *
 * En el main tendremos un bucle que crea un objeto Alumno pide al usuario todos
 * sus datos y los setea en Alumno, despues ese Alumno se guarda en el conjunto
 * y se le pregunta al usuario si quiere crear otro Alumno o no. Despues haremos
 * las siguientes acciones: • Mostrar en pantalla todos los alumnos que se
 * encuentren en la asignatura. • Mostrar en pantalla los alumnos que se
 * encuentren como condicional >7 y su cantidad. • Ordenar los alumnos de
 * acuerdo a su nota (de mayor a menor) y mostrarlo en pantalla. • Ordenar los
 * alumnos de acuerdo a su nota (de menor a mayor) y mostrarlo en pantalla. •
 * Ordenar los alumnos por nombre y apellido y mostrarlo en pantalla Nota: para
 * los ordenamientos utilizar las facilidades provistas por la plataforma Java.
 */
public class NewMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\\n");
        HashSet<Alumno> conjuntoAlumno = new HashSet();
        String opcion = "";

        do {
            Alumno a1 = new Alumno();

            System.out.println("////////////////////////////");
            System.out.println("Ingrese los Datos del Alumno");
            System.out.println("////////////////////////////"); 
            System.out.println("Nombre:");
            String nombre = scan.next();
            a1.setNombre(nombre);
            
            System.out.println("Apellido");
            String apellido = scan.next();
            a1.setApellido(apellido);

            System.out.println("Numero de Legajo:");
            int numLegajo = scan.nextInt();
            a1.setNumLegajo(numLegajo);

            System.out.println("Sexo(M o F):");
            String sexo = scan.next();
            a1.setSexo(sexo);

            System.out.println("Nota Final:");
            int notaFinal = scan.nextInt();
            a1.setNotaFinal(notaFinal);

            conjuntoAlumno.add(a1);

            System.out.println("Desea Agregar otro alumno??");
            opcion = scan.next();
            
        } while (opcion.equalsIgnoreCase("si"));

        System.out.println("=======");
        System.out.println("Alumnos");
        
        
        conjuntoAlumno.forEach((alumno) -> {

            System.out.println(alumno);
            
        });
        System.out.println("===================================================");
        System.out.println("Estos son los alumnos que se encuentran condicional");
        int contador = 0;
        
        for (Alumno alumno : conjuntoAlumno) {
            if (alumno.getNotaFinal()<7) {
                System.out.println(alumno);
                contador++;
            }
            
        }
        System.out.println("============================================");
        System.out.println("el total de chicos que esta condicional es: " + contador);
        
        ArrayList<Alumno> lista = new ArrayList(conjuntoAlumno);
        
        Collections.sort(lista, Alumno.compararNotas);
        
        System.out.println("=====================================");
        System.out.println("Alumnos Ordenados por nota Ascendente");
        
        for (Alumno alumno : lista) {
            System.out.println(alumno);
        }
        
        Collections.sort(lista,Alumno.compararNotasDes );
        
        System.out.println("=====================================");
        System.out.println("Alumnos Ordenados por nota Descendente");
        
        for (Alumno alumno : lista) {
            System.out.println(alumno);
        }
        
        Collections.sort(lista, Alumno.comparaNombres);
        
        System.out.println("=====================================");
        System.out.println("Alumnos Ordenados por Nombre Asc");
        
        for (Alumno alumno : lista) {
            System.out.println(alumno);
        }
        
        Collections.sort(lista, Alumno.compararApellidos);
        
        System.out.println("=====================================");
        System.out.println("Alumnos Ordenados por Apellido Asc");
        
        for (Alumno alumno : lista) {
            System.out.println(alumno);
        }
    }
    
    
}
