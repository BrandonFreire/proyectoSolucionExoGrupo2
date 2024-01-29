import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @autor David Morales
 * @GitHub DavidME1604
 * @date 28/01/2024
 * @version 3.5.1
 */

public class DMMecatronico {
    //Atributos
    List<IFExobot> dmEnsamblado;
    Random rand = new Random();
    List<IASoldado> dmAsignados;
    IFFuenteDePoder dmFuentePoder;
    PJExpertoEspaniol dmProfesorEspaniol;
    PJExpertoIngles dmProfesorIngles;
    private String dmNombre;

    /**
     * Contructor con parametros
     * @param dmNombre
     */
    public DMMecatronico(String dmNombre) {
        this.dmNombre = dmNombre;
    }

    //Setters/getters
    public String dmGetNombre() {
        return dmNombre;
    }

    public void dmSetNombre(String dmNombre) {
        this.dmNombre = dmNombre;
    }

    /**
     * Ensambla los exobot y los entrea en los idiomas
     * @param cantidad
     */
    public void dmEnsamblar(int cantidad) {
        dmEnsamblado = new ArrayList<IFExobot>();
        dmAsignados = new ArrayList<IASoldado>();
        dmProfesorEspaniol =  new PJExpertoEspaniol("Francisco", 35);
        dmProfesorIngles = new PJExpertoIngles("John", 40);
        for (int i = 0; i < cantidad; i++) {
            dmEnsamblado.add(new IFExobot("camuflaje", "verde oscuro"));
            dmProfesorEspaniol.dmEnseniarEspanol(dmEnsamblado.get(i));
            dmProfesorIngles.dmEnsenarIngles(dmEnsamblado.get(i));
            dmElegirArmas(dmEnsamblado.get(i));
            dmEnsamblarBateria(dmEnsamblado.get(i));
            dmAsignarSoldado(dmEnsamblado.get(i));
        }
    }

    /**
     * Elige un set de armas con un valor randomico
     * @param dmExobot : lista de exobots
     */
    public void dmElegirArmas(IFExobot dmExobot) {
        int numeroAleatorio = rand.nextInt(2);
        if (numeroAleatorio == 0) {
            IALaser dmLaser = new IALaser("gris metalico");
            DMBazuca dmBazuca = new DMBazuca("0.9");
            dmExobot.iaExtremidadSuperiorDerecha.iaUsarLaser(dmLaser);
            dmExobot.dmExtremidadSuperiorIzquierda.dmUsarBazuca(dmBazuca);
        } else {
            IALanzaFuego dmLanzaFuego = new IALanzaFuego("0.8");
            DMMetralleta dmMetralleta = new DMMetralleta("Verde oscuro");
            dmExobot.iaExtremidadSuperiorDerecha.iaUsarLanzaFuego(dmLanzaFuego);
            dmExobot.dmExtremidadSuperiorIzquierda.dmUsarMetralleta(dmMetralleta);
        }
    }

    /**
     * Coloca la bateria
     * @param dmExobot
     */
    public void dmEnsamblarBateria(IFExobot dmExobot) {
        dmFuentePoder = new IFFuenteDePoder(1000, "0.2, 0.4");
        dmExobot.ifEnsamblarFuenteDePoder(dmFuentePoder);
    }

    /**
     * Asigna el exobot al soldado mediante la clave
     * @param dmExobot
     */
    public void dmAsignarSoldado(IFExobot dmExobot) {
        dmAsignados.add(new IASoldado(dmExobot.pjgetcodigoSeguridad()));
        dmExobot.pjgetcodigoSeguridad();
    }

    /**
     * Sirve para mostrar los exobots ensamblados
     */
    public void dmReportar() {
        for (IFExobot dmExobot : dmEnsamblado) {
            System.out.println("Exobot ensamblado y asignado a soldado con codigo: " + dmExobot.pjgetcodigoSeguridad());
            System.out.print("Armamento ensamblado: ");
            if (dmExobot.dmExtremidadSuperiorIzquierda.dmBazuca != null) {
                System.out.println("Bazuca y laser");
            } else {
                System.out.println("Metralleta y lanza fuego");
            }
            System.out.println("*****************************************************************");
        }
    }

}
