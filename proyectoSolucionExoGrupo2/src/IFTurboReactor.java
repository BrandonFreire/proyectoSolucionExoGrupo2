/**
 * @autor Ismael Freire
 * @date 27/01/2024
 *       brandon.freire@outlook.com
 * @version 1.1
 */
public class IFTurboReactor {
    private String ifColor;
    IFFuenteDePoder dmFuenteDePoder;

    /**
     * Constructor con parametros
     * 
     * @param ifColor
     */
    public IFTurboReactor(String ifColor) {
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

    public void dmVerificarVuelo(IFFuenteDePoder fuenteDePoder){
        dmFuenteDePoder = fuenteDePoder;
        if(dmFuenteDePoder.dmGetPorcentajeBateria()>0){
            System.out.println("Volando....");
            dmFuenteDePoder.dmSetPorcentajeBateria((short) (dmFuenteDePoder.dmGetPorcentajeBateria()-10));
        }else{
            System.out.println("Sin bateria para el vuelo");
        }
    }

}
