import java.util.Scanner;

public class Questao1 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int produtoNumerosImpares = 1;
    int somaNumerosPares = 0;
    int numero;

    System.out.println("Digite vários numeros inteiros e positivos: ");
    System.out.println("Para parar de digitar os números digite 0.");
    numero = scanner.nextInt();

    while (numero != 0) {

        if(numero % 2 == 0){
            somaNumerosPares = somaNumerosPares + numero;
            }else{
                produtoNumerosImpares = produtoNumerosImpares * numero;
    
            }
        numero = scanner.nextInt();
    }

System.out.println("A soma dos numeros dos numeros pares é: "+somaNumerosPares);
System.out.println("O produtos dos numeros impares é: "+produtoNumerosImpares);

scanner.close();

}

}
