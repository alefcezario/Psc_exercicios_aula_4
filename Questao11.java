import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double massaMaterial;
        double massaDesejada = 0.10;
        double taxaPerda = 0.25;
        int tempoSegundos = 0, repetir; 

        do {
            System.out.println("Digite a massa do material em gramas: ");
            massaMaterial = scanner.nextDouble();    
        while (massaMaterial >= massaDesejada) {
            massaMaterial = massaMaterial * (1 - taxaPerda); 
            tempoSegundos = tempoSegundos + 30; 
        }
        System.out.println("O tempo necessário para a massa se tornar menor que 0,10 gramas: " + tempoSegundos + " segundos.");
        System.out.println("Deseja calcular o tempo de mais uma massa? (Digite 1 para sim, e 2 para não)");
        repetir = scanner.nextInt();
    }while (repetir == 1);
    
    System.out.println("Programa encerrado!");
        scanner.close();
    }
}
