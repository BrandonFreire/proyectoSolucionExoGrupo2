public class App {
    static DMMecatronico dmMecatronico = new DMMecatronico("David");
    static IFExobot dmExobot = new IFExobot(null);
    public static void main(String[] args) {
        System.out.println(dmMecatronico.dmEnsamblar(dmExobot));
    }
}
