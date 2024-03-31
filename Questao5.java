import java.util.Random;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto, numeroTentativas = 0, numeroDigitado;

        numeroSecreto = random.nextInt(101);

        System.out.println("Bem vindo ao Jogo de Adivinhção!");
        System.out.println("Estou pensando em uma número entre 1 e 100...");
        System.out.println("Tente adivinhar qual é!");

        do{
            System.out.println("Digite seu palpite: ");
            numeroDigitado = scanner.nextInt();
            numeroTentativas++;
            
            if (numeroDigitado < numeroSecreto) {
                System.out.println("Muito baixo. Tente novamente.");

            }else if (numeroDigitado > numeroSecreto) {             
                System.out.println("Muito alto. Tente novamente.");

            }else{
                System.out.println("Parabéns! Você acertou o numero em "+numeroTentativas+" tentativas!");
            }
        } while (numeroSecreto != numeroDigitado);

        scanner.close();
    }
}
