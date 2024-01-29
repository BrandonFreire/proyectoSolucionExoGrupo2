
public class DMMetralleta implements IIFArma{
    private String dmColor;

    
    public DMMetralleta(String dmColor) {
        this.dmColor = dmColor;
    }
    
    public String dmGetColor() {
        return dmColor;
    }
    public void dmSetColor(String dmColor) {
        this.dmColor = dmColor;
    }

    
    @Override
    public void ifDisparar() {
        System.out.println("Metralleta disparandose....");
    }
    
}
