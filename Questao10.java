import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matriculas = new int[100]; 
        double[] notas = new double[100]; 

        for (int i = 0; i < 100; i++) {
            System.out.println("Digite o número de matrícula do aluno " + (i + 1) + ":");
            matriculas[i] = scanner.nextInt();
            System.out.println("Digite a nota do aluno " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 100 - 1; i++) {
            for (int j = i + 1; j < 100; j++) {
                if (notas[j] > notas[i]) {
                    double tempNota = notas[i];
                    notas[i] = notas[j];
                    notas[j] = tempNota;

                    int tempMatricula = matriculas[i];
                    matriculas[i] = matriculas[j];
                    matriculas[j] = tempMatricula;
                }
            }
        }

    
        System.out.println("As duas maiores notas são:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Nota: " + notas[i] + ", Matrícula: " + matriculas[i]);
        }
        scanner.close();
    }
}
