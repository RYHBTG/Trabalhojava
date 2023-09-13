package trabalho;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Animais {
     private String especies;
     private String NomeDoAnimal;
     private String Region;
     private String SpecialSet;
     public Animais(String especies, String nomedoanimal, String region, String specialSet) {
         this.especies = especies;
         this.NomeDoAnimal = nomedoanimal;
         this.Region = region;
         this.SpecialSet = specialSet;
     }

     public String getEspecies() {
         return especies;
     }

     public String setEspecies(String especies, String nomedoanimal, String region, String specialSet) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Digite qual o nome do animal: ");
         this.NomeDoAnimal = scanner.nextLine();
         System.out.println("Digite a regiao desejada (pais, bioma, etc): ");
         this.Region = scanner.nextLine();
         System.out.println("Digite alguma caracteristica especial: ");
         this.SpecialSet = scanner.nextLine();
          System.out.println("Especie feita");
          this.especies = scanner.nextLine();
         return especies;
     }

 }
