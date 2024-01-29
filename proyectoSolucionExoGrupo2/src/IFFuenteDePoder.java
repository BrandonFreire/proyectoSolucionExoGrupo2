/**
 * @autor Ismael Freire
 * @date 27/01/2024
 *       brandon.freire@outlook.com
 * @version 1.1
 */
public class IFFuenteDePoder {
    private int ifCapacidad;
    private String ifTamanio;
    private short dmPorcentajeBateria;

    public short dmGetPorcentajeBateria() {
        return dmPorcentajeBateria;
    }

    public void dmSetPorcentajeBateria(short dmPorcentajeBateria) {
        this.dmPorcentajeBateria = dmPorcentajeBateria;
    }

    /**
     * Constructor con parametross
     * 
     * @param ifCapacidad
     * @param ifTamanio
     */
    public IFFuenteDePoder(int ifCapacidad, String ifTamanio) {
        this.ifCapacidad = ifCapacidad;
        this.ifTamanio = ifTamanio;
        this.dmPorcentajeBateria = 100;
    }

    /**
     * getter/setter
     * 
     * @return
     */
    public int IFgetCapacidad() {
        return ifCapacidad;
    }

    public void IFsetCapacidad(int ifCapacidad) {
        this.ifCapacidad = ifCapacidad;
    }

    public String IFgetTamanio() {
        return ifTamanio;
    }

    public void IFsetTamanio(String ifTamanio) {
        this.ifTamanio = ifTamanio;
    }
}
