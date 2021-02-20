

package Ejer6;

import java.util.HashSet;
import java.util.Scanner;

/*Implemente un programa para una Librería haciendo uso de un HashSet para
evitar datos repetidos. Para ello, se debe crear una clase llamada Libro que
guarde la información de cada uno de los libros de una Biblioteca. La clase Libro
debe guardar el título del libro, autor, número de ejemplares del libro y número de
ejemplares prestados, también se creará una HashSet de tipo Libro que guardará
todos los libros creados.
En el main tendremos un bucle que crea un objeto Libro pide al usuario todos sus
datos y los setea en el Libro, despues ese Libro se guarda en el conjunto y se le
pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Método prestamo(HashSet<Libro> libros, String titulo): que recibe el conjunto
y el titulo del libro que quiere sacar el usuario, lo busca en el conjunto e
incrementa el atributo correspondiente cada vez que se realice un préstamo
del libro. No se podrán prestar libros de los que no queden ejemplares
disponibles para prestar. Devuelve true si se ha podido realizar la operación y
false en caso contrario.
• Método devolucion(HashSet<Libro> libros, String titulo): que recibe el libro
que quiere sacar el usuario, lo busca en el conjunto decrementa el atributo
correspondiente cuando se produzca la devolución de un libro. No se podrán
devolver libros que no se hayan prestado. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros.
 */
public class NewMain {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        HashSet<Libro> libreria = new HashSet();
        
        String respuesta = "";
        do {
            Libro libro1 = new Libro();
            System.out.println("Ingrese los datos del libro");
            
            System.out.println("Titulo:");
            String titulo = scanner.next();
            libro1.setTitulo(titulo);
            
            System.out.println("Autor:");
            String autor = scanner.next();
            libro1.setAutor(autor);
            
            System.out.println("Numero de Ejemplares");
            int numEjemplares = scanner.nextInt();
            libro1.setNumEjemplares(numEjemplares);
            
            System.out.println("Numero de Ejemplares prestados:");
            int numPrestados = scanner.nextInt();
            libro1.setNumPrestados(numPrestados);
            
            libreria.add(libro1);
            
            System.out.println("Desea guardar otro libro??");
            
            respuesta = scanner.next();
            
        } while (respuesta.equalsIgnoreCase("si"));
        
        for (Libro libro : libreria) {
            System.out.println(libro);
             
        }
        
        do {
            System.out.println("que libro desea pedir prestado??");
            String libroPedido = scanner.next();
            
            if (Libro.prestamo(libreria, libroPedido)) {
                System.out.println("Se ha realizado el prestamo");
                
                
            } else {
                System.out.println("No se encuentran ejemplares disponibles de este libro");
            }
            
            
            System.out.println("Desea pedir prestado otro libro??");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("si"));
        
        
        do {
            System.out.println("que libro desea devolver??");
            String libroDevuelto = scanner.next();
            
            if (Libro.devolucion(libreria, libroDevuelto)) {
                System.out.println("Se ha realizado la devolucion");
                
                
            } else {
                System.out.println("No tenemos datos que se haya prestado este libro");
            }
            
            
            System.out.println("Desea devolver otro libro??");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("si"));
        
        
        for (Libro libro : libreria) {
            System.out.println(libro);
        }
    }

}
