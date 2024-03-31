import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, produtoNumero = 0;
        int b;
       
        System.out.println("Digite o numero real A:");
        a = scanner.nextDouble();

        System.out.println("Digite o numero inteiro B:");
        b = scanner.nextInt();

        for (int i = 0; i < Math.abs(b); i++) {
            produtoNumero = produtoNumero + a;
        }

        if (b < 0) {
            produtoNumero = -produtoNumero;
        }

        System.out.println("O produto de " + a + " por " + b + " é igual a: " + produtoNumero);
        scanner.close();
    }
}
