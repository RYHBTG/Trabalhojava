package trabalho;

public class Terrestres extends Animais {
    private String especie;
    private Terrestres supper;
    public Terrestres(String nomedoanimal, String region, String specialSet) {
        super(nomedoanimal, region, specialSet);
    }
    public Terrestres(){
        
    }

    public String getespecie() {
        return especie;
    }

    @Override
    public void setEspecies() {
        super.setEspecies();
        especie = "Terrestres";
    }
    @Override
    public String mostrarespecie() {
        String resumo;
        resumo = super.mostrarespecie();
        resumo += "\nEspecie: " + getespecie();
        return resumo;
    }
}
