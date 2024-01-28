public class DMExtremidadInferior {
    private String dmLado;
    private String dmColor;
    private String dmTamanio;


    
    public DMExtremidadInferior(String dmLado, String dmColor, String dmTamanio) {
        this.dmLado = dmLado;
        this.dmColor = dmColor;
        this.dmTamanio = dmTamanio;
    }


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
