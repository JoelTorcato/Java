import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your gender (M for male, F for female): ");
        char gender = scanner.next().toUpperCase().charAt(0);

        double tax = 0;

        switch (gender) {
            case 'F':
                tax = salary * 0.10;
                break;
            case 'M':
                tax = salary * 0.15;
                break;
            default:
                System.out.println("Invalid gender");
                System.exit(0);
        }

        System.out.println("Tax to be paid: " + tax);
    }
}
