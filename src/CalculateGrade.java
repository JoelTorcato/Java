import java.util.Arrays;
import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade for the first test: ");
        double teste1 = scanner.nextDouble();

        System.out.print("Enter the grade for the second test: ");
        double teste2 = scanner.nextDouble();

        double[] trabalhos = new double[5]; // Create an array
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the grade for the practical work " + (i + 1) + ": ");
            trabalhos[i] = scanner.nextDouble();
        }

        Arrays.sort(trabalhos); // Used to order the elements of an array in ascending order.
        double mediaTrabalhos = (trabalhos[2] + trabalhos[3] + trabalhos[4]) / 3.0;

        System.out.print("Enter the grade for the final work: ");
        double trabalhoFinal = scanner.nextDouble();

        double notaFinal = ((teste1 + teste2) / 2) * 0.6 + mediaTrabalhos * 0.2 + trabalhoFinal * 0.2;

        System.out.println("The student's final grade is: " + notaFinal);

        scanner.close();
    }
}
