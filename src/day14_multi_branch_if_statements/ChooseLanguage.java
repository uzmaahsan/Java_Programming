package day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection = 1;
        if (selection == 1) {
            System.out.println("Thank you for your call");
        } else if (selection == 2) {
            System.out.println("hola gracias para llamar");

        } else if (selection == 3) {
            System.out.println(" marhaba aradiginiz vash zvonok");
        } else if (selection == 4) {
            System.out.println("privet, spsibibo za vash zvonok");
        } else if (selection == 5) {
            System.out.println("Merci ,pour voter appeal ");
        }else{
            System.out.println("Lets talk in English , hello");


        }
    }
}