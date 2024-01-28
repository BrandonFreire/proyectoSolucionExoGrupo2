public class IAExtremidadSuperiorDerecha {
    private String iaID;
    private int iaLargo;
    protected IALaser iaLaser;
    protected IALanzaFuego iaLanzaFuego;


    public String iaGetIaID() {
        return iaID;
    }
    public void iaSetIaID(String iaID) {
        this.iaID = iaID;
    }
    public int iaGetIaLargo() {
        return iaLargo;
    }
    public void iaSetIaLargo(int iaLargo) {
        this.iaLargo = iaLargo;
    }

    public void iaUsarLaser (IALaser laser){
        this.iaLaser = laser;
    }

    public void iaUsarLanzaFuego (IALanzaFuego lanzaFuego){
        this.iaLanzaFuego = lanzaFuego;
    }

}
