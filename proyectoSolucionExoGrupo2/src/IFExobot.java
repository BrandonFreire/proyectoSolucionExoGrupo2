/**
 * @autor Ismael Freire
 * @date 27/01/2024
 * brandon.freire@outlook.com
 * @version  1.0
 */
public class IFExobot extends PJIABot{
    private String ifPatronColor;
    private String ifColorExobot;
    public IFEspalda ifEspalda;
    protected IAExtremidadSuperiorDerecha iaExtremidadSuperiorDerecha;
    public IFFuenteDePoder ifFuenteDePoder;
    DMExtremidadSuperiorIzquierda dmExtremidadSuperiorIzquierda;

    /**
     * Constructor con parametros
     * Tiene una relacion de composicion con Espalda
     * @param pjcodigoSeguridad
     */
    public IFExobot(String pjcodigoSeguridad) {
        super(pjcodigoSeguridad);
        this.ifEspalda = new IFEspalda();
        iaExtremidadSuperiorDerecha = new IAExtremidadSuperiorDerecha();
        dmExtremidadSuperiorIzquierda = new DMExtremidadSuperiorIzquierda("mdASDF","0.6");
    }

    /** getter/setter Patron
     * 
     * @return
     */
    public String getIfPatronColor() {
        return ifPatronColor;
    }
    public void setIfPatronColor(String ifPatronColor) {
        this.ifPatronColor = ifPatronColor;
    }
    public String getIfColorExobot() {
        return ifColorExobot;
    }
    public void setIfColorExobot(String ifColorExobot) {
        this.ifColorExobot = ifColorExobot;
    }

    /**
     * Relacion de agregacion con fuente de poder
     * @param ifFuenteDePoder
     */
    public void ensamblarFuenteDePoder(IFFuenteDePoder ifFuenteDePoder){
        this.ifFuenteDePoder = ifFuenteDePoder;
    }
}
