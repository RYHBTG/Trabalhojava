package trabalho;

import java.util.Scanner;

public class Terrestres extends Animais {
    public Terrestres(String especies, String nomedoanimal, String region, String specialSet) {
        super(especies, nomedoanimal, region, specialSet);
    }

    @Override
    public String setEspecies(String especies) {
        super.setEspecies(especies);
        return especies;
    }
    @Override
    public String mostrarEspecie(){
        String resumo;
        resumo = supper.mostrarEspecie();
        resumo += "\nEspecie: " + getEspecie();
        return resumo;
     }
}
