import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaKills = 0, somaDeaths = 0, somaAssists = 0, kills, deaths, assists;
        String resposta;

        while (true) {
            System.out.println("Digite o número de kills da rodada:");
            kills = scanner.nextInt();
            System.out.println("Agora o número de deaths:");
            deaths = scanner.nextInt();
            System.out.println("E por ultimo o número de assists:");
            assists = scanner.nextInt();

            somaKills += kills;
            somaDeaths += deaths;
            somaAssists += assists;

            if (somaKills <= 5) {
                System.out.println("noob");

            } else if (somaKills >= 20) {
                System.out.println("master");
            }

            if (somaDeaths >= 20) {
                System.out.println("Houston, we have a problem");
            }

            if (somaAssists >= 20) {
                System.out.println("team work");
            }

            System.out.println("Digite 'S' se houver um vencedor, caso contrário digite 'N':");
            resposta = scanner.next();
            if (resposta.equalsIgnoreCase("S")) {
                break; 
            }
        }

        scanner.close();
    }
}
