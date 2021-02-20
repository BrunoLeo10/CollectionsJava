package Ejer6;

import java.util.HashSet;

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
public class Libro {

    private String titulo, autor;
    private Integer numEjemplares, numPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer numEjemplares, Integer numPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numPrestados = numPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(Integer numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public Integer getNumPrestados() {
        return numPrestados;
    }

    public void setNumPrestados(Integer numPrestados) {
        this.numPrestados = numPrestados;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo = " + titulo + ", autor = " + autor + ", numEjemplares = " + numEjemplares + ", numPrestados = " + numPrestados + '}';
    }

    //METODO PRESTAMOS: para pedir prestado un libro del conjunto
    //pedimos por parametros el conjunto y el titulo del libro para poder compararlo con el que pedimos nosotros
    public static boolean prestamo(HashSet<Libro> Libros, String titulo) {//lo hacemos static para no tener que crear un objeto al llamarlo
        
        boolean prestamo = false;//creamos una variable booleana para recibir el resultado de nuestro bloque en caso de que sea true
        
        for (Libro Libro : Libros) {//creamos un for each para que recorra cada uno de los elementos del conjunto
            
            //creamos una variable para que guarde cuantos libros hay en stock
            //esta proviene de restar el numero de ejemplares existentes con los ejemplares prestados
            int stock = Libro.numPrestados - Libro.numPrestados;
            
            //en el condicional if comparamos el atributo titulo con el parametro titulo para encontrar el libro que deseamos pedir prestado
            if (Libro.titulo.equals(titulo)) {
                //si el libro esta en stock(stock > 0) entonces realizamos el prestamo
                if (stock > 0) {
                    //entonces el numero de prestados se incrementa y el num en stock baja
                    Libro.numPrestados = Libro.numPrestados + 1;
                    stock--;
                    //devolvemos true si la condicion se cumple
                    prestamo = true;
                }
            }
        }
        //retornamos la variable booleana con nuestro resultado
        return prestamo;
    }

    //Metodo Devolucion
    public static boolean devolucion(HashSet<Libro> Libros, String titulo) {
        boolean devolucion = false;

        for (Libro Libro : Libros) {
            int stock = Libro.getNumEjemplares();

            if (Libro.titulo.equals(titulo)) {
                
                if (Libro.numPrestados > 0) {
                    
                    Libro.numPrestados = Libro.numPrestados - 1;
                    stock++;

                    devolucion = true;
                }
            }
        }

        return devolucion;
    }
}
