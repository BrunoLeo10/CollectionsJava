

package Ejer5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*Se requiere un programa que lea y guardara Países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
pais que ingresó el usuario y se mostrará el conjunto, si el país no se encuentra
en el conjunto se le informará al usuario.
 */
public class NewMain {

    
    public static void main(String[] args) {
        
        HashSet<String> paises = new HashSet();//creo un conjunto hash
        
        Scanner sc = new Scanner(System.in);
        String nombrePais, op;
        
        do {
            System.out.println("Ingrese un pais");
            nombrePais = sc.nextLine();
            
            paises.add(nombrePais);
            
            System.out.println("Desea ingresar otro pais? SI/NO ");
            op = sc.nextLine();
            
        } while (op.equalsIgnoreCase("Si"));
        
        //recorremos el conjunto con un 'for each'
        for (String pais : paises) {
            System.out.println(pais);
            
        }
        //creamos un arraylist para poder usar el metodo sort de la clase collection y asi poder ordenar el conjunto
        ArrayList<String> lista = new ArrayList(paises);
        Collections.sort(lista);
        
        System.out.println("/////////////////////////////////");
        System.out.println("CONJUNTO ORDENADO ALFABETICAMENTE");
        System.out.println("/////////////////////////////////");
        
        for (String string : lista) {
            System.out.println(string);
        }
        
        
        System.out.println("\nIngrese el pais a borrar");
        String borrado = sc.nextLine();
        
        //Creamos un iterator para iterar la lista y poder borrar el valor que deseamos eliminar del conjunto
        Iterator<String> it = paises.iterator();
        
        int contador = 0; //creamnos un contador que se ira sumando si se elimina un objeto
        
        while(it.hasNext()) { //creamos un bucle para iterar los elementos existentes
            if (it.next().equals(borrado)) { //para cada elemento buscaremos que coincida con el string que ingresamos en la variable
                it.remove(); //si coincide borraremos el elemento
                contador++;
            }
        }
        
        if (contador == 0) { //si al finalizar el bucle el contador sigue en 0 significa que ningun elemento se ha eliminado
            System.out.println("El pais ingresado no se ha encontrado");
        } else {//si el contador es diferente de cero significa que borro un elemento
            System.out.println("\nLista Final");
            System.out.println(" ");
            
            for (String pais : paises) { //por ende mostraremos la lista sin el elemento que hemos borrado
                System.out.println(pais);
            }
        }
        
        
    }

}
