package trabalho;

public class Aquatico extends Animais{
    public Aquatico(String especies, String nomedoanimal, String region, String specialSet) {
        super(especies, nomedoanimal, region, specialSet);
    }
    public Aquatico(){
        
    }
    @Override
    public String setEspecies(String especies) {
        super.setEspecies(especies);
        return especies;
    }
}
