/**
 * @autor Ismael Freire
 * @date 27/01/2024
 *       brandon.freire@outlook.com
 * @version 1.1
 */
public class IFExobot extends PJIABot {
    private String ifPatronColor;
    private String ifColorExobot;
    public IFEspalda ifEspalda;
    protected IAExtremidadSuperiorDerecha iaExtremidadSuperiorDerecha;
    DMExtremidadInferior dmExtremidadInferiorIzq;
    DMExtremidadInferior dmExtremidadInferiorDer;
    public IFFuenteDePoder ifFuenteDePoder;
    DMExtremidadSuperiorIzquierda dmExtremidadSuperiorIzquierda;

    /**
     * Constructor con parametros
     * Tiene una relacion de composicion con Espalda
     * 
     * @param pjcodigoSeguridad
     */
    public IFExobot(String pjcodigoSeguridad) {
        super(pjcodigoSeguridad);
        this.ifEspalda = new IFEspalda();
        iaExtremidadSuperiorDerecha = new IAExtremidadSuperiorDerecha("123489", 18);
        dmExtremidadSuperiorIzquierda = new DMExtremidadSuperiorIzquierda("mdASDF", "0.6");
        dmExtremidadInferiorIzq = new DMExtremidadInferior("Izquierdo", "verde", "1.3");
        dmExtremidadInferiorDer = new DMExtremidadInferior("Derecha", "verde", "1.3");
    }

    /**
     * getter/setter Patron
     * 
     * @return
     */
    public String IFgetPatronColor() {
        return ifPatronColor;
    }

    public void IFsetPatronColor(String ifPatronColor) {
        this.ifPatronColor = ifPatronColor;
    }

    public String IFgetColorExobot() {
        return ifColorExobot;
    }

    public void IFsetColorExobot(String ifColorExobot) {
        this.ifColorExobot = ifColorExobot;
    }

    /**
     * Relacion de agregacion con fuente de poder
     * 
     * @param ifFuenteDePoder
     */
    public void IFensamblarFuenteDePoder(IFFuenteDePoder ifFuenteDePoder) {
        this.ifFuenteDePoder = ifFuenteDePoder;
    }
}
