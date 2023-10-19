package fr.exo2if;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int salaireAnnuel;

        System.out.println("Travailez vous depuis moins de 2 ans : ");

        boolean travailMoins2Ans = clavier.nextBoolean();

        System.out.println("Combien gagnez vous par an : ");
        int salaireAn = clavier.nextInt();

        if(travailMoins2Ans == true && salaireAn <= 30000){
            System.err.println("Vous pouvez avoir un prêt");
        }
        else{
            System.err.println("Vous ne pouvez pas avoir un prêt");
        }
    }
    
}
