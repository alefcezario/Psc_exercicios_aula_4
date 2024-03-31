import java.util.Scanner;

public class Questao7 {
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 int colunas, tipoForma;
  
  do { 
 System.out.println("Escolha o número correspondente a forma que deseja exibir conforme as opções abaixo: ");   
 System.out.println("1: retângulo "); 
 System.out.println("2: diagonal superior esquerda"); 
 System.out.println("3: diagonal superior direita"); 
 System.out.println("4: diagonal inferior esquerda"); 
 System.out.println("5: diagonal inferior direita");  
 tipoForma = scanner.nextInt();
 
switch (tipoForma) {
    case 1:
    System.out.print("Agora digite o número de colunas: ");
    colunas = scanner.nextInt();

    for (int i = 0; i < colunas; i++) {
        for (int j = 0; j < colunas; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
        break;
    case 2:
    System.out.print("Agora digite o número de colunas: ");
    colunas = scanner.nextInt();

    for (int i = 0; i < colunas; i++) {
        for (int j = 0; j < colunas - i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    break;  
    case 3:
    System.out.print("Agora digite o número de colunas: ");
    colunas = scanner.nextInt();

    for (int i = 0; i < colunas; i++) {
        for (int j = 0; j < colunas; j++) {
            if (j >= i) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    break;
    case 4:
    System.out.print("Agora digite o número de colunas: ");
    colunas = scanner.nextInt();

    for (int i = 0; i < colunas; i++) {
        for (int j = 0; j < colunas; j++) {
            if (j <= i) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }   
    break;  
    case 5:
    System.out.print("Agora digite o número de colunas: ");
    colunas = scanner.nextInt();

    for (int i = 0; i < colunas; i++) {
        for (int j = 0; j < colunas; j++) {
            if (j >= colunas - i - 1) { 
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    break;
    default:
    System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE ABAIXO:\n ");

}
}while (tipoForma <1 || tipoForma > 5);

scanner.close();
}   
 
}
