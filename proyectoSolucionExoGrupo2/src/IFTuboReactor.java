/**
 * @autor Ismael Freire
 * @date 27/01/2024
 * brandon.freire@outlook.com
 * @version  1.0
 */
public class IFTuboReactor implements IIFArma{
    private String ifColor;
    
    /**
     * Constructor sin parametros
     */
    public IFTuboReactor() {
    }

    /**
     * Constructor con parametros
     * @param ifColor
     */
    public IFTuboReactor(String ifColor) {
        this.ifColor = ifColor;
    }

    /** getter/setter
     * 
     * @return
     */
    public String getIfColor() {
        return ifColor;
    }

    public void setIfColor(String ifColor) {
        this.ifColor = ifColor;
    }

    @Override
    public void ifDisparar() {
        System.out.println("Estoy disparando");
    }
}
