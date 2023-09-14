package trabalho;

public class Voador extends Animais{
    private String especie;
    private Voador supper;
    public Voador(String nomedoanimal, String region, String specialset) {
        super(nomedoanimal, region, specialset);
    }
    public Voador (){
        
    }

    public String getespecie() {
        return especie;
    }

    @Override
    public void setEspecies() {
        super.setEspecies();
        especie = "Voador";
    }

    @Override
    public String mostrarespecie() {
        String resumo;
        resumo = super.mostrarespecie();
        resumo += "\nEspecie: " + getespecie();
        return resumo;
    }
}
