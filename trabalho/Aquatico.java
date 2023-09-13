package trabalho;

public class Aquatico extends Animais{
    private String especie;
    public Aquatico(String nomedoanimal, String region, String specialSet) {
        super(nomedoanimal, region, specialSet);
    }
    public Aquatico(){
        
    }
    @Override
    public void setEspecies() {
        super.setEspecies();
        especie = "aquatico";
    }
    @Override
    public String mostrarEspecie(){
        String resumo;
        resumo = supper.mostrarEspecie();
        resumo += "\nEspecie: " + getEspecie();
        return resumo;
     }
}
