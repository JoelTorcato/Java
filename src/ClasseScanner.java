import java.util.Scanner;

public class ClasseScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite endereço: ");
        String endereco = entrada.nextLine();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
    }
}
