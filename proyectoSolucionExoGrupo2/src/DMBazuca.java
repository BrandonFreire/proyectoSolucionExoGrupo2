
public class DMBazuca implements IIFArma {
    private String dmLongitud;
    

    public DMBazuca(String dmLongitud) {
        this.dmLongitud = dmLongitud;
    }

    public String dmGetLongitud() {
        return dmLongitud;
    }

    public void dmSetLongitud(String dmLongitud) {
        this.dmLongitud = dmLongitud;
    }

    @Override
    public void ifDisparar() {

    }

}
