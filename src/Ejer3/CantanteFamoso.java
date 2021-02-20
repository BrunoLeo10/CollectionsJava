
package Ejer3;

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
public class CantanteFamoso {

   private String nombre;
   private String discoConMasVentas;

    public CantanteFamoso() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }

    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }

    @Override
    public String toString() {
        return "El nombre del artista es: " + nombre + " y su disco con mas ventas es: " +  discoConMasVentas;
    }
   
   
}
