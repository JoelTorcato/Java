import javax.swing.JOptionPane;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Indica dois números: ");
        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();

        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + numero1);
            JOptionPane.showMessageDialog(null, "O menor número é: " + numero2);
        } else if (numero2 > numero1) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + numero2);
            JOptionPane.showMessageDialog(null, "O menor número é: " + numero1);
        } else {
            JOptionPane.showMessageDialog(null, "Os números são iguais." + numero1);
        }

        int maximo = Math.max(numero1, numero2);
        int minimo = Math.min(numero1, numero2);

        JOptionPane.showMessageDialog(null, "O maior número é: " + maximo);
        JOptionPane.showMessageDialog(null, "O menor número é: " + minimo);

        entrada.close();

    }
}
