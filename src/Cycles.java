import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {

        int soma = 0;
        int conta = 0;
        int num = 0;
        float media;

        Scanner input = new Scanner(System.in);

        while (num >= 0) {
            System.out.print("Introduza um número: ");

            num = input.nextInt();

            if (num >= 0) {
                soma+=num;
                conta++;
            }
        }

        media = (soma/conta);

        System.out.print(" A média dos números é " +media+"\n");
        input.close();
    }
}
