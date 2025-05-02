import java.util.Scanner;

public class ExerciseaCycle {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int contador = 0;
            int soma = 0;

            while (contador < 10) {
                System.out.print("Enter an integer: ");
                int numero = scanner.nextInt();
                soma += numero;
                contador++;
            }

            double media = soma / 10.0;

            System.out.println("Sum of numbers: " + soma);
            System.out.println("Average of numbers: " + media);

            scanner.close();
        }
}
