import java.util.Scanner;

public class LeituraEscrita {
    public static void main(String[] args) {
        int idade;
        String nome;

        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        nome = input.next();
        System.out.print("Idade: ");
        idade = input.nextInt();
        System.out.print("O " + nome + " tem " + idade + " anos");
    }
}