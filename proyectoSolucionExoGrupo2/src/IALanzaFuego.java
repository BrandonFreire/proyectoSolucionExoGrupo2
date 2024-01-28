public class IALanzaFuego implements IIFArma{
    private String iaLongitud;

    public String iaGetIaColor() {
        return iaLongitud;
    }

    public void iaSetIaColor(String iaLongitud) {
        this.iaLongitud = iaLongitud;
    }

    @Override
    public void ifDisparar() {
        System.out.println("Lanza fuego disparandose...");
    }

    
}
