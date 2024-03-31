public class Questao9 {
    public static void main(String[] args) {
        int populacaoA = 5000000, populacaoB = 7000000, anos = 0; 
        double taxaCrescimentoA = 0.03, taxaCrescimentoB = 0.02; 

        while (populacaoA <= populacaoB) {
            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++;
        }
        System.out.println("A população do país A ultrapassará a população do país B em "+ anos +" anos.");
    }
}
