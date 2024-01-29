/**
 * @autor David Morales
 * @GitHub DavidME1604
 * @date 28/01/2024
 * @version 3.5.1
 */

public class DMExtremidadSuperiorIzquierda {
    //atributos
    private String dmID;
    private String dmLargo;
    DMBazuca dmBazuca;
    DMMetralleta dmMetralleta;
    
    /**
     * Contructor con parametros
     * @param dmID
     * @param dmLargo
     */
    public DMExtremidadSuperiorIzquierda(String dmID, String dmLargo) {
        this.dmID = dmID;
        this.dmLargo = dmLargo;
    }

    //Setters/getters
    public String dmGetID() {
        return dmID;
    }
    public void dmSetID(String dmID) {
        this.dmID = dmID;
    }
    public String dmGetLargo() {
        return dmLargo;
    }
    public void dmSetLargo(String dmLargo) {
        this.dmLargo = dmLargo;
    }

    public void dmUsarBazuca(DMBazuca bazuca){
        dmBazuca = bazuca;
    }
    
    /**
     * Arma metralleta como agragacion de la clase
     */
    public void dmUsarMetralleta(DMMetralleta metralleta){
        dmMetralleta = metralleta;
    }
}
