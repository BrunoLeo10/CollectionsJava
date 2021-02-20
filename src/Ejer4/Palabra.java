
package Ejer4;

import java.util.ArrayList;
import java.util.Scanner;

/*Crear una clase llamada Palabra que mantenga información sobre diferentes
palabras con un atributo lista de tipo String, que se le van a ir agregando palabras
por medio del método add(String). Al final, el programa debe permitirnos conocer
el conjunto de palabras guardadas en la lista, ingresadas por el usuario. Este
conjunto deberá estar ordenado alfabéticamente. Crear una aplicación que
muestre toda la información que disponga la clase Palabra.
NOTA: Si necesitas saber más sobre ordenamiento en java consulta los siguientes
links. Algoritmos de ordenamiento. / Implementar Comparator
 */
public class Palabra {
    private ArrayList<String> palabras = new ArrayList();

    public Palabra() {
    }

    public ArrayList<String> getPalabras() {
        return palabras;
    }

    public void setPalabras(ArrayList<String> palabras) {
        this.palabras = palabras;
    }
    
    public void llenarLista(){
        Scanner sc = new Scanner(System.in);
        String palabra, op;
        
        do {
            System.out.println("Ingrese una palabra");
            palabra = sc.nextLine();
            
            palabras.add(palabra);
            
            System.out.println("Desea ingresar otra palabra? SI/NO ");
            op = sc.nextLine();
            
        } while (op.equalsIgnoreCase("Si"));
    }
    
    public void mostrarLista() {

        for (String palabra : palabras) {
            System.out.println(palabra);

        }
        System.out.println("");

    }
    
}
