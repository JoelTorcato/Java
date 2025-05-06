import java.util.Scanner;

public class CombinedExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n========== MENU DE EXERCÍCIOS ==========");
            System.out.println("1. Leitura e exibição de 10 nomes");
            System.out.println("2. Cálculo da média de 10 idades");
            System.out.println("3. Identificação do maior salário");
            System.out.println("0. Sair");
            System.out.print("\nEscolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    exercicioNomes(scanner);
                    break;
                case 2:
                    exercicioIdades(scanner);
                    break;
                case 3:
                    exercicioSalarios(scanner);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    // Exercise 1
    public static void exercicioNomes(Scanner scanner) {
        String[] nomes = new String[10];

        System.out.println("\n--- EXERCÍCIO 1: LEITURA DE NOMES ---");
        System.out.println("Digite 10 nomes:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Nome " + (i+1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("\nNomes armazenados:");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i+1) + ". " + nomes[i]);
        }
    }

    // Exercise 2
    public static void exercicioIdades(Scanner scanner) {
        int[] idades = new int[10];
        int soma = 0;

        System.out.println("\n--- EXERCÍCIO 2: MÉDIA DE IDADES ---");
        System.out.println("Digite 10 idades:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Idade " + (i+1) + ": ");
            idades[i] = scanner.nextInt();
            soma += idades[i];
        }

        double media = (double) soma / idades.length;

        System.out.println("\nIdades informadas:");
        for (int idade : idades) {
            System.out.print(idade + " ");
        }

        System.out.println("\n\nMédia das idades: " + media);
        scanner.nextLine(); // Limpar o buffer
    }

    // Exercise 3
    public static void exercicioSalarios(Scanner scanner) {
        double[] salarios = new double[10];

        System.out.println("\n--- EXERCÍCIO 3: MAIOR SALÁRIO ---");
        System.out.println("Digite 10 salários:");

        // Leitura dos salários
        for (int i = 0; i < 10; i++) {
            System.out.print("Salário " + (i+1) + ": ");
            salarios[i] = scanner.nextDouble();
        }

        // Encontrar o maior salário e seu índice
        double maiorSalario = salarios[0];
        int indiceMaiorSalario = 0;

        for (int i = 1; i < salarios.length; i++) {
            if (salarios[i] > maiorSalario) {
                maiorSalario = salarios[i];
                indiceMaiorSalario = i;
            }
        }

        System.out.println("\nSalários informados:");
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }

        System.out.println("\n\nO maior salário é: " + maiorSalario);
        System.out.println("Índice do maior salário: " + indiceMaiorSalario);
        System.out.println("Posição do maior salário: " + (indiceMaiorSalario + 1));
        scanner.nextLine();
    }
}


