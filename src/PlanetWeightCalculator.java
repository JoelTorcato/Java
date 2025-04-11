import java.util.Scanner;

public class PlanetWeightCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight on Earth (kg): ");
        double earthWeight = scanner.nextDouble();

        System.out.println("Choose a planet:");
        System.out.println("1 - Mercury");
        System.out.println("2 - Venus");
        System.out.println("3 - Mars");
        System.out.println("4 - Jupiter");
        System.out.println("5 - Saturn");
        System.out.println("6 - Uranus\n");
        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();

        double gravity = 0;

        switch (choice) {
            case 1:
                gravity = 0.37;
                break;
            case 2:
                gravity = 0.88;
                break;
            case 3:
                gravity = 0.38;
                break;
            case 4:
                gravity = 2.64;
                break;
            case 5:
                gravity = 1.15;
                break;
            case 6:
                gravity = 1.17;
                break;
            default:
                System.out.println("Invalid option");
                System.exit(0);
        }

        double planetWeight = earthWeight / 10 * gravity;
        System.out.println("Your weight on the chosen planet is: " + planetWeight + " kg");
    }
}
