import java.util.Scanner;

public class LerComScanner {

    public static void main(String[] args) {
        System.out.println("Indique o seu nome: ");

        Scanner scanln = new Scanner(System.in);
        String nome = scanln.nextLine();

        System.out.println("Olá " + nome);

        scanln.close();
    }
}
