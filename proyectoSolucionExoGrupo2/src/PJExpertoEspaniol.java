public class PJExpertoEspaniol implements PJIEnseniar{

    private String pjnombre;
    private int pjedad;

    /**
     * Constructor de la clase PJExpertoEspaniol.
     * @param pjnombre El nombre del experto en español.
     * @param pjedad La edad del experto en español.
     */
    public PJExpertoEspaniol(String pjnombre, int pjedad) {
        this.pjnombre = pjnombre;
        this.pjedad = pjedad;
    }

    /** getter/setter
     * 
     * @return
     */
    public String pjgetNombre() {
        return pjnombre;
    }

    
    public void pjsetNombre(String pjnombre) {
        this.pjnombre = pjnombre;
    }

    
    public int pjgetEdad() {
        return pjedad;
    }

    
    public void pjsetEdad(int pjedad) {
        this.pjedad = pjedad;
    }

    @Override
    public void pjEnseniarLexico() {
        System.out.println("Enseniando lexico");
    }

    @Override
    public void pjEnseniarGramatica() {
        System.out.println("Ensiniando gramatica");
    }

    @Override
    public void pjEnseniarFonetica() {
        System.out.println("Enseniando fonetica");
    }

    public void dmEnseniarEspanol (PJIAprendeEspaniol dmAlumnoEspaniol){
        System.out.println("Enseniando espanol");
        pjEnseniarFonetica();
        pjEnseniarGramatica();
        pjEnseniarLexico();
    }
   
}
