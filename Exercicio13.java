public class Exercicio13 {
    public static void executar(){
    int numero = Prompt.lerInteiro("digite o valor de n:");
    
    int[] vetor = fibonacci(numero);
    System.out.print("Sequência de Fibonacci: ");
    for (int i = 0; i < numero; i++) {
        System.out.print(vetor[i] + " ");
    }
}

public static int[] fibonacci(int n) {
    int[] vetor = new int[n];
    if (n >= 1) {
        vetor[0] = 1;
    }
    if (n >= 2) {
        vetor[1] = 1;
    }
    for (int i = 2; i < n; i++) {
        vetor[i] = vetor[i - 1] + vetor[i - 2];
    }
    return vetor;
}
    }

