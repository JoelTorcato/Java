import java.util.Scanner;

public class Pair {
    public static void main(String[] args) {
        int NR;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        NR = scanner.nextInt();

        if (NR % 2 == 0) {
            System.out.println("The number " + NR + " is pair.");
        } else {
            System.out.println("The number " + NR + " is odd.");
        }
    }
}
