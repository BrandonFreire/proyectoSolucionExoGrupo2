/**
 * @autor Ismael Freire
 * @date 27/01/2024
 *       brandon.freire@outlook.com
 * @version 1.1
 */
public class IFEspalda {
    private String ifTamanio;
    private String ifColor;
    public IFTurboReactor ifTurboReactor;

    /**
     * Constructor con parametros
     * 
     * @param ifTamanio
     * @param ifColor
     */
    public IFEspalda(String ifTamanio, String ifColor) {
        this.ifTamanio = ifTamanio;
        this.ifColor = ifColor;
        this.ifTurboReactor = new IFTurboReactor("verde oscuro");
    }

    /**
     * getter/setter
     * 
     * @return
     */
    public String IFgetTamanio() {
        return ifTamanio;
    }

    public void IFsetTamanio(String ifTamanio) {
        this.ifTamanio = ifTamanio;
    }

    public String IFgetColor() {
        return ifColor;
    }

    public void IFsetColor(String ifColor) {
        this.ifColor = ifColor;
    }
}
