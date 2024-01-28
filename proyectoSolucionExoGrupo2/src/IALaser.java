public class IALaser implements IIFArma {
    private String iaColor;

    public String iaGetIaColor() {
        return iaColor;
    }

    public void iaSetIaColor(String iaColor) {
        this.iaColor = iaColor;
    }

    @Override
    public void ifDisparar() {
        System.out.println("Laser disparandose...");
    }

    
}
