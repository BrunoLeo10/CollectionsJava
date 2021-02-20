package Ejer8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/*Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas que realizaremos en el main,
como introducir un elemento, modificar su precio, eliminar un producto y mostrar
los productos que tenemos con su precio (Utilizar Hashmap). El HashMap tendrá
de llave el nombre del producto y de valor el precio.
 */
public class NewMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> conjuntoAlmacen = new HashMap();

        String opcion = "";

        do {
            Tienda t1 = new Tienda();

            System.out.println("Ingrese el nombre del producto");
            String nombre = scanner.next();
            t1.setProducto(nombre);

            System.out.println("Ingrese el precio del producto");
            int precio = scanner.nextInt();
            t1.setPrecio(precio);

            conjuntoAlmacen.put(nombre, precio);

            System.out.println("Desea Ingresar otro producto");
            opcion = scanner.next();

        } while (opcion.equalsIgnoreCase("si"));

        System.out.println("=================");
        System.out.println("Productos Ingresados");
        for (Map.Entry<String, Integer> entry : conjuntoAlmacen.entrySet()) {
            System.out.println("Nombre del producto: " + entry.getKey() + "// Precio del Producto: " + entry.getValue());
        }

        do {
            System.out.println("Desea Eliminar un producto??");
            opcion = scanner.next();
            if (opcion.equalsIgnoreCase("no")) {
                break;
            } else {
                System.out.println("Cual producto desea eliminar??");
                String borrado = scanner.next();

                for (Map.Entry<String, Integer> entry : conjuntoAlmacen.entrySet()) {
                    if (entry.getKey().equals(borrado)) {
                        conjuntoAlmacen.remove(borrado);
                    }
                }
            }
        } while (opcion.equalsIgnoreCase("si"));

        for (Map.Entry<String, Integer> entry : conjuntoAlmacen.entrySet()) {
            System.out.println("Nombre del producto: " + entry.getKey() + "// Precio del Producto: " + entry.getValue());
        }
    }

}
