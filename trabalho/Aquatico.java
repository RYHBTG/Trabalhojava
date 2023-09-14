package trabalho;

public class Aquatico extends Animais{
    private String especie;
    private Aquatico supper;

    public Aquatico(String nomedoanimal, String region, String specialset) {
        super(nomedoanimal, region, specialset);
    }
    public Aquatico(){
        
    }
    @Override
    public void setEspecies() {
        super.setEspecies();
        especie = "aquatico";
    }

    public String getespecie() {
        return especie;
    }

    @Override
    public String mostrarespecie() {
        String resumo;
        resumo = super.mostrarespecie();
        resumo += "\nEspecie: " + getespecie();
        return resumo;
    }
}
