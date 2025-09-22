import java.util.Scanner;

public class ModoTexto {
    public static void main(String[] args){
        String Linha;
        int num;

        Scanner s = new Scanner(System.in);

        System.out.println("Insira uma frase: ");
        Linha = s.nextLine();
        System.out.println("A frase inserida foi " + Linha);

        System.out.println("Insira um número");
        num = s.nextInt();
        System.out.println("O número inserido foi " + num);
    }
}

