/**
 * @autor Ismael Freire
 * @date 27/01/2024
 *       brandon.freire@outlook.com
 * @version 1.1
 */
public class IFTuboReactor implements IIFArma {
    private String ifColor;

    /**
     * Constructor sin parametros
     */
    public IFTuboReactor() {
    }

    /**
     * Constructor con parametros
     * 
     * @param ifColor
     */
    public IFTuboReactor(String ifColor) {
        this.ifColor = ifColor;
    }

    /**
     * getter/setter
     * 
     * @return
     */
    public String IFgetColor() {
        return ifColor;
    }

    public void IFsetColor(String ifColor) {
        this.ifColor = ifColor;
    }

    @Override
    public void ifDisparar() {
        System.out.println("Estoy disparando");
    }
}
