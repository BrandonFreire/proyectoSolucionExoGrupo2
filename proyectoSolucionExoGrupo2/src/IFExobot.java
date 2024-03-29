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
    public IFExobot(String patronColor, String color) {
        super();
        this.ifPatronColor = patronColor;
        this.ifColorExobot = color;
        this.ifEspalda = new IFEspalda("1.2", "gris metalico");
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

    public void dmVolar(){
        ifEspalda.ifTurboReactor.dmVerificarVuelo(ifFuenteDePoder);
    }

    /**
     * Relacion de agregacion con fuente de poder
     * 
     * @param ifFuenteDePoder
     */
    public void ifEnsamblarFuenteDePoder(IFFuenteDePoder ifFuenteDePoder) {
        this.ifFuenteDePoder = ifFuenteDePoder;
    }

    public void dmDispararBrazoIzq (){
        if (dmExtremidadSuperiorIzquierda.dmBazuca != null) {
            dmExtremidadSuperiorIzquierda.dmBazuca.ifDisparar();
        }else{
            dmExtremidadSuperiorIzquierda.dmMetralleta.ifDisparar();
        }
    }

    public void dmDispararBrazoDer (){
        if(iaExtremidadSuperiorDerecha.iaLanzaFuego!=null){
            iaExtremidadSuperiorDerecha.iaLanzaFuego.dmVerificarDisparo(ifFuenteDePoder);
        }else{
            iaExtremidadSuperiorDerecha.iaLaser.ifDisparar();
        }
    }
}
