/**
 * Clase que representa un bot que puede aprender español e inglés.
 * Implementa las interfaces PJIAprendeEspaniol y PJIAprenderIngles.
 * 
 * @author Jonathan Paredes
 * @Github Jonathan4325
 * @version 1.0
 */
public class PJIABot implements PJIAprendeEspaniol, PJIAprenderIngles {

    private String pjcodigoSeguridad;

    /**
     * Constructor de la clase PJIABot.
     * @param pjcodigoSeguridad 
     */
    public PJIABot(String pjcodigoSeguridad) {
        this.pjcodigoSeguridad = pjcodigoSeguridad;
    }

    /**
     * Método para obtener el código de seguridad del bot.
     * @return 
     */
    public String getPjcodigoSeguridad() {
        return pjcodigoSeguridad;
    }

    /**
     * Método para establecer el código de seguridad del bot.
     * @param pjcodigoSeguridad El nuevo código de seguridad del bot.
     */
    public void setPjcodigoSeguridad(String pjcodigoSeguridad) {
        this.pjcodigoSeguridad = pjcodigoSeguridad;
    }

    /**
     * Método para que vuele velozmente.
     */
    public void pjVolarVeloz() {
        System.out.println("Volando velozmente...");
    }

    /**
     * Método para que salte alto.
     */
    public void pjSaltarAlto() {
        System.out.println("Saltando alto...");
    }

    /**
     * Método para que corra rápido.
     */
    public void pjCorrerRapido() {
        System.out.println("Corriendo rápido...");
    }

    /**
     * Método para crear un código de seguridad predeterminado para el bot.
     */
    public void pjCrearCodigoSeguridad() {
        setPjcodigoSeguridad("123456789");
    }

    @Override
    public void pjAprenderEspaniol() {
        System.out.println("Aprendiendo español...");
    }

    @Override
    public void pjAprenderIngles() {
        System.out.println("Aprendiendo inglés...");
    }
}