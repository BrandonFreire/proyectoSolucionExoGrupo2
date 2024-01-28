public class IFFuenteDePoder {
    private int ifCapacidad;
    private String ifTamanio;
    /**
     * Constructor sin parametros
     */
    public IFFuenteDePoder() {
    }
    /**
     * Constructor con parametross
     * @param ifCapacidad
     * @param ifTamanio
     */
    public IFFuenteDePoder(int ifCapacidad, String ifTamanio) {
        this.ifCapacidad = ifCapacidad;
        this.ifTamanio = ifTamanio;
    }
    /** getter/setter
     * 
     * @return
     */
    public int getIfCapacidad() {
        return ifCapacidad;
    }
    public void setIfCapacidad(int ifCapacidad) {
        this.ifCapacidad = ifCapacidad;
    }
    public String getIfTamanio() {
        return ifTamanio;
    }
    public void setIfTamanio(String ifTamanio) {
        this.ifTamanio = ifTamanio;
    }
}
