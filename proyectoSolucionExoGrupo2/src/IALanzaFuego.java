/**
 * @autor Ivonne Ayala
 * @date 28/01/2024
 * @version 9.0
 */
public class IALanzaFuego implements IIFArma{
    //Atributos
    private String iaLongitud;
    IFFuenteDePoder dmFuenteDePoder;

    /**
     * Constructor de la clase IALanzaFuego
     * @param Longitud
     */
    public IALanzaFuego(String Longitud) {
        this.iaLongitud = Longitud;
    }
    
    /**
     * Método para disparar
     */
    @Override
    public void ifDisparar() {
        System.out.println("Lanza fuego disparandose...");
    }

    /**
     * Método que verifica la capacidad de disparo del lanzallamas basándose en la fuente de poder.
     * @param fuenteDePoder
     */
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

    // public String iaGetColor() {
    //     return iaLongitud;
    // }

    // public void iaSetColor(String iaLongitud) {
    //     this.iaLongitud = iaLongitud;
    // }

