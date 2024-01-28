import java.util.Random;

public class DMMecatronico {
    IFExobot dmExobot;
    Random rand = new Random();

    private String dmNombre;

    
    public DMMecatronico(String dmNombre) {
        this.dmNombre = dmNombre;
    }

    public String dmGetNombre() {
        return dmNombre;
    }

    public void dmSetNombre(String dmNombre) {
        this.dmNombre = dmNombre;
    }

    public String dmEnsamblar(IFExobot exobot){
        dmExobot = exobot;
        String dmCaracteristicas = "";
        dmCaracteristicas += dmElegirArmas();
        dmCaracteristicas += dmEnsamblarBateria();
        return dmCaracteristicas;
    }

    public String dmElegirArmas(){
        int numeroAleatorio = rand.nextInt(2);

        if (numeroAleatorio == 0){
            IALaser  dmLaser = new IALaser("gris metalico");
            DMBazuca dmBazuca  = new DMBazuca("0.9");
            dmExobot.iaExtremidadSuperiorDerecha.iaUsarLaser(dmLaser);
            dmExobot.dmExtremidadSuperiorIzquierda.dmUsarBazuca(dmBazuca);
            return "Armas: Laser y Bazuca";
        }else{
            IALanzaFuego  dmLanzaFuego = new IALanzaFuego("0.8");
            DMMetralleta dmMetralleta = new DMMetralleta("Verde oscuro");
            dmExobot.iaExtremidadSuperiorDerecha.iaUsarLanzaFuego(dmLanzaFuego);
            dmExobot.dmExtremidadSuperiorIzquierda.dmUsarMetralleta(dmMetralleta);
            return "Armas: Lanza Fuego y Metralleta";
        }
    }

    public String dmEnsamblarBateria(){
        IFFuenteDePoder dmFuntePoder = new IFFuenteDePoder();
        dmExobot.IFensamblarFuenteDePoder(dmFuntePoder);
        return "Se ha ensamblado una batería de energía.";
    }

}
