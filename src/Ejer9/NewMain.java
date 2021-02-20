package Ejer9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Almacena en un HashMap los códigos postales de 10 ciudades a elección de
esta página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la
letra, solo el numero.
*Madrid: 28008
*Los Angeles: 90209
*New York: 10470
*Rio de Janiero: 20750
*Roma: 00173
*Berlin: 12480
*Paris: 75000
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
usuario.
• Después editar el código postal que buscó el usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos
 */
public class NewMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");

        HashMap<Integer, String> codigoPostal = new HashMap();

        System.out.println("Ingrese 7 codigos postales y sus ciudades");
        for (int i = 0; i < 7; i++) {

            System.out.println("Codigo Postal");
            int codigo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ciudad:");
            String ciudad = scanner.nextLine();

            codigoPostal.put(codigo, ciudad);

        }
        System.out.println("======================");
        System.out.println("Datos Ingresados--->");
        for (Map.Entry<Integer, String> entry : codigoPostal.entrySet()) {
            System.out.println("Codigo Postal: " + entry.getKey() + "// Ciudad: " + entry.getValue());
        }

        String opcion = "";
        do {
            System.out.println("========================");
            System.out.println("Ingrese un codigo postal");
            int codigo = scanner.nextInt();

            for (Map.Entry<Integer, String> entry : codigoPostal.entrySet()) {
                if (entry.getKey().equals(codigo)) {
                    codigoPostal.remove(codigo);
                }
            }

            System.out.println("Desea Remover Otra Ciudad?");
        } while (opcion.equalsIgnoreCase("si"));

        for (Map.Entry<Integer, String> entry : codigoPostal.entrySet()) {
            System.out.println("Codigo Postal: " + entry.getKey()
                    + "// Ciudad: " + entry.getValue());
        }
    }

}
