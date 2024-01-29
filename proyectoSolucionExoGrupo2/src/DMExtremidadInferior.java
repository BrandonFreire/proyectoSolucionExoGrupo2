/**
 * @autor David Morales
 * @GitHub DavidME1604
 * @date 28/01/2024
 * @version 3.5.1
 */

public class DMExtremidadInferior {
    //Atributos
    private String dmLado;
    private String dmColor;
    private String dmTamanio;


    /**
     * Contructor con parametros
     * @param dmLado
     * @param dmColor
     * @param dmTamanio
     */    
    public DMExtremidadInferior(String dmLado, String dmColor, String dmTamanio) {
        this.dmLado = dmLado;
        this.dmColor = dmColor;
        this.dmTamanio = dmTamanio;
    }

    //Setter/getters
    public String dmGetLado() {
        return dmLado;
    }
    public void dmSetLado(String dmLado) {
        this.dmLado = dmLado;
    }
    public String dmGetColor() {
        return dmColor;
    }
    public void dmSetColor(String dmColor) {
        this.dmColor = dmColor;
    }
    public String dmGetTamanio() {
        return dmTamanio;
    }
    public void dmSetTamanio(String dmTamanio) {
        this.dmTamanio = dmTamanio;
    }


}
