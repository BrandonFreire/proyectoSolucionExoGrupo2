import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @autor David Morales
 * @GitHub DavidME1604
 * @date 28/01/2024
 * @version 3.5.1
 */

public class DMTaller {
    // Atributos
    Scanner sc = new Scanner(System.in);
    private static final String dmNombreTaller = "Base Sputnik";
    DMMecatronico dmMecatronico;
    List<IASoldado> dmSoldados;
    List<IFExobot> dmExobots;

    // Getter
    public static String dmGetNombretaller() {
        return dmNombreTaller;
    }

    /*
     * Ensamblaje de los exobots
     */
    public void ensamblarExobots() {
        String entrada = "";
        int flota = 0;
        boolean isOK = false;
        dmMecatronico = new DMMecatronico("Arseniy");
        System.out.println("Taller: " + dmGetNombretaller());
        System.out.println("Area de ensamblaje de exobots");
        System.out.println("Mecatronico encargado: " + dmMecatronico.dmGetNombre());
        System.out.println("Operacion: Ensamblar flotilla de Exobots");
        System.out.print("Introduzca la cantidad de exobots que quiere ensamblar: ");
        do {
            entrada = sc.nextLine();
            try {
                flota = Integer.parseInt(entrada);
                if (flota>0){
                    isOK=true;
                    dmMecatronico.dmEnsamblar(flota);
                }else{
                    System.out.println("No existen flotas negativas, ni de 0 personas");
                    System.out.print("Intentelo de nuevo: ");
                }
            } catch (Exception  e) {
                System.out.println("Entrada no valida");
                System.out.print("Intentelo de nuevo: ");
            }
        } while (!isOK);
        System.out.println("ENSAMBLANDO .......");
        System.out.println("\n REPORTE DE EXOBOTS ENSAMBLADOS");
        dmMecatronico.dmReportar();
        dmProbar();
    }

    /*
     * Prueba que se haya asignado los exobots correctamente y sus funcionalidades
     */
    public void dmProbar() {
        dmSoldados = dmMecatronico.dmAsignados;
        dmExobots = dmMecatronico.dmEnsamblado;
        if (dmSoldados == null) {
            System.out.println("No existen registros");
        } else {
            dmSoldados.get(0).iaUsar(dmExobots.get(0));
            dmSoldados.get(0).dmDispararBrazoDer();
            dmSoldados.get(0).dmDispararBrazoIzq();
            dmSoldados.get(0).iaVolar();
            dmSoldados.get(0).dmCambiarBateria(dmMecatronico);
            System.out.println("Esta entrenado el idioma espanol? " + dmExobots.get(0).dmIsEspanolAvaible());
            System.out.println("Esta entrenado el idioma ingles? " + dmExobots.get(0).dmIsInglesAvaible());
            dmSoldados.get(0).dmDispararBrazoDer();
        }
    }
}
