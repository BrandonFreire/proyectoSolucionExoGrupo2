public class IASoldado {
    private String iaCodigoSeguridad;
    protected IFExobot ifExobot;

    public String iaGetIaCodigoSeguridad() {
        return iaCodigoSeguridad;
    }

    public void iaSetIaCodigoSeguridad(String iaCodigoSeguridad) {
        this.iaCodigoSeguridad = iaCodigoSeguridad;
    }

    public void iaUsar(IFExobot iaUsa){
        this.ifExobot = iaUsa;
    }

    public void iaCorrer(){
        System.out.println("Estoy corriendo");
    }

    public void iaSaltar(){
        System.out.println("Estoy saltando");
    }

    public void iaVolar(){
        System.out.println("Estoy volando");
    }

}
