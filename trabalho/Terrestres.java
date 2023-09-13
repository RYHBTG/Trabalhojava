package trabalho;

public class Terrestres extends Animais {
    private String especie;
    public Terrestres(String nomedoanimal, String region, String specialSet) {
        super(nomedoanimal, region, specialSet);
    }
    public Terrestres(){
        
    }

    @Override
    public void setEspecies() {
        super.setEspecies();
        especie = "Terrestres";
    }
    @Override
    public String mostrarEspecie(){
        String resumo;
        resumo = supper.mostrarEspecie();
        resumo += "\nEspecie: " + getEspecie();
        return resumo;
     }
}
