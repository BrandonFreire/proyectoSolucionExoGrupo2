/**
 * @autor Ivonne Ayala
 * @date 28/01/2024
 * @version 9.0
 */
public class IALaser implements IIFArma {
    //Atributos
    private String iaColor;

    /**
     * Constructor de la clase IALaser
     * @param Color
     */
    public IALaser(String Color) {
        this.iaColor = Color;
    }
    
    /**
     * Método para disparar
     */
    @Override
    public void ifDisparar() {
        System.out.println("Laser disparandose...");
    }
    
}
// public String iaGetColor() {
//     return iaColor;
// }

// public void iaSetColor(String iaColor) {
//     this.iaColor = iaColor;
// }
