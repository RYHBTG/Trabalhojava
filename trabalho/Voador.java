package trabalho;

public class Voador extends Animais{
    private String especie;
    public Voador(String especies, String nomedoanimal, String region, String specialset) {
        super(especies, nomedoanimal, region, specialSet);
    }
    public Voador (){
        
    }

     @Override
    public void setEspecies() {
        super.setEspecies();
        especie = "Voador";
    }
    @Override
    public String mostrarEspecie(){
        String resumo;
        resumo = supper.mostrarEspecie();
        resumo += "\nEspecie: " + getEspecie();
        return resumo;
     }
}
