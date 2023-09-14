import trabalho.*;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Animais especie;
        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("Você foi escolhido para reencarnar como um animal!");
            System.out.println("Realize a escolha desejada:");
            System.out.println("1 - Aquático");
            System.out.println("2 - Terrestre");
            System.out.println("3 - Voador");
            System.out.println("4 - Mostrar escolha");
            System.out.print("Escolha: ");
            int opc = leitor.nextInt();
            switch (opc) {
                case 1:
                    especie = new Aquatico();
                    especie.setEspecies();
                    break;

                case 2:
                    especie = new Terrestres();
                    especie.setEspecies();
                    break;

                case 3:
                    especie = new Voador();
                    especie.setEspecies();
                    break;

                case 4:
                    especie.mostrarespecie();
                    break;

                default:
                    System.out.println("Escolha inválida! Tente novamente.");
                    break;
            }
        }
    }
}
