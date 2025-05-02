import java.util.Scanner;

public class LargestNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int contador = 0;
            int maior = Integer.MIN_VALUE;

            while (contador < 10) {
                System.out.print("Enter an integer: ");
                int numero = scanner.nextInt();

                if (numero > maior) {
                    maior = numero;
                }

                contador++;
            }

            System.out.println("The highest number entered was: " + maior);

            scanner.close();
        }
}
