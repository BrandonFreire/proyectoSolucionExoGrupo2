public class IALanzaFuego implements IIFArma{
    private String iaLongitud;

    public IALanzaFuego(String Longitud) {
        this.iaLongitud = Longitud;
    }
    // public String iaGetColor() {
    //     return iaLongitud;
    // }

    // public void iaSetColor(String iaLongitud) {
    //     this.iaLongitud = iaLongitud;
    // }

    @Override
    public void ifDisparar() {
        System.out.println("Lanza fuego disparandose...");
    }

    
}
