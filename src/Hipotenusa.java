import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        double cateto1, cateto2, hipotenusa;

        Scanner input = new Scanner(System.in);

        System.out.print("Insira o tamanho do primeiro cateto: ");
        cateto1 = input.nextDouble();
        System.out.print("Insira o tamanho do segundo cateto: ");
        cateto2 = input.nextDouble();

        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.print("A hipotenusa é: " + hipotenusa);

        input.close();
    }
}