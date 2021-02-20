

package Ejer3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*Crear una clase llamada CantanteFamoso, esta clase guardará cantantes
famosos y tendrá como atributos el nombre y discoConMasVentas, y los
métodos getters y setters.
Se debe además crear en el main un arrayList de tipo CantanteFamoso que
agregue manualmente 5 objetos de tipo CantanteFamoso a la la lista. Luego, se
debe mostrar los nombres de cada cantante y su disco con más ventas por
pantalla.
Además, se debe pedir al usuario un nombre y disco con más ventas de otro
cantante famoso, agregarlo a la lista y mostrar la lista actualizada. Una vez
mostrada la lista actualizada, se debe dar opción a elegir entre volver a introducir
los datos de otro cantante. eliminar un cantante o salir del programa. Se podrán
introducir tantos datos de cantantes como se desee.
 */
public class NewMain {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList <CantanteFamoso> cantantes = new ArrayList();
        
        String respuesta = "";
        String nombre;
        String disco;
        
        System.out.println("Agregue 5 cantantes famosos y su respectivo Disco Mas Vendido");
        do {
            CantanteFamoso cf1 = new CantanteFamoso();
            
            System.out.println("Ingrese el nombre del Cantante Famoso");
            nombre = sc.nextLine();
            
            System.out.println("Ingrese el nombre del Disco Mas Vendido");
            disco = sc.nextLine();
            
            cf1.setNombre(nombre);
            cf1.setDiscoConMasVentas(disco);
            
            cantantes.add(cf1);
            
            
        } while (cantantes.size()<5);
        
        for (CantanteFamoso cantante : cantantes) {
            
            System.out.println(cantante);
        }
        
        System.out.println("Agregue otro Cantante famoso y su respectivo Disco mas Famoso");
        nombre = sc.nextLine();
        disco = sc.nextLine();
        
        CantanteFamoso cf2 = new CantanteFamoso();
        cf2.setNombre(nombre);
        cf2.setDiscoConMasVentas(disco);
        
        cantantes.add(cf2);
        
        for (CantanteFamoso cantante : cantantes) {
            System.out.println(cantante);
        }
        
        
        int opcion;
        String eliminar;
        
        do {            
            System.out.println("Que desea hacer ??");
            System.out.println("1 - Agregar un cantante");
            System.out.println("2 - Quitar un cantante");
            System.out.println("3 - Salir");
            
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    CantanteFamoso c3 = new CantanteFamoso();
                    System.out.println("Ingrese Nombre");
                    nombre = sc.next();
                    c3.setNombre(nombre);
                    
                    System.out.println("Ingrese disco");
                    disco = sc.next();
                    c3.setDiscoConMasVentas(disco);
            
                    cantantes.add(c3);
                    
                    System.out.println(" ");
                    
                    for (CantanteFamoso cantante : cantantes) {
                        System.out.println(cantante);
                    }
                    break;
                case 2:
                    
                    System.out.println("Que cantante desea eliminar?");
                    eliminar = sc.next();
                    Iterator<CantanteFamoso> it = cantantes.iterator();
                    while (it.hasNext()){
                        if (it.next().getNombre().equals(eliminar)){
                            it.remove();
                            
                        }
                    }
                    
                    for (CantanteFamoso cantante : cantantes) {
                        System.out.println(cantante);
                    }

                    break;
                case 3 : 
                    System.out.println("Muchas gracias");
                    break;
                default:
                    System.out.println("Ha ingresado una opcion incorrecta");
                    break;
                }
            } while(opcion != 3 );
            

    }

}
