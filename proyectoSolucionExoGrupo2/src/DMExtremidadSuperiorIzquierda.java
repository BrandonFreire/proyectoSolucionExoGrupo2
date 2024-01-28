public class DMExtremidadSuperiorIzquierda {
    private String dmID;
    private String dmLargo;
    DMBazuca dmBazuca;
    DMMetralleta dmMetralleta;
    

    public DMExtremidadSuperiorIzquierda(String dmID, String dmLargo) {
        this.dmID = dmID;
        this.dmLargo = dmLargo;
    }

    public String dmGetID() {
        return dmID;
    }
    public void dmSetID(String dmID) {
        this.dmID = dmID;
    }
    public String dmGetLargo() {
        return dmLargo;
    }
    public void dmSetLargo(String dmLargo) {
        this.dmLargo = dmLargo;
    }

    public void dmUsarBazuca(DMBazuca bazuca){
        dmBazuca = bazuca;
    }
    

    public void dmUsarMetralleta(DMMetralleta metralleta){
        dmMetralleta = metralleta;
    }
}
