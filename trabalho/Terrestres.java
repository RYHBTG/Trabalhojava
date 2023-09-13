package trabalho;

import java.util.Scanner;

public class Terrestres extends Animais {
    public Terrestres(String nomedoanimal, String region, String specialSet) {
        super(nomedoanimal, region, specialSet);
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
