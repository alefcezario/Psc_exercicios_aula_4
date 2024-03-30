import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numeroLido, quadradoNumero, cuboNumero, raizNumero;
        
        do {
            System.out.println("\nDigite um numero para saber seu quadrado, seu cubo e sua raiz quadrada: ");
            System.out.println("Caso queira parar, digite zero ou um numero negativo: ");
            numeroLido = scanner.nextDouble();

            if (numeroLido > 1) {
                
            quadradoNumero = numeroLido * numeroLido;
            cuboNumero = numeroLido * numeroLido * numeroLido;
            raizNumero = Math.sqrt(numeroLido);
            
            System.out.println("O numero digitado foi: "+ numeroLido);
            System.out.println("O quadrado do numero digitado é: "+ quadradoNumero);
            System.out.println("O cubo do numero digitado é: " + cuboNumero);
            System.out.println("A raiz do numero digitado é: " + raizNumero);
            }else{
                System.out.println("Você digitou um valor negativo ou zero. Parando programa...");
            }

        } while ( numeroLido > 1 );

        scanner.close();
    }
}
