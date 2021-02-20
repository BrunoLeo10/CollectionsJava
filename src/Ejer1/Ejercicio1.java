

package Ejer1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*Diseñar un programa que lea y guarde títulos de libros en una ArrayList de tipo
String. El programa pedirá el titulo de un libro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar titulo de otro
libro o si quiere salir. Si decide salir, se mostrará todos los libros guardados en el
ArrayList.
Después al usuario se le pedirá un libro y se recorrerá la lista con un Iterator, se
buscará el libro en la lista y si está en la lista se eliminará el libro que ingresó el
usuario y se mostrará la lista, si el libro no se encuentra en la lista se le informará
al usuario.
 */
public class Ejercicio1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList <String> libros = new ArrayList();
        
        String nombre;
        String respuesta="";
        
        do {
            System.out.println("ingrese el nombre del libro");
            
            nombre = sc.nextLine();
            
            libros.add(nombre);
            
            System.out.println("Desea ingresar otro libro");
            
            respuesta = sc.nextLine();
            
        } while (respuesta.equalsIgnoreCase("si"));
        
        
        for (String libro : libros) {
            System.out.println(libro);
        }
        
        System.out.println("que libro desea buscar");
        System.out.println("----libro");
        String buscaLibro = sc.nextLine();
        
        Iterator<String> it = libros.iterator();
        
        int contador = 0;
        while (it.hasNext()) {
            if (it.next().equals(buscaLibro)) {
                it.remove();
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("el libro no se ha encontrado");
        }
        if (contador > 1) {
            System.out.println("Lista Modificada");
        
        for (String libro : libros) {
            System.out.println(libro);
        }
        }
        
        
    }

}
