public class PJExpertoEspaniol implements PJIAprendeEspaniol,PJIEnsenia{

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
    public void pjenseniarLexico() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pjenseniarLexico'");
    }

    @Override
    public void pjenseniarGramatica() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pjenseniarGramatica'");
    }

    @Override
    public void pjenseniarFonetica() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pjenseniarFonetica'");
    }

    @Override
    public void pjAprenderEspaniol() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pjAprenderEspaniol'");
    }

   
}
