package trabalho;

public class Voador extends Animais{
    public Voador() {
    }

    public Voador(String terrestre, String aquatico, String voador) {
        super(terrestre, aquatico, voador);
    }

    @Override
    public String setVoador(String Voador) {
        return super.setVoador(Voador);
    }
}
