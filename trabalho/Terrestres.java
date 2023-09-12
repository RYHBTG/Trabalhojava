package trabalho;

import java.util.Scanner;

public class Terrestres extends Animais {
    public Terrestres() {
    }

    public Terrestres(String terrestre, String aquatico, String voador) {
        super(terrestre, aquatico, voador);
    }

    @Override
    public String setTerrestre(String Terrestre) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite qual animal deseja se tornar");
        scanner.nextLine();
        return super.setTerrestre(Terrestre);
    }
}
