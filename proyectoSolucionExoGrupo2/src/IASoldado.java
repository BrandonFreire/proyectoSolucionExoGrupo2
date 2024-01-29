public class IASoldado {
    private String iaCodigoSeguridad;
    protected IFExobot iaExobot;
    DMMecatronico dmMecatronico;
    IFFuenteDePoder dmFuentePoder;

    public IASoldado(String CodigoSeguridad) {
        this.iaCodigoSeguridad = CodigoSeguridad;
    }

    public String iaGetCodigoSeguridad() {
        return iaCodigoSeguridad;
    }

    // public void iaSetCodigoSeguridad(String iaCodigoSeguridad) {
    // this.iaCodigoSeguridad = iaCodigoSeguridad;
    // }

    public void iaUsar(IFExobot iaUsa) {
        if (iaExobot == null) {
            if (iaGetCodigoSeguridad().equals(iaUsa.pjgetcodigoSeguridad())) {
                this.iaExobot = iaUsa;
                System.out.println("Traje colocado. Listo para usar....");
            }else{
                System.out.println("No es el exobot que me asignaron");
            }
        } else {
            System.out.println("El soldado ya esta puesto el traje");
        }
    }

    public void iaCorrer() {
        System.out.println("Estoy corriendo");
    }

    public void iaSaltar() {
        System.out.println("Estoy saltando");
    }

    public void iaVolar() {
        if (iaExobot != null) {
            iaExobot.dmVolar();
        }else{
            System.out.println("Soy un simple soldado... no tengo mi exobot");
        }
    }

    public void dmDispararBrazoDer() {
        if (iaExobot != null) {
            iaExobot.dmDispararBrazoDer();
        }else{
            System.out.println("Soy un simple soldado... no tengo mi exobot");
        }
    }

    public void dmDispararBrazoIzq() {
        if (iaExobot != null) {
            iaExobot.dmDispararBrazoIzq();
        }else{
            System.out.println("Soy un simple soldado... no tengo mi exobot");
        }
    }

    public void dmCambiarBateria(DMMecatronico mecatronico){
        if (iaExobot!=null) {
            dmFuentePoder = new IFFuenteDePoder(1000, "0.2, 0.4");
            iaExobot.ifEnsamblarFuenteDePoder(dmFuentePoder);
            System.out.println("Fuente de poder cambiada....");
        }else{
            System.out.println("Soy un simple soldado... no tengo mi exobot");
        }
    }

}
