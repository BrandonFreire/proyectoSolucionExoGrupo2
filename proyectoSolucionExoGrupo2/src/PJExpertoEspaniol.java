/**
 * Clase que implementa funcionalidades de un experto en español.
 * Permite enseñar léxico, gramática y fonética.
 * 
 * @author Jonathan Paredes
 * @Github Jonathan4325
 * @version 2.43
 */
public class PJExpertoEspaniol implements PJIEnseniar{

    private String nombre;
    private int edad;

    /**
     * Constructor de la clase PJExpertoEspaniol.
     * @param nombre El nombre del experto en español.
     * @param edad La edad del experto en español.
     */
    public PJExpertoEspaniol(String nombre, int edad) {
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

}

