public class IASoldado {
    private String iaCodigoSeguridad;
    protected IFExobot Exobot;

    public IASoldado (String CodigoSeguridad){
      this.iaCodigoSeguridad = CodigoSeguridad;
    }

    // public String iaGetCodigoSeguridad() {
    //     return iaCodigoSeguridad;
    // }

    // public void iaSetCodigoSeguridad(String iaCodigoSeguridad) {
    //     this.iaCodigoSeguridad = iaCodigoSeguridad;
    // }

    public void iaUsar(IFExobot iaUsa){
        this.Exobot = iaUsa;
        System.out.println("Exobot asignado al soldado con código de seguridad: " + iaCodigoSeguridad);
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
