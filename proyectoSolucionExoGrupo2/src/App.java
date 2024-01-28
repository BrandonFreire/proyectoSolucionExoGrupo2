public class App {
    static DMMecatronico dmMecatronico = new DMMecatronico("David");
    static IFExobot dmExobot = new IFExobot(null);
    static IASoldado iaSoldado = new IASoldado("1750311514");
    public static void main(String[] args) {
       // System.out.println(dmMecatronico.dmEnsamblar(dmExobot));
        IFExobot iaExobotAsignado = dmMecatronico.IAAsignarASoldado(iaSoldado);

    }
}
