/**
 * Clase que implementa funcionalidades de un experto en inglés.
 * Permite enseñar léxico, gramática y fonética.
 * 
 * @author Jonathan Paredes
 * @Github Jonathan4325
 * @version 2.43
 */
public class PJExpertoIngles implements PJIEnseniar {

    private String nombre;
    private int edad;

    /**
     * Constructor de la clase PJExpertoIngles.
     * @param nombre El nombre del experto en inglés.
     * @param edad La edad del experto en inglés.
     */
    public PJExpertoIngles(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Método para obtener el nombre del experto en inglés.
     * @return El nombre del experto en inglés.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del experto en inglés.
     * @param nombre El nuevo nombre del experto en inglés.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la edad del experto en inglés.
     * @return La edad del experto en inglés.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método para establecer la edad del experto en inglés.
     * @param edad La nueva edad del experto en inglés.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void pjLexico() {
        System.out.println("Enseñando léxico...");
    }

    @Override
    public void pjGramatica() {
        System.out.println("Enseñando gramática...");
    }

    @Override
    public void pjFonetica() {
        System.out.println("Enseñando fonética...");
    }
}
