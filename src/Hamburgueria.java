import java.util.Scanner;

public class Hamburgueria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double precoHamburguer = 2.0;
        final double precoCheeseburger = 2.5;
        final double precoBatatas = 0.75;
        final double precoSumo = 1.0;

        System.out.print("Quantos Hambúrgueres? ");
        int qtdHamburguer = scanner.nextInt();

        System.out.print("Quantos Cheeseburgers? ");
        int qtdCheeseburger = scanner.nextInt();

        System.out.print("Quantas Batatas Fritas? ");
        int qtdBatatas = scanner.nextInt();

        System.out.print("Quantos Sumos? ");
        int qtdSumo = scanner.nextInt();

        double total = (qtdHamburguer * precoHamburguer) +
                (qtdCheeseburger * precoCheeseburger) +
                (qtdBatatas * precoBatatas) +
                (qtdSumo * precoSumo);

        System.out.println("\nResumo do Pedido:");
        System.out.println("Hambúrgueres: " + qtdHamburguer);
        System.out.println("Cheeseburgers: " + qtdCheeseburger);
        System.out.println("Batatas Fritas: " + qtdBatatas);
        System.out.println("Sumos: " + qtdSumo);
        System.out.println("Total a Pagar: " + total + " euros");

        scanner.close();
    }
}

