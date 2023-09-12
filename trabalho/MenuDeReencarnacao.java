package trabalho;

import java.util.Scanner;

public class MenuDeReencarnacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Animais animal = new Animais(null,null,null);
        Terrestres terrestres = new Terrestres(null,null,null);
        while (true) {
            System.out.println("Você foi escolhido para reencarnar como um animal!");
            System.out.println("Realize a escolha desejada:");
            System.out.println("1 - Aquático");
            System.out.println("2 - Terrestre");
            System.out.println("3 - Voador");
            int opc = leitor.nextInt();

            switch (opc) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Escolha inválida! Tente novamente.");
                    break;
            }
        }
    }
}
