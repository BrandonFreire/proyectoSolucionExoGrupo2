public class IALaser implements IIFArma {
    
    private String iaColor;

    public IALaser(String Color) {
        this.iaColor = Color;
    }
    // public String iaGetColor() {
    //     return iaColor;
    // }

    // public void iaSetColor(String iaColor) {
    //     this.iaColor = iaColor;
    // }

    @Override
    public void ifDisparar() {
        System.out.println("Laser disparandose...");
    }

    
}
