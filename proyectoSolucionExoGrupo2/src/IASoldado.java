public class IASoldado {
    private String iaCodigoSeguridad;
    protected IFExobot Exobot;

    public IASoldado (String CodigoSeguridad){
      this.iaCodigoSeguridad = CodigoSeguridad;
      iaUsar(Exobot);
    }

    // public String iaGetCodigoSeguridad() {
    //     return iaCodigoSeguridad;
    // }

    // public void iaSetCodigoSeguridad(String iaCodigoSeguridad) {
    //     this.iaCodigoSeguridad = iaCodigoSeguridad;
    // }

    public void iaUsar(IFExobot iaUsa){
        this.Exobot = iaUsa;
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
