import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sequencia1 = 1, sequencia2 = 4;

        System.out.println("Digite o valor de N:");
        n = scanner.nextInt();

        System.out.println("Os " +n+ " termos da série são:");
        for (int i = 0; i < n; i++) {
            System.out.print(sequencia1 +", ");
                sequencia1++;
            System.out.print(sequencia2 +", ");
            System.out.print(sequencia2 +", ");
                sequencia2++;
            }
        scanner.close();    
    }    
    }
