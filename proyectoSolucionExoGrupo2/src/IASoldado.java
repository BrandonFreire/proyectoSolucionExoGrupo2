/**
 * @autor Ivonne Ayala 
 * @date 28/01/2024
 * @version 9.0
 */
public class IASoldado {
    //Atributos
    private String iaCodigoSeguridad;
    protected IFExobot iaExobot;
    DMMecatronico dmMecatronico;
    IFFuenteDePoder dmFuentePoder;

    /**
     * Constructor de la clase IASoldado
     * @param CodigoSeguridad
     */
    public IASoldado(String CodigoSeguridad) {
        this.iaCodigoSeguridad = CodigoSeguridad;
    }

    /**
     * Getter iaCodigoSeguridad
     * @return
     */
    public String iaGetCodigoSeguridad() {
        return iaCodigoSeguridad;
    }

    /**
     * Método para usar exobot
     * @param iaUsa
     */
    public void iaUsar(IFExobot iaUsa) {
        if (iaExobot == null) {
            if (iaGetCodigoSeguridad().equals(iaUsa.pjgetcodigoSeguridad())) {
                this.iaExobot = iaUsa;
                System.out.println("Traje colocado. Listo para usar....");
            }else{
                System.out.println("No es el exobot que me asignaron.");
            }
        } else {
            System.out.println("El soldado ya esta puesto el traje.");
        }
    }
    
    /**
     * Método para correr
     */
    public void iaCorrer() {
        System.out.println("Estoy corriendo.");
    }

    /**
     * Método para saltar
     */
    public void iaSaltar() {
        System.out.println("Estoy saltando.");
    }
    
    /**
     * Método para volar usando el exobot
     */
    public void iaVolar() {
        if (iaExobot != null) {
            iaExobot.dmVolar();
        }else{
            System.out.println("Soy un simple soldado... no tengo mi exobot.");
        }
    }
    
    /**
     * Método para disparar el brazo derecho usando el exobot
     */
    public void dmDispararBrazoDer() {
        if (iaExobot != null) {
            iaExobot.dmDispararBrazoDer();
        }else{
            System.out.println("Soy un simple soldado... no tengo mi exobot");
        }
    }
    
    /**
     * Método para disparar el brazo izquierdo usando el exobot
     */
    public void dmDispararBrazoIzq() {
        if (iaExobot != null) {
            iaExobot.dmDispararBrazoIzq();
        }else{
            System.out.println("Soy un simple soldado... no tengo mi exobot");
        }
    }
    
    /**
     * Método para cambiar la batería del exobot
     * @param mecatronico 
     */
    public void dmCambiarBateria(DMMecatronico mecatronico){
        if (iaExobot!=null) {
            dmFuentePoder = new IFFuenteDePoder(1000, "0.2, 0.4");
            iaExobot.ifEnsamblarFuenteDePoder(dmFuentePoder);
            System.out.println("Fuente de poder cambiada....");
        }else{
            System.out.println("Soy un simple soldado... no tengo mi exobot");
        }
    }
}
// public void iaSetCodigoSeguridad(String iaCodigoSeguridad) {
// this.iaCodigoSeguridad = iaCodigoSeguridad;
// }
