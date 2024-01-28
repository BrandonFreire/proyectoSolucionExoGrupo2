public class IAExtremidadSuperiorDerecha {
    private String iaID;
    private int iaLargo;
    public IALaser iaLaser;
    public IALanzaFuego iaLanzaFuego;

    public IAExtremidadSuperiorDerecha(String ID, int Largo) {
        this.iaID = ID;
        this.iaLargo = Largo;
    }

    // public String iaGetID() {
    //     return iaID;
    // }
    // public void iaSetID(String iaID) {
    //     this.iaID = iaID;
    // }
    // public int iaGetLargo() {
    //     return iaLargo;
    // }
    // public void iaSetLargo(int iaLargo) {
    //     this.iaLargo = iaLargo;
    // }

    public void iaUsarLaser (IALaser laser){
        this.iaLaser = laser;
    }

    public void iaUsarLanzaFuego (IALanzaFuego lanzaFuego){
        this.iaLanzaFuego = lanzaFuego;
    }

}
