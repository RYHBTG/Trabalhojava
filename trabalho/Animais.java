package trabalho;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Animais {
     private String nomedoanimal;
     private String region;
     private String specialset;
     public Animais(String nomedoanimal, String region, String specialset) {
         this.nomedoanimal = nomedoanimal;
         this.region = region;
         this.specialset = specialset;
     }
     public Animais(){

     }

    public String getnomedoanimal() {
        return nomedoanimal;
    }

    public void setnomedoanimal(String nomedoanimal) {
        this.nomedoanimal = nomedoanimal;
    }

    public String getregion() {
        return region;
    }

    public void setregion(String region) {
        this.region = region;
    }

    public String getspecialset() {
        return specialset;
    }

    public void setspecialset(String specialset) {
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
