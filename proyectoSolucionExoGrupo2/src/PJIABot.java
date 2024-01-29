import java.security.SecureRandom;

public class PJIABot implements PJIAprendeEspaniol, PJIAprendeIngles {

    private String pjcodigoSeguridad;
    private boolean dmIsEspanolAvaible;
    private boolean dmIsInglesAvaible;

    // Crear codigos de seguridad

    public boolean dmIsEspanolAvaible() {
        return dmIsEspanolAvaible;
    }

    public void dmSetIsEspanolAvaible(boolean dmIsEspanolAvaible) {
        this.dmIsEspanolAvaible = dmIsEspanolAvaible;
    }

    public boolean dmIsInglesAvaible() {
        return dmIsInglesAvaible;
    }

    public void setDmIsInglesAvaible(boolean dmIsInglesAvaible) {
        this.dmIsInglesAvaible = dmIsInglesAvaible;
    }

    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static SecureRandom random = new SecureRandom();
    

    /**
     * Constructor de la clase PJIABot.
     * 
     * @param pjcodigoSeguridad
     */
    public PJIABot() {
        pjCrearCodigoSeguridad();
        this.dmIsEspanolAvaible = false;
        this.dmIsInglesAvaible = false;
    }

    /**
     * getter/setter
     * 
     * @return
     */
    public String pjgetcodigoSeguridad() {
        return pjcodigoSeguridad;
    }

    public void pjSetcodigoSeguridad(String pjcodigoSeguridad) {
        this.pjcodigoSeguridad = pjcodigoSeguridad;
    }

    public void pjCrearCodigoSeguridad() {
        StringBuilder codigo = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            codigo.append(CARACTERES.charAt(random.nextInt(CARACTERES.length())));
        }
        pjSetcodigoSeguridad(codigo.toString());
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

    @Override
    public void pjAprenderEspaniol() {
        //System.out.println("Aprendiendo español...");
        this.dmIsEspanolAvaible = true;
    }

    @Override
    public void pjAprenderIngles() {
        //System.out.println("Aprendiendo inglés...");
        this.dmIsInglesAvaible = true;
    }
}
