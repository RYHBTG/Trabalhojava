package trabalho;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Animais {
     private String nomedoanimal;
     private String region;
     private String specialset;
     public Animais(String especies, String nomedoanimal, String region, String specialset) {
         this.especies = especies;
         this.nomedoanimal = nomedoanimal;
         this.region = region;
         this.specialset = specialset;
     }

     public String mostrarespecie(){
          String resumo;
          resumo = "Nome: " + getnomedoanimal() + "\n" + "Regiao: " + getregion() + "\n" + "Caracteristica especial: " + getspecialset();
          return resumo;
     }

     public void setEspecies() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Digite qual o nome do animal: ");
         this.nomedoanimal = scanner.nextLine();
         System.out.println("Digite a regiao desejada (pais, bioma, etc): ");
         this.region = scanner.nextLine();
         System.out.println("Digite alguma caracteristica especial: ");
         this.specialset = scanner.nextLine();
     }
 }
