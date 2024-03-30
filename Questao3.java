import java.util.Scanner;

public class Questao3 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadePessoas = 10, idadePessoa, pessoasComMais50Anos = 0, contadorAlturas = 0;
        int pessoasMenos40Quilos = 0;
        double alturaPessoa, pesoPessoa, totalAlturas=0, mediaALturas, percentualPessoasMenos40Kilos;

        for (int i = 1; i <= quantidadePessoas; i++){
            System.out.println("\nDigite as informações da "+ i + "ª pessoa de acordo com as informações abaixo.");
            System.out.println("Primeiro digite a idade:");
            idadePessoa = scanner.nextInt();
            System.out.println("Agora digite a altura: ");
            alturaPessoa = scanner.nextDouble();
            System.out.println("E por ultimo o peso: ");
            pesoPessoa = scanner.nextDouble();

            if (idadePessoa >50 ){
                pessoasComMais50Anos++;
            }

            if (idadePessoa >= 10 && idadePessoa <= 20) {
              totalAlturas = totalAlturas + alturaPessoa ;
              contadorAlturas++;      
            }
            if (pesoPessoa <40) {
                pessoasMenos40Quilos++;
                
            }
        }

        System.out.println("\n A quantidade de pessoas com mais de 50 anos é: "+pessoasComMais50Anos);

        if (contadorAlturas > 0) {
           mediaALturas = totalAlturas / contadorAlturas;
           System.out.println("A média das alturas das pessoas entre 10 e 20 anos é: "+ mediaALturas);
        }else{
            System.out.println("Não tivemos pessoas com idades entre 10 e 20 anos para calcular a média de idade!");
        }
        
        percentualPessoasMenos40Kilos = (double) pessoasMenos40Quilos/ quantidadePessoas *100;
        System.out.println("O percentual de pessoas com menos de 40 kilos é: "+ percentualPessoasMenos40Kilos+ "%");

        scanner.close();
    }
    
}

