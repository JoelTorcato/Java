import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Math grade: ");
        double math = scanner.nextDouble();

        System.out.print("Portuguese grade: ");
        double portuguese = scanner.nextDouble();

        System.out.print("English grade: ");
        double english = scanner.nextDouble();

        double average = (math + portuguese + english) / 3;

        System.out.printf("Average: %.2f\n", average);

        if (average >= 9.5) {
            System.out.println("Positive average");
        } else {
            System.out.println("Negative average");
        }

        scanner.close();
    }
}