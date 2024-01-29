public class IALanzaFuego implements IIFArma{
    private String iaLongitud;
    IFFuenteDePoder dmFuenteDePoder;

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

    public void dmVerificarDisparo(IFFuenteDePoder fuenteDePoder){
        dmFuenteDePoder =  fuenteDePoder;
        if (dmFuenteDePoder.dmGetPorcentajeBateria()>=70) {
            System.out.println("Potencia alta");
            ifDisparar();
            dmFuenteDePoder.dmSetPorcentajeBateria((short) (dmFuenteDePoder.dmGetPorcentajeBateria()-10));
        }
        if (dmFuenteDePoder.dmGetPorcentajeBateria()<70&&dmFuenteDePoder.dmGetPorcentajeBateria()>=30) {
            System.out.println("Potencia media");
            ifDisparar();
            dmFuenteDePoder.dmSetPorcentajeBateria((short) (dmFuenteDePoder.dmGetPorcentajeBateria()-10));
        }
        if (dmFuenteDePoder.dmGetPorcentajeBateria()<30&&dmFuenteDePoder.dmGetPorcentajeBateria()>=10) {
            System.out.println("Potencia baja");
            ifDisparar();
            dmFuenteDePoder.dmSetPorcentajeBateria((short) (dmFuenteDePoder.dmGetPorcentajeBateria()-10));
        }
        if (dmFuenteDePoder.dmGetPorcentajeBateria()<10) {
            System.out.println("Sin potencia para el disparo");
        }
    }  
}
