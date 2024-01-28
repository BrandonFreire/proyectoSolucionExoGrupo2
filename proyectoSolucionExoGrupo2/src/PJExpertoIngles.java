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

    /** getter/setter
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int getEdad() {
        return edad;
    }

   
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
