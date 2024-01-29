/**
 * @autor David Morales
 * @GitHub DavidME1604
 * @date 28/01/2024
 * @version 3.5.1
 */

public class DMMetralleta implements IIFArma{
    //atributos
    private String dmColor;

    //Setters/getters
    public DMMetralleta(String dmColor) {
        this.dmColor = dmColor;
    }
    
    public String dmGetColor() {
        return dmColor;
    }
    public void dmSetColor(String dmColor) {
        this.dmColor = dmColor;
    }

    /**
     * Implementacion de la accion disparar de la interfaz IIFArma
     */
    @Override
    public void ifDisparar() {
        System.out.println("Metralleta disparandose....");
    }
    
}
