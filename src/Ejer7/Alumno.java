
package Ejer7;

import java.util.Comparator;

/*Se necesita implementar un sistema en el que se puedan cargar alumnos, para
esto tendremos una clase Alumno con el nombre y apellido, el número de legajo,
el sexo y la nota final. Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación:

En el main tendremos un bucle que crea un objeto Alumno pide al usuario todos sus
datos y los setea en Alumno, despues ese Alumno se guarda en el conjunto y se le
pregunta al usuario si quiere crear otro Alumno o no.
Despues haremos las siguientes acciones:
• Mostrar en pantalla todos los alumnos que se encuentren en la asignatura.
• Mostrar en pantalla los alumnos que se encuentren como condicional >7 y su
cantidad.
• Ordenar los alumnos de acuerdo a su nota (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar los alumnos de acuerdo a su nota (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar los alumnos por nombre y apellido y mostrarlo en pantalla
Nota: para los ordenamientos utilizar las facilidades provistas por la plataforma
Java.
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private Integer numLegajo;
    private String sexo;
    private Integer notaFinal;

    public Alumno(String nombre, String apellido, Integer numLegajo, String sexo, Integer notaFinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numLegajo = numLegajo;
        this.sexo = sexo;
        this.notaFinal = notaFinal;
    }

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNumLegajo() {
        return numLegajo;
    }

    public void setNumLegajo(Integer numLegajo) {
        this.numLegajo = numLegajo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
       

    public Integer getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Integer notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", numLegajo=" + numLegajo + ", sexo=" + sexo + ", notaFinal=" + notaFinal + '}';
    }
    
    //Metodo compara notas ascendente
    public static Comparator<Alumno> compararNotas = new Comparator<Alumno>(){
        @Override
        public int compare(Alumno a1, Alumno a2) {
            return a1.getNotaFinal().compareTo(a2.getNotaFinal());
        }
        
        
    };
    
    //Metodo compara notas descendente
    public static Comparator<Alumno> compararNotasDes = new Comparator<Alumno>(){
        @Override
        public int compare(Alumno a1, Alumno a2) {
            return a2.getNotaFinal().compareTo(a1.getNotaFinal());
        }
        
        
    };
    
    //metodo compara nombres
    public static Comparator<Alumno> comparaNombres = new Comparator<Alumno>(){
        
        @Override
        public int compare(Alumno a1, Alumno a2){
            return a1.getNombre().compareTo(a2.getNombre());
        }
    };
    
    //Metodo para comparar apellidos
    public static Comparator<Alumno> compararApellidos = new Comparator<Alumno>(){
    
        @Override
        public int compare(Alumno a1, Alumno a2){
            return a1.getApellido().compareTo(a2.getApellido());
        }
    };
}
