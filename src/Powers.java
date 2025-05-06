import java.util.Scanner;

public class Powers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will you enter (N)? ");
        int N = scanner.nextInt();

        System.out.print("What is the exponent (Exp)? ");
        int Exp = scanner.nextInt();

        int contador = 0;

        while (contador < N) {
            System.out.print("Enter an integer: ");
            int numero = scanner.nextInt();

            double potencia = Math.pow(numero, Exp);
            System.out.println(numero + " raised to " + Exp + " é " + potencia);

            contador++;
        }

        scanner.close();
    }
}
