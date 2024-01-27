public class App {

    private String pjcodigoSeguridad;

    public App(String pjcodigoSeguridad) {
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

    public static void main(String[] args) {
        App bot = new App("123456789");
        bot.pjVolarVeloz();
        bot.pjSaltarAlto();
        bot.pjCorrerRapido();
        bot.pjCrearCodigoSeguridad();
        System.out.println("Código de seguridad: " + bot.pjcodigoSeguridad);
    }
}
