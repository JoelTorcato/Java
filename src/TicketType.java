import java.util.Scanner;

public class TicketType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (age < 6) {
            System.out.println("Free of charge");
        } else if (age >= 6 && age <= 12) {
            System.out.println("Child ticket");
        } else if (age >= 13 && age <= 65) {
            System.out.println("Regular ticket");
        } else {
            System.out.println("Senior ticket");
        }

        scanner.close();
    }
}