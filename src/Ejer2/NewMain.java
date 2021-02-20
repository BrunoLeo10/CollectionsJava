

package Ejer2;

import java.util.HashSet;
import java.util.Scanner;

/*Diseñar un programa que lea una serie de valores numéricos enteros desde el
teclado y los guarde en un ArrayList de tipo Integer. La lectura de números termina
cuando se introduzca el valor -99. Este valor no se guarda en el ArrayList. A
continuación, el programa mostrará por pantalla el número de valores que se han
leído, su suma y su media (promedio). Por último, se mostrarán todos los valores
leídos, indicando cuántos de ellos son mayores que la media.
 */
public class NewMain {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> conjuntoNumeros = new HashSet();
        
        int suma = 0;
        int num;
        do {
            System.out.println("///////////////");
            System.out.println("Ingrese numeros");
            
            num = scanner.nextInt();
            
            if (num != -99) {
                conjuntoNumeros.add(num);
                
                suma = suma + num;
            }
            
            
            
        } while (num!=(-99));
        
        System.out.println("//////////////");
        System.out.println("Valores Leidos");
        
        
        for (Integer conjuntoNumero : conjuntoNumeros) {
            System.out.println(conjuntoNumero);
        }
        
        System.out.println("////////////");
        System.out.println("Suma");
        
        System.out.println(suma);
        
        int promedio = suma / conjuntoNumeros.size();
        
        System.out.println("////////////");
        System.out.println("Promedio");
        
        System.out.println(promedio);
        
        System.out.println("//////////////////");
        System.out.println("Valores superiores al promedio");
       
        for (Integer conjuntoNumero : conjuntoNumeros) {
            if (conjuntoNumero>promedio) {
                System.out.println(conjuntoNumero);
            }
            
        }
        
    }

}
