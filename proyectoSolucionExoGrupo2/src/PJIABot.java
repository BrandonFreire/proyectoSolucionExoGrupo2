public class PJIABot{

    private String pjcodigoSeguridad;


    public PJIABot(String pjcodigoSeguridad) {
        this.pjcodigoSeguridad = pjcodigoSeguridad;
    }
    public void pjVolarVeloz() {
        System.out.println("Volando...");
    }

    public void pjSaltarAlto() {
        System.out.println("Saltando alto...");
    }

    public void pjCorrerRapido() {
        System.out.println("Corriendo rapido...");
    }

    public void pjCrearCodigoSeguridad() {
        setPjcodigoSeguridad("123456789");
    }

    public void setPjcodigoSeguridad(String pjcodigoSeguridad) {
        this.pjcodigoSeguridad = pjcodigoSeguridad;
    }


}
