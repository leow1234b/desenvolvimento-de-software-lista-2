public class Exercicio14 {
    public static void executar(){
        int[] vetor = new int[5];

        
        for (int i = 0; i < 5; i++) {
            vetor[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + ": ");
        }

        
        int maior = vetor[0];
        int posicaoMaior = 0;
        for (int i = 1; i < 5; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
        }

        
        for (int i = posicaoMaior; i < 4; i++) {
            vetor[i] = vetor[i + 1];
        }
        vetor[4] = maior;

        
        System.out.println("Vetor atualizado:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}

    

