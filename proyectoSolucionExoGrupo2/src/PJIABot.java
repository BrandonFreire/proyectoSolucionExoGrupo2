public class PJIABot implements PJIAprendeEspaniol, PJIAprendeIngles {

    private String pjcodigoSeguridad;

    /**
     * Constructor de la clase PJIABot.
     * @param pjcodigoSeguridad 
     */
    public PJIABot(String pjcodigoSeguridad) {
        this.pjcodigoSeguridad = pjcodigoSeguridad;
    }

    /** getter/setter
     * 
     * @return
     */
    public String pjgetcodigoSeguridad() {
        return pjcodigoSeguridad;
    }

    
    public void pjsetcodigoSeguridad(String pjcodigoSeguridad) {
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
