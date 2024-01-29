import java.util.List;
import java.util.Scanner;

public class DMTaller {
    Scanner sc = new Scanner(System.in);
    private static final String dmNombreTaller= "Base Sputnik";
    public static String dmGetnombretaller() {
        return dmNombreTaller;
    }


    DMMecatronico dmMecatronico;
    List<IASoldado> dmSoldados;
    List<IFExobot> dmExobots;

    public void ensamblarExobots(){
        dmMecatronico = new DMMecatronico("Arseniy");
        System.out.println("Taller: "+dmGetnombretaller());
        System.out.println("Area de ensamblaje de exobots");
        System.out.println("Mecatronico encargado: " + dmMecatronico.dmGetNombre());
        System.out.println("Operacion: Ensamblar flotilla de Exobots");
        System.out.print("Introduzca la cantidad de exobots que quiere ensamblar: ");
        dmMecatronico.dmEnsamblar(sc.nextInt());
        System.out.println("ENSAMBLANDO .......");
        System.out.println("\n REPORTE DE EXOBOTS ENSAMBLADOS");
        dmMecatronico.dmReportar();
        dmProbar();
    }

    public void dmProbar (){
        dmSoldados = dmMecatronico.dmAsignados;
        dmExobots = dmMecatronico.dmEnsamblado;
        if (dmSoldados == null) {
            System.out.println("No existen registros");
        }else{
            dmSoldados.get(0).iaUsar(dmExobots.get(0));
            dmSoldados.get(0).dmDispararBrazoDer();
            dmSoldados.get(0).dmDispararBrazoIzq();
            dmSoldados.get(0).iaVolar();
            dmSoldados.get(0).dmCambiarBateria(dmMecatronico);
            System.out.println("Esta entrenado el idioma espanol? "+dmExobots.get(0).dmIsEspanolAvaible()); 
            System.out.println("Esta entrenado el idioma ingles? "+dmExobots.get(0).dmIsInglesAvaible()); 
            dmSoldados.get(0).dmDispararBrazoDer();
        }
    }
}
