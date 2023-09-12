package trabalho;

 public class Animais {
    private String terrestre;
    private String aquatico;
    private String voador;
    public Animais(){

    }
    public Animais(String terrestre, String aquatico, String voador){
        this.terrestre = terrestre;
        this.aquatico = aquatico;
        this.voador = voador;
    }
    public String getTerrestre(){
        return terrestre;
    }
    public String getAquatico(){
        return aquatico;
    }
    public String getVoador(){
        return voador;
    }

    public String setTerrestre(String Terrestre) {
        this.terrestre = terrestre;
        return Terrestre;
    }

    public String setAquatico(String Aquatico) {
        this.aquatico = aquatico;
        return Aquatico;
    }

    public String setVoador(String Voador) {
        this.voador = voador;
        return Voador;
    }


 }
