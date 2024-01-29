/**
 * @autor David Morales
 * @GitHub DavidME1604
 * @date 28/01/2024
 * @version 3.5.1
 */

public class DMBazuca implements IIFArma {
    //Atributos
    private String dmLongitud;
    
    //Setters/getters
    public DMBazuca(String dmLongitud) {
        this.dmLongitud = dmLongitud;
    }

    public String dmGetLongitud() {
        return dmLongitud;
    }

    public void dmSetLongitud(String dmLongitud) {
        this.dmLongitud = dmLongitud;
    }
    
    /**
     * Implementacion de la accion disparar de la interfaz IIFArma
     */
    @Override
    public void ifDisparar() {
        System.out.println("Bazuca disparandose....");
    }

}
