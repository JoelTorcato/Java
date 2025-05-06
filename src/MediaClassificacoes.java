import java.util.Scanner;

public class MediaClassificacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        int contador = 0;
        double nota;

        System.out.println("Enter ratings between 0 and 20 (0 to finish):");

        while (true) {
            System.out.print("Classification: ");
            nota = scanner.nextDouble();

            if (nota == 0) {
                break;
            }

            if (nota >= 0 && nota <= 20) {
                soma += nota;
                contador++;
            } else {
                System.out.println("Invalid rating! Must be between 0 and 20.");
            }
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Average ratings: " + media);
        } else {
            System.out.println("No valid classification was entered.");
        }

        scanner.close();
    }
}
