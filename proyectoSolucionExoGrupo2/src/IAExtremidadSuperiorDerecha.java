/**
 * @autor Ivonne Ayala
 * @date 28/01/2024
 * @version 9.0
 */
public class IAExtremidadSuperiorDerecha {
   
    //Atributos
    private String iaID;
    private int iaLargo;
    public IALaser iaLaser;
    public IALanzaFuego iaLanzaFuego;

    /**
     * Constructor de la clase IAExtremidadSuperiorDerecha
     * @param ID
     * @param Largo
     */
    public IAExtremidadSuperiorDerecha(String ID, int Largo) {
        this.iaID = ID;
        this.iaLargo = Largo;
    }
    /**
     * Método para usar el laser
     * @param laser
     */
    public void iaUsarLaser (IALaser laser){
        this.iaLaser = laser;
    }
    
    /**
     * Método para usar el lanza fuego
     * @param lanzaFuego
     */
    public void iaUsarLanzaFuego (IALanzaFuego lanzaFuego){
        this.iaLanzaFuego = lanzaFuego;
    }
    
}

// public String iaGetID() {
//     return iaID;
// }
// public void iaSetID(String iaID) {
//     this.iaID = iaID;
// }
// public int iaGetLargo() {
//     return iaLargo;
// }
// public void iaSetLargo(int iaLargo) {
//     this.iaLargo = iaLargo;
// }
