import java.util.Scanner;

public class Cubicmeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a largura (m): ");
        double largura = scanner.nextDouble();

        System.out.print("Insira a altura (m): ");
        double altura = scanner.nextDouble();

        System.out.print("Insira o comprimento (m): ");
        double comprimento = scanner.nextDouble();

        double betao = largura * altura * comprimento;

        System.out.println("Volume de betão necessário: " + betao + " metros cúbicos.");

        scanner.close();
    }
}
