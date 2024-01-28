/**
 * @autor Ismael Freire
 * @date 27/01/2024
 *       brandon.freire@outlook.com
 * @version 1.1
 */
public class IFEspalda {
    private String ifTamanio;
    private String ifColor;
    public IFTuboReactor ifTuboReactor;

    /**
     * Constructor sin parametros
     */
    public IFEspalda() {
    }

    /**
     * Constructor con parametros
     * 
     * @param ifTamanio
     * @param ifColor
     */
    public IFEspalda(String ifTamanio, String ifColor) {
        this.ifTamanio = ifTamanio;
        this.ifColor = ifColor;
        this.ifTuboReactor = new IFTuboReactor();
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
