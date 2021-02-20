

package Ejer4;

import java.util.Collections;

/*Crear una clase llamada Palabra que mantenga información sobre diferentes
palabras con un atributo lista de tipo String, que se le van a ir agregando palabras
por medio del método add(String). Al final, el programa debe permitirnos conocer
el conjunto de palabras guardadas en la lista, ingresadas por el usuario. Este
conjunto deberá estar ordenado alfabéticamente. Crear una aplicación que
muestre toda la información que disponga la clase Palabra.
NOTA: Si necesitas saber más sobre ordenamiento en java consulta los siguientes
links. Algoritmos de ordenamiento. / Implementar Comparator
 */
public class NewMain {

    
    public static void main(String[] args) {
        
        Palabra lista = new Palabra();   //creamos el objeto

        lista.llenarLista();
        lista.mostrarLista();
        Collections.sort(lista.getPalabras());
        System.out.println("LISTA ORDENADA:");
         System.out.println("===============================");
        lista.mostrarLista();
        
    }

}
