public class PJExpertoIngles implements PJIEnseniar {

    private String pjnombre;
    private int pjedad;

    /**
     * Constructor de la clase PJExpertoIngles.
     * @param pjnombre El nombre del experto en inglés.
     * @param pjedad La edad del experto en inglés.
     */
    public PJExpertoIngles(String pjnombre, int pjedad) {
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
       // System.out.println("Enseniando lexico");
    }

    @Override
    public void pjEnseniarGramatica() {
      //  System.out.println("Ensiniando gramatica");
    }

    @Override
    public void pjEnseniarFonetica() {
       // System.out.println("Enseniando fonetica");
    }

    public void dmEnsenarIngles (PJIAprendeIngles dmAlumnoIngles){
        //System.out.println("Enseniando ingles");
        pjEnseniarFonetica();
        pjEnseniarGramatica();
        pjEnseniarLexico();
        dmAlumnoIngles.pjAprenderIngles();
    }

}

